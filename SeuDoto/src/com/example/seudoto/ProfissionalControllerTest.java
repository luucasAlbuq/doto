package com.example.seudoto;

import java.util.List;
import java.util.Random;

import model.ProfissionalSaude;
import model.TipoProfissional;

import org.junit.Assert;
import org.junit.Before;

import util.Convenio;
import util.Especialidade;
import util.MensagemExcessao;
import android.test.AndroidTestCase;
import controller.ProfissionalController;
import exception.ProfissionalSaudeException;

public class ProfissionalControllerTest extends AndroidTestCase {

	private ProfissionalController controller;
	private static final String EXCESSAO = MensagemExcessao.ERRO.toString();
	Random rand;

	@Before
	protected void setUp() throws Exception {
		super.setUp();
		controller = ProfissionalController.getInstance(getContext());
		rand = new Random();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testCadastrarProfissionalSucesso()
			throws ProfissionalSaudeException {
		ProfissionalSaude prof = null;

		try {
			prof = new ProfissionalSaude("Médico", "" + rand.nextInt(),
					"Lucas Almeida", Especialidade.CARDIOLOGISTA.toString(),
					Convenio.SMILE.toString());
			controller.cadastrarProfissionalSaude(prof);
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			fail();
		}

		// Verifica se salvou
		assertTrue(controller.buscarTodos().contains(prof));

		try {
			controller.removerProfissional(prof);
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			fail("Nao deveria ter lancado excessao");
		}
	}

	public void testCadastrarProfissionalInvalido()
			throws ProfissionalSaudeException {

		ProfissionalSaude prof = null;
		Exception excption = null;
		try {
			controller.cadastrarProfissionalSaude(prof);
			Assert.fail("Deveria ter lancado excessao");
		} catch (ProfissionalSaudeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			excption = e;
		}
		assertFalse(controller.buscarTodos().contains(prof));
		assertNotNull(excption);
		assertEquals(EXCESSAO, excption.getMessage());
	}

	public void testCadastrarProfissionalPassandoParametros() {
		Exception excption = null;
		ProfissionalSaude prof = null;

		try {
			prof = new ProfissionalSaude(TipoProfissional.MEDICO.toString(), ""
					+ rand.nextInt(), "Dean Feliciano",
					Especialidade.CARDIOLOGISTA.toString(),
					Convenio.SMILE.toString());

			controller.cadastrarProfissionalSaude(prof.getNome(),
					prof.getTipo(), prof.getNumeroRegistro(),
					prof.getEspecialidade(), prof.getConvenio());

		} catch (ProfissionalSaudeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			excption = e;
			Assert.fail("Nao Deveria ter lancado excessao");
		}

		assertNull(excption);

		try {
			assertTrue(controller.buscarTodos().contains(prof));
		} catch (ProfissionalSaudeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail("Nao Deveria ter lancado excessao");
		}

		try {
			controller.removerProfissional(prof);
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			fail("Nao deveria ter lancado excessao");
		}

	}

	public void testCadastrarProfissionalPassandoParametrosInvalidos()
			throws ProfissionalSaudeException {
		Exception excption = null;
		ProfissionalSaude prof = null;

		try {
			prof = new ProfissionalSaude(TipoProfissional.MEDICO.toString(), ""+rand.nextInt(), "Fulano gaspar", 
					Especialidade.CARDIOLOGISTA.toString(), Convenio.UNIMED.toString());
			controller.cadastrarProfissionalSaude(null, prof.getTipo(),
					prof.getNumeroRegistro(), prof.getEspecialidade(),
					prof.getConvenio());
			Assert.fail("Deveria ter lancado excessao");
		} catch (ProfissionalSaudeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			excption = e;
		}

		assertNotNull(excption);
		assertEquals(EXCESSAO, excption.getMessage());
		assertFalse(controller.buscarTodos().contains(prof));

	}
	
	public void testCadastrarProfissionalCRMInvalido(){
		Exception excption = null;
		ProfissionalSaude prof = null;

		try {
			prof = new ProfissionalSaude(TipoProfissional.MEDICO.toString(), ""+rand.nextInt(), "Fulano gaspar", 
					Especialidade.CARDIOLOGISTA.toString(), Convenio.UNIMED.toString());
			controller.cadastrarProfissionalSaude(prof);
			controller.cadastrarProfissionalSaude(prof);
			fail("Deveria lencar excessao");
		} catch (ProfissionalSaudeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			excption = e;
		}
		assertNotNull(excption);
		assertEquals(MensagemExcessao.CRM_INVALIDO.toString(), excption.getMessage());
	}
	
	
	public void testAvaliar(){
		ProfissionalSaude prof = null;
		final String cpf=""+rand.nextInt();
		final String cpf2=""+rand.nextInt();
		int positiva = 0;
		int negativa = 1;
		
		try {
			prof = new ProfissionalSaude(TipoProfissional.MEDICO.toString(),
					""+rand.nextInt(), "Beltrano Figueiredo",
					Especialidade.PEDIATRA.toString(),
					Convenio.UNIMED.toString());
			
			controller.cadastrarProfissionalSaude(prof);
			

		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			fail("Nao deveria ter lancado excessao");
		}

		try {
			
			assertTrue(controller.getAvaliacoesNegativas(prof.getNumeroRegistro())==0);
			controller.criarAvaliacao(cpf,prof.getNumeroRegistro(),negativa);
			assertTrue(controller.getAvaliacoesNegativas(prof.getNumeroRegistro())==1);
			
			assertTrue(controller.getAvaliacoesPositivas(prof.getNumeroRegistro())==0);
			controller.criarAvaliacao(cpf2,prof.getNumeroRegistro(),positiva);
			assertTrue(controller.getAvaliacoesPositivas(prof.getNumeroRegistro())==1);
			
		} catch (ProfissionalSaudeException e1) {
			e1.printStackTrace();
			fail();
		}
		
		

		try {
			controller.removerProfissional(prof);
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			fail("Nao deveria ter lancado excessao");
		}
	}
	
	public void testAvaliacaoDuplicada() throws ProfissionalSaudeException{
		ProfissionalSaude prof = null;
		final String cpf=""+rand.nextInt();
		int positiva = 0;
		Exception exception=null;
		int negativa=1;
		
		try {
			prof = new ProfissionalSaude(TipoProfissional.MEDICO.toString(),
					""+rand.nextInt(), "Beltrano Figueiredo",
					Especialidade.PEDIATRA.toString(),
					Convenio.UNIMED.toString());
			
			controller.cadastrarProfissionalSaude(prof);
			

		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			fail("Nao deveria ter lancado excessao");
		}

		try {
			
			//Cria pela primeira vez
			assertTrue(controller.getAvaliacoesNegativas(prof.getNumeroRegistro())==0);
			controller.criarAvaliacao(cpf,prof.getNumeroRegistro(),negativa);
			assertTrue(controller.getAvaliacoesNegativas(prof.getNumeroRegistro())==1);
			//Cria pela segunda vez
			controller.criarAvaliacao(cpf,prof.getNumeroRegistro(),negativa);
			fail();
		} catch (ProfissionalSaudeException e1) {
			e1.printStackTrace();
			exception = e1;
		}
		
		assertNotNull(exception);
		assertTrue(controller.getAvaliacoesNegativas(prof.getNumeroRegistro())==1);

		try {
			controller.removerProfissional(prof);
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			fail("Nao deveria ter lancado excessao");
		}
	
	}
	
	public void testBuscarPorEspecialidade() {
		List<ProfissionalSaude> profissionais = null;
		ProfissionalSaude prof = null;

		try {
			prof = new ProfissionalSaude(TipoProfissional.MEDICO.toString(),
					""+rand.nextInt(), "Beltrano Figueiredo",
					Especialidade.PEDIATRA.toString(),
					Convenio.UNIMED.toString());
			
			controller.cadastrarProfissionalSaude(prof);

			profissionais = controller
					.buscarProfissionalPorEspecialidade(Especialidade.PEDIATRA);
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			fail("Nao deveria ter lancado excessao");
		}

		assertNotNull(profissionais);

		for (ProfissionalSaude profissional : profissionais) {
			assertSame(Especialidade.PEDIATRA.toString(),
					profissional.getEspecialidade());
		}

		try {
			controller.removerProfissional(prof);
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			fail("Nao deveria ter lancado excessao");
		}
	}
}
