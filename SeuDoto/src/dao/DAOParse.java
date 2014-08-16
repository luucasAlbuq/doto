package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import org.json.JSONArray;

import util.AvaliacaoTableEnum;
import util.ProfissionalTableEnum;

import com.parse.FindCallback;
import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import exception.ProfissionalSaudeException;
import android.content.Context;
import model.Avaliacao;
import model.ProfissionalSaude;

/**
 * Classe responsavel por manipular instancias de Objetos e persistir-las no BD.
 * @author Lucas
 *
 */
public class DAOParse {

	private static DAOParse instance;
	private static List<ParseObject> resultadoBusca = null;
	private static ArrayList<ProfissionalSaude> todosProfissionais = new ArrayList<ProfissionalSaude>();
	
	private DAOParse() {
		// TODO Auto-generated constructor stub
	}

	public static DAOParse getInstance() {
		if (instance == null) {
			instance = new DAOParse();
		}

		return instance;
	}

	/**
	 * Metodo responsavel por persistir um profissional na nuvem, caso esteja
	 * sem conexao o profissional sera cadastrado posteriormente quando a
	 * conexao voltar.
	 * 
	 * @param ProfissionalSaude
	 *            prof
	 * @throws ProfissionalSaudeException
	 * @throws ParseException
	 */
	public void cadastrarProfissional(ProfissionalSaude prof)
			throws ProfissionalSaudeException, ParseException {
		ParseObject objeto = null;
		if (prof!=null && isCrmUnico(prof.getNumeroRegistro())) {
			objeto = new ParseObject(
					ProfissionalTableEnum.NOME_CLASSE.toString());
			objeto.put(ProfissionalTableEnum.COLUNA_NOME.toString(),
					prof.getNome());
			objeto.put(ProfissionalTableEnum.COLUNA_CRM.toString(),
					prof.getNumeroRegistro());
			objeto.put(ProfissionalTableEnum.COLUNA_ESPECIALIDADE.toString(),
					prof.getEspecialidade());
			objeto.put(ProfissionalTableEnum.COLUNA_TIPO.toString(),
					prof.getTipo());
			objeto.put(ProfissionalTableEnum.COLUNA_CONVENIOS.toString(),
					prof.getConvenios());
			objeto.put(ProfissionalTableEnum.COLUNA_AVAL_POSI.toString(), 0);
			objeto.put(ProfissionalTableEnum.COLUNA_AVAL_NEGA.toString(), 0);

			try {
				objeto.saveInBackground();
			} catch (Exception e) {
				e.getStackTrace();
				objeto.saveEventually();
			}
		} else {
			throw new ProfissionalSaudeException();
		}
	}
	
