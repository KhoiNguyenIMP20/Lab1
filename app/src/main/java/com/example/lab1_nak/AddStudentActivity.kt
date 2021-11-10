package com.example.lab1_nak

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.core.content.ContextCompat

class AddStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_student)
    }

    fun addBtnOnClick(view: View) {
        val name = findViewById<EditText>(R.id.inputStudentName).text.trim()
        val score = findViewById<EditText>(R.id.inputStudentScore).text.trim()
        val confirmation = findViewById<TextView>(R.id.addStatus)
        // Validation process
        if(name.isEmpty() || score.isEmpty()){
            confirmation.setText(R.string.alert_fill_blanks)
            confirmation.setTextColor(resources.getColor(R.color.invalid))
        } else {
            confirmation.setText(R.string.success_add)
            confirmation.setTextColor(resources.getColor(R.color.success))
        }
    }

    fun goBack(view: View) {
        finish()
    }
}