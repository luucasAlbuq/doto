package activity;

import model.ProfissionalSaude;
import util.Convenio;
import util.Especialidade;

import com.example.seudoto.R;
import com.example.seudoto.R.layout;

import controller.ProfissionalController;
import android.app.Activity;
import android.content.Intent;
import android.media.Image;
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
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class CadastrarProfissionalActivity extends Activity {

	private String nome, indentificacao, tipo, especialidade, convenio, cidade,
			rua, bairro;
	private ProfissionalController controler;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastrar_profissional);

		carregarCidades();
		carregarConvenios();
		carregarEspecialidades();
		carregarTiposProfissionais();

		controler = ProfissionalController.getInstance(this);

		final EditText nomeText = (EditText) findViewById(R.id.cadastrar_put_nome);
		final EditText ruaText = (EditText) findViewById(R.id.cadastrar_put_rua);
		final EditText bairroText = (EditText) findViewById(R.id.cadastrar_put_bairro);
		final EditText numeroRegistro = (EditText) findViewById(R.id.cadastrar_put_crm);

		ImageButton salvar = (ImageButton) findViewById(R.id.SaveimageView);

		final Toast alertaSucesso = Toast.makeText(this,
				"Profissional Cadastrado com Sucesso", Toast.LENGTH_LONG);
		final Toast alertaFalha = Toast.makeText(this,
				"Erro ao cadastrado um profissional", Toast.LENGTH_LONG);
		salvar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				nome = nomeText.getText().toString();
				rua = ruaText.getText().toString();
				bairro = bairroText.getText().toString();
				String endereco = rua + " " + bairro + "\n " + cidade;

				try {
					ProfissionalSaude prof = new ProfissionalSaude(tipo,
							numeroRegistro.getText().toString(), nome,
							endereco, especialidade, convenio);
					controler.cadastrarProfissionalSaude(prof);
					
					nomeText.setText("");
					numeroRegistro.setText("");
					bairroText.setText("");
					
					alertaSucesso.show();
					
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

						cidade = cidades[position];

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
	
	
}
