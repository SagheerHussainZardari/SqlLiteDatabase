package com.example.sqllitedatabase

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DbHelper(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {


    companion object {
        private val DATABASE_NAME = "University.db"
        private val DATABASE_VERSION = 1

        //table student
        private val TABLE_NAME = "students"
        private val STUDENTS_COL_NAME = "Name"
        private val STUDENTS_COL_ROLL = "Roll"


    }
    override fun onCreate(p0: SQLiteDatabase?) {
        val CREATE_TABLE_QUERY =
            "CREATE TABLE $TABLE_NAME($STUDENTS_COL_NAME TEXT , $STUDENTS_COL_ROLL TEXT)"
        p0!!.execSQL(CREATE_TABLE_QUERY)
    }
    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

        val DROP_TABLE_QUERY = "DROP TABLE IF EXISTS $TABLE_NAME"
        p0!!.execSQL(DROP_TABLE_QUERY)
        onCreate(p0)
    }

    fun insertData(name: String, roll: String): Boolean {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(STUDENTS_COL_NAME, name)
        values.put(STUDENTS_COL_ROLL, roll)


        val a: Long = db.insert(TABLE_NAME, null, values)

        return a != -1L
    }

}