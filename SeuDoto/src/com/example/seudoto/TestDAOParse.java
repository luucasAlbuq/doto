package com.example.seudoto;

import java.util.Random;

import model.ProfissionalSaude;

import org.junit.Before;

import controller.ProfissionalController;
import dao.DAOParse;
import exception.ProfissionalSaudeException;
import android.test.AndroidTestCase;

public class TestDAOParse extends AndroidTestCase {
	
	private DAOParse daoParse;
	
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		daoParse.getInstance();
				
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testCadastrarProfissional(){
		try {
			ProfissionalSaude p1 = new ProfissionalSaude("Medico", "6669", "TalesBoy", "Psiquiatra", "Particular");
			
		} catch (ProfissionalSaudeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
