package activity;

import java.util.ArrayList;
import java.util.List;

import model.ProfissionalSaude;
import model.TipoProfissional;
import util.Convenio;
import util.Especialidade;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.seudoto.R;
import com.parse.ParseException;

import controller.ProfissionalController;
import exception.ProfissionalSaudeException;

public class CadastrarProfissionalActivity extends Activity {

	private String nome, indentificacao, especialidade;
	private ProfissionalController controler;
	private ProfissionalSaude profissionalParaCadastrar = null;
	private EditText nomeText, numeroRegistro, foneText;
	boolean isCrmunico = false;
	private ImageButton botaoAddConveio,botaoSalvar, botaoAddEspecialidade;
	
	//Listas para o dialoga de convenios
	private ArrayList<String> conveniosSelecionados;
	boolean[] itemsConvenioChecked = new boolean[Convenio.values().length];
	CharSequence[] convenios = new CharSequence[Convenio.values().length];
	
	//Lista de especialidades	
	CharSequence[] especialidades = new CharSequence[Especialidade.values().length];
	
	//Ultima especialidade selecionada
	private int lastSelectEspecialidade = -1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastrar_profissional);

		//carregarCidades();
		
		
		//Carregando Intens que seram exibidos no dialogo de convenios
		//Lista de Convenios
	    for(int i=0;i < Convenio.values().length;i++){
	    	convenios[i]= (Convenio.values()[i].toString());
	    	itemsConvenioChecked[i]=false;
	    }
	    
	    
	    //Carregando Itens que seram exibidos no dialogo de especialidades
	    for(int i=0;i < Especialidade.values().length;i++){
	    	especialidades[i]= (Especialidade.values()[i].toString());
	    }
		
		
		

		controler = ProfissionalController.getInstance();

		//Inicializando componentes
		nomeText = (EditText) findViewById(R.id.cadastrar_put_nome);
		numeroRegistro = (EditText) findViewById(R.id.cadastrar_put_crm);
		foneText = (EditText) findViewById(R.id.cadastrar_put_fone);
		botaoAddConveio = (ImageButton)findViewById(R.id.addConvenio);
		botaoSalvar = (ImageButton) findViewById(R.id.SaveimageView);
		botaoAddEspecialidade = (ImageButton) findViewById(R.id.addEspecialidade);
		
		
		//Mensaggens para acoes de salvar
		final Toast alertaFalha = Toast.makeText(this,"Erro ao cadastrar um profissional", Toast.LENGTH_LONG);
		final Toast alertaCampos = Toast.makeText(this,"Os campos Nome, Identificação e Especialidade são obrigatórios",Toast.LENGTH_LONG);

		//Botao salvar eh acionado
		botaoSalvar.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				nome = nomeText.getText().toString();
				indentificacao = numeroRegistro.getText().toString();
				String numeroFone = foneText.getText().toString();
				
				try {
					if (isCamposValidos()) {
						profissionalParaCadastrar = new ProfissionalSaude(TipoProfissional.MEDICO.toString(), numeroRegistro.getText().toString(), nome,
					    especialidade, conveniosSelecionados, numeroFone);
						EsperandoConsulta espera = new EsperandoConsulta();
						espera.execute(new String[] { "Seu Doto" });
					} else {
						alertaCampos.show();
					}

				} catch (Exception e) {
					alertaFalha.show();
				}
			}
		});
		
		
		//botao add comentario eh acionado
		botaoAddConveio.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onCreateDialogConvenio().show();
			}
		});
		
		//botao add especialide eh acionado
		botaoAddEspecialidade.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onCreateDialogEspecialidade().show();
				
			}
		});
	}
	
	
	
	/**
	 * Metodo responsavel por criar o dialogo de especialidades
	 * @return Dialog
	 */
	public Dialog onCreateDialogEspecialidade() {
		
		AlertDialog.Builder builder = new AlertDialog.Builder(
				CadastrarProfissionalActivity.this);

		// Set the dialog title
		builder.setTitle("Especialidade").setSingleChoiceItems(especialidades, lastSelectEspecialidade,
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						especialidade = String.valueOf(especialidades[which]);
						lastSelectEspecialidade = which;
					}
						})
				.setCancelable(false)
				.setPositiveButton("Fechar",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								// do things
							}
						});
		
		return builder.create();
	}
	
	
	/**
	 * Metodo responsavel por criar o dialogo de convenios
	 * @return Dialog
	 */
	public Dialog onCreateDialogConvenio() {
		conveniosSelecionados = new ArrayList(); // Where we track the selected items
		AlertDialog.Builder builder = new AlertDialog.Builder(
				CadastrarProfissionalActivity.this);

		// Set the dialog title
		builder.setTitle("Convênio")

				.setMultiChoiceItems(convenios, itemsConvenioChecked,
						new DialogInterface.OnMultiChoiceClickListener() {
							@Override
							public void onClick(DialogInterface dialog,
									int which, boolean isChecked) {
								if (isChecked) {
									// If the user checked the item, add it to
									// the selected items
									int indice = which;
									String convenioSelecionado = String.valueOf(convenios[indice]);
									conveniosSelecionados.add(convenioSelecionado);
								} else if (conveniosSelecionados.contains(String.valueOf(convenios[which]))) {
									// Else, if the item is already in the
									// array, remove it
									conveniosSelecionados.remove(Integer
											.valueOf(which));
								}
							}
						})
				.setCancelable(false)
				.setPositiveButton("Fechar",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog, int id) {
								// do things
							}
						});
		return builder.create();
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.activity_home_actions, menu);

		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Take appropriate action for each action item click
		switch (item.getItemId()) {
		case R.id.action_home:
			//locationFound();
			CadastrarProfissionalActivity.this.finish();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	private void locationFound() {
		Intent i = new Intent(CadastrarProfissionalActivity.this,
				BuscarActivity.class);
		startActivity(i);
	}



//	public void carregarTiposProfissionais() {
//
//		final String[] tiposProfissionais = new String[] { "MÃ©dico" };
//
//		ArrayAdapter<String> adaptadorTiposProfissionais = new ArrayAdapter<String>(
//				this, android.R.layout.simple_spinner_item, tiposProfissionais);
//
//		Spinner profissionaisSpinner = (Spinner) findViewById(R.id.cadastro_tipo_prof_spinner);
//
//		adaptadorTiposProfissionais
//				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//		profissionaisSpinner.setAdapter(adaptadorTiposProfissionais);
//
//		profissionaisSpinner
//				.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//
//					@Override
//					public void onItemSelected(AdapterView<?> parent,
//							View view, int position, long id) {
//
//						tipo = tiposProfissionais[position];
//
//					}
//
//					@Override
//					public void onNothingSelected(AdapterView<?> parent) {
//						// TODO Auto-generated method stub
//
//					}
//				});
//
//	}

	private boolean isCamposValidos() {
		return nome!=null && !"".equals(nome.trim())
				&& indentificacao != null && !"".equals(indentificacao.trim()) && (especialidade!=null
				&& !especialidade.trim().equals(""));
	}

	private class EsperandoConsulta extends AsyncTask<String, Integer, String> {

		private ProgressDialog mProgressDialog;

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			Context contexto = CadastrarProfissionalActivity.this;
			mProgressDialog = new ProgressDialog(contexto);
			mProgressDialog.setMessage("Enviando dados");
			mProgressDialog.setIndeterminate(false);
			mProgressDialog.setCancelable(false);
			mProgressDialog.show();
		}

		@Override
		protected String doInBackground(String... params) {

			if (profissionalParaCadastrar != null) {
				try {
					isCrmunico = controler.getDaoParse().isCrmUnico(
							profissionalParaCadastrar.getNumeroRegistro());
					
					if (isCrmunico) {
						try {
							controler
									.cadastrarProfissionalSaude(profissionalParaCadastrar);
						} catch (ProfissionalSaudeException e) {
							e.getMessage();
						} catch (ParseException e) {
							e.getMessage();
						}
					}
					
				} catch (ParseException e) {
					e.getMessage();
				}
			}

			

			return null;
		}

		@Override
		protected void onPostExecute(String result) {

			mProgressDialog.dismiss();

			if (!isCrmunico) {
				Toast alertaCRM = Toast.makeText(
						CadastrarProfissionalActivity.this,
						"Identificação inválida!",
						Toast.LENGTH_LONG);
				alertaCRM.show();

				if (numeroRegistro != null) {
					numeroRegistro.setText("");
				}

			} else {

				if (numeroRegistro != null) {
					numeroRegistro.setText("");
				}
				if (nomeText != null) {
					nomeText.setText("");
				}if(foneText!=null){
					foneText.setText("");
				}
				

				Toast alertaSucesso = Toast.makeText(
						CadastrarProfissionalActivity.this,
						"Profissional Cadastrado com Sucesso",
						Toast.LENGTH_LONG);
				alertaSucesso.show();
			}

		}
	}

}
