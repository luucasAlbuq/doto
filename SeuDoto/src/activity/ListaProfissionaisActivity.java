package activity;

import java.util.ArrayList;

import model.Endereco;
import model.ProfissionalSaude;
import model.TipoProfissional;

import com.example.seudoto.R;

import controller.ProfissionalController;
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
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListaProfissionaisActivity extends Activity {

	private ListView resultadoPesquisa;
	private ArrayList<ProfissionalSaude> listaProfissional;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_profissionais);

		listaProfissional = ProfissionalController.getResultadoBuscaSimples();

		resultadoPesquisa = (ListView) findViewById(R.id.resultadoPesquisa);
		resultadoPesquisa.setAdapter(new EfficientAdapter(this,
				listaProfissional.size()));

		resultadoPesquisa.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				ProfissionalController
						.setProfissionalSelecionado(listaProfissional
								.get(position));

				Intent telaDetalhes = new Intent(
						ListaProfissionaisActivity.this,
						DetalhesProfissionalActivity.class);
				ListaProfissionaisActivity.this.startActivity(telaDetalhes);

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
		Intent i = new Intent(ListaProfissionaisActivity.this,
				CadastrarProfissionalActivity.class);
		startActivity(i);
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
						R.layout.modelo_lista_profissional, null);
				campo = new ViewCampo();
				campo.campoCRM = (TextView) convertView
						.findViewById(R.id.pesq_crm_resp_prof1);
				campo.campoNome = (TextView) convertView
						.findViewById(R.id.pesq_nome_prof1);
				campo.campoConvenio = (TextView) convertView
						.findViewById(R.id.pesq_convenio_resp_prof1);
				campo.campoAvaliacao = (TextView) convertView
						.findViewById(R.id.pesq_avaliacao_resp_prof1);
				campo.campoEndereco = (TextView) convertView
						.findViewById(R.id.pesq_endereco_resp_prof1);

				convertView.setTag(campo);
			} else {
				campo = (ViewCampo) convertView.getTag();
			}

			/*
			 * Esse bloco é responsavel por jogar as informações dos
			 * profissionais na tela
			 */
			campo.campoNome.setText(String.valueOf(ProfissionalController
					.getResultadoBuscaSimples().get(position).getNome()));
			campo.campoCRM.setText(String.valueOf(ProfissionalController
					.getResultadoBuscaSimples().get(position)
					.getNumeroRegistro()));
			campo.campoConvenio.setText(String.valueOf(ProfissionalController
					.getResultadoBuscaSimples().get(position).getConvenio()));

			campo.campoAvaliacao.setText("Positiva");
			campo.campoEndereco.setText(String.valueOf(ProfissionalController
					.getResultadoBuscaSimples().get(position).getEndereco()
					.toString()));

			return convertView;
		}

	}

	static class ViewCampo {
		TextView campoCRM;
		TextView campoNome;
		TextView campoConvenio;
		TextView campoAvaliacao;
		TextView campoEndereco;
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
