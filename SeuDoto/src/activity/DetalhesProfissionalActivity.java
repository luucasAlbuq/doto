package activity;

import model.ProfissionalSaude;

import com.example.seudoto.R;
import com.example.seudoto.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DetalhesProfissionalActivity extends Activity {
	
	private ProfissionalSaude profissionalSaude;
	private TextView nomeText, crmText,especialidadeText,convenioText,tipoText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalhes_profissional);
		
		Intent intent = getIntent();
		ProfissionalSaude profissionalSaude = (ProfissionalSaude) intent.getSerializableExtra("profissional");
	
		preencherCampos(profissionalSaude);
	}

	private void preencherCampos(ProfissionalSaude prof){
		nomeText = (TextView) findViewById(R.id.detalhes_nome_prof1);
		crmText = (TextView) findViewById(R.id.detalhes_crm_resp_prof1);
		especialidadeText = (TextView) findViewById(R.id.detalhes_especialidade_resp_prof1);
		convenioText = (TextView) findViewById(R.id.detalhes_convenio_resp_prof1);
		tipoText = (TextView) findViewById(R.id.detalhes_tipo_resp_prof1);
		
		nomeText.setText(prof.getNome());
		crmText.setText(prof.getNumeroRegistro());
		especialidadeText.setText(prof.getEspecialidades().get(0).toString());
		convenioText.setText(prof.getConvenios().get(0).toString());
		tipoText.setText(prof.getTipo().toString());
	}

	public ProfissionalSaude getProfissionalSaude() {
		return profissionalSaude;
	}

	public void setProfissionalSaude(ProfissionalSaude profissionalSaude) {
		this.profissionalSaude = profissionalSaude;
	}
	
	
	
	
}
