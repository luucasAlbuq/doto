package activity;

import model.ProfissionalSaude;

import com.example.seudoto.R;
import com.example.seudoto.R.layout;

import controller.ProfissionalController;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class DetalhesProfissionalActivity extends Activity {

	private ProfissionalSaude profissionalSaude;
	private TextView nomeText, crmText, especialidadeText, convenioText,
			tipoText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalhes_profissional);

		profissionalSaude = ProfissionalController.getProfissionalSelecionado();

		preencherCampos(profissionalSaude);
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
		Intent i = new Intent(DetalhesProfissionalActivity.this,
				CadastrarProfissionalActivity.class);
		startActivity(i);
	}

	private void preencherCampos(ProfissionalSaude prof) {
		nomeText = (TextView) findViewById(R.id.detalhes_nome_prof1);
		crmText = (TextView) findViewById(R.id.detalhes_crm_resp_prof1);
		especialidadeText = (TextView) findViewById(R.id.detalhes_especialidade_resp_prof1);
		convenioText = (TextView) findViewById(R.id.detalhes_convenio_resp_prof1);
		tipoText = (TextView) findViewById(R.id.detalhes_tipo_resp_prof1);

		nomeText.setText(prof.getNome());
		crmText.setText(prof.getNumeroRegistro());

		especialidadeText.setText(prof.getEspecialidade());

		convenioText.setText(prof.getConvenio());

		tipoText.setText(prof.getTipo().toString());
	}

	public ProfissionalSaude getProfissionalSaude() {
		return profissionalSaude;
	}

	public void setProfissionalSaude(ProfissionalSaude profissionalSaude) {
		this.profissionalSaude = profissionalSaude;
	}

}