	/**
	 * Metodo responsavel por retornar um profissional 
	 * de acordo com o crm que ele foi cadastrado
	 * 
	 * @param String crm
	 * @return ProfissionalSaude profissional
	 * @throws ParseException
	 * @throws ProfissionalSaudeException
	 */
	public ProfissionalSaude buscarProfissinalPorCRM(String crm) throws ParseException, ProfissionalSaudeException{
		ProfissionalSaude prof = null;
		if(crm!=null && !crm.trim().equals("")){
			ParseQuery query = new ParseQuery(ProfissionalTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(ProfissionalTableEnum.COLUNA_CRM.toString(), crm);
			ParseObject obj = query.getFirst();
			prof = montaProfissionalSaude(obj);
		}
		
		return prof;
	}

	/**
	 * Verifica se crm ja estao cadastrada no BD, se ja estiver um
	 * profissional cadastrado com esse crm retorna false
	 * 
	 * @param String crm
	 * @return boolean
	 * @throws ParseException
	 */
	@SuppressWarnings("unchecked")
	public boolean isCrmUnico(String crm) throws ParseException {
		boolean result = true;
		List<ParseObject> objs = null;

		ParseQuery query = new ParseQuery(
				ProfissionalTableEnum.NOME_CLASSE.toString());
		query.whereEqualTo(ProfissionalTableEnum.COLUNA_CRM.toString(), crm);
		try {
			objs = query.find();
		} catch (ParseException e) {
			throw e;
		}
		if (objs != null && objs.size() > 0) {
			result = false;
		}

		return result;
	}

	/**
	 * Metodo responsavel por receber uma objeto Parse e retornar um objeto
	 * ProfissionalSaude equivalente aos objeto Parse
	 * 
	 * @param ParseObject
	 *            object
	 * @return ProfissionalSaude profissional
	 * @throws ProfissionalSaudeException
	 */
	private ProfissionalSaude montaProfissionalSaude(ParseObject object)
			throws ProfissionalSaudeException {
		String nome = object.getString(ProfissionalTableEnum.COLUNA_NOME
				.toString());
		String crm = object.getString(ProfissionalTableEnum.COLUNA_CRM
				.toString());
		String tipo = object.getString(ProfissionalTableEnum.COLUNA_TIPO
				.toString());
		String especialidade = object
				.getString(ProfissionalTableEnum.COLUNA_ESPECIALIDADE
						.toString());
		
		Integer avaliacoesPositivas = (Integer) object.get(ProfissionalTableEnum.COLUNA_AVAL_POSI.toString());
		Integer avaliacoesNegativas = (Integer) object.get(ProfissionalTableEnum.COLUNA_AVAL_NEGA.toString()); 

		ArrayList<String> convenios = null;
		try {
			convenios = (ArrayList<String>) object
					.get(ProfissionalTableEnum.COLUNA_CONVENIOS.toString());
		} catch (Exception e) {
			throw new ProfissionalSaudeException();
		}
		
		ProfissionalSaude prof = new ProfissionalSaude(tipo, crm, nome, especialidade, convenios);
		prof.setAvaliacoesPositivas(avaliacoesPositivas);
		prof.setAvaliacoesNegativas(avaliacoesNegativas);
		return prof;
	}

	/**
	 * Retorna todos os profissionais cadastrados no BD.
	 * 
	 * @return List<ProfissionalSaude> profissionais
	 * @throws ProfissionalSaudeException
	 * @throws ParseException
	 */
	@SuppressWarnings("unchecked")
	public List<ProfissionalSaude> findAll() throws ProfissionalSaudeException,
			ParseException {

		ParseQuery query = new ParseQuery(
				ProfissionalTableEnum.NOME_CLASSE.toString());
		query.setLimit(50);
		try {
			List<ParseObject> objects = query.find();
			setTodosProfissionais(new ArrayList<ProfissionalSaude>());
			for (ParseObject obj : objects) {
				try {
					ProfissionalSaude prof = montaProfissionalSaude(obj);
					getTodosProfissionais().add(prof);
				} catch (ProfissionalSaudeException e1) {
					throw e1;
				}
			}
		} catch (ParseException e) {
			throw e;
		}
		return getTodosProfissionais();
	}

	/**
	 * Metodo responsavel por realiza uma busca de profissionais tendo como
	 * parametros Especialiadade, Tipo de profissinal e Convenio. Se nenhum
	 * desses paramtros for especificado sera retornada uma lista com todos os
	 * profissionais cadastrados.
	 * 
	 * @param String
	 *            especialidade
	 * @param String
	 *            tipo
	 * @param String
	 *            convenio
	 * @return ArrayList<ProfissionalSaude> profissionais
	 * @throws ParseException
	 * @throws ProfissionalSaudeException
	 */
	public ArrayList<ProfissionalSaude> buscaSimples(String especialidade,
			String tipo, String convenio) throws ParseException,
			ProfissionalSaudeException {
		ArrayList<ProfissionalSaude> profisisonais = new ArrayList<ProfissionalSaude>();
		final String SELECIONE = "SELECIONE";
		ParseQuery query = null;

		// Se for especificado tipo e especialidade
		if (isEspecialidadeValida(especialidade) && isTipoValido(tipo)
				&& !isConvenioValido(convenio)) {
			query = new ParseQuery(ProfissionalTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(
					ProfissionalTableEnum.COLUNA_ESPECIALIDADE.toString(),
					especialidade);
			query.whereEqualTo(ProfissionalTableEnum.COLUNA_TIPO.toString(),
					tipo);
		}

		// Se so especificado apenas especialidade
		if (isEspecialidadeValida(especialidade) && !isConvenioValido(convenio)
				&& !isTipoValido(tipo)) {
			query = new ParseQuery(ProfissionalTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(
					ProfissionalTableEnum.COLUNA_ESPECIALIDADE.toString(),
					especialidade);
		}

		// Se so especificado apenas tipos
		if (!isEspecialidadeValida(especialidade)
				&& !isConvenioValido(convenio) && isTipoValido(tipo)) {
			query = new ParseQuery(ProfissionalTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(ProfissionalTableEnum.COLUNA_TIPO.toString(),
					tipo);
		}

		// Se so for especificado apenas o convenio
		if (!isEspecialidadeValida(especialidade) && !isTipoValido(tipo)
				&& isConvenioValido(convenio)) {
			query = new ParseQuery(ProfissionalTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(
					ProfissionalTableEnum.COLUNA_CONVENIOS.toString(), convenio);
		}

		// Se so for informado conveio e especialdiade
		if (isEspecialidadeValida(especialidade) && isConvenioValido(convenio)
				&& !isTipoValido(tipo)) {
			query = new ParseQuery(ProfissionalTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(
					ProfissionalTableEnum.COLUNA_ESPECIALIDADE.toString(),
					especialidade);
			query.whereEqualTo(
					ProfissionalTableEnum.COLUNA_CONVENIOS.toString(), convenio);
		}

		// Se so for informado convenio e tipo
		if (!isEspecialidadeValida(especialidade) && isTipoValido(tipo)
				&& isConvenioValido(convenio)) {
			query = new ParseQuery(ProfissionalTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(
					ProfissionalTableEnum.COLUNA_CONVENIOS.toString(), convenio);
			query.whereEqualTo(ProfissionalTableEnum.COLUNA_TIPO.toString(),
					tipo);
		}

		// Se for iformado convenio, especialidade e tipo
		if (isConvenioValido(convenio) && isEspecialidadeValida(especialidade)
				&& isTipoValido(tipo)) {
			query = new ParseQuery(ProfissionalTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(
					ProfissionalTableEnum.COLUNA_CONVENIOS.toString(), convenio);
			query.whereEqualTo(
					ProfissionalTableEnum.COLUNA_ESPECIALIDADE.toString(),
					especialidade);
			query.whereEqualTo(ProfissionalTableEnum.COLUNA_TIPO.toString(),
					tipo);
		}

		// Se nao for especificado nada
		if (!isConvenioValido(convenio)
				&& !isEspecialidadeValida(especialidade) && !isTipoValido(tipo)) {
			profisisonais = (ArrayList<ProfissionalSaude>) findAll();
		}

		if (query != null) {
			query.setLimit(50);
			List<ParseObject> objs = query.find();
			for (ParseObject prof : objs) {
				try {
					profisisonais.add(montaProfissionalSaude(prof));
				} catch (ProfissionalSaudeException e) {
					e.printStackTrace();
				}
			}
		}

		return profisisonais;
	}
	
	/**
	 * Metodo responsavel por retornar uma lista de profissinais que possui um determinada especialidade
	 * @param Stirng especialidade
	 * @return ArrayList<ProfissionalSaude> profissionais
	 * @throws ParseException
	 */
	public ArrayList<ProfissionalSaude> buscarPorEspecialidade(String especialidade) throws ParseException{
		ArrayList<ProfissionalSaude> resultadoPesquisa = null;
		if(isEspecialidadeValida(especialidade)){
			resultadoPesquisa = new ArrayList<ProfissionalSaude>();
			
			ParseQuery query = new ParseQuery(ProfissionalTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(ProfissionalTableEnum.COLUNA_ESPECIALIDADE.toString(),especialidade);
			
			if (query != null) {
				query.setLimit(50);
				List<ParseObject> objs = query.find();
				for (ParseObject prof : objs) {
					try {
						resultadoPesquisa.add(montaProfissionalSaude(prof));
					} catch (ProfissionalSaudeException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		
		return resultadoPesquisa;
	}

	private boolean isEspecialidadeValida(String especialidade) {
		String SELECIONE = "SELECIONE";
		return especialidade != null && !especialidade.trim().equals("")
				&& !especialidade.toUpperCase().equals(SELECIONE);
	}

	private boolean isTipoValido(String tipo) {
		String SELECIONE = "SELECIONE";
		return tipo != null && !tipo.trim().equals("")
				&& !tipo.toUpperCase().equals(SELECIONE);
	}

	private boolean isConvenioValido(String convenio) {
		String SELECIONE = "SELECIONE";
		return convenio != null && !convenio.trim().equals("")
				&& !convenio.toUpperCase().equals(SELECIONE);
	}

	/**
	 * Método responsavel por retorna todas as avaliações cadastradas.
	 * 
	 * @return ArrayList<Avaliacao> avaliacoes
	 * @throws ParseException
	 */
	public ArrayList<Avaliacao> getAllAvaliacoes() throws ParseException {
		List<ParseObject> avaliacoes = null;

		ParseQuery query = new ParseQuery(
				AvaliacaoTableEnum.NOME_CLASSE.toString());
		query.setLimit(50);
		try {
			avaliacoes = query.find();
		} catch (ParseException e) {
			throw e;
		}

		return montarAvaliacao(avaliacoes);
	}

	/**
	 * Metodo responsavel por receber uma lusta de objetos Parse e retornar ums
	 * lista de objetos ProfissionalSaude equivalente aos objeto Parse
	 * 
	 * @param List
	 *            <ParseObject> objs
	 * @return ArrayList<Avaliacao> avaliacao
	 */
	private ArrayList<Avaliacao> montarAvaliacao(List<ParseObject> objs) {
		ArrayList<Avaliacao> avaliacaos = new ArrayList<Avaliacao>();

		for (ParseObject par : objs) {
			String idUser = par.getString(AvaliacaoTableEnum.COLUNA_USER
					.toString());
			String crm = par
					.getString(AvaliacaoTableEnum.COLUNA_CRM.toString());
			boolean aval = (Boolean) par
					.get(AvaliacaoTableEnum.COLUNA_AVALIACAO.toString());
			avaliacaos.add(new Avaliacao(crm, idUser, aval));
		}

		return avaliacaos;
	}

	/**
	 * Método responsavel por criar uma avaliação única e persisti-la no BD.
	 * Sendo true equivalente a uma avaliação positiva e false a uma avaliacao
	 * negativa.
	 * 
	 * @param String
	 *            crm
	 * @param String
	 *            idUser
	 * @param boolean avaliacao
	 * @throws ProfissionalSaudeException
	 * @throws ParseException
	 */
	public void criarAvaliacao(String crm, String idUser, boolean avaliacao)
			throws ProfissionalSaudeException, ParseException {
		if (crm != null && !crm.trim().equals("") && idUser != null
				&& !idUser.trim().equals("")) {
			if (isAvaliacaoUnica(idUser, crm)) {
				ParseObject aval = new ParseObject(
						AvaliacaoTableEnum.NOME_CLASSE.toString());
				aval.put(AvaliacaoTableEnum.COLUNA_CRM.toString(), crm);
				aval.put(AvaliacaoTableEnum.COLUNA_USER.toString(), idUser);
				aval.put(AvaliacaoTableEnum.COLUNA_AVALIACAO.toString(),
						avaliacao);

				try {
					aval.saveInBackground();
					atualizaAvaliacoesProfissional(crm,avaliacao);
				} catch (Exception e) {
					e.getStackTrace();
					aval.saveEventually();
				}
			} else {
				throw new ProfissionalSaudeException();
			}

		} else {
			throw new ProfissionalSaudeException();
		}
	}
	
	/**
	 * Metodo responsavel por atualizar as avaliacoes de um Profissional
	 * @param String crm
	 * @param String avaliaco
	 * @throws ParseException
	 */
	private void atualizaAvaliacoesProfissional(String crm, boolean avaliaco) throws ParseException{
		ParseObject prof = getProfissinal(crm);
		if(avaliaco){
			Integer avaliacoesPositivasDesatualizadas = (Integer) prof.get(ProfissionalTableEnum.COLUNA_AVAL_POSI.toString());
			prof.put(ProfissionalTableEnum.COLUNA_AVAL_POSI.toString(), avaliacoesPositivasDesatualizadas+1);
		}else{
			Integer avaliacoesNegativasDesatualizadas = (Integer) prof.get(ProfissionalTableEnum.COLUNA_AVAL_NEGA.toString());
			prof.put(ProfissionalTableEnum.COLUNA_AVAL_NEGA.toString(), avaliacoesNegativasDesatualizadas+1);
		}
		prof.save();
	}

	/**
	 * Retorna o numero de avaliacoes positivas de um Profissional
	 * 
	 * @param ProfissionalSaude
	 *            prof
	 * @return Integer avaliaocoesPositivas
	 * @throws ParseException
	 */
	public Integer getAvaliacoesPositivas(ProfissionalSaude prof)
			throws ParseException {
		Integer avalPositivas = null;

		if (prof.getNumeroRegistro() != null) {
			List<ParseObject> objs = null;

			ParseQuery query = new ParseQuery(
					AvaliacaoTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(AvaliacaoTableEnum.COLUNA_CRM.toString(),
					prof.getNumeroRegistro());
			query.whereEqualTo(AvaliacaoTableEnum.COLUNA_AVALIACAO.toString(),
					true);
			try {
				objs = query.find();
				avalPositivas = new Integer(objs.size());
			} catch (ParseException e) {
				throw e;
			}
		}

		return avalPositivas;
	}

	/**
	 * Retorna o numero de avaliacoes negativas de um Profissional
	 * 
	 * @param ProfissionalSaude
	 *            prof
	 * @return Integer avaliacoesNegativas
	 * @throws ParseException
	 */
	public Integer getAvaliacoesNegativas(ProfissionalSaude prof)
			throws ParseException {
		Integer avalNegativas = null;

		if (prof.getNumeroRegistro() != null) {
			List<ParseObject> objs = null;

			ParseQuery query = new ParseQuery(
					AvaliacaoTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(AvaliacaoTableEnum.COLUNA_CRM.toString(),
					prof.getNumeroRegistro());
			query.whereEqualTo(AvaliacaoTableEnum.COLUNA_AVALIACAO.toString(),
					false);
			try {
				objs = query.find();
				avalNegativas = new Integer(objs.size());
			} catch (ParseException e) {
				throw e;
			}
		}

		return avalNegativas;
	}

	/**
	 * Metodo responsavel por verificar se algum usuario esta tentando
	 * avaliar um profissional mais de uma vez.
	 * 
	 * @param String
	 *            idUser
	 * @param String
	 *            crm
	 * @return boolean isValido
	 * @throws ParseException
	 */
	public boolean isAvaliacaoUnica(String idUser, String crm)
			throws ParseException {
		boolean isValido = true;

		List<ParseObject> objs = null;

		if (idUser != null && crm != null && !idUser.equals("")
				&& !crm.trim().equals("")) {
			ParseQuery query = new ParseQuery(
					AvaliacaoTableEnum.NOME_CLASSE.toString());
			query.whereEqualTo(AvaliacaoTableEnum.COLUNA_USER.toString(),
					idUser);
			query.whereEqualTo(AvaliacaoTableEnum.COLUNA_CRM.toString(), crm);
			try {
				objs = query.find();
			} catch (ParseException e) {
				throw e;
			}
		}

		if (objs != null && objs.size() > 0) {
			isValido = false;
		}

		return isValido;
	}

	/**
	 * Metodo responsavel por remover um profissional cadastrado no BD
	 * 
	 * @param String
	 *            crm
	 * @throws ParseException 
	 */
	public void removerProfissional(String crm) throws ParseException {
		ParseObject object = getProfissinal(crm);
		object.deleteInBackground();
	}
	
	/**
	 * Metodo responsavel por retornar um ParseObject referente a um Profissinal
	 * @param String crm
	 * @return ParseObject profissinal
	 * @throws ParseException
	 */
	private ParseObject getProfissinal(String crm) throws ParseException {
		ParseObject obj = null;
		ParseQuery query = new ParseQuery(ProfissionalTableEnum.NOME_CLASSE.toString());
		query.whereEqualTo(ProfissionalTableEnum.COLUNA_CRM.toString(),crm);
		try {
			obj = query.getFirst();
		} catch (ParseException e) {
			throw new ParseException(0, e.getMessage());
		}
		
		return obj;
	}
	
	/**
	 *  Metodo responsavel por remover uma avaliacao cadastrada no BD
	 * @param String idUser
	 * @param String crm
	 * @throws ParseException
	 */
	public void removerAvaliacao(String idUser, String crm) throws ParseException{
		ParseObject object = getAvaliacao(idUser,crm);
		object.deleteInBackground();
	}
	
	/**
	 * Metodo responsavel por retorna uma ParseObject referente a uma avaliacao
	 * @param idUser
	 * @param crm
	 * @return ParseObject avaliacao
	 * @throws ParseException
	 */
	private ParseObject getAvaliacao(String idUser, String crm) throws ParseException{
		ParseObject obj = null;
		ParseQuery query = new ParseQuery(AvaliacaoTableEnum.NOME_CLASSE.toString());
		query.whereEqualTo(AvaliacaoTableEnum.COLUNA_CRM.toString(),crm);
		query.whereEqualTo(AvaliacaoTableEnum.COLUNA_USER.toString(), idUser);
		try {
			obj = query.getFirst();
		} catch (ParseException e) {
			throw new ParseException(0, e.getMessage());
		}
		
		return obj;
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