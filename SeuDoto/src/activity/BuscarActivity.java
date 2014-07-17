package activity;

import util.Convenio;
import util.Especialidade;

import com.example.seudoto.R;
import com.example.seudoto.R.layout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class BuscarActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_buscar);
		
		carregarCidades();
		carregarConvenios();
		carregarEspecialidades();
		carregarTiposProfissionais();
	}

	public void carregarEspecialidades() {
		String[] especialidades = new String[] {
				Especialidade.CARDIOLOGISTA.toString(),
				Especialidade.DERMATOLOGISTA.toString(),
				Especialidade.GINECOLOGISTA.toString(),
				Especialidade.NEUROLOGISTA.toString(),
				Especialidade.PEDIATRA.toString() };

		ArrayAdapter<String> adaptadorEspecialidade = new ArrayAdapter<String>(
				this, android.R.layout.simple_spinner_item, especialidades);
		
		Spinner especialidadeSpinner = (Spinner) findViewById(R.id.especialidade_spinner);
		
		adaptadorEspecialidade.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		especialidadeSpinner.setAdapter(adaptadorEspecialidade);
		
		especialidadeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
	
	public void carregarConvenios(){
		
		String[] convenios = new String[]{Convenio.SMILE.toString(),Convenio.UNIDENTES.toString(),Convenio.UNIMED.toString()};
		
		ArrayAdapter<String> adaptadorConvenios = new ArrayAdapter<String>(
				this, android.R.layout.simple_spinner_item, convenios);
		
		Spinner convenioSpinner = (Spinner) findViewById(R.id.convenio_spinner);
		
		adaptadorConvenios.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		convenioSpinner.setAdapter(adaptadorConvenios);
		
		convenioSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});

	}
	
	public void carregarCidades(){
		
		String[] cidades = new String[]{"João Pessoa","Campina Grande","Patos","Cajazeiras","Guarabira","Sousa"};
		
		ArrayAdapter<String> adaptadorCidades = new ArrayAdapter<String>(
				this, android.R.layout.simple_spinner_item, cidades);
		
		Spinner cidadesSpinner = (Spinner) findViewById(R.id.cidade_spinner);
		
		adaptadorCidades.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		cidadesSpinner.setAdapter(adaptadorCidades);
		
		cidadesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});

	}
	
	public void carregarTiposProfissionais(){
		
		String[] tiposProfissionais = new String[]{"Médico","Dentista","Fisioterapeuta","Nutricionista","Psicologo"};
		
		ArrayAdapter<String> adaptadorTiposProfissionais = new ArrayAdapter<String>(
				this, android.R.layout.simple_spinner_item, tiposProfissionais);
		
		Spinner profissionaisSpinner = (Spinner) findViewById(R.id.profissional_spinner);
		
		adaptadorTiposProfissionais.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		profissionaisSpinner.setAdapter(adaptadorTiposProfissionais);
		
		profissionaisSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub
				
			}
		});

		
	}
}
