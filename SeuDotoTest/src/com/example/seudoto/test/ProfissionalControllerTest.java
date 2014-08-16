package com.example.seudoto.test;

import java.util.List;
import java.util.Random;

import model.ProfissionalSaude;
import model.TipoProfissional;

import org.junit.Assert;
import org.junit.Before;

import com.parse.Parse;
import com.parse.ParseException;

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
		Parse.initialize(getContext(), "7EqoOy2DDnMMHlXUGAbi9aJkqIgryikPIRv7CzX3", "nvT2iYY8AfuMJgH7cJQeoemBFFQsrXDqoR4wy2OJ");
		controller = ProfissionalController.getInstance();
		rand = new Random();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testCadastrarProfissionalSucesso()
			throws ProfissionalSaudeException, ParseException, InterruptedException {
		ProfissionalSaude prof = null;

		try {
			prof = new ProfissionalSaude("Médico", "" + rand.nextInt(),
					"Lucas Almeida", Especialidade.CARDIOLOGISTA.toString(),
					Convenio.SMILE.toString());
			controller.cadastrarProfissionalSaude(prof);
		} catch (ProfissionalSaudeException e) {
			fail();
		} catch (ParseException e) {
			fail();
		}

		// Verifica se salvou
		try {
			assertTrue(controller.buscarTodos().contains(prof));
			controller.removerProfissional(prof.getNumeroRegistro());
		} catch (ParseException e1) {
			fail();
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
			excption = e;
		} catch (ParseException e) {
			excption = e;
		}
		try {
			assertFalse(controller.buscarTodos().contains(prof));
		} catch (ParseException e) {
			
		}
		assertNotNull(excption);
		assertEquals(EXCESSAO, excption.getMessage());
	}

