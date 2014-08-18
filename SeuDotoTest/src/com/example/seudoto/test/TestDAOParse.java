package com.example.seudoto.test;

import java.util.ArrayList;
import java.util.List;

import model.ProfissionalSaude;
import android.test.AndroidTestCase;

import com.parse.Parse;
import com.parse.ParseException;

import dao.DAOParse;
import exception.ProfissionalSaudeException;

public class TestDAOParse extends AndroidTestCase {
	
	private ArrayList<String> crmProfsFake;
	private ArrayList<ProfissionalSaude> cadastrados;
	
	protected void setUp() throws Exception {
		crmProfsFake = new ArrayList<String>();
		cadastrados = new ArrayList<ProfissionalSaude>();
		Parse.initialize(getContext(), "7EqoOy2DDnMMHlXUGAbi9aJkqIgryikPIRv7CzX3", "nvT2iYY8AfuMJgH7cJQeoemBFFQsrXDqoR4wy2OJ");
		super.setUp();
				
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testA_CadastrarProfissionalComSucesso(){
		Exception exception = new Exception();
		try {
			ProfissionalSaude p1 = new ProfissionalSaude("Medico", "abc-124", "TalesBoy", "Psiquiatra", "Particular");
			DAOParse.getInstance().cadastrarProfissional(p1);
			crmProfsFake.add(p1.getNumeroRegistro());
			cadastrados.add(p1);
			exception = null;
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			exception = e;
			e.printStackTrace();
		}
		assertNull(exception);

		exception = new Exception();
		try {
			ProfissionalSaude p2 = new ProfissionalSaude("Medico", "1010101", "Timothy Leary", "Experimentalista", "Particular");
			DAOParse.getInstance().cadastrarProfissional(p2);
			crmProfsFake.add(p2.getNumeroRegistro());
			cadastrados.add(p2);
			exception = null;
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			exception = e;
			e.printStackTrace();
		}

		assertNull(exception);
	}
	
	public void testB_CadastrarProfissionalCRMLongoComSucesso(){
		Exception exception = new Exception();
		try {
			ProfissionalSaude p3 = new ProfissionalSaude("Medico", "101010100001111000011110000111100001111", "Nazareno", "Terapeuta Social", "SUS");			
			DAOParse.getInstance().cadastrarProfissional(p3);
			crmProfsFake.add(p3.getNumeroRegistro());
			cadastrados.add(p3);
			exception = null;
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			exception = e;
			e.printStackTrace();
		}
		assertNull(exception);
		
		exception = new Exception();
		try {
			exception = null;
			ProfissionalSaude p4 = new ProfissionalSaude("Medico", "1110101", "Paje", "Curandeiro", "UniIndio");
			DAOParse.getInstance().cadastrarProfissional(p4);		
			crmProfsFake.add(p4.getNumeroRegistro());
			cadastrados.add(p4);
			
		} catch (ProfissionalSaudeException e) {
			exception = e;
			e.printStackTrace();
		} catch (ParseException e) {
			exception = e;
			e.printStackTrace();
		}
		assertNull(exception);
	}
	
	public void testC_CadastrarProfissionalCRMRepetido(){
		boolean uniqueCRM = true;
		try {
			ProfissionalSaude p1 = new ProfissionalSaude("Medico", "abc-124", "TalesBoy-CRMRepetido", "Psiquiatra", "Particular");			
			uniqueCRM = DAOParse.getInstance().isCrmUnico(p1.getNumeroRegistro());
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			fail("Problemas com ProfissionalSaude");
		} catch (ParseException e) {
			e.printStackTrace();
			fail("Problemas com Parse");
		}
		assertFalse(uniqueCRM);
		
		uniqueCRM = true;
		try {
			ProfissionalSaude p2 = new ProfissionalSaude("Medico", "1010101", "Timothy Leary - CRMRepetido", "Experimentalista", "Particular");
			uniqueCRM = DAOParse.getInstance().isCrmUnico(p2.getNumeroRegistro());
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			fail("Problemas com ProfissionalSaude");
		} catch (ParseException e) {
			e.printStackTrace();
			fail("Problemas com Parse");
		}
		assertFalse(uniqueCRM);
	}
	
	public void testD_CadastrarProfissionalComFalhas(){
		Exception exception = new Exception();	
		//Tipo null
		try {
			ProfissionalSaude p5 = new ProfissionalSaude(null, "123null456", "Dr Fake", "Placebologista", "UniT");
			crmProfsFake.add(p5.getNumeroRegistro());
			exception = null;
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			exception = e;
		}
		assertNotNull(exception);
		
		exception = new Exception();	
		//CRM null
		try {
			ProfissionalSaude p5 = new ProfissionalSaude("Médico", null, "Dr Fake", "Placebologista", "UniT");
			crmProfsFake.add(p5.getNumeroRegistro());
			exception = null;
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			exception = e;
		}
		assertNotNull(exception);
		
		exception = new Exception();	
		//CRM string vazia
		try {
			ProfissionalSaude p5 = new ProfissionalSaude("Médico", "", "Dr Fake", "Placebologista", "UniT");
			crmProfsFake.add(p5.getNumeroRegistro());
			exception = null;
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			exception = e;
		}
		assertNotNull(exception);
		
		exception = new Exception();	
		//Nome null
		try {
			ProfissionalSaude p5 = new ProfissionalSaude("Médico", "314156", null, "Placebologista", "UniT");
			crmProfsFake.add(p5.getNumeroRegistro());
			exception = null;
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			exception = e;
		}
		assertNotNull(exception);
		
		exception = new Exception();	
		//Nome vazio
		try {
			ProfissionalSaude p5 = new ProfissionalSaude("Médico", "314156", "", "Placebologista", "UniT");
			crmProfsFake.add(p5.getNumeroRegistro());
			exception = null;
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			exception = e;
		}
		assertNotNull(exception);
		
		exception = new Exception();	
		//Especialidade null
		try {
			ProfissionalSaude p5 = new ProfissionalSaude("Médico", "314156", "Dr Fake", null, "UniT");
			crmProfsFake.add(p5.getNumeroRegistro());
			exception = null;
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			exception = e;
		}
		assertNotNull(exception);
		
		exception = new Exception();	
		//Especialidade vazio
		try {
			ProfissionalSaude p5 = new ProfissionalSaude("Médico", "314156", "Dr Fake", "", "UniT");
			crmProfsFake.add(p5.getNumeroRegistro());
			exception = null;
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			exception = e;
		}
		assertNotNull(exception);
	}
	
	public void testE_CadastrarProfissionalCRMRepetido(){
		boolean uniqueCRM = true;
		try {
			ProfissionalSaude p1 = new ProfissionalSaude("Medico", "abc-124", "TalesBoy-CRMRepetido", "Psiquiatra", "Particular");			
			uniqueCRM = DAOParse.getInstance().isCrmUnico(p1.getNumeroRegistro());
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			fail("Problemas com ProfissionalSaude");
		} catch (ParseException e) {
			e.printStackTrace();
			fail("Problemas com Parse");
		}
		assertFalse(uniqueCRM);
		
		uniqueCRM = true;
		try {
			ProfissionalSaude p2 = new ProfissionalSaude("Medico", "1010101", "Timothy Leary - CRMRepetido", "Experimentalista", "Particular");
			uniqueCRM = DAOParse.getInstance().isCrmUnico(p2.getNumeroRegistro());
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			fail("Problemas com ProfissionalSaude");
		} catch (ParseException e) {
			e.printStackTrace();
			fail("Problemas com Parse");
		}
		assertFalse(uniqueCRM);
	}
	
	public void testF_FindAll(){
		Exception exception = new Exception();
		ArrayList<String> crms = new ArrayList<String>();
		
		try {
			List<ProfissionalSaude> profs = DAOParse.getInstance().findAll();
			for (ProfissionalSaude p : profs) {
				crms.add(p.getNumeroRegistro());
			}
			
			exception = null;
		} catch (ProfissionalSaudeException e) {
			exception = e;
			e.printStackTrace();
		} catch (ParseException e) {
			exception = e;
			e.printStackTrace();
		}
		
		assertNull(exception);
		assertTrue(crms.contains("abc-124"));
		assertTrue(crms.contains("1010101"));
		assertTrue(crms.contains("101010100001111000011110000111100001111"));
		assertTrue(crms.contains("1010101000"));
		
	}
	
	public void testG_BuscaSimples(){
		Exception exception = new Exception();

		boolean teste = false;
		
		ArrayList<ProfissionalSaude> profs = new ArrayList<ProfissionalSaude>();
		try {
			profs = DAOParse.getInstance().buscaSimples("Psiquiatra", "Médico", "Particular");
		} catch (Exception e) {
			exception = e;
			e.printStackTrace();
		} 
		assertNull(exception);
		for (ProfissionalSaude p : profs) {
			if(p.getNumeroRegistro().equals("abc-123")){
				System.out.println(p.getNumeroRegistro());
				teste = true;
				break;
			}
		}
		assertTrue(teste);
		
		//zerando as variaveis de teste
		exception = new Exception();		
		teste = false;
		
		try {
			profs = DAOParse.getInstance().buscaSimples("", "Medico", "Particular");
		} catch (Exception e) {
			exception = e;
			e.printStackTrace();
		} 
		assertNull(exception);
		for (ProfissionalSaude p : profs) {
			if(p.getNumeroRegistro().equals("abc-123")){
				System.out.println(p.getNumeroRegistro());
				teste = true;
				break;
			}
		}
		assertTrue(teste);
		
		//zerando as variaveis de teste
		exception = new Exception();		
		teste = false;
		
		try {
			profs = DAOParse.getInstance().buscaSimples("Psiquiatra", "", "Particular");
		} catch (Exception e) {
			exception = e;
			e.printStackTrace();
		} 
		assertNull(exception);
		for (ProfissionalSaude p : profs) {
			if(p.getNumeroRegistro().equals("abc-123")){
				System.out.println(p.getNumeroRegistro());
				teste = true;
				break;
			}
		}
		assertTrue(teste);
		
		//zerando as variaveis de teste
		exception = new Exception();		
		teste = false;
		
		try {
			profs = DAOParse.getInstance().buscaSimples("", "", "Particular");
		} catch (Exception e) {
			exception = e;
			e.printStackTrace();
		} 
		assertNull(exception);
		for (ProfissionalSaude p : profs) {
			if(p.getNumeroRegistro().equals("abc-123")){
				System.out.println(p.getNumeroRegistro());
				teste = true;
				break;
			}
		}
		assertTrue(teste);
		
		//zerando as variaveis de teste
		exception = new Exception();		
		teste = false;
		
		try {
			profs = DAOParse.getInstance().buscaSimples("Psiquiatra", "Médico", "");
		} catch (Exception e) {
			exception = e;
			e.printStackTrace();
		} 
		assertNull(exception);
		for (ProfissionalSaude p : profs) {
			if(p.getNumeroRegistro().equals("abc-123")){
				System.out.println(p.getNumeroRegistro());
				teste = true;
				break;
			}
		}
		assertTrue(teste);
		
		//zerando as variaveis de teste
		exception = new Exception();		
		teste = false;
		
		try {
			profs = DAOParse.getInstance().buscaSimples("", "Médico", "");
		} catch (Exception e) {
			exception = e;
			e.printStackTrace();
		} 
		assertNull(exception);
		for (ProfissionalSaude p : profs) {
			if(p.getNumeroRegistro().equals("abc-123")){
				System.out.println(p.getNumeroRegistro());
				teste = true;
				break;
			}
		}
		assertTrue(teste);
		
		//zerando as variaveis de teste
		exception = new Exception();		
		teste = false;
		
		try {
			profs = DAOParse.getInstance().buscaSimples("Psiquiatra", "", "");
		} catch (Exception e) {
			exception = e;
			e.printStackTrace();
		} 
		assertNull(exception);
		for (ProfissionalSaude p : profs) {
			if(p.getNumeroRegistro().equals("abc-123")){
				System.out.println(p.getNumeroRegistro());
				teste = true;
				break;
			}
		}
		assertTrue(teste);
		
		//zerando as variaveis de teste
		exception = new Exception();		
		teste = false;
		
		try {
			profs = DAOParse.getInstance().buscaSimples("", "", "");
		} catch (Exception e) {
			exception = e;
			e.printStackTrace();
		} 
		assertNull(exception);
		for (ProfissionalSaude p : profs) {
			if(p.getNumeroRegistro().equals("abc-123")){
				System.out.println(p.getNumeroRegistro());
				teste = true;
				break;
			}
		}
		assertTrue(teste);
	}
	
	public void testH_BuscaPorEspecialidade(){
		Exception exception = new Exception();

		boolean teste = false;
		
		ArrayList<ProfissionalSaude> profs = new ArrayList<ProfissionalSaude>();
		try {
			profs = DAOParse.getInstance().buscarPorEspecialidade("Curandeiro");
		} catch (Exception e) {
			exception = e;
			e.printStackTrace();
		} 
		assertNull(exception);
		for (ProfissionalSaude p : profs) {
			if(p.getNumeroRegistro().equals("abc-123")){
				System.out.println(p.getNumeroRegistro());
				teste = true;
				break;
			}
		}
		assertTrue(teste);
	}
	
	
	public void testI_BuscaPorCRM(){
		Exception exception = new Exception();
		
		ProfissionalSaude prof = null;
		try {
			prof = new ProfissionalSaude("Medico", "000", "Fake", "Fakologo", "PlanoFake");
		} catch (ProfissionalSaudeException e1) {
			e1.printStackTrace();
		}
		
		try {
			prof = DAOParse.getInstance().buscarProfissinalPorCRM("1110101");
		} catch (Exception e) {
			exception = e;
			e.printStackTrace();
		} 
		assertNull(exception);
		assertTrue(prof.getNome().equals("Paje"));
	}
	
	
	public void testZremoveProfissinaisFakeFromTest() {
		System.out.println("CRM " + crmProfsFake.size());
		
		try {
			DAOParse.getInstance().removerProfissional("abc-124");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			DAOParse.getInstance().removerProfissional("1010101");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			DAOParse.getInstance().removerProfissional("101010100001111000011110000111100001111");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			DAOParse.getInstance().removerProfissional("1110101");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
