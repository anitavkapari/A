package com.example.annu.myapplication.DB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBholder extends SQLiteOpenHelper {

    private static final String DB_NAME="employee.sqlite";  //made constant
    private static final int DB_VERSION = 1;
    private  static  final String TABLE="employee";
    private static final String ID="id";
    private static final String NAME="name";
    private static final String ADDRESS="address";
    private static final String PHONE="phone";
    private static final String COURSE ="course";
    private static final String BRANCH="branch";
    private static final String YEARS="years";


    public DBholder(Context context) {    //
        super( context, DB_NAME, null,DB_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query= "create table "+ TABLE
                +"  ( "+ ID + " integer primary key autoincrement ,"
                +NAME + " text,  "+ADDRESS + " text," +PHONE + "text,"  +COURSE + "text,"
                +BRANCH + "text,"  +YEARS + "integer)";
        Log.e("DBQuery","=========="+query);
        sqLiteDatabase.execSQL( query );
    }
    public boolean addEmployee(Employee employee){
        SQLiteDatabase db= getWritableDatabase();
        ContentValues values= new ContentValues();
        values.put( NAME,employee.getName() );
        values.put( ADDRESS,employee.getAddress() );
        values.put( PHONE,employee.getPhone() );
        values.put( COURSE,employee.getCourse() );
        values.put( BRANCH,employee.getBranch() );
        values.put( YEARS,employee.getYears() );
        long no =db.insert( TABLE, null,values);
        if(no==0) {
            return false;
        }
            else {
                return true;
            }
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
