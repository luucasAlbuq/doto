package activity;

import model.ProfissionalSaude;
import util.Convenio;
import util.Especialidade;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
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

	private String nome, indentificacao, tipo, especialidade, convenio;
	private ProfissionalController controler;
	private ProfissionalSaude profissionalParaCadastrar = null;
	private EditText nomeText, numeroRegistro;
	boolean isCrmunico = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastrar_profissional);

		carregarCidades();
		carregarConvenios();
		carregarEspecialidades();
		carregarTiposProfissionais();

		controler = ProfissionalController.getInstance();

		nomeText = (EditText) findViewById(R.id.cadastrar_put_nome);
		numeroRegistro = (EditText) findViewById(R.id.cadastrar_put_crm);

		ImageButton salvar = (ImageButton) findViewById(R.id.SaveimageView);

		final Toast alertaFalha = Toast.makeText(this,
				"Erro ao cadastrar um profissional", Toast.LENGTH_LONG);

		final Toast alertaCampos = Toast
				.makeText(
						this,
						"Os campos Tipo, Nome, Identificação e Especialidade são obrigatórios",
						Toast.LENGTH_LONG);

		salvar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				nome = nomeText.getText().toString();
				indentificacao = numeroRegistro.getText().toString();

				try {

					if (isCamposValidos()) {
						profissionalParaCadastrar = new ProfissionalSaude(tipo,
								numeroRegistro.getText().toString(), nome,
								especialidade, convenio);

						// Mostra um progress bar informando que o profissional
						// ta sendo persistido no BD online
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
			LocationFound();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	private void LocationFound() {
		Intent i = new Intent(CadastrarProfissionalActivity.this,
				BuscarActivity.class);
		startActivity(i);
	}

	public void carregarEspecialidades() {
		final String[] especialidades = new String[] {
				Especialidade.CARDIOLOGISTA.toString(),
				Especialidade.DERMATOLOGISTA.toString(),
				Especialidade.GINECOLOGISTA.toString(),
				Especialidade.NEUROLOGISTA.toString(),
				Especialidade.PEDIATRA.toString() };

		ArrayAdapter<String> adaptadorEspecialidade = new ArrayAdapter<String>(
				this, android.R.layout.simple_spinner_item, especialidades);

		Spinner especialidadeSpinner = (Spinner) findViewById(R.id.cadastro_especialidade_spinner);

		adaptadorEspecialidade
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		especialidadeSpinner.setAdapter(adaptadorEspecialidade);

		especialidadeSpinner
				.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

					@Override
					public void onItemSelected(AdapterView<?> parent,
							View view, int position, long id) {

						especialidade = especialidades[position];

					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub

					}
				});

	}

	public void carregarConvenios() {

		final String[] convenios = new String[] { Convenio.SMILE.toString(),
				Convenio.UNIDENTES.toString(), Convenio.UNIMED.toString() };

		ArrayAdapter<String> adaptadorConvenios = new ArrayAdapter<String>(
				this, android.R.layout.simple_spinner_item, convenios);

		Spinner convenioSpinner = (Spinner) findViewById(R.id.cadastro_convenio_spinner);

		adaptadorConvenios
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		convenioSpinner.setAdapter(adaptadorConvenios);

		convenioSpinner
				.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

					@Override
					public void onItemSelected(AdapterView<?> parent,
							View view, int position, long id) {

						convenio = convenios[position];

					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub

					}
				});

	}

	public void carregarCidades() {

		final String[] cidades = new String[] { "João Pessoa",
				"Campina Grande", "Patos", "Cajazeiras", "Guarabira", "Sousa" };

		ArrayAdapter<String> adaptadorCidades = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, cidades);

		Spinner cidadesSpinner = (Spinner) findViewById(R.id.cadastro_cidade_spinner);

		adaptadorCidades
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		cidadesSpinner.setAdapter(adaptadorCidades);

		cidadesSpinner
				.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

					@Override
					public void onItemSelected(AdapterView<?> parent,
							View view, int position, long id) {

					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub

					}
				});

	}

	public void carregarTiposProfissionais() {

		final String[] tiposProfissionais = new String[] { "Médico",
				"Dentista", "Fisioterapeuta", "Nutricionista", "Psicologo" };

		ArrayAdapter<String> adaptadorTiposProfissionais = new ArrayAdapter<String>(
				this, android.R.layout.simple_spinner_item, tiposProfissionais);

		Spinner profissionaisSpinner = (Spinner) findViewById(R.id.cadastro_tipo_prof_spinner);

		adaptadorTiposProfissionais
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		profissionaisSpinner.setAdapter(adaptadorTiposProfissionais);

		profissionaisSpinner
				.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

					@Override
					public void onItemSelected(AdapterView<?> parent,
							View view, int position, long id) {

						tipo = tiposProfissionais[position];

					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub

					}
				});

	}

	private boolean isCamposValidos() {
		return nome!=null && !nome.trim().equals("") && tipo != null && !tipo.trim().equals("")
				&& indentificacao != null && !indentificacao.trim().equals("");
	}

	// Para chamar a AsyncTask: new nomeDaAsyncTask().execute();
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
