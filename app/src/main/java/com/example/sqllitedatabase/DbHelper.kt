package com.example.sqllitedatabase

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import android.widget.Toast

class DbHelper(context: Context): SQLiteOpenHelper(context ,"Uni.db" , null , 1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0!!.execSQL("CREATE TABLE students(name TEXT , roll TEXT);")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        p0!!.execSQL("DROP TABLE IF EXISTS students;")
        onCreate(p0!!)
    }


    fun insertData(name: String , roll: String){
        var ra =  this.writableDatabase

        ra.execSQL("INSERT INTO students VALUES ( '$name', '$roll' )")
        Log.d("a" , "sagheer:row Inserted!!!")

    }



}