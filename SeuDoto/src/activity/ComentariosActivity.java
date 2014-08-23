package activity;


import activity.ListaProfissionaisActivity.ViewCampo;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import model.Avaliacao;
import model.ProfissionalSaude;

import com.example.seudoto.R;

import controller.ProfissionalController;

public class ComentariosActivity extends Activity {
	
	private ListView listaComentarios;
	private List<Avaliacao> avaliacoes;
	private ProfissionalController controller;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_comentarios);
		
		controller = ProfissionalController.getInstance();
		avaliacoes = controller.getAvaliacoes();
		listaComentarios = (ListView) findViewById(R.id.listaComentarios);
		
		listaComentarios.setAdapter(new EfficientAdapter(this,avaliacoes.size()));
		
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
			Intent i = new Intent(ComentariosActivity.this,
					CadastrarProfissionalActivity.class);
			startActivity(i);
		}else if(id==R.id.action_home_main){
			Intent i = new Intent(ComentariosActivity.this,
					BuscarActivity.class);
			startActivity(i);
		}
		
	}
	
	
	private static class EfficientAdapter extends BaseAdapter {

		private LayoutInflater layoutInflater;
		private int quantidadeDeAtividades;

		public EfficientAdapter(Context context, int quantidadeTotalDeAtividades) {
			layoutInflater = LayoutInflater.from(context);
			quantidadeDeAtividades = quantidadeTotalDeAtividades;
		}

		@Override
		public int getCount() {
			return quantidadeDeAtividades;
		}

		@Override
		public Object getItem(int position) {
			return position;
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewCampo campo;

			if (convertView == null) {
				convertView = layoutInflater.inflate(
						R.layout.modelo_comentarios, null);
				campo = new ViewCampo();
				
				campo.campoComentario = (TextView) convertView
						.findViewById(R.id.listaComentarioAnonimo);


				convertView.setTag(campo);
			} else {
				campo = (ViewCampo) convertView.getTag();
			}

			/*
			 * Esse bloco eh responsavel por jogar as informacoes dos
			 * comentarios na tela
			 */
			Avaliacao avaliacaoListagem = ProfissionalController.getAvaliacoes().get(position);
			
			campo.campoComentario.setText(avaliacaoListagem.getComentario());

			return convertView;
		}

	}

	static class ViewCampo {
		TextView campoComentario;
	}

	private void limparTabelas(ListView view) {
		if (view.isDirty()) {
			view.clearAnimation();
			view.clearChoices();
			view.clearDisappearingChildren();
			view.clearFocus();
			view.clearTextFilter();
		}

	}
}
