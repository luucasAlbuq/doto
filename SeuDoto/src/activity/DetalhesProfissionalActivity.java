package activity;

import model.ProfissionalSaude;

import com.example.seudoto.R;
import com.example.seudoto.R.layout;

import controller.ProfissionalController;
import exception.ProfissionalSaudeException;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteAbortException;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class DetalhesProfissionalActivity extends Activity {

	private ProfissionalSaude profissionalSaude;
	private TextView nomeText, crmText, especialidadeText, convenioText,avaliacaoNega,avaliacaoPosi,
			tipoText;
	private ProfissionalController controller;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalhes_profissional);

		controller = ProfissionalController.getInstance(this);
		profissionalSaude = controller.getProfissionalSelecionado();

		try {
			preencherCampos(profissionalSaude);
		} catch (ProfissionalSaudeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		final Toast alertaSucesso = Toast.makeText(this,
				"Avaliação computada com Sucesso", Toast.LENGTH_LONG);
		final Toast alertaFalha = Toast.makeText(this,
				"Falha ao computar a Avaliação", Toast.LENGTH_LONG);
		final Toast alertaAvaliacao = Toast.makeText(this,
				"Você já avaliou esse profissional anteriormente!", Toast.LENGTH_LONG);
		
		
		ImageButton likeBotao = (ImageButton) findViewById(R.id.detalhes_like);
		likeBotao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try{
					String cpfUser = "12345";
					String crm = profissionalSaude.getNumeroRegistro();
					if(controller.getDao().isAvaliacaoValida(cpfUser, crm)){
						controller.criarAvaliacao("12345", crm,0);
						int avaliacaoesAtualizadas = controller.getAvaliacoesPositivas(crm);
						avaliacaoPosi.setText(""+avaliacaoesAtualizadas);
						alertaSucesso.show();
					}else{
						alertaAvaliacao.show();
					}
				}catch (SQLiteAbortException e){
					alertaFalha.show();
				} catch (ProfissionalSaudeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		ImageButton unLike = (ImageButton) findViewById(R.id.detalhes_dislike);
		unLike.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try{
					String cpfUser = "12345";
					String crm = profissionalSaude.getNumeroRegistro(); 
					if(controller.getDao().isAvaliacaoValida(cpfUser,crm )){
						controller.criarAvaliacao("12345", crm,1);
						int avaliacoesAtualizadas = controller.getAvaliacoesPositivas(crm);
						avaliacaoNega.setText(""+avaliacoesAtualizadas);
						
						alertaSucesso.show();
					}else{
						alertaAvaliacao.show();
					}
					
					
				}catch(SQLiteAbortException e){
					alertaFalha.show();
				} catch (ProfissionalSaudeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.activity_cadastrar_home_actions, menu);

		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Take appropriate action for each action item click
		switch (item.getItemId()) {
		case R.id.action_search:
			LocationFound(R.id.action_search);
			return true;
		case R.id.action_home_main:
			LocationFound(R.id.action_home_main);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	private void LocationFound(int id) {
		if(id==R.id.action_search){
			Intent i = new Intent(DetalhesProfissionalActivity.this,
					CadastrarProfissionalActivity.class);
			startActivity(i);
		}else if(id==R.id.action_home_main){
			Intent i = new Intent(DetalhesProfissionalActivity.this,
					BuscarActivity.class);
			startActivity(i);
		}
		
	}

	private void preencherCampos(ProfissionalSaude prof) throws ProfissionalSaudeException {
		nomeText = (TextView) findViewById(R.id.detalhes_nome_prof1);
		crmText = (TextView) findViewById(R.id.detalhes_crm_resp_prof1);
		especialidadeText = (TextView) findViewById(R.id.detalhes_especialidade_resp_prof1);
		convenioText = (TextView) findViewById(R.id.detalhes_convenio_resp_prof1);
		tipoText = (TextView) findViewById(R.id.detalhes_tipo_resp_prof1);
		avaliacaoPosi = (TextView) findViewById(R.id.detalhes_avaliacao_resp_prof1);
		avaliacaoNega = (TextView) findViewById(R.id.detalhes_avaliacao_neg_resp_prof1);

		nomeText.setText(prof.getNome());
		crmText.setText(prof.getNumeroRegistro());

		especialidadeText.setText(prof.getEspecialidade());

		convenioText.setText(prof.getConvenio());

		tipoText.setText(prof.getTipo().toString());
		avaliacaoPosi.setText(""+controller.getAvaliacoesPositivas(profissionalSaude.getNumeroRegistro()));
		avaliacaoNega.setText(""+controller.getAvaliacoesNegativas(profissionalSaude.getNumeroRegistro()));
	}

	public ProfissionalSaude getProfissionalSaude() {
		return profissionalSaude;
	}

	public void setProfissionalSaude(ProfissionalSaude profissionalSaude) {
		this.profissionalSaude = profissionalSaude;
	}
	
	
}