//	public void testCadastrarProfissionalPassandoParametros() throws ParseException {
//		Exception excption = null;
//		ProfissionalSaude prof = null;
//
//		try {
//			prof = new ProfissionalSaude(TipoProfissional.MEDICO.toString(), ""
//					+ rand.nextInt(), "Dean Feliciano",
//					Especialidade.CARDIOLOGISTA.toString(),
//					Convenio.SMILE.toString());
//
//			controller.cadastrarProfissionalSaude(prof.getNome(),
//					prof.getTipo(), prof.getNumeroRegistro(),
//					prof.getEspecialidade(), prof.getConvenios().get(0));
//
//		} catch (ProfissionalSaudeException e) {
//			excption = e;
//			Assert.fail("Nao Deveria ter lancado excessao");
//		}
//
//		assertNull(excption);
//
//		try {
//			assertTrue(controller.buscarTodos().contains(prof));
//		} catch (ProfissionalSaudeException e) {
//			e.printStackTrace();
//			Assert.fail("Nao Deveria ter lancado excessao");
//		} catch (ParseException e) {
//			Assert.fail("Nao Deveria ter lancado excessao");
//		}
//
//		try {
//			controller.removerProfissional(prof.getNumeroRegistro());
//		} catch (ProfissionalSaudeException e) {
//			fail("Nao deveria ter lancado excessao");
//		}
//
//	}
//
//	public void testCadastrarProfissionalPassandoParametrosInvalidos()
//			throws ProfissionalSaudeException {
//		Exception excption = null;
//		ProfissionalSaude prof = null;
//
//		try {
//			prof = new ProfissionalSaude(TipoProfissional.MEDICO.toString(), ""+rand.nextInt(), "Fulano gaspar", 
//					Especialidade.CARDIOLOGISTA.toString(), Convenio.UNIMED.toString());
//			
//			controller.cadastrarProfissionalSaude(null, prof.getTipo(),
//					prof.getNumeroRegistro(), prof.getEspecialidade(),
//					prof.getConvenios().get(0));
//			
//			Assert.fail("Deveria ter lancado excessao");
//		} catch (ProfissionalSaudeException e) {
//			e.printStackTrace();
//			excption = e;
//		}
//
//		assertNotNull(excption);
//		assertEquals(EXCESSAO, excption.getMessage());
//		try {
//			assertFalse(controller.buscarTodos().contains(prof));
//		} catch (ParseException e) {
//			fail();
//		}
//
//	}
//	
//	public void testCadastrarProfissionalCRMInvalido(){
//		Exception excption = null;
//		ProfissionalSaude prof = null;
//
//		try {
//			prof = new ProfissionalSaude(TipoProfissional.MEDICO.toString(), ""+rand.nextInt(), "Fulano gaspar", 
//					Especialidade.CARDIOLOGISTA.toString(), Convenio.UNIMED.toString());
//			controller.cadastrarProfissionalSaude(prof);
//			controller.cadastrarProfissionalSaude(prof);
//			fail("Deveria lencar excessao");
//		} catch (ProfissionalSaudeException e) {
//			e.printStackTrace();
//			excption = e;
//		} catch (ParseException e) {
//			fail();
//		}
//		assertNotNull(excption);
//		assertEquals(MensagemExcessao.ERRO.toString(), excption.getMessage());
//	}
//	
//	
//	public void testAvaliar() throws ParseException{
//		ProfissionalSaude prof = null;
//		final String cpf=""+rand.nextInt();
//		final String cpf2=""+rand.nextInt();
//		boolean positiva = true;
//		boolean negativa = false;
//		
//		try {
//			prof = new ProfissionalSaude(TipoProfissional.MEDICO.toString(),
//					""+rand.nextInt(), "Beltrano Figueiredo",
//					Especialidade.PEDIATRA.toString(),
//					Convenio.UNIMED.toString());
//			
//			controller.cadastrarProfissionalSaude(prof);
//			
//
//		} catch (ProfissionalSaudeException e) {
//			fail("Nao deveria ter lancado excessao");
//		} catch (ParseException e) {
//			fail("Nao deveria ter lancado excessao");
//		}
//
//		try {
//			
//			assertTrue(controller.getAvaliacoesNegativas(prof)==0);
//			controller.criarAvaliacao(cpf,prof.getNumeroRegistro(),negativa);
//			assertTrue(controller.getAvaliacoesNegativas(prof)==1);
//			
//			assertTrue(controller.getAvaliacoesPositivas(prof)==0);
//			controller.criarAvaliacao(cpf2,prof.getNumeroRegistro(),positiva);
//			assertTrue(controller.getAvaliacoesPositivas(prof)==1);
//			
//		} catch (ProfissionalSaudeException e1) {
//			fail();
//		} catch (ParseException e) {
//			fail();
//		}
//		
//		
//
//		try {
//			controller.removerAvalicao(cpf, prof.getNumeroRegistro());
//			controller.removerAvalicao(cpf2, prof.getNumeroRegistro());
//			controller.removerProfissional(prof.getNumeroRegistro());
//		} catch (ProfissionalSaudeException e) {
//			fail("Nao deveria ter lancado excessao");
//		}
//	}
//	
//	public void testAvaliacaoDuplicada() throws ProfissionalSaudeException, ParseException{
//		ProfissionalSaude prof = null;
//		final String cpf=""+rand.nextInt();
//		Exception exception=null;
//		boolean negativa=false;
//		
//		try {
//			prof = new ProfissionalSaude(TipoProfissional.MEDICO.toString(),
//					""+rand.nextInt(), "Beltrano Figueiredo",
//					Especialidade.PEDIATRA.toString(),
//					Convenio.UNIMED.toString());
//			
//			controller.cadastrarProfissionalSaude(prof);
//			
//
//		} catch (ProfissionalSaudeException e) {
//			e.printStackTrace();
//			fail("Nao deveria ter lancado excessao");
//		} catch (ParseException e) {
//			fail();
//		}
//
//		try {
//			
//			//Cria pela primeira vez
//			assertTrue(controller.getAvaliacoesNegativas(prof)==0);
//			controller.criarAvaliacao(cpf,prof.getNumeroRegistro(),negativa);
//			assertTrue(controller.getAvaliacoesNegativas(prof)==1);
//			//Cria pela segunda vez
//			controller.criarAvaliacao(cpf,prof.getNumeroRegistro(),negativa);
//			fail();
//		} catch (ProfissionalSaudeException e1) {
//			e1.printStackTrace();
//			exception = e1;
//		} catch (ParseException e) {
//			fail();
//		}
//		
//		assertNotNull(exception);
//		try {
//			assertTrue(controller.getAvaliacoesNegativas(prof)==1);
//		} catch (ParseException e1) {
//			fail();
//		}
//
//		try {
//			controller.removerProfissional(prof.getNumeroRegistro());
//		} catch (ProfissionalSaudeException e) {
//			e.printStackTrace();
//			fail("Nao deveria ter lancado excessao");
//		}
//	
//	}
//	
//	public void testRemoverProfissional() throws ProfissionalSaudeException, ParseException{
//		ProfissionalSaude prof = null;
//
//		try {
//			prof = new ProfissionalSaude("Médico", "" + rand.nextInt(),
//					"Lucas Almeida", Especialidade.CARDIOLOGISTA.toString(),
//					Convenio.SMILE.toString());
//			controller.cadastrarProfissionalSaude(prof);
//		} catch (ProfissionalSaudeException e) {
//			fail();
//		} catch (ParseException e) {
//			fail();
//		}
//
//		// Verifica se salvou
//		try {
//			assertTrue(controller.buscarTodos().contains(prof));
//		} catch (ParseException e1) {
//			fail();
//		}
//
//		try {
//			controller.removerProfissional(prof.getNumeroRegistro());
//		} catch (ProfissionalSaudeException e) {
//			fail("Nao deveria ter lancado excessao");
//		}
//		
//		ProfissionalSaude profRemoveu = controller.buscarProfissionalPorIdentificacao(prof.getNumeroRegistro());
//		assertNull(profRemoveu);
//	}
//	
//	public void testBuscarPorEspecialidade() throws ParseException {
//		List<ProfissionalSaude> profissionais = null;
//		ProfissionalSaude prof = null;
//
//		try {
//			prof = new ProfissionalSaude(TipoProfissional.MEDICO.toString(),
//					""+rand.nextInt(), "Beltrano Figueiredo",
//					Especialidade.PEDIATRA.toString(),
//					Convenio.UNIMED.toString());
//			
//			controller.cadastrarProfissionalSaude(prof);
//
//			profissionais = controller
//					.buscarProfissionalPorEspecialidade(Especialidade.PEDIATRA);
//		} catch (ProfissionalSaudeException e) {
//			fail("Nao deveria ter lancado excessao");
//		} catch (ParseException e) {
//			fail("Nao deveria ter lancado excessao");
//		}
//
//		assertNotNull(profissionais);
//
//		for (ProfissionalSaude profissional : profissionais) {
//			assertEquals(Especialidade.PEDIATRA.toString(),
//					profissional.getEspecialidade());
//		}
//
//		try {
//			controller.removerProfissional(prof.getNumeroRegistro());
//		} catch (ProfissionalSaudeException e) {
//			e.printStackTrace();
//			fail("Nao deveria ter lancado excessao");
//		}
//	}
}
