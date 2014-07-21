package bd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class ProfissionalBD extends SQLiteOpenHelper {
	
	private static final int DATABASE_VERSION = 1;
	public static final String ID = "_id";
	public static final String NOME_PROF = "nome";
	public static final String IDENTIFICACAO_PROF = "identificacao";
	public static final String ENDERECO_PROF = "endereco";
	public static final String TABLE_NAME = "TB_PROF";
	public static final String CONVENIO_PROF = "convenio";
	public static final String TIPO_PROF = "tipo";
	public static final String AVALIACAO_PROF = "avaliacao";
	public static final String ESPECIALIDADE_PROF = "especialidade";
	public static final String DATABASE_NAME = "seuDoto.db";
	private static final String DATABASE_CREATE = "create table " + 
	TABLE_NAME + "( " + ID + " integer primary key autoincrement, " +
	NOME_PROF + " text not null, " + IDENTIFICACAO_PROF + " integer not null, " + AVALIACAO_PROF + " integer, " +
	ENDERECO_PROF + " text not null, " + TIPO_PROF + " text not null, " + CONVENIO_PROF + " text not null, " + ESPECIALIDADE_PROF + " text not null);";

	public ProfissionalBD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DATABASE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
	}

}
