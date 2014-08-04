package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import util.MensagemExcessao;
import exception.ProfissionalSaudeException;
import model.Avaliacao;
import model.ProfissionalSaude;
import model.TipoProfissional;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.location.Criteria;
import bd.ProfissionalBD;

public class DAOREST implements DAOInterface {

	private static DAOREST instance;
	private static ProfissionalBD criaBD;
	private SQLiteDatabase database;
	private static final String EXCECAO = MensagemExcessao.ERRO.toString();
	private static String URL = "jdbc:mysql://54.191.161.104/";
	private static String DB_NAME = "dotozin";
	private static String DRIVER = "com.mysql.jdbc.Driver";
	private static String USER_NAME = "doto";
	private static String PASSWORD = "doto12345";
	

	public DAOREST() {
		// TODO Auto-generated constructor stub
	}

	public static DAOREST getInstance(Context context) {
		if (instance == null) {
			instance = new DAOREST();
			criaBD = new ProfissionalBD(context);
		}

		return instance;
	}

	@Override
	public <T> void persistir(T entity) throws ProfissionalSaudeException {

		if (entity instanceof ProfissionalSaude && entity != null) {
			ProfissionalSaude prof = (ProfissionalSaude) entity;

			if (isCrmValido(prof.getNumeroRegistro())) {
				ContentValues valores = new ContentValues();
				valores.put(ProfissionalBD.NOME_PROF, prof.getNome());
				valores.put(ProfissionalBD.ESPECIALIDADE_PROF,
						prof.getEspecialidade());
				valores.put(ProfissionalBD.IDENTIFICACAO_PROF,
						prof.getNumeroRegistro());
				valores.put(ProfissionalBD.CONVENIO_PROF, prof.getConvenio());
				valores.put(ProfissionalBD.TIPO_PROF, prof.getTipo().toString());
				
				database = criaBD.getReadableDatabase();
				database.insert(ProfissionalBD.TABLE_NAME, null, valores);
			} else {
				throw new ProfissionalSaudeException(
						MensagemExcessao.CRM_INVALIDO.toString());
			}

		} else {
			throw new ProfissionalSaudeException(EXCECAO);
		}

	}

	@Override
	public <T> void remover(T entity) throws ProfissionalSaudeException {
		if (entity instanceof ProfissionalSaude) {
			ProfissionalSaude prof = (ProfissionalSaude) entity;
			database.delete(
					ProfissionalBD.TABLE_NAME,
					ProfissionalBD.IDENTIFICACAO_PROF + " = "
							+ prof.getNumeroRegistro(), null);
		} else {
			throw new ProfissionalSaudeException();
		}
	}

