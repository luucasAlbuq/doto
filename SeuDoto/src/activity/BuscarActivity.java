package activity;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import util.Convenio;
import util.Especialidade;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
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

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.seudoto.R;

import controller.ProfissionalController;
import exception.ProfissionalSaudeException;

public class BuscarActivity extends Activity {

	private ImageButton botaoPesquisar;
	private ProfissionalController profissionalController;
	private String tipo;
	private String especialidade;
	private String convenio;
	private String cidade;
	//volley
	private RequestQueue queue;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buscar);
		
		profissionalController = ProfissionalController.getInstance(this);
		
		//volley
		queue = Volley.newRequestQueue(this);

		carregarCidades();
		carregarConvenios();
		carregarEspecialidades();
		carregarTiposProfissionais();

		final Toast alertaBusca = Toast.makeText(this,
				"Nenhum profissional foi encontrado!", Toast.LENGTH_LONG);
		
		botaoPesquisar = (ImageButton) findViewById(R.id.botaoPesquisar);
		botaoPesquisar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				try {
					profissionalController.buscaSimples(getTipo(), getEspecialidade(), getConvenio(), getCidade());
				} catch (ProfissionalSaudeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(profissionalController.getResultadoBuscaSimples().size()>0){
					Intent telaLista = new Intent(BuscarActivity.this,ListaProfissionaisActivity.class);
					BuscarActivity.this.startActivity(telaLista);
				}else{
					alertaBusca.show();
				}
				

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
        	LocationFound();
            return true;
        default:
            return super.onOptionsItemSelected(item);
        }
    }
	
	private void LocationFound() {
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

		final String[] cidades = new String[] {"Selecione", "Jo�o Pessoa", "Campina Grande",
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

		final String[] tiposProfissionais = new String[] {"Selecione", "M�dico", "Dentista",
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

		
	//volley
	public void jsonPOST(String prof, String espec, String conv, String cidade){
		//post
		HashMap<String, String> parametrosDaBusca = new HashMap<String, String>();
		parametrosDaBusca.put("profissional", prof);
		parametrosDaBusca.put("especialidade", espec);
		parametrosDaBusca.put("convenio", conv);
		parametrosDaBusca.put("cidade", cidade);
		
		String url = "http://date.jsontest.com/";
		
		JsonObjectRequest req = new JsonObjectRequest(url, new JSONObject(parametrosDaBusca),
			       new Response.Listener<JSONObject>() {
			           @Override
			           public void onResponse(JSONObject response) {
			               try {
			            	   //pra onde vão as respostas??
			            	   setResultadoBusca(response.toString(4));
			               } catch (JSONException e) {
			                   e.printStackTrace();
			               }
			           }
			       }, new Response.ErrorListener() {
			           @Override
			           public void onErrorResponse(VolleyError error) {
			               VolleyLog.e("Error: ", error.getMessage());
			           }
			       });

			// add the request object to the queue to be executed
			queue.add(req);
		
	}
	
	private void setResultadoBusca(String resposta){
		//TODO resposta busca
	}

}
