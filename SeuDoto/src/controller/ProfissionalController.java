package controller;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import dao.DAOREST;
import model.Endereco;
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
	public void cadastrarProfissionalSaude(String nome,String tipoProfissinal, String identificacao,String especialidade, String endereco, String convenio) {
		
		ProfissionalSaude profissional;
		try {
			profissional = new ProfissionalSaude(tipoProfissinal.toString(), identificacao, nome, endereco, especialidade, convenio);
			getDao().persistir(profissional);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void cadastrarProfissionalSaude(ProfissionalSaude prof){
		getDao().persistir(prof);
	}

	@Override
	public List<ProfissionalSaude> buscarProfissionalPorNome(String nome) {
		return  getDao().findByName(nome);
	}

	@Override
	public List<ProfissionalSaude> buscarProfissionalPorEspecialidade(
			Especialidade especialidade) {
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
			Especialidade especialidade, Endereco endereco, Convenio convenio) {
		
		
		return null;
	}

	@Override
	public void atualizarProfissional(ProfissionalSaude profissional) {
		getDao().update(profissional);
	}

	@Override
	public void removerProfissional(ProfissionalSaude profissional) {
		getDao().remover(profissional);
	}

	public static ArrayList<ProfissionalSaude> getResultadoBuscaSimples() {

		//Bloco de teste
//		Endereco endereco = new Endereco("Rua quilombos", "123", "Centro", "03A", "Campina Grande", "PB");
//		ProfissionalSaude prof1 = new ProfissionalSaude(TipoProfissional.DENTISTA, "1234", "Fulano", endereco);
//		prof1.addConvenio(Convenio.SMILE);
//		prof1.addConvenio(Convenio.UNIDENTES);
//		
//		ProfissionalSaude prof2 = new ProfissionalSaude(TipoProfissional.MEDICO, "5678", "Beltrano", endereco);
//		prof1.addConvenio(Convenio.UNIMED);
//		
//		ArrayList<ProfissionalSaude> saida = new ArrayList<ProfissionalSaude>();
//		saida.add(prof1);
//		saida.add(prof2);
//		
//		return saida;

		return resultadoBuscaSimples;
	}

	public void setResultadoBuscaSimples(
			ArrayList<ProfissionalSaude> resultadoBuscaSimples) {
		this.resultadoBuscaSimples = resultadoBuscaSimples;
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
	
	public List<ProfissionalSaude> buscaSimples(String tipo, String especialidade, String convenio,String cidade){
		//TODO Implementar
		
		ArrayList<ProfissionalSaude> resultado = getDao().buscaSimples(tipo, especialidade, convenio,cidade);
		setResultadoBuscaSimples(resultado);
		return resultado;
	}
	
	
	public List<ProfissionalSaude> buscarTodos(){
		return getDao().findAll();
	}

	public static ProfissionalSaude getProfissionalSelecionado() {
		return profissionalSelecionado;
	}

	public static void setProfissionalSelecionado(
			ProfissionalSaude profissionalSelecionado) {
		ProfissionalController.profissionalSelecionado = profissionalSelecionado;
	}
	
	public void incrementaAvaliacao(){
		getProfissionalSelecionado().setAvaliacao(profissionalSelecionado.getAvaliacao()+1);
		getDao().updateAvaliacao(getProfissionalSelecionado().getAvaliacao(), getProfissionalSelecionado().getNumeroRegistro());
	}
	
	public void decrementaAvaliacao(){
		getProfissionalSelecionado().setAvaliacao(profissionalSelecionado.getAvaliacao()-1);
		getDao().updateAvaliacao(getProfissionalSelecionado().getAvaliacao(), getProfissionalSelecionado().getNumeroRegistro());
	}
}
