package com.example.seudoto;

import junit.framework.Assert;

import com.robotium.solo.Solo;

import activity.BuscarActivity;
import activity.CadastrarProfissionalActivity;
import activity.DetalhesProfissionalActivity;
import activity.ListaProfissionaisActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Spinner;

/**
 * Para rodar os testes é necessário ter APENAS profissional do tipo médico
 * cadastrado e ao menos um cardiologista, convenio da smiles cadastrado no BD
 * 
 * @author Lucas
 * 
 */
public class PesquisarProfissionalActivityTest extends
		ActivityInstrumentationTestCase2<BuscarActivity> {

	private Solo mSolo;
	private final String ERRO = "Nenhum profissional foi encontrado!";

	public PesquisarProfissionalActivityTest() {
		super(BuscarActivity.class);
	}

	protected void setUp() throws Exception {
		mSolo = new Solo(getInstrumentation(), getActivity());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAselecionarTodos() {

		// Verifica se ta na tela correta
		mSolo.assertCurrentActivity("Activity Correta", BuscarActivity.class);

		mSolo.sleep(10);
		ImageButton botaoPesquisa = (ImageButton) mSolo
				.getView(R.id.botaoPesquisar);
		mSolo.clickOnView(botaoPesquisa);

		Assert.assertTrue(mSolo
				.waitForActivity(ListaProfissionaisActivity.class));

		// Verifica se mudou de tela
		mSolo.assertCurrentActivity("Activity Correta",
				ListaProfissionaisActivity.class);

		// Voltando pra tela de busca
		mSolo.goBackToActivity("BuscarActivity");

		// Verifica se ta na tela correta
		mSolo.assertCurrentActivity("Activity Correta", BuscarActivity.class);

	}

	public void testBbuscaCompletaInexistente() {
		// Verifica se ta na tela correta
		mSolo.assertCurrentActivity("Activity Correta", BuscarActivity.class);

		// Seleciona Profissional - Dentista
		mSolo.sleep(10);
		mSolo.pressSpinnerItem(0, 2);
		boolean medicoSelecionado = mSolo.isSpinnerTextSelected(0, "Dentista");
		assertEquals("Dentista selecionado", true, medicoSelecionado);
		mSolo.sleep(10);

		// Seleciona Especialidade - Cardiologista
		mSolo.pressSpinnerItem(1, 1);
		boolean especialidadeSelecionado = mSolo.isSpinnerTextSelected(1,
				"Cardiologista");
		assertEquals("Cardiologista selecionado", true,
				especialidadeSelecionado);
		mSolo.sleep(10);

		// Seleciona Convenio
		mSolo.pressSpinnerItem(2, 3);
		boolean convenioSelecionado = mSolo.isSpinnerTextSelected(2, "Unimed");
		assertEquals("Unimed selecionado", true, convenioSelecionado);
		mSolo.sleep(10);

		// Confirma pesquisa
		ImageButton botaoPesquisa = (ImageButton) mSolo
				.getView(R.id.botaoPesquisar);
		mSolo.clickOnView(botaoPesquisa);

		// Verifica se ta na tela correta
		mSolo.assertCurrentActivity("Activity Correta", BuscarActivity.class);

	}

	public void testCbuscaCompleta() {
		// Verifica se ta na tela correta
		mSolo.assertCurrentActivity("Activity Correta", BuscarActivity.class);

		// Seleciona Profissional - Medico
		mSolo.pressSpinnerItem(0, 1);
		boolean medicoSelecionado = mSolo.isSpinnerTextSelected(0, "Médico");
		assertEquals("Médico selecionado", true, medicoSelecionado);
		mSolo.sleep(10);

		// Seleciona Especialidade - Cardiologista
		mSolo.pressSpinnerItem(1, 1);
		boolean especialidadeSelecionado = mSolo.isSpinnerTextSelected(1,
				"Cardiologista");
		assertEquals("Cardiologista selecionado", true,
				especialidadeSelecionado);
		mSolo.sleep(10);

		// Seleciona Convenio
		mSolo.pressSpinnerItem(2, 1);
		boolean convenioSelecionado = mSolo.isSpinnerTextSelected(2, "Smiles");
		assertEquals("Smiles selecionado", true, convenioSelecionado);
		mSolo.sleep(10);

		// Confirma pesquisa
		ImageButton botaoPesquisa = (ImageButton) mSolo
				.getView(R.id.botaoPesquisar);
		mSolo.clickOnView(botaoPesquisa);

		Assert.assertTrue(mSolo
				.waitForActivity(ListaProfissionaisActivity.class));
		// Verifica se mudou de tela
		mSolo.assertCurrentActivity("Activity Correta",
				ListaProfissionaisActivity.class);

		// Voltando pra tela de busca
		mSolo.goBackToActivity("BuscarActivity");

		// Verifica se ta na tela correta
		mSolo.assertCurrentActivity("Activity Correta", BuscarActivity.class);

	}

	public void testDpesquisaPorEspecialidade() {

		// Pesquisando por medico
		mSolo.pressSpinnerItem(1, 1);
		boolean medicoSelecionado = mSolo.isSpinnerTextSelected(1,
				"Cardiologista");
		assertEquals("Cardiologista selecionado", true, medicoSelecionado);
		mSolo.sleep(10);

		ImageButton botaoPesquisa = (ImageButton) mSolo
				.getView(R.id.botaoPesquisar);
		mSolo.clickOnView(botaoPesquisa);

		Assert.assertTrue(mSolo
				.waitForActivity(ListaProfissionaisActivity.class));

		// Verifica se mudou de tela
		mSolo.assertCurrentActivity("Activity Correta",
				ListaProfissionaisActivity.class);

		// Voltando pra tela de busca
		mSolo.goBackToActivity("BuscarActivity");

		// Verifica se ta na tela correta
		mSolo.assertCurrentActivity("Activity Correta", BuscarActivity.class);

	}

	public void testEpesquisaPorEspecialidadeNaoEncontrada() {

		// Pesquisando por Neurologista
		mSolo.sleep(10);
		mSolo.pressSpinnerItem(1, 4);
		boolean especialidadeSelecionado = mSolo.isSpinnerTextSelected(1,
				"Neurologista");
		assertEquals("Neurologista selecionado", true, especialidadeSelecionado);

		ImageButton botaoPesquisa = (ImageButton) mSolo
				.getView(R.id.botaoPesquisar);
		mSolo.clickOnView(botaoPesquisa);
		mSolo.sleep(10);

		Assert.assertFalse(mSolo
				.waitForActivity(ListaProfissionaisActivity.class));

		mSolo.waitForText(ERRO);
		// Verifica se mudou de tela
		mSolo.assertCurrentActivity("Activity Correta", BuscarActivity.class);
	}

	public void testFpesquisarPorConvenioInexistente() {
		mSolo.assertCurrentActivity("Activity Correta", BuscarActivity.class);
		// Pesquisando por convenio
		mSolo.pressSpinnerItem(2, 2);
		boolean conveioSelecionado = mSolo
				.isSpinnerTextSelected(2, "Unidestes");
		assertEquals("Unidestes selecionado", true, conveioSelecionado);

		mSolo.sleep(10);
		ImageButton botaoPesquisa = (ImageButton) mSolo
				.getView(R.id.botaoPesquisar);
		mSolo.clickOnView(botaoPesquisa);

		Assert.assertFalse(mSolo
				.waitForActivity(ListaProfissionaisActivity.class));

		mSolo.waitForText(ERRO);
		// Verifica se mudou de tela
		mSolo.assertCurrentActivity("Activity Correta", BuscarActivity.class);
	}

	public void testGpesquisarPorConvenio() {
		mSolo.assertCurrentActivity("Activity Correta", BuscarActivity.class);
		// Pesquisando por medico
		mSolo.pressSpinnerItem(2, 1);
		boolean conveioSelecionado = mSolo.isSpinnerTextSelected(2, "Smiles");
		assertEquals("Smiles selecionado", true, conveioSelecionado);

		mSolo.sleep(10);
		ImageButton botaoPesquisa = (ImageButton) mSolo
				.getView(R.id.botaoPesquisar);
		mSolo.clickOnView(botaoPesquisa);

		Assert.assertTrue(mSolo
				.waitForActivity(ListaProfissionaisActivity.class));

		// Verifica se mudou de tela
		mSolo.assertCurrentActivity("Activity Correta",
				ListaProfissionaisActivity.class);

		// Voltando pra tela de busca
		mSolo.goBackToActivity("BuscarActivity");

		// Verifica se ta na tela correta
		mSolo.assertCurrentActivity("Activity Correta", BuscarActivity.class);

	}

	public void testHverDetalhes() {
		// Verifica se ta na tela correta
		mSolo.assertCurrentActivity("Activity Correta", BuscarActivity.class);

		mSolo.sleep(10);
		ImageButton botaoPesquisa = (ImageButton) mSolo
				.getView(R.id.botaoPesquisar);
		mSolo.clickOnView(botaoPesquisa);

		if(mSolo.waitForActivity(ListaProfissionaisActivity.class)){
			mSolo.assertCurrentActivity("Activity Correta", ListaProfissionaisActivity.class);
			
			//Selecionando o primeiro medico da lista para ver os detalhes
		    mSolo.clickInList(1);
		    assertTrue(mSolo.waitForActivity(DetalhesProfissionalActivity.class));
		    mSolo.goBackToActivity("BuscarActivity");
		}
		
		// Verifica se ta na tela correta
		mSolo.assertCurrentActivity("Activity Correta", BuscarActivity.class);
	}
}
