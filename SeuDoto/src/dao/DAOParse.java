package dao;

import java.util.ArrayList;
import java.util.List;

import util.ProfissionalTableEnum;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import exception.ProfissionalSaudeException;
import android.content.Context;
import bd.ProfissionalBD;
import model.ProfissionalSaude;

public class DAOParse {
	
	private static DAOParse instance;
	private ParseObject objeto = null;
	private static List<ParseObject> resultadoBusca=null;
	private static ArrayList<ProfissionalSaude> todosProfissionais = new ArrayList<ProfissionalSaude>();
	
	public DAOParse() {
		// TODO Auto-generated constructor stub
	}

	public static DAOParse getInstance() {
		if (instance == null) {
			instance = new DAOParse();
		}

		return instance;
	}
	
	public void cadastrarProfissional(ProfissionalSaude prof) throws ProfissionalSaudeException{
		
		if(isCrmUnico(prof.getNumeroRegistro())){
			objeto = new ParseObject(ProfissionalTableEnum.NOME_CLASSE.toString());
			objeto.put(ProfissionalTableEnum.COLUNA_NOME.toString(), prof.getNome());
			objeto.put(ProfissionalTableEnum.COLUNA_CRM.toString(), prof.getNumeroRegistro());
			objeto.put(ProfissionalTableEnum.COLUNA_ESPECIALIDADE.toString(), prof.getEspecialidade());
			objeto.put(ProfissionalTableEnum.COLUNA_TIPO.toString(), prof.getTipo());
			try{
				objeto.saveInBackground();
			}catch(Exception e){
				e.getStackTrace();
				objeto.saveEventually();
			}
		}else{
			throw new ProfissionalSaudeException();
		}
	}
	
	@SuppressWarnings("unchecked")
	public boolean isCrmUnico(String crm){
		boolean  result = true;
		List<ParseObject> objs=null;
		
		ParseQuery query = new ParseQuery(ProfissionalTableEnum.NOME_CLASSE.toString());
		query.whereEqualTo(ProfissionalTableEnum.COLUNA_CRM.toString(), crm);
		try {
			 objs = query.find();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(objs!=null && objs.size()>0){
			result =false;
		}
		
		return result;
	}
	
	private ProfissionalSaude montaProfissionalSaude(ParseObject object) throws ProfissionalSaudeException{
		String nome = object.getString(ProfissionalTableEnum.COLUNA_NOME.toString());
		String crm = object.getString(ProfissionalTableEnum.COLUNA_CRM.toString());
		String tipo = object.getString(ProfissionalTableEnum.COLUNA_TIPO.toString());
		String especialidade = object.getString(ProfissionalTableEnum.COLUNA_ESPECIALIDADE.toString());
		
		return new ProfissionalSaude(tipo, crm, nome, especialidade, "Unimed");
	}
	
	@SuppressWarnings("unchecked")
	public List<ProfissionalSaude> findAll(){
		
		ParseQuery query = new ParseQuery(ProfissionalTableEnum.NOME_CLASSE.toString());
		query.setLimit(50);
		try {
			List<ParseObject> objects = query.find();
			for(ParseObject obj : objects){
				try {
					ProfissionalSaude prof = montaProfissionalSaude(obj);
					todosProfissionais.add(prof);
				} catch (ProfissionalSaudeException e1) {
					e1.printStackTrace();
				}
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}	
		return getTodosProfissionais();
	}
	
	
	
	public ArrayList<ProfissionalSaude> buscaSimples(String especialidade, String tipo, String convenio) throws ParseException{
		ArrayList<ProfissionalSaude> profisisonais = new ArrayList<ProfissionalSaude>();
		final String SELECIONE = "SELECIONE";
		ParseQuery query = null;
		
		//Se for especificado tipo e especialidade
		if(especialidade!=null && !especialidade.trim().equals("") && !especialidade.toUpperCase().equals(SELECIONE)
				&& tipo!=null && !tipo.trim().equals("") && !tipo.toUpperCase().equals(SELECIONE)){
			query = new ParseQuery(ProfissionalTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(ProfissionalTableEnum.COLUNA_ESPECIALIDADE.toString(),especialidade);
			query.whereEqualTo(ProfissionalTableEnum.COLUNA_TIPO.toString(),tipo);
		}
		
		//Se so especificado apenas especialidade
		if(especialidade!=null && !especialidade.trim().equals("") && !especialidade.toUpperCase().equals(SELECIONE)
				&& (tipo==null || tipo.toUpperCase().equals(SELECIONE))){
			query = new ParseQuery(ProfissionalTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(ProfissionalTableEnum.COLUNA_ESPECIALIDADE.toString(),especialidade);
		}
		
		//Se so especificado apenas tipos
		if((especialidade==null || especialidade.toUpperCase().equals(SELECIONE)) &&
				tipo!=null && !tipo.trim().equals("") && !tipo.toUpperCase().equals(SELECIONE)){
			query = new ParseQuery(ProfissionalTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(ProfissionalTableEnum.COLUNA_TIPO.toString(),tipo);
		}
		
		//Se nao for especificado nada
		if(tipo.toUpperCase().equals(SELECIONE) && especialidade.toUpperCase().equals(SELECIONE)){
			profisisonais = (ArrayList<ProfissionalSaude>) findAll();
		}
		
		if(query!=null){
			query.setLimit(50);
			List<ParseObject> objs = query.find();
			for(ParseObject prof: objs){
				try {
					profisisonais.add(montaProfissionalSaude(prof));
				} catch (ProfissionalSaudeException e) {
					e.printStackTrace();
				}
			}
		}
		
		int size = profisisonais.size();
		return profisisonais;
	}

	public static List<ParseObject> getResultadoBusca() {
		return resultadoBusca;
	}

	public static void setResultadoBusca(List<ParseObject> resultadoBusca) {
		DAOParse.resultadoBusca = resultadoBusca;
	}

	public static ArrayList<ProfissionalSaude> getTodosProfissionais() {
		return todosProfissionais;
	}

	public static void setTodosProfissionais(
			ArrayList<ProfissionalSaude> todosProfissionais) {
		DAOParse.todosProfissionais = todosProfissionais;
	}
	
	
}
