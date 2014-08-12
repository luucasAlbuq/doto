package com.example.seudoto;

import java.util.Random;

import model.ProfissionalSaude;

import org.junit.Before;

import com.parse.ParseException;

import controller.ProfissionalController;
import dao.DAOParse;
import exception.ProfissionalSaudeException;
import android.test.AndroidTestCase;

public class TestDAOParse extends AndroidTestCase {
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
				
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testCadastrarProfissionalComSucesso(){
		Exception exception = null;
		try {
			ProfissionalSaude p1 = new ProfissionalSaude("Medico", "abc-124", "TalesBoy", "Psiquiatra", "Particular");
			ProfissionalSaude p2 = new ProfissionalSaude("Medico", "101010100001111000011110000111100001111", "Nazareno", "Terapeuta Social", "SUS");
			ProfissionalSaude p3 = new ProfissionalSaude("Medico", "101010100001111000011110000111100001110", "Gesuis Krysto Todo Poderoso Alpha e Omega e etc e tal", "Placebista", "UniCristao");
			ProfissionalSaude p4 = new ProfissionalSaude("Medico", "1010101", "Timothy Leary", "Experimentalista", "Particular");
			
			DAOParse.getInstance().cadastrarProfissional(p1);
			DAOParse.getInstance().cadastrarProfissional(p2);
			DAOParse.getInstance().cadastrarProfissional(p3);
			DAOParse.getInstance().cadastrarProfissional(p4);
			
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			exception = e;
			e.printStackTrace();
		}
		
		assertNull(exception);
	}
	
	public void testCadastrarProfissionalComFalhas(){
		Exception exception = null;
		
		try {
			ProfissionalSaude p1 = new ProfissionalSaude("Medico", "abc-124", "TalesBoy", "Psiquiatra", "Particular");		
			ProfissionalSaude p2 = new ProfissionalSaude("Medico", "101010100001111000011110000111100001111", "Nazareno", "Terapeuta Social", "SUS");
			ProfissionalSaude p3 = new ProfissionalSaude("Medico", "101010100001111000011110000111100001110", "Gesuis Krysto Todo Poderoso Alpha e Omega e etc e tal", "Placebista", "UniCristao");
			ProfissionalSaude p4 = new ProfissionalSaude("Medico", "1010101", "Timothy Leary", "Experimentalista", "Particular");
			DAOParse.getInstance().cadastrarProfissional(p1);
	
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			
		}catch (ParseException e) {
			exception = e;
			e.printStackTrace();
		}
		
		assertNotNull(exception);
		exception = null;
		
		try {
			ProfissionalSaude p2 = new ProfissionalSaude("Medico", "101010100001111000011110000111100001111", "Nazareno", "Terapeuta Social", "SUS");
			DAOParse.getInstance().cadastrarProfissional(p2);
	
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			
		}catch (ParseException e) {
			exception = e;
			e.printStackTrace();
		}
		
		assertNotNull(exception);
		exception = null;
		
		try {
			ProfissionalSaude p3 = new ProfissionalSaude("Medico", "101010100001111000011110000111100001110", "Gesuis Krysto Todo Poderoso Alpha e Omega e etc e tal", "Placebista", "UniCristao");
			DAOParse.getInstance().cadastrarProfissional(p3);
	
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			
		}catch (ParseException e) {
			exception = e;
			e.printStackTrace();
		}
		
		assertNotNull(exception);
		exception = null;
		
		try {
			ProfissionalSaude p4 = new ProfissionalSaude("Medico", "1010101", "Timothy Leary", "Experimentalista", "Particular");
			DAOParse.getInstance().cadastrarProfissional(p4);
			
		} catch (ProfissionalSaudeException e) {
			e.printStackTrace();
			
		}catch (ParseException e) {
			exception = e;
			e.printStackTrace();
		}
		
		assertNotNull(exception);
		
	}

}
