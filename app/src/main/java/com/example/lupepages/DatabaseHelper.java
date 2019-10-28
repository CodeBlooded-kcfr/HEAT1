package com.example.lupepages;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.strictmode.SqliteObjectLeakedViolation;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "LUPEDatabase.db";
    public static final String TABLE_NAME = "Entrepreneurs_Table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "Full_Name";
    public static final String COL_3 = "Email";
    public static final String COL_4 = "Password";
    public static final String COL_5 = "Company_Name";
    public static final String COL_6 = "Zip_Code";



    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT, FULL_NAME TEXT, Email TEXT, Password TEXT, Company_Name TEXT, Zip_Code INTEGER )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " +  TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String full_name, String email, String password, String company_name, String zip_code) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, full_name);
        contentValues.put(COL_3, email);
        contentValues.put(COL_4, password);
        contentValues.put(COL_5, company_name);
        contentValues.put(COL_6, zip_code);
        long result = db.insert(TABLE_NAME,null,contentValues);
        if (result == -1)
            return false;
        else
            return true;

    }

    public Cursor getViewData()  {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor results = db.rawQuery("Select * from " + TABLE_NAME, null);
        return results;
    }
}