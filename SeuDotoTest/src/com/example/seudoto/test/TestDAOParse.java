package com.example.seudoto.test;

import java.util.ArrayList;

import model.ProfissionalSaude;
import android.test.AndroidTestCase;

import com.parse.Parse;
import com.parse.ParseException;

import dao.DAOParse;
import exception.ProfissionalSaudeException;

public class TestDAOParse extends AndroidTestCase {
	
	private ArrayList<String> crmProfsFake;
	
	protected void setUp() throws Exception {
		crmProfsFake = new ArrayList<String>();
		Parse.initialize(getContext(), "7EqoOy2DDnMMHlXUGAbi9aJkqIgryikPIRv7CzX3", "nvT2iYY8AfuMJgH7cJQeoemBFFQsrXDqoR4wy2OJ");
		super.setUp();
				
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testACadastrarProfissionalComSucesso(){
		Exception exception = new Exception();
		try {
			ProfissionalSaude p1 = new ProfissionalSaude("Medico", "abc-124", "TalesBoy", "Psiquiatra", "Particular");
			DAOParse.getInstance().cadastrarProfissional(p1);
			crmProfsFake.add(p1.getNumeroRegistro());
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
			exception = null;
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			exception = e;
			e.printStackTrace();
		}

		assertNull(exception);
	}
	
	public void testBCadastrarProfissionalCRMLongoComSucesso(){
		Exception exception = new Exception();
		try {
			ProfissionalSaude p3 = new ProfissionalSaude("Medico", "101010100001111000011110000111100001111", "Nazareno", "Terapeuta Social", "SUS");			
			DAOParse.getInstance().cadastrarProfissional(p3);
			crmProfsFake.add(p3.getNumeroRegistro());
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
			ProfissionalSaude p4 = new ProfissionalSaude("Medico", "1010101000", "Pajé", "Curandeiro", "UniIndio");
			DAOParse.getInstance().cadastrarProfissional(p4);		
			crmProfsFake.add(p4.getNumeroRegistro());
			exception = null;
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			exception = e;
			e.printStackTrace();
		}
		assertNull(exception);
	}
	
	public void testCCadastrarProfissionalCRMRepetido(){
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
	
	public void testDCadastrarProfissionalComFalhas(){
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
			DAOParse.getInstance().removerProfissional("1010101000");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
