package activity;

import util.Convenio;
import util.Especialidade;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.seudoto.R;
import com.parse.ParseException;

import controller.ProfissionalController;
import exception.ProfissionalSaudeException;

public class BuscarActivity extends Activity {

	private ImageButton botaoPesquisar;
	private ProfissionalController profissionalController;
	private String tipo;
	private String especialidade;
	private String convenio;
	private String cidade;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buscar);
		
		profissionalController = ProfissionalController.getInstance();
		
		carregarCidades();
		carregarConvenios();
		carregarEspecialidades();
		carregarTiposProfissionais();
		
		botaoPesquisar = (ImageButton) findViewById(R.id.botaoPesquisar);
		
		
		
		botaoPesquisar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				EsperandoConsulta espera = new EsperandoConsulta();
				espera.execute(new String[] { "Seu Doto" });

			}
		});

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
	
	

	public void carregarEspecialidades() {
		final String[] especialidades = new String[] {"Selecione",
				Especialidade.CARDIOLOGISTA.toString(),
				Especialidade.DERMATOLOGISTA.toString(),
				Especialidade.GINECOLOGISTA.toString(),
				Especialidade.NEUROLOGISTA.toString(),
				Especialidade.PEDIATRA.toString() };

		ArrayAdapter<String> adaptadorEspecialidade = new ArrayAdapter<String>(
				this, android.R.layout.simple_spinner_item, especialidades);

		Spinner especialidadeSpinner = (Spinner) findViewById(R.id.especialidade_spinner);

		adaptadorEspecialidade
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		especialidadeSpinner.setAdapter(adaptadorEspecialidade);

		especialidadeSpinner
				.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

					@Override
					public void onItemSelected(AdapterView<?> parent,
							View view, int position, long id) {
						
						setEspecialidade(especialidades[position]);

					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub

					}
				});

	}

	public void carregarConvenios() {

		final String[] convenios = new String[] {"Selecione", Convenio.SMILE.toString(),
				Convenio.UNIDENTES.toString(), Convenio.UNIMED.toString() };

		ArrayAdapter<String> adaptadorConvenios = new ArrayAdapter<String>(
				this, android.R.layout.simple_spinner_item, convenios);

		Spinner convenioSpinner = (Spinner) findViewById(R.id.convenio_spinner);

		adaptadorConvenios
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		convenioSpinner.setAdapter(adaptadorConvenios);

		convenioSpinner
				.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

					@Override
					public void onItemSelected(AdapterView<?> parent,
							View view, int position, long id) {
						setConvenio(convenios[position]);

					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub

					}
				});

	}

	public void carregarCidades() {

		final String[] cidades = new String[] {"Selecione", "João Pessoa", "Campina Grande",
				"Patos", "Cajazeiras", "Guarabira", "Sousa" };

		ArrayAdapter<String> adaptadorCidades = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, cidades);

		Spinner cidadesSpinner = (Spinner) findViewById(R.id.cidade_spinner);

		adaptadorCidades
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		cidadesSpinner.setAdapter(adaptadorCidades);

		cidadesSpinner
				.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

					@Override
					public void onItemSelected(AdapterView<?> parent,
							View view, int position, long id) {
						cidade = cidades[position];
					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub

					}
				});

	}

	public void carregarTiposProfissionais() {

		final String[] tiposProfissionais = new String[] {"Selecione", "Mï¿½dico", "Dentista",
				"Fisioterapeuta", "Nutricionista", "Psicologo" };

		ArrayAdapter<String> adaptadorTiposProfissionais = new ArrayAdapter<String>(
				this, android.R.layout.simple_spinner_item, tiposProfissionais);

		Spinner profissionaisSpinner = (Spinner) findViewById(R.id.profissional_spinner);

		adaptadorTiposProfissionais
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		profissionaisSpinner.setAdapter(adaptadorTiposProfissionais);

		profissionaisSpinner
				.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

					@Override
					public void onItemSelected(AdapterView<?> parent,
							View view, int position, long id) {
						setTipo(tiposProfissionais[position]);

					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub

					}
				});

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

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
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
	
	private void setResultadoBusca(String resposta){
		//TODO resposta busca
	}
	
	
	private class EsperandoConsulta extends AsyncTask<String, Integer, String>{

			private ProgressDialog mProgressDialog;
			
			@Override
			protected void onPreExecute() {
				super.onPreExecute();
				Context contexto = BuscarActivity.this;
				mProgressDialog = new ProgressDialog(contexto);
				
				mProgressDialog.setMessage("Pesquisando...");
				mProgressDialog.setIndeterminate(false);
				mProgressDialog.setCancelable(false);
				mProgressDialog.show();
			}
			
			@Override
			protected String doInBackground(String... params) {
				
				boolean concluido = false;
				
				try {
					if(tipo!=null && especialidade!=null && convenio!=null){
						try {
							profissionalController.buscaSimples(tipo, especialidade,convenio);
							concluido = true;
						} catch (ParseException e) {
							concluido = false;
						}
					}
					
				} catch (ProfissionalSaudeException e) {
					concluido = false;
				}
				
				return null;
			}
			
			@Override
			protected void onPostExecute(String result) {
				mProgressDialog.dismiss();
				if(!profissionalController.getResultadoBuscaSimples().isEmpty()){
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
