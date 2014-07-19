package activity;

import java.util.List;

import model.ProfissionalSaude;
import model.TipoProfissional;
import util.Convenio;
import util.Especialidade;

import com.example.seudoto.R;
import com.example.seudoto.R.layout;

import controller.ProfissionalController;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.view.View.OnClickListener;

public class BuscarActivity extends Activity {

	private ImageButton botaoPesquisar;
	private ProfissionalController profissionalController;
	private String tipo;
	private String especialidade;
	private String convenio;

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
				
				//profissionalController.buscaSimples(getTipo(), getEspecialidade(), getConvenio());
				Intent telaLista = new Intent(BuscarActivity.this,ListaProfissionaisActivity.class);
				BuscarActivity.this.startActivity(telaLista);

			}
		});

	}
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_actions, menu);
 
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
		final String[] especialidades = new String[] {
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

		final String[] convenios = new String[] { Convenio.SMILE.toString(),
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

		final String[] cidades = new String[] { "João Pessoa", "Campina Grande",
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
						// TODO Auto-generated method stub

					}

					@Override
					public void onNothingSelected(AdapterView<?> parent) {
						// TODO Auto-generated method stub

					}
				});

	}

	public void carregarTiposProfissionais() {

		final String[] tiposProfissionais = new String[] { "Médico", "Dentista",
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

		
	
}
