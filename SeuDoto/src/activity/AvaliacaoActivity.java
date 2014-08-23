package activity;

import model.Avaliacao;
import model.ProfissionalSaude;

import com.example.seudoto.R;
import com.example.seudoto.R.id;
import com.example.seudoto.R.layout;
import com.parse.ParseException;

import controller.ProfissionalController;
import controller.UserController;
import exception.ProfissionalSaudeException;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class AvaliacaoActivity extends Activity {
	
	private TextView nome,avaliacaoNega,avaliacaoPosi;
	boolean isAvaliacaoUnica = false;
	boolean addComentario = false;
	private ProfissionalSaude profissionalSaude;
	private ProfissionalController controller;
	private boolean avaliacao;
//	final static String IDUSER = UserController.getInstance().getIdUser();
	final static String IDUSER = "12345";
	private Button salvarComentario;
	private Avaliacao avaliacaoCorrente; 
	
	
	//Widget GUI
    private  EditText txtComentarioAnonimo;
    private TextView lblCount;
 
    // Init Static Members
    static int MAX_COUNT = 140;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_avaliacao);
		
		controller = ProfissionalController.getInstance();
		avaliacaoCorrente = controller.getAvaliacaoCorrente();
		profissionalSaude = controller.getProfissionalSelecionado();
		
		nome = (TextView) findViewById(id.avaliacao_nome_prof1);
		nome.setText(profissionalSaude.getNome());
		
		txtComentarioAnonimo = (EditText)findViewById(R.id.txtComentarioAnonimo);
        lblCount = (TextView)findViewById(R.id.lblCount);
        
        if(avaliacaoCorrente!=null && avaliacaoCorrente.getComentario()!=null){
        	txtComentarioAnonimo.setText(avaliacaoCorrente.getComentario());
        	txtComentarioAnonimo.setFocusable(false);
        }
        
        
		
		try {
			preencherCampos(profissionalSaude);
		} catch (ProfissionalSaudeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		salvarComentario = (Button) findViewById(R.id.button1);
		salvarComentario.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
		ImageButton likeBotao = (ImageButton) findViewById(R.id.detalhes_like);
		likeBotao.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				setAvaliacaoPositiva(true);
				String crm = profissionalSaude.getNumeroRegistro();

				EsperandoConsulta espera = new EsperandoConsulta();
				espera.execute(new String[] { "Seu Doto" });

			}
		});
		
		ImageButton unLike = (ImageButton) findViewById(R.id.detalhes_dislike);
		unLike.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				setAvaliacaoPositiva(false);
				String crm = profissionalSaude.getNumeroRegistro(); 
					
					EsperandoConsulta espera = new EsperandoConsulta();
					espera.execute(new String[]{"Seu Doto"});
				
			}
		});
		
		// Attached Listener to Edit Text Widget
        txtComentarioAnonimo.addTextChangedListener(new TextWatcher() {
 
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
 
            }
 
            public void beforeTextChanged(CharSequence s, int start, int count,
                    int after) {
                // TODO Auto-generated method stub
 
            }
            
			@Override
			public void afterTextChanged(Editable s) {
				// Display Remaining Character with respective color
                int count = MAX_COUNT - s.length();
                lblCount.setText(Integer.toString(count));
                lblCount.setTextColor(Color.BLUE);
                if(count < 10)
                {
                    lblCount.setTextColor(Color.BLUE);
                }
                if(count < 0)
                {
                    lblCount.setTextColor(Color.RED);
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
			Intent i = new Intent(AvaliacaoActivity.this,
					CadastrarProfissionalActivity.class);
			startActivity(i);
		}else if(id==R.id.action_home_main){
			Intent i = new Intent(AvaliacaoActivity.this,
					BuscarActivity.class);
			startActivity(i);
		}
		
	}
	
	
	private void preencherCampos(ProfissionalSaude prof) throws ProfissionalSaudeException {
		avaliacaoPosi = (TextView) findViewById(R.id.avaliacao_avaliacao_resp_prof1);
		avaliacaoNega = (TextView) findViewById(R.id.avaliacao_avaliacao_neg_resp_prof1);
		
		avaliacaoPosi.setText(""+profissionalSaude.getAvaliacoesPositivas());
		avaliacaoNega.setText(""+profissionalSaude.getAvaliacoesNegativas());
	}
	
	
	private class EsperandoConsulta extends AsyncTask<String, Integer, String> {

		private ProgressDialog mProgressDialog;

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			Context contexto = AvaliacaoActivity.this;
			mProgressDialog = new ProgressDialog(contexto);
			mProgressDialog.setMessage("Enviando dados");
			mProgressDialog.setIndeterminate(false);
			mProgressDialog.setCancelable(false);
			mProgressDialog.show();
		}

		@Override
		protected String doInBackground(String... params) {

			
			String crm = profissionalSaude.getNumeroRegistro();
			try {
				setAvaliacaoUnica( controller.getDaoParse().isAvaliacaoUnica(IDUSER, crm));
			} catch (ParseException e1) {
				e1.getMessage();
			}
			
			
			if(isAvaliacaoUnica){
				try {
					String comentario = txtComentarioAnonimo.getText().toString();
					controller.criarAvaliacao(IDUSER, crm, avaliacao,comentario);
					
					if(isAvaliacaoPositiva()){
						profissionalSaude.addAvaliacaoPositiva();
					}else if(!isAvaliacaoPositiva()){
						profissionalSaude.addAvaliacaoNegativa();
					}
				} catch (ProfissionalSaudeException e) {
					e.getMessage();
				} catch (ParseException e) {
					e.getMessage();
				}
				
				/*
				 * Se ja existir uma avaliacao ele verifica se ja existe um comentario nessa avaliacao
				 *  se existe uma avaliacao e nao existir um comentario ele add um comentario
				 */
			}else if(avaliacaoCorrente!=null && (avaliacaoCorrente.getComentario()==null || avaliacaoCorrente.getComentario().trim().equals(""))){
				String comentario = txtComentarioAnonimo.getText().toString();
				try {
					controller.addComentario(IDUSER, crm, comentario);
					addComentario=true;
				} catch (ParseException e) {
					 e.getMessage();
				}
			}

			return null;
		}

		@Override
		protected void onPostExecute(String result) {
			if(!isAvaliacaoUnica() && !addComentario){
				mProgressDialog.dismiss();
				Toast alertaAvaliacao = Toast.makeText(AvaliacaoActivity.this,
							"Você avaliou esse profissional posteriormente!", Toast.LENGTH_LONG);
				alertaAvaliacao.show();
			}else if(!isAvaliacaoUnica() && addComentario){
				mProgressDialog.dismiss();
				Toast alertaComentario = Toast.makeText(AvaliacaoActivity.this,
						"Depoimentos anônimo salvo", Toast.LENGTH_LONG);
				alertaComentario.show();
			}
			
			else{
				avaliacaoPosi.setText(""+profissionalSaude.getAvaliacoesPositivas());
				avaliacaoNega.setText(""+profissionalSaude.getAvaliacoesNegativas());
				mProgressDialog.dismiss();
				Toast alertaSucesso = Toast.makeText(AvaliacaoActivity.this,
						"Avaliação computada com Sucesso", Toast.LENGTH_LONG);
				alertaSucesso.show();
			}
			
		}
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

	
	
}
