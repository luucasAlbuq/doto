package br.com.restful.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.restful.exception.ProfissionalSaudeException;
import br.com.restful.model.Cliente;
import br.com.restful.model.ProfissionalSaude;

/**
 * 
 * Classe responsável por conter os metodos do CRUD
 *
 * @author Lucas
 * @version 1.0
 */
public class DAO implements DAOInterface {
	
private static DAO instance;
	
	
	/**
	 * 
	 * Método responsável por criar uma instancia da classe ClienteDAO (Singleton)
	 *
	 * @return
	 * @author Lucas
	 * @version 1.0
	 */
	public static DAO getInstance(){
		if(instance == null)
			instance = new DAO();
		return instance;
	}


	@Override
	public ArrayList<ProfissionalSaude> findAll() throws ProfissionalSaudeException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void cadastrarProfissional(ProfissionalSaude profissional)
			throws ProfissionalSaudeException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void removerProfissional(ProfissionalSaude profissional)
			throws ProfissionalSaudeException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<ProfissionalSaude> findByEspecialidade(String especialidade)
			throws ProfissionalSaudeException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<ProfissionalSaude> findByTipo(String tipo)
			throws ProfissionalSaudeException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<ProfissionalSaude> buscaSimples(String tipo,
			String especialidade, String convenio, String cidade)
			throws ProfissionalSaudeException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void update(ProfissionalSaude profissional)
			throws ProfissionalSaudeException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public ProfissionalSaude findByIndentificao(String identificacao)
			throws ProfissionalSaudeException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int getAvaliacoesPositicas(String crm)
			throws ProfissionalSaudeException {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int getAvaliacoesNegativas(String crm)
			throws ProfissionalSaudeException {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void criarAvaliacao(String cpf, String crm, int avaliacao)
			throws ProfissionalSaudeException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean existeAvaliacao(String cpf, String crm)
			throws ProfissionalSaudeException {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean existeCRM(String crm) throws ProfissionalSaudeException {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<ProfissionalSaude> findByName(String nomeProf)
			throws ProfissionalSaudeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(ProfissionalSaude profissional)throws ProfissionalSaudeException {
		// TODO Auto-generated method stub
		
	}
	
	
}
