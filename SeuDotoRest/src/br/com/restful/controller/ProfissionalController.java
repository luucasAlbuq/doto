package br.com.restful.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.restful.dao.DAO;
import br.com.restful.exception.ProfissionalSaudeException;
import br.com.restful.model.Cliente;
import br.com.restful.model.ProfissionalSaude;
import br.com.restful.util.TipoProfissional;
import br.com.restful.util.Convenio;
import br.com.restful.util.Especialidade;


public class ProfissionalController {
	
private static ProfissionalController instance;
	
	private DAO dao;
	private static ArrayList<ProfissionalSaude> resultadoBuscaSimples;
	private static ProfissionalSaude profissionalSelecionado;

	public static ProfissionalController getInstance() {
		if (instance == null){
			instance = new ProfissionalController();
		}
			
		return instance;
	}

	
	public void cadastrarProfissionalSaude(ProfissionalSaude prof) throws ProfissionalSaudeException{
		getDao().cadastrarProfissional(prof);
	}

	public List<ProfissionalSaude> buscarProfissionalPorNome(String nome) throws ProfissionalSaudeException {
		return  getDao().findByName(nome);
	}

	public List<ProfissionalSaude> buscarProfissionalPorEspecialidade(
			Especialidade especialidade) throws ProfissionalSaudeException {
		return getDao().findByEspecialidade(especialidade.toString());
	}

	
	public ProfissionalSaude buscarProfissionalPorIdentificacao(
			String identificacao) throws ProfissionalSaudeException {
		return (ProfissionalSaude) getDao().findByIndentificao(identificacao);
	}

	public List<ProfissionalSaude> buscarProfissionalPorTipo(TipoProfissional tipo) throws ProfissionalSaudeException {
		return getDao().findByTipo(tipo.toString());
	}

	
	public ProfissionalSaude buscarProfissional(String nome,
			TipoProfissional tipoProfissional, int identificacao,
			Especialidade especialidade, Convenio convenio) {
		
		
		return null;
	}

	
	public void atualizarProfissional(ProfissionalSaude profissional) throws ProfissionalSaudeException {
		getDao().update(profissional);
	}

	public void removerProfissional(ProfissionalSaude profissional) throws ProfissionalSaudeException {
		getDao().remover(profissional);
	}

	public static ArrayList<ProfissionalSaude> getResultadoBuscaSimples() {
		return resultadoBuscaSimples;
	}

	public static void setResultadoBuscaSimples(
			ArrayList<ProfissionalSaude> resultado){
			resultadoBuscaSimples = resultado;
	}

	public DAO getDao() {
		if(dao==null){
			dao = DAO.getInstance();
		}
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}
	
	public List<ProfissionalSaude> buscaSimples(String tipo, String especialidade, String convenio,String cidade) throws ProfissionalSaudeException{
		//TODO Implementar
		
		ArrayList<ProfissionalSaude> resultado = new ArrayList<ProfissionalSaude>(getDao().buscaSimples(tipo, especialidade, convenio,cidade));
		setResultadoBuscaSimples(resultado);
		return resultado;
	}
	
	
	public ArrayList<ProfissionalSaude> buscarTodos() throws ProfissionalSaudeException{
		return getDao().findAll();
	}

	public static ProfissionalSaude getProfissionalSelecionado() {
		return profissionalSelecionado;
	}

	public static void setProfissionalSelecionado(
			ProfissionalSaude profissionalSelecionado) {
		ProfissionalController.profissionalSelecionado = profissionalSelecionado;
	}
	
	public void criarAvaliacao(String cpf, String crm, int avaliacao) throws ProfissionalSaudeException{
		getDao().criarAvaliacao(cpf, crm, avaliacao);
	}
	
	public int getAvaliacoesPositivas(String crm) throws ProfissionalSaudeException{
		return getDao().getAvaliacoesPositicas(crm);
	}
	
	public int getAvaliacoesNegativas(String crm) throws ProfissionalSaudeException{
		return getDao().getAvaliacoesNegativas(crm);
	}
}
