package com.example.easywallet;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by CHAI on 12/10/2017.
 */

public class db extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "menu";
    private static final int DATABASE_VERSION = 1;

    private static final String TABLE_NAME = "MENU";
    private static final String COL_ID = "id";
    private static final String COL_NAME = "name";
    private static final String COL_PICTURE = "picture";

    private static final String CREATE_TABLE = "CREATE_TABLE" + TABLE_NAME + "("
            + COL_ID + "INTRGER PRIMARY KEY AUTOINCREMENT, "
            + COL_PICTURE + " TEXT, "
            + COL_NAME + " TEXT)";

    public db (Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);

    @Override
    public void onCreate (SQLiteDatabase db) {
            db.execSQL(CREATE_TABLE);
            insert(db);
    }


    public void insert(SQLiteDatabase db){
        ContentValues cv = new ContentValues();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
