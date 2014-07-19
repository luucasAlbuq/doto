package dao;

import java.util.ArrayList;
import java.util.List;

import model.ProfissionalSaude;
import model.TipoProfissional;
import util.Especialidade;
import android.location.Criteria;
import controller.ProfissionalController;

public class DAOREST implements DAOInterface {

	private static DAOREST instance;

	public DAOREST(){
		// TODO Auto-generated constructor stub
	}

	public static DAOREST getInstance() {
		if (instance == null)
			instance = new DAOREST();
		return instance;
	}

	@Override
	public <T> void persistir(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void update(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> void remover(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <T> List<T> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> List<T> findByCriteira(Criteria consulta) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public <T> List<T> findByName(String nome){
		return null;
	}
	
	public <T> List<T> findByEspecialidade(Especialidade especialidade){
		return null;
	}
	
	public <T> T findByIndentificao(String identificacao){
		return null;
	}
	
	public <T> List<T> findByTipo(TipoProfissional tipo){
		return null;
	}
	
	public <T> T findByEntity(T entity){
		return null;
	}
	
	public  ArrayList<ProfissionalSaude> buscaSimples(String tipo, String especialidade, String convenio){
		return null;
	}
}
