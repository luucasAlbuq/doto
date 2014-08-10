package activity;

import model.ProfissionalSaude;

import com.example.seudoto.R;
import com.example.seudoto.R.layout;

import controller.ProfissionalController;
import exception.ProfissionalSaudeException;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAbortException;
import android.os.AsyncTask;
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
	private boolean avaliacao;
	final String IDUSER ="12345";
	boolean isAvaliacaoUnica = false;
	

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
		
		final Toast alertaFalha = Toast.makeText(this,
				"Falha ao computar a Avalia��o", Toast.LENGTH_LONG);
		final Toast alertaAvaliacao = Toast.makeText(this,
				"Voc� j� avaliou esse profissional anteriormente!", Toast.LENGTH_LONG);
		
		
		ImageButton likeBotao = (ImageButton) findViewById(R.id.detalhes_like);
		likeBotao.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				try{
					
					avaliacao=true;
					String crm = profissionalSaude.getNumeroRegistro();
					if(controller.getDao().isAvaliacaoValida(IDUSER, crm)){
						
						EsperandoConsulta espera = new EsperandoConsulta();
						espera.execute(new String[]{"Seu Doto"});
						
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
					avaliacao = false;
					String crm = profissionalSaude.getNumeroRegistro(); 
					if(controller.getDao().isAvaliacaoValida(IDUSER,crm )){
						
						EsperandoConsulta espera = new EsperandoConsulta();
						espera.execute(new String[]{"Seu Doto"});
						
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
		avaliacaoPosi.setText(""+profissionalSaude.getAvaliacoesPositivas());
		avaliacaoNega.setText(""+profissionalSaude.getAvaliacoesNegativas());
	}

	public ProfissionalSaude getProfissionalSaude() {
		return profissionalSaude;
	}

	public void setProfissionalSaude(ProfissionalSaude profissionalSaude) {
		this.profissionalSaude = profissionalSaude;
	}
	
	
	public boolean isAvaliacaoUnica() {
		return isAvaliacaoUnica;
	}

	public void setAvaliacaoUnica(boolean isAvaliacaoUnica) {
		this.isAvaliacaoUnica = isAvaliacaoUnica;
	}


		// Para chamar a AsyncTask: new nomeDaAsyncTask().execute();
		private class EsperandoConsulta extends AsyncTask<String, Integer, String> {

			private ProgressDialog mProgressDialog;

			@Override
			protected void onPreExecute() {
				super.onPreExecute();
				Context contexto = DetalhesProfissionalActivity.this;
				mProgressDialog = new ProgressDialog(contexto);
				mProgressDialog.setMessage("Enviando dados");
				mProgressDialog.setIndeterminate(false);
				mProgressDialog.setCancelable(false);
				mProgressDialog.show();
			}

			@Override
			protected String doInBackground(String... params) {

				
				String crm = profissionalSaude.getNumeroRegistro();
				setAvaliacaoUnica( controller.getDaoParse().isAvaliacaoUnica(IDUSER, crm));
				
				
				if(isAvaliacaoUnica){
					try {
						controller.criarAvaliacao(IDUSER, crm, avaliacao);
						
						if(avaliacao){
							profissionalSaude.addAvaliacaoPositiva();
						}else if(!avaliacao){
							profissionalSaude.addAvaliacaoNegativa();
						}
					} catch (ProfissionalSaudeException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				return null;
			}

			@Override
			protected void onPostExecute(String result) {
				if(!isAvaliacaoUnica()){
					mProgressDialog.dismiss();
					Toast alertaAvaliacao = Toast.makeText(DetalhesProfissionalActivity.this,
								"Voc� j� avaliou esse profissional!", Toast.LENGTH_LONG);
					alertaAvaliacao.show();
				}else{
					avaliacaoPosi.setText(""+profissionalSaude.getAvaliacoesPositivas());
					avaliacaoNega.setText(""+profissionalSaude.getAvaliacoesNegativas());
					mProgressDialog.dismiss();
					Toast alertaSucesso = Toast.makeText(DetalhesProfissionalActivity.this,
							"Avalia��o computada com Sucesso", Toast.LENGTH_LONG);
					alertaSucesso.show();
				}
				
			}
		}
	
}
