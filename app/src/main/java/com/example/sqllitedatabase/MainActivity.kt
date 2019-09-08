package com.example.sqllitedatabase

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.database.sqlite.SQLiteDatabase
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    internal lateinit var dbHelper: DbHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbHelper = DbHelper(this)
        dbHelper.insertData("sagheer" , "2k17/CSE/89")

    }
}
