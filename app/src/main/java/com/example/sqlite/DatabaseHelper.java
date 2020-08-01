package com.example.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    //Table nombre:
    public static final String TABLE_NAME = "COUNTRIES";

    //Table Columna:
    public static final String _ID = "id";
    public static final String SUBJECT = "subject";
    public static final String DESC = "description";

    //Database informacion
    static final String DB_NAME = "SQLITE ANDROID.DB";

    //DATABASE VERSION:
    static final int DB_VERSION = 1;

    //Creando Tabla Query:
    public static final String CREATE_TABLE = "create table " + TABLE_NAME + "(" + _ID +
            "INTEGER PRIMARY KEY AUTOINCREMENT, " + SUBJECT + "TEXT NO NULL, " + DESC + "TEXT);";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //EJECUTANDO EL QUERY
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
    }
}
