package activity;

import model.Avaliacao;
import model.ProfissionalSaude;

import com.example.seudoto.R;
import com.example.seudoto.R.layout;
import com.parse.ParseException;

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
	final static String IDUSER ="12345";
	boolean isAvaliacaoUnica = false;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalhes_profissional);

		controller = ProfissionalController.getInstance();
		profissionalSaude = controller.getProfissionalSelecionado();

		try {
			preencherCampos(profissionalSaude);
		} catch (ProfissionalSaudeException e1) {
			// TODO Auto-generated catch block
			e1.getMessage();
		}
		
		
		ImageButton comentarios = (ImageButton) findViewById(R.id.detalhes_comentarios);
		comentarios.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				EsperandoPorAvaliacoes espera = new EsperandoPorAvaliacoes();
				espera.execute(new String[]{"Seu Doto"});
			}
		});
		
		ImageButton avaliar = (ImageButton) findViewById(R.id.detalhes_avaliar);
		avaliar.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				EsperandoConsulta espera = new EsperandoConsulta();
				espera.execute(new String[]{"Seu Doto"});
				
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
			locationFound(R.id.action_search);
			return true;
		case R.id.action_home_main:
			locationFound(R.id.action_home_main);
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	private void locationFound(int id) {
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

		convenioText.setText(prof.toStringConveios());

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


	public boolean isAvaliacaoPositiva() {
		return avaliacao;
	}

	public void setAvaliacaoPositiva(boolean avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	private class EsperandoPorAvaliacoes extends AsyncTask<String, Integer, String> {

		private ProgressDialog mProgressDialog;

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			Context contexto = DetalhesProfissionalActivity.this;
			mProgressDialog = new ProgressDialog(contexto);
			mProgressDialog.setMessage("Colhendo dados");
			mProgressDialog.setIndeterminate(false);
			mProgressDialog.setCancelable(false);
			mProgressDialog.show();
		}

		@Override
		protected String doInBackground(String... params) {
			try {
				controller.carregaAvaliacoes(profissionalSaude.getNumeroRegistro());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(String result) {
			mProgressDialog.dismiss();

			if (controller.getAvaliacoes() != null) {
				boolean temComentarios = false;
				for(Avaliacao aval : controller.getAvaliacoes()){
					if(aval.getComentario()!=null && !aval.getComentario().trim().equals("")){
						temComentarios = true;
						break;
					}
				}
				
				if (!temComentarios) {
					
					Toast alertaAvaliacao = Toast.makeText(
							DetalhesProfissionalActivity.this,
							"Não há depoimentos para "
									+ profissionalSaude.getNome() + ".",
							Toast.LENGTH_LONG);
					alertaAvaliacao.show();
				} else {
					Intent telaAvaliacao = new Intent(
							DetalhesProfissionalActivity.this,
							ComentariosActivity.class);
					startActivity(telaAvaliacao);
				}
			}

		}
	}
	
	
	private class EsperandoConsulta extends AsyncTask<String, Integer, String> {

		private ProgressDialog mProgressDialog;

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			Context contexto = DetalhesProfissionalActivity.this;
			mProgressDialog = new ProgressDialog(contexto);
			mProgressDialog.setMessage("Colhendo dados");
			mProgressDialog.setIndeterminate(false);
			mProgressDialog.setCancelable(false);
			mProgressDialog.show();
		}

		@Override
		protected String doInBackground(String... params) {
			
			try {
				controller.carregaAvaliacaoCorrente(IDUSER, profissionalSaude.getNumeroRegistro());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return null;
		}

		@Override
		protected void onPostExecute(String result) {
			mProgressDialog.dismiss();
			Intent telaAvaliacao = new Intent(
					DetalhesProfissionalActivity.this, AvaliacaoActivity.class);
			startActivity(telaAvaliacao);

		}
	}
	
}
