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
	public static final String TABLE_NAME = "TB_PROF";
	public static final String CONVENIO_PROF = "convenio";
	public static final String TIPO_PROF = "tipo";
	public static final String AVALIACAO_PROF = "avaliacao";
	public static final String ESPECIALIDADE_PROF = "especialidade";
	public static final String DATABASE_NAME = "seuDoto.db";
	private static final String DATABASE_CREATE = "create table " + 
	TABLE_NAME + "( " + ID + " integer primary key autoincrement, " +
	NOME_PROF + " text not null, " + IDENTIFICACAO_PROF + " integer not null, " + AVALIACAO_PROF + " integer, " 
	+ TIPO_PROF + " text not null, " + CONVENIO_PROF + " text not null, " + ESPECIALIDADE_PROF + " text not null);";
	
	
	
	public static final String ID_USER = "_id";
	public static final String NOME_USER = "nome";
	public static final String IDENTIFICACAO_USER = "identificacao";
	public static final String TABLE_NAME_USER = "TB_USER";
	private static final String DATABASE_CREATE_USER = "create table " + 
	TABLE_NAME_USER + "( " + ID + " integer primary key autoincrement, " +
	NOME_USER + " text not null, " + IDENTIFICACAO_USER + " integer not null);";
	
	public static final String ID_AVALIACAO = "_id";
	public static final String IDENTIFICACAO_USER_AVAL = "identificacao_user";
	public static final String AVALIACAO = "avaliacao";
	public static final String IDENTIFICACAO_PROF_AVAL = "identificacao_prof";
	public static final String TABLE_NAME_AVAL = "TB_AVALIACAO";
	private static final String DATABASE_CREATE_AVAL = "create table " + 
	TABLE_NAME_AVAL + "( " + ID + " integer primary key autoincrement, " +
	IDENTIFICACAO_USER_AVAL + " integer not null, "+AVALIACAO + " integer not null, " + IDENTIFICACAO_PROF_AVAL + " integer not null);";

	public ProfissionalBD(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DATABASE_CREATE);
		db.execSQL(DATABASE_CREATE_USER);
		db.execSQL(DATABASE_CREATE_AVAL);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
	}

}
