package dao;

import java.util.ArrayList;
import java.util.List;

import model.ProfissionalSaude;
import model.TipoProfissional;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
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
	public <T> void persistir(T entity) {

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
			new Exception("Objeto de tipo desconhecido");
		}

	}

	@Override
	public <T> void update(T entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> void remover(T entity) {
		if (entity instanceof ProfissionalSaude) {
			ProfissionalSaude prof = (ProfissionalSaude) entity;
			database.delete(
					ProfissionalBD.TABLE_NAME,
					ProfissionalBD.IDENTIFICACAO_PROF + " = "
							+ prof.getNumeroRegistro(), null);
		}
	}

	@Override
	public List<ProfissionalSaude> findAll() {
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
			try {
				prof = new ProfissionalSaude(tipo, numeroRegistro, nome,
						enderenco, especialidade, convenio);

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

	public <T> List<T> findByName(String nome) {
		return null;
	}

	public List<ProfissionalSaude> findByEspecialidade(String especialidade) {
		database = criaBD.getReadableDatabase();

		Cursor cursor = database.rawQuery(
				"SELECT * FROM TB_PROF WHERE especialidade LIKE '%"
						+ especialidade + "%'", null);
		ArrayList<ProfissionalSaude> listaDeResultados = new ArrayList<ProfissionalSaude>();

		for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
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
			try {
				prof = new ProfissionalSaude(tipo, numeroRegistro, nome,
						enderenco, especialidade.toString(), convenio);

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

	public <T> T findByIndentificao(String identificacao) {
		return null;
	}

	public List<ProfissionalSaude> findByTipo(TipoProfissional tipo) {
		database = criaBD.getReadableDatabase();

		Cursor cursor = database.rawQuery(
				"SELECT * FROM TB_PROF WHERE tipo LIKE '%" + tipo.toString()
						+ "%'", null);
		ArrayList<ProfissionalSaude> listaDeResultados = new ArrayList<ProfissionalSaude>();

		for (cursor.moveToFirst(); !cursor.isAfterLast(); cursor.moveToNext()) {
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
			try {
				prof = new ProfissionalSaude(tipo.toString(), numeroRegistro,
						nome, enderenco, especialdiade, convenio);

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

	public <T> T findByEntity(T entity) {
		return null;
	}

	public ArrayList<ProfissionalSaude> buscaSimples(String tipo,
			String especialidade, String convenio, String cidade) {
		database = criaBD.getReadableDatabase();

		String sqlConsulta = "SELECT * FROM " + ProfissionalBD.TABLE_NAME
				+ " WHERE " + ProfissionalBD.TIPO_PROF + " LIKE '%" + tipo
				+ "%'" + " AND " + ProfissionalBD.ESPECIALIDADE_PROF
				+ " LIKE '%" + especialidade + "%'" + " AND "
				+ ProfissionalBD.CONVENIO_PROF + " LIKE '%" + convenio + "%'"
				+ " AND " + ProfissionalBD.ENDERECO_PROF + " LIKE '%" + cidade
				+ "%'";

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

	public void updateAvaliacao(int avaliacao, String crm) {
		String consultasql = "UPDATE " + ProfissionalBD.TABLE_NAME + " SET "
				+ ProfissionalBD.AVALIACAO_PROF + " = " + avaliacao + " WHERE "
				+ ProfissionalBD.IDENTIFICACAO_PROF + " = " + crm;
		database = criaBD.getReadableDatabase();
		database.rawQuery(consultasql, null);

	}
}
