package activity;

import java.util.ArrayList;

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
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.seudoto.R;
import com.parse.ParseException;

import controller.ProfissionalController;
import exception.ProfissionalSaudeException;

public class BuscarActivity extends Activity {

	private ImageButton botaoPesquisar;
	private ProfissionalController profissionalController;
	private String tipo;
	private String especialidadeSelecionada;
	private String convenio;
	private String cidade;
	private ImageButton botaoAddConvenio,botaoAddEspecialidade;
	
	//Ultima especialidade selecionada
	private int lastSelectEspecialidade = -1;
	
	//Listas para o dialoga de convenios
	private ArrayList<String> conveniosSelecionados;
	boolean[] itemsConvenioChecked = new boolean[Convenio.values().length];
	CharSequence[] convenios = new CharSequence[Convenio.values().length];
	
	//Lista de especialidades	
	CharSequence[] especialidades = new CharSequence[Especialidade.values().length];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buscar);
		
		//carregarCidades();
		
		
		// Carregando Intens que seram exibidos no dialogo de convenios
		// Lista de Convenios
		for (int i = 0; i < Convenio.values().length; i++) {
			convenios[i] = (Convenio.values()[i].toString());
			itemsConvenioChecked[i] = false;
		}
		
		
		//Carregando Itens que seram exibidos no dialogo de especialidades
	    for(int i=0;i < Especialidade.values().length;i++){
	    	especialidades[i]= (Especialidade.values()[i].toString());
	    }
	    
	    
		
		profissionalController = ProfissionalController.getInstance();
		
		botaoPesquisar = (ImageButton) findViewById(R.id.botaoPesquisar);
		botaoAddConvenio = (ImageButton) findViewById(R.id.addPesquisarConvenio);
		botaoAddEspecialidade = (ImageButton) findViewById(R.id.addPesquisarEspecialidade);
		
		
		

		botaoPesquisar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				EsperandoConsulta espera = new EsperandoConsulta();
				espera.execute(new String[] { "Seu Doto" });

			}
		});
		
		
		botaoAddConvenio.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onCreateDialogConvenio().show();
			}
		});
		
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
				BuscarActivity.this);

		// Set the dialog title
		builder.setTitle("Especialidade").setSingleChoiceItems(especialidades, lastSelectEspecialidade,
				new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						especialidadeSelecionada = String.valueOf(especialidades[which]);
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
				BuscarActivity.this);

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
									String convenioSelecionado = String
											.valueOf(convenios[indice]);
									conveniosSelecionados
											.add(convenioSelecionado);
								} else if (conveniosSelecionados
										.contains(String
												.valueOf(convenios[which]))) {
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
        inflater.inflate(R.menu.activity_cadastrar_actions, menu);
 
        return super.onCreateOptionsMenu(menu);
    }
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
        // Take appropriate action for each action item click
        switch (item.getItemId()) {
        case R.id.action_search:
        	locationFound();
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
	
	private void locationFound() {
        Intent i = new Intent(BuscarActivity.this, CadastrarProfissionalActivity.class);
        startActivity(i);
    }
	
	

	public ProfissionalController getProfissionalController() {
		return profissionalController;
	}

	public void setProfissionalController(
			ProfissionalController profissionalController) {
		this.profissionalController = profissionalController;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEspecialidadeSelecionada() {
		return especialidadeSelecionada;
	}

	public void setEspecialidadeSelecionada(String especialidade) {
		this.especialidadeSelecionada = especialidade;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	private class EsperandoConsulta extends AsyncTask<String, Integer, String>{

			private ProgressDialog mProgressDialog;
			
			@Override
			protected void onPreExecute() {
				super.onPreExecute();
				Context contexto = BuscarActivity.this;
				mProgressDialog = new ProgressDialog(contexto);
				
				mProgressDialog.setMessage("Pesquisando ...");
				mProgressDialog.setIndeterminate(false);
				mProgressDialog.setCancelable(false);
				mProgressDialog.show();
			}
			
			@Override
			protected String doInBackground(String... params) {
				
				boolean concluido = false;
				
				try {
					
						try {
							profissionalController.buscaSimples(null, especialidadeSelecionada,conveniosSelecionados);
							concluido = true;
						} catch (ParseException e) {
							concluido = false;
						}
					
					
				} catch (ProfissionalSaudeException e) {
					concluido = false;
				}
				
				return null;
			}
			
			@Override
			protected void onPostExecute(String result) {
				mProgressDialog.dismiss();
				especialidadeSelecionada = null;
				if(profissionalController.getResultadoBuscaSimples()!=null && !profissionalController.getResultadoBuscaSimples().isEmpty()){
					Intent telaLista = new Intent(BuscarActivity.this,ListaProfissionaisActivity.class);
					startActivity(telaLista);
				}else{
					Toast alertaBusca = Toast.makeText(BuscarActivity.this,
							"Nenhum profissional foi encontrado!", Toast.LENGTH_LONG);
					alertaBusca.show();
				}
				
			}
		}

}
