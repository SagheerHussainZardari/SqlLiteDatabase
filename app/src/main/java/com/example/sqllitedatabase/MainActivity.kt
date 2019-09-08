package com.example.sqllitedatabase

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    internal lateinit var dbHelper: DbHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dbHelper = DbHelper(this)


    }

    fun insertData(view: View) {

        val isDataInserted = dbHelper.insertData("sagheer", "2k17/CSE/89")

        if (isDataInserted)
            showToast("Data Inserted")
        else
            showToast("Data Not Inserted")
    }

    fun showToast(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
