package dao;

import java.util.ArrayList;
import java.util.List;

import util.AvaliacaoTableEnum;
import util.ProfissionalTableEnum;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import exception.ProfissionalSaudeException;
import android.content.Context;
import bd.ProfissionalBD;
import model.Avaliacao;
import model.ProfissionalSaude;

public class DAOParse {
	
	private static DAOParse instance;
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
		ParseObject objeto = null;
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
		
		//Carregando avaliacoes
		ArrayList<Avaliacao> avaliacoes = getAllAvaliacoes();
		for(ProfissionalSaude prof : profisisonais){
			for(Avaliacao aval : avaliacoes){
				if(prof.getNumeroRegistro().equals(aval.getCrm())){
					if(aval.isAvaliacao()){
						prof.addAvaliacaoPositiva();
					}else{
						prof.addAvaliacaoNegativa();
					}
				}
			}
		}
		
		return profisisonais;
	}
	
	
	public ArrayList<Avaliacao> getAllAvaliacoes(){
		List<ParseObject> avaliacoes=null;
		
		ParseQuery query = new ParseQuery(AvaliacaoTableEnum.NOME_CLASSE.toString());
		query.setLimit(50);
		try {
			avaliacoes= query.find();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return montarAvaliacao(avaliacoes);
	}
	
	private ArrayList<Avaliacao> montarAvaliacao(List<ParseObject> objs){
		ArrayList<Avaliacao> avaliacaos = new ArrayList<Avaliacao>();
		
		for(ParseObject par : objs){
			String idUser = par.getString(AvaliacaoTableEnum.COLUNA_USER.toString());
			String crm = par.getString(AvaliacaoTableEnum.COLUNA_CRM.toString());
			boolean aval = (Boolean) par.get(AvaliacaoTableEnum.COLUNA_AVALIACAO.toString());
			avaliacaos.add(new Avaliacao(crm, idUser, aval));
		}
		
		return avaliacaos;
	}
	
	public void criarAvaliacao(String crm,String idUser, boolean avaliacao) throws ProfissionalSaudeException{
		if(crm!=null && !crm.trim().equals("") && idUser!=null && !idUser.trim().equals("")){
			if(isAvaliacaoUnica(idUser, crm)){
				ParseObject aval = new ParseObject(AvaliacaoTableEnum.NOME_CLASSE.toString());
				aval.put(AvaliacaoTableEnum.COLUNA_CRM.toString(), crm);
				aval.put(AvaliacaoTableEnum.COLUNA_USER.toString(), idUser);
				aval.put(AvaliacaoTableEnum.COLUNA_AVALIACAO.toString(), avaliacao);
				
				try{
					aval.saveInBackground();
				}catch(Exception e){
					e.getStackTrace();
					aval.saveEventually();
				}
			}else{
				throw new ProfissionalSaudeException();
			}
			
		}else{
			throw new ProfissionalSaudeException();
		}
	}
	
	
	public Integer getAvaliacoesPositivas(ProfissionalSaude prof){
		Integer avalPositivas = null;
		
		if(prof.getNumeroRegistro()!=null){
			List<ParseObject> objs=null;
			
			ParseQuery query = new ParseQuery(AvaliacaoTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(AvaliacaoTableEnum.COLUNA_CRM.toString(), prof.getNumeroRegistro());
			query.whereEqualTo(AvaliacaoTableEnum.COLUNA_AVALIACAO.toString(), true);
			try {
				 objs = query.find();
				 avalPositivas = new Integer(objs.size());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return avalPositivas;
	}
	
	public Integer getAvaliacoesNegativas(ProfissionalSaude prof){
		Integer avalNegativas = null;
		
		if(prof.getNumeroRegistro()!=null){
			List<ParseObject> objs=null;
			
			ParseQuery query = new ParseQuery(AvaliacaoTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(AvaliacaoTableEnum.COLUNA_CRM.toString(), prof.getNumeroRegistro());
			query.whereEqualTo(AvaliacaoTableEnum.COLUNA_AVALIACAO.toString(), false);
			try {
				 objs = query.find();
				 avalNegativas = new Integer(objs.size());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return avalNegativas;
	}
	
	public boolean isAvaliacaoUnica(String idUser, String crm){
		boolean isValido = true;
		
		List<ParseObject> objs=null;
		
		if(idUser!=null && crm!=null && !idUser.equals("") && !crm.trim().equals("")){
			ParseQuery query = new ParseQuery(AvaliacaoTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(AvaliacaoTableEnum.COLUNA_USER.toString(), idUser);
			query.whereEqualTo(AvaliacaoTableEnum.COLUNA_CRM.toString(), crm);
			try {
				 objs = query.find();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(objs!=null && objs.size()>0){
			isValido =false;
		}
		
		return isValido;
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
