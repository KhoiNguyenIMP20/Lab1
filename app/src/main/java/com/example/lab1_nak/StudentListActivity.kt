package com.example.lab1_nak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class StudentListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)
    }

    fun goBack(view: View) {
        finish()
    }
}