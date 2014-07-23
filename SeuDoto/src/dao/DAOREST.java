package dao;

import java.util.ArrayList;
import java.util.List;

import exception.ProfissionalSaudeException;
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

		if (entity instanceof ProfissionalSaude) {
			ProfissionalSaude prof = (ProfissionalSaude) entity;

			ContentValues valores = new ContentValues();
			valores.put(ProfissionalBD.NOME_PROF, prof.getNome());
			valores.put(ProfissionalBD.ESPECIALIDADE_PROF,
					prof.getEspecialidade());
			valores.put(ProfissionalBD.ENDERECO_PROF, prof.getEndereco()
					.toString());
			valores.put(ProfissionalBD.IDENTIFICACAO_PROF,
					prof.getNumeroRegistro());
			valores.put(ProfissionalBD.CONVENIO_PROF, prof.getConvenio());
			valores.put(ProfissionalBD.TIPO_PROF, prof.getTipo().toString());
			valores.put(ProfissionalBD.AVALIACAO_PROF, prof.getAvaliacao());
			database = criaBD.getReadableDatabase();
			long index = database.insert(ProfissionalBD.TABLE_NAME, null,
					valores);
			// return index;
		} else {
			throw new ProfissionalSaudeException("Objeto de tipo desconhecido");
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
			throw new ProfissionalSaudeException("Objeto de tipo desconhecido");
		}
	}

	@Override
	public List<ProfissionalSaude> findAll() throws ProfissionalSaudeException {
		database = criaBD.getReadableDatabase();
		Cursor cursor = database.rawQuery("select * from TB_PROF", null);
		ArrayList<ProfissionalSaude> listaDeResultados = new ArrayList<ProfissionalSaude>();

		for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
			String nome = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.NOME_PROF));
			int avaliacao = cursor.getInt(cursor
					.getColumnIndex(ProfissionalBD.AVALIACAO_PROF));
			String especialidade = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.ESPECIALIDADE_PROF));
			String convenio = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.CONVENIO_PROF));
			String enderenco = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.ENDERECO_PROF));
			String tipo = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.TIPO_PROF));
			String numeroRegistro = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.IDENTIFICACAO_PROF));

			ProfissionalSaude prof;

			prof = new ProfissionalSaude(tipo, numeroRegistro, nome, enderenco,
					especialidade, convenio);

			prof.setAvaliacao(avaliacao);

			if (!listaDeResultados.contains(prof)) {
				listaDeResultados.add(prof);
			}

		}
		return listaDeResultados;
	}

	public List<ProfissionalSaude> findByEspecialidade(String especialidade)
			throws ProfissionalSaudeException {
		database = criaBD.getReadableDatabase();

		ArrayList<ProfissionalSaude> listaDeResultados = new ArrayList<ProfissionalSaude>();

		if (especialidade != null && !especialidade.trim().equals("")) {

			Cursor cursor = database.rawQuery(
					"SELECT * FROM TB_PROF WHERE especialidade LIKE '%"
							+ especialidade + "%'", null);

			for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor
					.moveToNext()) {
				String nome = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.NOME_PROF));
				int avaliacao = cursor.getInt(cursor
						.getColumnIndex(ProfissionalBD.AVALIACAO_PROF));
				String convenio = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.CONVENIO_PROF));
				String enderenco = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.ENDERECO_PROF));
				String tipo = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.TIPO_PROF));
				String numeroRegistro = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.IDENTIFICACAO_PROF));

				ProfissionalSaude prof;

				prof = new ProfissionalSaude(tipo, numeroRegistro, nome,
						enderenco, especialidade.toString(), convenio);

				prof.setAvaliacao(avaliacao);

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
		ArrayList<ProfissionalSaude> listaDeResultados = new ArrayList<ProfissionalSaude>();

		if (tipo != null && !tipo.trim().equals("")) {

			Cursor cursor = database.rawQuery(
					"SELECT * FROM TB_PROF WHERE tipo LIKE '%"
							+ tipo.toString() + "%'", null);

			for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor
					.moveToNext()) {
				String nome = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.NOME_PROF));
				int avaliacao = cursor.getInt(cursor
						.getColumnIndex(ProfissionalBD.AVALIACAO_PROF));
				String convenio = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.CONVENIO_PROF));
				String enderenco = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.ENDERECO_PROF));
				String especialdiade = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.ESPECIALIDADE_PROF));

				String numeroRegistro = cursor.getString(cursor
						.getColumnIndex(ProfissionalBD.IDENTIFICACAO_PROF));

				ProfissionalSaude prof;

				prof = new ProfissionalSaude(tipo.toString(), numeroRegistro,
						nome, enderenco, especialdiade, convenio);

				prof.setAvaliacao(avaliacao);

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

		if (tipo != null && !tipo.trim().equals("") && especialidade != null
				&& !especialidade.trim().equals("")
				&& !especialidade.trim().equals("") && convenio != null
				&& !convenio.trim().equals("") && cidade != null
				&& !cidade.trim().equals("")) {

			String linhaTipo, linhaEspecialidade, linhaConvenio, linhaCidade;
			ArrayList<String> listaConsulta = new ArrayList<String>();

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
			if (!cidade.trim().equalsIgnoreCase("SELECIONE")) {
				linhaCidade = ProfissionalBD.ENDERECO_PROF + " LIKE '%"
						+ cidade + "%'";
				if (listaConsulta.size() >= 2
						&& !listaConsulta.get(listaConsulta.size() - 1)
								.equalsIgnoreCase("AND")) {
					listaConsulta.add("AND");
				}
				listaConsulta.add(linhaCidade);
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

		ArrayList<ProfissionalSaude> listaDeResultados = new ArrayList<ProfissionalSaude>();

		for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
			String nome = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.NOME_PROF));
			int avaliacao = cursor.getInt(cursor
					.getColumnIndex(ProfissionalBD.AVALIACAO_PROF));

			String enderenco = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.ENDERECO_PROF));

			String numeroRegistro = cursor.getString(cursor
					.getColumnIndex(ProfissionalBD.IDENTIFICACAO_PROF));

			ProfissionalSaude prof;
			try {
				prof = new ProfissionalSaude(tipo.toString(), numeroRegistro,
						nome, enderenco, especialidade, convenio);
				prof.setAvaliacao(avaliacao);

				if (!listaDeResultados.contains(prof)) {
					listaDeResultados.add(prof);
				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return listaDeResultados;
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

	public List<ProfissionalSaude> findByName(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ProfissionalSaude> findByTipo(TipoProfissional tipo) {
		// TODO Auto-generated method stub
		return null;
	}
}
