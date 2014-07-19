package controller;

import java.util.List;

import dao.DAOREST;
import model.Endereco;
import model.ProfissionalSaude;
import model.TipoProfissional;
import util.Convenio;
import util.Especialidade;

public class ProfissionalController implements ProfissionalInterface {
	
	private static ProfissionalController instance;
	
	private DAOREST dao;
	
	private ProfissionalController() {
		// TODO Auto-generated constructor stub
	}

	public static ProfissionalController getInstance() {
		if (instance == null)
			instance = new ProfissionalController();
		return instance;
	}

	@Override
	public void cadastrarProfissionalSaude(String nome,
			TipoProfissional tipoProfissinal, String identificacao,
			Especialidade especialidade, Endereco endereco, Convenio convenio) {
		
		ProfissionalSaude profissional = new ProfissionalSaude(tipoProfissinal, identificacao , nome, endereco);
		profissional.getConvenios().add(convenio);
		profissional.getEspecialidades().add(especialidade);
	}

	@Override
	public List<ProfissionalSaude> buscarProfissionalPorNome(String nome) {
		return  getDao().findByName(nome);
	}

	@Override
	public List<ProfissionalSaude> buscarProfissionalPorEspecialidade(
			Especialidade especialidade) {
		return getDao().findByEspecialidade(especialidade);
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

	public DAOREST getDao() {
		if(dao==null){
			dao = DAOREST.getInstance();
		}
		return dao;
	}

	public void setDao(DAOREST dao) {
		this.dao = dao;
	}
	
	

}
