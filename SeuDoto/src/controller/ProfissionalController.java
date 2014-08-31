package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.parse.ParseException;

import dao.DAOParse;
import exception.ProfissionalSaudeException;
import model.Avaliacao;
import model.ProfissionalSaude;
import model.TipoProfissional;
import util.Convenio;
import util.Especialidade;

public class ProfissionalController implements ProfissionalInterface {
	
	private static ProfissionalController instance;

	private DAOParse daoParse;
	private static List<ProfissionalSaude> resultadoBuscaSimples;
	private static ProfissionalSaude profissionalSelecionado;
	private static Avaliacao avaliacaoCorrente;
	private static List<Avaliacao> avaliacoes;

	
	private ProfissionalController() {
		
	}

	public static ProfissionalController getInstance() {
		if (instance == null){
			instance = new ProfissionalController();
		}
			
		return instance;
	}

	
	@Override
	public void cadastrarProfissionalSaude(ProfissionalSaude prof) throws ProfissionalSaudeException, ParseException{
		getDaoParse().cadastrarProfissional(prof);
	}

	@Override
	public List<ProfissionalSaude> buscarProfissionalPorNome(String nome) {
		//TODO
		return Collections.emptyList(); 
	}

	@Override
	public List<ProfissionalSaude> buscarProfissionalPorEspecialidade(
			Especialidade especialidade) throws ProfissionalSaudeException, ParseException {
		return getDaoParse().buscarPorEspecialidade(especialidade.toString());
	}

	@Override
	public ProfissionalSaude buscarProfissionalPorIdentificacao(
			String identificacao) {
		return null;
	}

	@Override
	public List<ProfissionalSaude> buscarProfissionalPorTipo(TipoProfissional tipo) {
		return Collections.emptyList(); 
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
	public void removerProfissional(String crm) throws ProfissionalSaudeException, ParseException {
		getDaoParse().removerProfissional(crm);
	}
	
	public void removerAvalicao(String idUser, String crm) throws ParseException{
		getDaoParse().removerAvaliacao(idUser, crm);
	}
	
	public void addComentario(String idUser, String crm, String comentario) throws ParseException{
		getDaoParse().addComentario(idUser, crm, comentario);
	}

	public static List<ProfissionalSaude> getResultadoBuscaSimples() {
		return resultadoBuscaSimples;
	}

	public static void setResultadoBuscaSimples(
			List<ProfissionalSaude> resultado){
			resultadoBuscaSimples = resultado;
	}

	public List<ProfissionalSaude> buscaSimples(String tipo, String especialidade, ArrayList<String> convenios) throws ProfissionalSaudeException, ParseException{
		List<ProfissionalSaude> resultado = (ArrayList<ProfissionalSaude>) getDaoParse().buscaSimples(especialidade, tipo, convenios);
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
	
	public void criarAvaliacao(String idUser, String crm, boolean avaliacao, String comentario) throws ProfissionalSaudeException, ParseException{
		getDaoParse().criarAvaliacao(crm, idUser, avaliacao, comentario);
	}
	
	public int getAvaliacoesPositivas(ProfissionalSaude prof) throws ProfissionalSaudeException, ParseException{
		return getDaoParse().getAvaliacoesPositivas(prof);
	}
	
	public int getAvaliacoesNegativas(ProfissionalSaude prof) throws ProfissionalSaudeException, ParseException{
		return getDaoParse().getAvaliacoesNegativas(prof);
	}
	
	public void carregaAvaliacaoCorrente(String idUser, String crm) throws ParseException{
		setAvaliacaoCorrente(null);
		Avaliacao aval = getDaoParse().getObjetoAvaliacao(idUser, crm);
		if(aval!=null){
			setAvaliacaoCorrente(aval);
		}
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

	public static Avaliacao getAvaliacaoCorrente() {
		return avaliacaoCorrente;
	}

	public static void setAvaliacaoCorrente(Avaliacao avaliacaoCorrente) {
		ProfissionalController.avaliacaoCorrente = avaliacaoCorrente;
	}

	public static List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public static void setAvaliacoes(List<Avaliacao> avaliacoes) {
		ProfissionalController.avaliacoes = avaliacoes;
	}
	
	public void carregaAvaliacoes(String crm) throws ParseException{
		List<Avaliacao> aval=getDaoParse().getAvaliacoesByCrm(crm);
		setAvaliacoes(aval);
	}

	
}
