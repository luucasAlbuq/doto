package controller;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import dao.DAOREST;
import exception.ProfissionalSaudeException;
import model.ProfissionalSaude;
import model.TipoProfissional;
import util.Convenio;
import util.Especialidade;

public class ProfissionalController implements ProfissionalInterface {
	
	private static ProfissionalController instance;
	
	private DAOREST dao;
	private static ArrayList<ProfissionalSaude> resultadoBuscaSimples;
	private static ProfissionalSaude profissionalSelecionado;
	private Context context;
	
	private ProfissionalController(Context context) {
		this.context = context;
	}

	public static ProfissionalController getInstance(Context context) {
		if (instance == null){
			instance = new ProfissionalController(context);
		}
			
		return instance;
	}

	@Override
	public void cadastrarProfissionalSaude(String nome,String tipoProfissinal, String identificacao,String especialidade, String convenio) throws ProfissionalSaudeException {
		
		ProfissionalSaude profissional;
		try {
			profissional = new ProfissionalSaude(tipoProfissinal.toString(), identificacao, nome, especialidade, convenio);
			getDao().persistir(profissional);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ProfissionalSaudeException();
		}
		
	}
	
	public void cadastrarProfissionalSaude(ProfissionalSaude prof) throws ProfissionalSaudeException{
		getDao().persistir(prof);
		getDao().cadastrarProfissional(prof);
	}

	@Override
	public List<ProfissionalSaude> buscarProfissionalPorNome(String nome) {
		return  getDao().findByName(nome);
	}

	@Override
	public List<ProfissionalSaude> buscarProfissionalPorEspecialidade(
			Especialidade especialidade) throws ProfissionalSaudeException {
		return getDao().findByEspecialidade(especialidade.toString());
	}

	@Override
	public ProfissionalSaude buscarProfissionalPorIdentificacao(
			String identificacao) {
		return (ProfissionalSaude) getDao().findByIndentificao(identificacao);
	}

	@Override
	public List<ProfissionalSaude> buscarProfissionalPorTipo(TipoProfissional tipo) {
		return getDao().findByTipo(tipo);
	}

	@Override
	public ProfissionalSaude buscarProfissional(String nome,
			TipoProfissional tipoProfissional, int identificacao,
			Especialidade especialidade, Convenio convenio) {
		
		
		return null;
	}

	@Override
	public void atualizarProfissional(ProfissionalSaude profissional) {
		getDao().update(profissional);
	}

	@Override
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

	public DAOREST getDao() {
		if(dao==null){
			dao = DAOREST.getInstance(context);
		}
		return dao;
	}

	public void setDao(DAOREST dao) {
		this.dao = dao;
	}
	
	public List<ProfissionalSaude> buscaSimples(String tipo, String especialidade, String convenio,String cidade) throws ProfissionalSaudeException{
		//TODO Implementar
		
		ArrayList<ProfissionalSaude> resultado = getDao().buscaSimples(tipo, especialidade, convenio,cidade);
		setResultadoBuscaSimples(resultado);
		return resultado;
	}
	
	
	public List<ProfissionalSaude> buscarTodos() throws ProfissionalSaudeException{
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
		//getProfissionalSelecionado().setAvaliacao(profissionalSelecionado.getAvaliacao()+1);
		//getDao().updateAvaliacao(getProfissionalSelecionado().getAvaliacao(), getProfissionalSelecionado().getNumeroRegistro());
		getDao().criarAvaliacao(cpf, crm, avaliacao);
	}
	
	public int getAvaliacoesPositivas(String crm) throws ProfissionalSaudeException{
		return getDao().getAvaliacoesPositicas(crm);
	}
	
	public int getAvaliacoesNegativas(String crm) throws ProfissionalSaudeException{
		return getDao().getAvaliacoesNegativas(crm);
	}

}
