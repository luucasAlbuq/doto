package activity;

import com.example.seudoto.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListaProfissionaisActivity extends Activity {

	ListView resultadoPesquisa;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_profissionais);

		resultadoPesquisa = (ListView) findViewById(R.id.resultadoPesquisa);

		resultadoPesquisa.setAdapter(new EfficientAdapter(this, 5));
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

			// campo.campoNome.setText(String
			// .valueOf(gerarRelatorio.getNomeAtivades().get(position)));
			// campo.campoCRM.setText(String
			// .valueOf(gerarRelatorio.getTempoAtivades().get(position)));
			// campo.campoConvenio.setText(String
			// .valueOf(gerarRelatorio.porcentagemDecrescente().get(
			// position)));
			// campo.campoAvaliacao.setText(String
			// .valueOf(gerarRelatorio.getPrioridadeAtivades().get(
			// position)));
			// campo.campoEndereco.setText(String
			// .valueOf(gerarRelatorio.getPrioridadeAtivades().get(
			// position)));

			campo.campoNome.setText("Gabriela Oliveira");
			campo.campoCRM.setText("67890");
			campo.campoConvenio.setText("Unimed");
			campo.campoAvaliacao.setText("Positiva");
			campo.campoEndereco.setText("Rua dos Alfeneiros, Nº 232 \n"+ "Campina Grande");

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
