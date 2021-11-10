package com.example.lab1_nak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goAddNewStudent(view: View) {
        val addactivity = Intent(this, AddStudentActivity::class.java)
        startActivity(addactivity)
    }

    fun goListStudents(view: View) {
        val addactivity = Intent(this, StudentListActivity::class.java)
        startActivity(addactivity)
    }
}