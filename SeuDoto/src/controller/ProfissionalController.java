package controller;

import java.util.ArrayList;
import java.util.List;

import com.parse.ParseException;

import android.content.Context;
import dao.DAOParse;
import dao.DAOREST;
import exception.ProfissionalSaudeException;
import model.ProfissionalSaude;
import model.TipoProfissional;
import util.Convenio;
import util.Especialidade;

public class ProfissionalController implements ProfissionalInterface {
	
	private static ProfissionalController instance;

	private DAOParse daoParse;
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
		} catch (Exception e) {
			e.printStackTrace();
			throw new ProfissionalSaudeException();
		}
		
	}
	
	public void cadastrarProfissionalSaude(ProfissionalSaude prof) throws ProfissionalSaudeException, ParseException{
		getDaoParse().cadastrarProfissional(prof);
	}

	@Override
	public List<ProfissionalSaude> buscarProfissionalPorNome(String nome) {
		//TODO
		return null;
	}

	@Override
	public List<ProfissionalSaude> buscarProfissionalPorEspecialidade(
			Especialidade especialidade) throws ProfissionalSaudeException {
		//TODO
		return null;
	}

	@Override
	public ProfissionalSaude buscarProfissionalPorIdentificacao(
			String identificacao) {
		return null;
	}

	@Override
	public List<ProfissionalSaude> buscarProfissionalPorTipo(TipoProfissional tipo) {
		return null;
	}

	@Override
	public ProfissionalSaude buscarProfissional(String nome,
			TipoProfissional tipoProfissional, int identificacao,
			Especialidade especialidade, Convenio convenio) {
		
		//TODO
		return null;
	}

	@Override
	public void atualizarProfissional(ProfissionalSaude profissional) {
		//TODO
	}

	@Override
	public void removerProfissional(ProfissionalSaude profissional) throws ProfissionalSaudeException {
		//TODO
	}

	public static ArrayList<ProfissionalSaude> getResultadoBuscaSimples() {
		return resultadoBuscaSimples;
	}

	public static void setResultadoBuscaSimples(
			ArrayList<ProfissionalSaude> resultado){
			resultadoBuscaSimples = resultado;
	}

	public List<ProfissionalSaude> buscaSimples(String tipo, String especialidade, String convenio) throws ProfissionalSaudeException, ParseException{
		ArrayList<ProfissionalSaude> resultado = (ArrayList<ProfissionalSaude>) getDaoParse().buscaSimples(especialidade, tipo, convenio);
		setResultadoBuscaSimples(resultado);
		return resultado;
	}
	
	
	public List<ProfissionalSaude> buscarTodos() throws ProfissionalSaudeException, ParseException{
		setResultadoBuscaSimples((ArrayList<ProfissionalSaude>) getDaoParse().findAll());
		return getResultadoBuscaSimples();
	}

	public static ProfissionalSaude getProfissionalSelecionado() {
		return profissionalSelecionado;
	}

	public static void setProfissionalSelecionado(
			ProfissionalSaude profissionalSelecionado) {
		ProfissionalController.profissionalSelecionado = profissionalSelecionado;
	}
	
	public void criarAvaliacao(String idUser, String crm, boolean avaliacao) throws ProfissionalSaudeException, ParseException{
		getDaoParse().criarAvaliacao(crm, idUser, avaliacao);
	}
	
	public int getAvaliacoesPositivas(ProfissionalSaude prof) throws ProfissionalSaudeException, ParseException{
		return getDaoParse().getAvaliacoesPositivas(prof);
	}
	
	public int getAvaliacoesNegativas(ProfissionalSaude prof) throws ProfissionalSaudeException, ParseException{
		return getDaoParse().getAvaliacoesNegativas(prof);
	}

	public DAOParse getDaoParse() {
		if(daoParse==null){
			daoParse = DAOParse.getInstance();
		}
		return daoParse;
	}

	public void setDaoParse(DAOParse daoParse) {
		this.daoParse = daoParse;
	}
	
	

}
