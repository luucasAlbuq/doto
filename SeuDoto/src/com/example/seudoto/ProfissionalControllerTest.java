package com.example.seudoto;

import java.util.List;
import java.util.Random;

import model.ProfissionalSaude;
import model.TipoProfissional;

import org.junit.Assert;
import org.junit.Before;

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
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			fail();
		}

		// Verifica se salvou
		try {
			assertTrue(controller.buscarTodos().contains(prof));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
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

	public void testCadastrarProfissionalInvalido()
			throws ProfissionalSaudeException {

		ProfissionalSaude prof = null;
		Exception excption = null;
		try {
			controller.cadastrarProfissionalSaude(prof);
			Assert.fail("Deveria ter lancado excessao");
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			excption = e;
		} catch (ParseException e) {
			excption = e;
		}
		try {
			assertFalse(controller.buscarTodos().contains(prof));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
					prof.getEspecialidade(), prof.getConvenios().get(0));

		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			excption = e;
			Assert.fail("Nao Deveria ter lancado excessao");
		}

		assertNull(excption);

		try {
			assertTrue(controller.buscarTodos().contains(prof));
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			Assert.fail("Nao Deveria ter lancado excessao");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
					prof.getConvenios().get(0));
			
			Assert.fail("Deveria ter lancado excessao");
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			excption = e;
		}

		assertNotNull(excption);
		assertEquals(EXCESSAO, excption.getMessage());
		try {
			assertFalse(controller.buscarTodos().contains(prof));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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
			e.printStackTrace();
			excption = e;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(excption);
		assertEquals(MensagemExcessao.CRM_INVALIDO.toString(), excption.getMessage());
	}
	
	
	public void testAvaliar(){
		ProfissionalSaude prof = null;
		final String cpf=""+rand.nextInt();
		final String cpf2=""+rand.nextInt();
		boolean positiva = true;
		boolean negativa = false;
		
		try {
			prof = new ProfissionalSaude(TipoProfissional.MEDICO.toString(),
					""+rand.nextInt(), "Beltrano Figueiredo",
					Especialidade.PEDIATRA.toString(),
					Convenio.UNIMED.toString());
			
			controller.cadastrarProfissionalSaude(prof);
			

		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			fail("Nao deveria ter lancado excessao");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			
			assertTrue(controller.getAvaliacoesNegativas(prof)==0);
			controller.criarAvaliacao(cpf,prof.getNumeroRegistro(),negativa);
			assertTrue(controller.getAvaliacoesNegativas(prof)==1);
			
			assertTrue(controller.getAvaliacoesPositivas(prof)==0);
			controller.criarAvaliacao(cpf2,prof.getNumeroRegistro(),positiva);
			assertTrue(controller.getAvaliacoesPositivas(prof)==1);
			
		} catch (ProfissionalSaudeException e1) {
			e1.printStackTrace();
			fail();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
		Exception exception=null;
		boolean negativa=false;
		
		try {
			prof = new ProfissionalSaude(TipoProfissional.MEDICO.toString(),
					""+rand.nextInt(), "Beltrano Figueiredo",
					Especialidade.PEDIATRA.toString(),
					Convenio.UNIMED.toString());
			
			controller.cadastrarProfissionalSaude(prof);
			

		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			fail("Nao deveria ter lancado excessao");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			
			//Cria pela primeira vez
			assertTrue(controller.getAvaliacoesNegativas(prof)==0);
			controller.criarAvaliacao(cpf,prof.getNumeroRegistro(),negativa);
			assertTrue(controller.getAvaliacoesNegativas(prof)==1);
			//Cria pela segunda vez
			controller.criarAvaliacao(cpf,prof.getNumeroRegistro(),negativa);
			fail();
		} catch (ProfissionalSaudeException e1) {
			e1.printStackTrace();
			exception = e1;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertNotNull(exception);
		try {
			assertTrue(controller.getAvaliacoesNegativas(prof)==1);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

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
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