	@Override
	public List<ProfissionalSaude> findAll() throws ProfissionalSaudeException {
		database = criaBD.getReadableDatabase();
		Cursor cursor = database.rawQuery("select * from TB_PROF", null);
		List<ProfissionalSaude> listaDeResultados = new ArrayList<ProfissionalSaude>();

		for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
			String nome = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.NOME_PROF));
			String especialidade = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.ESPECIALIDADE_PROF));
			String convenio = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.CONVENIO_PROF));

			String tipo = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.TIPO_PROF));
			String numeroRegistro = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.IDENTIFICACAO_PROF));

			ProfissionalSaude prof;

			prof = new ProfissionalSaude(tipo, numeroRegistro, nome,
					especialidade, convenio);


			if (!listaDeResultados.contains(prof)) {
				listaDeResultados.add(prof);
			}

		}
		return listaDeResultados;
	}

	public List<ProfissionalSaude> findByEspecialidade(String especialidade)
			throws ProfissionalSaudeException {
		database = criaBD.getReadableDatabase();

		List<ProfissionalSaude> listaDeResultados = new ArrayList<ProfissionalSaude>();

		if (especialidade != null && !"".equals(especialidade.trim())) {

			Cursor cursor = database.rawQuery(
					"SELECT * FROM TB_PROF WHERE especialidade LIKE '%"
							+ especialidade + "%'", null);

			for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor
					.moveToNext()) {
				String nome = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.NOME_PROF));

				String convenio = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.CONVENIO_PROF));

				String tipo = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.TIPO_PROF));
				String numeroRegistro = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.IDENTIFICACAO_PROF));

				ProfissionalSaude prof;

				prof = new ProfissionalSaude(tipo, numeroRegistro, nome,
						especialidade.toString(), convenio);

				if (!listaDeResultados.contains(prof)) {
					listaDeResultados.add(prof);
				}

			}
		} else {
			throw new ProfissionalSaudeException("Especialidade invalida");
		}
		return listaDeResultados;
	}

	@Override
	public List<ProfissionalSaude> findByTipo(String tipo)
			throws ProfissionalSaudeException {
		database = criaBD.getReadableDatabase();
		List<ProfissionalSaude> listaDeResultados = new ArrayList<ProfissionalSaude>();

		if (tipo != null && !"".equals(tipo.trim())) {

			Cursor cursor = database.rawQuery(
					"SELECT * FROM TB_PROF WHERE tipo LIKE '%"
							+ tipo.toString() + "%'", null);

			for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor
					.moveToNext()) {
				String nome = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.NOME_PROF));

				String convenio = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.CONVENIO_PROF));

				String especialdiade = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.ESPECIALIDADE_PROF));

				String numeroRegistro = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.IDENTIFICACAO_PROF));

				ProfissionalSaude prof;

				prof = new ProfissionalSaude(tipo.toString(), numeroRegistro,
						nome, especialdiade, convenio);

				if (!listaDeResultados.contains(prof)) {
					listaDeResultados.add(prof);
				}

			}
		} else {

			throw new ProfissionalSaudeException("Tipo invalido");
		}
		return listaDeResultados;
	}

	private String geraConsultaSimples(String tipo, String especialidade,
			String convenio, String cidade) throws ProfissionalSaudeException {
		String consulta = "";

		if (tipo != null && !"".equals(tipo.trim()) && especialidade != null
				&& !"".equals(especialidade.trim())
				&& !"".equals(especialidade.trim()) && convenio != null
				&& !"".equals(convenio.trim()) && cidade != null
				&& !"".equals(cidade.trim())) {

			String linhaTipo, linhaEspecialidade, linhaConvenio;
			List<String> listaConsulta = new ArrayList<String>();

			listaConsulta.add("SELECT * FROM " + ProfissionalBD.TABLE_NAME
					+ " WHERE ");

			if (!tipo.trim().equalsIgnoreCase("SELECIONE")) {
				linhaTipo = ProfissionalBD.TIPO_PROF + " LIKE '%" + tipo + "%'";
				listaConsulta.add(linhaTipo);

			}
			if (!especialidade.trim().equalsIgnoreCase("SELECIONE")) {
				linhaEspecialidade = ProfissionalBD.ESPECIALIDADE_PROF
						+ " LIKE '%" + especialidade + "%'";
				if (listaConsulta.size() == 2
						&& !listaConsulta.get(listaConsulta.size() - 1)
								.equalsIgnoreCase("AND")) {
					listaConsulta.add("AND");
				}
				listaConsulta.add(linhaEspecialidade);

			}
			if (!convenio.trim().equalsIgnoreCase("SELECIONE")) {
				linhaConvenio = ProfissionalBD.CONVENIO_PROF + " LIKE '%"
						+ convenio + "%'";
				if (listaConsulta.size() >= 2
						&& !listaConsulta.get(listaConsulta.size() - 1)
								.equalsIgnoreCase("AND")) {
					listaConsulta.add("AND");
				}
				listaConsulta.add(linhaConvenio);

			}

			// Montando a consulta final

			// Se o usuario nao tiver selecionado nada ele deve pesquisar todos
			if (tipo.trim().equalsIgnoreCase("SELECIONE")
					&& especialidade.trim().equalsIgnoreCase("SELECIONE")
					&& convenio.trim().equalsIgnoreCase("SELECIONE")
					&& cidade.trim().equalsIgnoreCase("SELECIONE")) {
				consulta = "select * from TB_PROF";
			}

			// Nesse caso ele selecionou alguma coisa
			if (listaConsulta.size() != 1) {
				for (String sql : listaConsulta) {
					consulta = consulta + " " + sql;
				}
			}

		} else {
			throw new ProfissionalSaudeException("Campos invalidos");
		}

		return consulta;
	}

	@Override
	public ArrayList<ProfissionalSaude> buscaSimples(String tipo,
			String especialidade, String convenio, String cidade)
			throws ProfissionalSaudeException {
		database = criaBD.getReadableDatabase();

		String sqlConsulta = geraConsultaSimples(tipo, especialidade, convenio,
				cidade);

		Cursor cursor = database.rawQuery(sqlConsulta, null);

		List<ProfissionalSaude> listaDeResultados = new ArrayList<ProfissionalSaude>();

		for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
			String nome = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.NOME_PROF));

			String convenioConsulta = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.CONVENIO_PROF));

			String especialidadeConsulta = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.ESPECIALIDADE_PROF));

			String numeroRegistro = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.IDENTIFICACAO_PROF));

			ProfissionalSaude prof;
			try {
				prof = new ProfissionalSaude(tipo.toString(), numeroRegistro,
						nome, especialidadeConsulta, convenioConsulta);
		
				if (!listaDeResultados.contains(prof)) {
					listaDeResultados.add(prof);
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return (ArrayList<ProfissionalSaude>) listaDeResultados;
	}

	public void updateAvaliacao(int avaliacao, String crm)
			throws ProfissionalSaudeException {
		if (crm != null && !crm.trim().equals("")) {
			SQLiteDatabase db = criaBD.getWritableDatabase();
			SQLiteStatement stmt = db.compileStatement("UPDATE "
					+ ProfissionalBD.TABLE_NAME + " SET "
					+ ProfissionalBD.AVALIACAO_PROF + "=? WHERE "
					+ ProfissionalBD.IDENTIFICACAO_PROF + " =?");
			stmt.bindString(1, "" + avaliacao);
			stmt.bindString(2, crm);
			stmt.execute();
		} else {
			throw new ProfissionalSaudeException(
					"Identificacao de profissional eh invalida ou nao existe");
		}

	}

	@Override
	public <T> void update(T entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public ProfissionalSaude findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProfissionalSaude> findByCriteira(Criteria consulta) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T findByIndentificao(String identificacao) {
		return null;
	}
	
	public int getAvaliacoesPositicas(String crm) throws ProfissionalSaudeException{
		database = criaBD.getReadableDatabase();
		int contadorPositivo = 0;

		if (crm != null && !crm.trim().equals("")) {

			Cursor cursor = database.rawQuery(
					"SELECT * FROM TB_AVALIACAO WHERE identificacao_prof ="+crm, null);

			for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor
					.moveToNext()) {
				String avaliacao = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.AVALIACAO));
				if(Integer.parseInt(avaliacao)==0){
					contadorPositivo++;
				}
			}
			
			
		} else {
			throw new ProfissionalSaudeException("Especialidade invalida");
		}
		return contadorPositivo;
	}
	
	public int getAvaliacoesNegativas(String crm) throws ProfissionalSaudeException{
		database = criaBD.getReadableDatabase();
		int contadorNegativo = 0;

		if (crm != null && !crm.trim().equals("")) {

			Cursor cursor = database.rawQuery(
					"SELECT * FROM TB_AVALIACAO WHERE identificacao_prof ="+crm, null);

			for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor
					.moveToNext()) {
				String avaliacao = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.AVALIACAO));
				if(Integer.parseInt(avaliacao)!=0){
					contadorNegativo++;
				}
			}
			
			
		} else {
			throw new ProfissionalSaudeException("Especialidade invalida");
		}
		return contadorNegativo;
	}

	public void criarAvaliacao(String cpf, String crm, int avaliacao)
			throws ProfissionalSaudeException {
		if (isAvaliacaoValida(cpf, crm)) {
			Avaliacao aval = null;
			if (avaliacao == 0) {
				aval = new Avaliacao(crm, cpf, true);
			} else {
				aval = new Avaliacao(crm, cpf, false);
			}

			ContentValues valores = new ContentValues();
			valores.put(ProfissionalBD.IDENTIFICACAO_USER_AVAL,
					aval.getIdUsuario());
			valores.put(ProfissionalBD.IDENTIFICACAO_PROF_AVAL, aval.getCrm());
			valores.put(ProfissionalBD.AVALIACAO, avaliacao);

			database = criaBD.getReadableDatabase();
			database.insert(ProfissionalBD.TABLE_NAME_AVAL, null, valores);
			
		} else {
			throw new ProfissionalSaudeException(
					MensagemExcessao.AVALIACAO_INVALIDA.toString());
		}
	}

	public boolean isAvaliacaoValida(String cpf, String crm)
			throws ProfissionalSaudeException {
		database = criaBD.getReadableDatabase();

		if (crm != null && !crm.trim().equals("") && cpf != null
				&& !cpf.trim().equals("")) {
			Cursor cursor = database.rawQuery(
					"SELECT * FROM TB_AVALIACAO WHERE identificacao_user ="
							+ cpf + " and identificacao_prof=" + crm, null);
			for (cursor.moveToFirst(); !cursor.isAfterLast();) {

				return false;
			}

			return true;
		} else {
			throw new ProfissionalSaudeException(
					MensagemExcessao.AVALIACAO_INVALIDA.toString());
		}
	}

	public boolean isCrmValido(String crm) throws ProfissionalSaudeException {

		database = criaBD.getReadableDatabase();

		if (crm != null && !crm.trim().equals("")) {

			Cursor cursor = database.rawQuery(
					"SELECT identificacao FROM TB_PROF WHERE identificacao ="
							+ crm, null);

			for (cursor.moveToFirst(); !cursor.isAfterLast();) {

				return false;
			}

			return true;
		} else {
			throw new ProfissionalSaudeException(
					MensagemExcessao.CRM_INVALIDO.toString());
		}

	}

	// ///////////////////////////////////// METODOS DO BD NA NUVEM
	// ////////////////////////////////////////////

	public List<ProfissionalSaude> findByName(String nomeProf) {
		List<ProfissionalSaude> listaProf = new ArrayList<ProfissionalSaude>();

		try {
			Class.forName(DRIVER).newInstance();
			Connection conn = DriverManager.getConnection(URL + DB_NAME,
					USER_NAME, PASSWORD);
			Statement st = conn.createStatement();
			ResultSet res = st
					.executeQuery("select * from Profissional where nome ='"
							+ nomeProf + "'");

			while (res.next()) {
				String crm = res.getString("crm");
				String nome = res.getString("nome");
				String tipo = res.getString("tipo_prof");
				// TODO falta encontrar o resto dos dados de Profissional no BD
				listaProf
						.add(new ProfissionalSaude(tipo, crm, nome, null, null));
			}

			conn.close();
		} catch (Exception e) {
			// TODO tratar exception

		}

		return listaProf;
	}

	public List<ProfissionalSaude> findByTipo(TipoProfissional tipo) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean cadastrarProfissional(ProfissionalSaude prof) {

		if (!crmJaCadastrado(prof)) {

			try {
				Class.forName(DRIVER).newInstance();
				Connection conn = DriverManager.getConnection(URL + DB_NAME,
						USER_NAME, PASSWORD);

				Statement st = conn.createStatement();

				String sql = "INSERT INTO Profissional VALUES ('"
						+ prof.getNumeroRegistro() + "', '" + prof.getTipo()
						+ "', '" + prof.getNome() + "')";

				st.executeUpdate(sql);

				sql = "INSERT INTO ConvenioProf VALUES ('"
						+ prof.getNumeroRegistro() + "', '"
						+ prof.getConvenio() + "')";

				st.executeUpdate(sql);

				conn.close();
				return true;
			} catch (Exception e) {
				System.err.print("ERRO");
				System.out.println(e);

			}
		}

		return false;
	}

	private boolean crmJaCadastrado(ProfissionalSaude prof) {
		try {
			Class.forName(DRIVER).newInstance();
			Connection conn = DriverManager.getConnection(URL + DB_NAME,
					USER_NAME, PASSWORD);
			Statement st = conn.createStatement();
			ResultSet res = st
					.executeQuery("select * from Profissional where crm ='"
							+ prof.getNumeroRegistro() + "'");

			while (res.next()) {
				return true;
			}

			conn.close();
		} catch (Exception e) {
			// TODO tratar a exception
		}
		return false;
	}

	public void adicionarConvenio(String crm, String convenio) {
		try {
			Class.forName(DRIVER).newInstance();
			Connection conn = DriverManager.getConnection(URL + DB_NAME,
					USER_NAME, PASSWORD);

			Statement st = conn.createStatement();

			String sql = "INSERT INTO ConvenioProf VALUES ('" + crm + "', '"
					+ convenio + "')";

			st.executeUpdate(sql);

			conn.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean existeCrm(String crm) {

		try {
			Class.forName(DRIVER).newInstance();
			Connection conn = DriverManager.getConnection(URL + DB_NAME,
					USER_NAME, PASSWORD);
			Statement st = conn.createStatement();
			ResultSet res = st
					.executeQuery("select * from Profissional where crm ='"
							+ crm + "'");

			while (res.next()) {
				return true;
			}

			conn.close();
		} catch (Exception e) {
			// TODO tratar exception

		}
		return false;
	}
}
