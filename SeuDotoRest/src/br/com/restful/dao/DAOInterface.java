package br.com.restful.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.restful.exception.ProfissionalSaudeException;
import br.com.restful.model.Cliente;
import br.com.restful.model.ProfissionalSaude;

public interface DAOInterface {

	public ArrayList<ProfissionalSaude> findAll() throws ProfissionalSaudeException;

	public void cadastrarProfissional(ProfissionalSaude profissional)
			throws ProfissionalSaudeException;

	public void removerProfissional(ProfissionalSaude profissional)
			throws ProfissionalSaudeException;

	public List<ProfissionalSaude> findByEspecialidade(String especialidade)
			throws ProfissionalSaudeException;

	public List<ProfissionalSaude> findByTipo(String tipo)
			throws ProfissionalSaudeException;

	public List<ProfissionalSaude> buscaSimples(String tipo,
			String especialidade, String convenio, String cidade)
			throws ProfissionalSaudeException;

	public void update(ProfissionalSaude profissional)
			throws ProfissionalSaudeException;

	public ProfissionalSaude findByIndentificao(String identificacao)
			throws ProfissionalSaudeException;

	public int getAvaliacoesPositicas(String crm)
			throws ProfissionalSaudeException;

	public int getAvaliacoesNegativas(String crm)
			throws ProfissionalSaudeException;

	public void criarAvaliacao(String cpf, String crm, int avaliacao)
			throws ProfissionalSaudeException;

	public boolean existeAvaliacao(String cpf, String crm)
			throws ProfissionalSaudeException;

	public boolean existeCRM(String crm) throws ProfissionalSaudeException;

	public List<ProfissionalSaude> findByName(String nomeProf)
			throws ProfissionalSaudeException;

	public void remover(ProfissionalSaude profissional)
			throws ProfissionalSaudeException;

}
