package com.example.lab1_nak

import android.content.ContentValues
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.lab1_nak.MyContentProvider

class AddStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_student)
    }

    fun addBtnOnClick(view: View) {
        val name = findViewById<EditText>(R.id.inputStudentName).text.trim()
        val score = findViewById<EditText>(R.id.inputStudentScore).text.trim()
        val toast_duration = Toast.LENGTH_SHORT
        //val confirmation = findViewById<TextView>(R.id.addStatus)
        // Validation process
        if (name.isEmpty() || score.isEmpty()) {
            //confirmation.setText(R.string.alert_fill_blanks)
            //confirmation.setTextColor(resources.getColor(R.color.invalid))
            val toast =
                Toast.makeText(applicationContext, R.string.alert_fill_blanks, toast_duration)
            toast.show()
        } else {
            //confirmation.setText(R.string.success_add)
            //confirmation.setTextColor(resources.getColor(R.color.success))
            //val toast = Toast.makeText(applicationContext, R.string.success_add, toast_duration)
            //toast.show()

            // class to add values in the database
            val values = ContentValues()

            // fetching text from user
            values.put(MyContentProvider.name, name.toString())
            values.put(MyContentProvider.grade, score.toString())

            // inserting into database through content URI
            contentResolver.insert(MyContentProvider.CONTENT_URI, values)

            // displaying a toast message
            Toast.makeText(applicationContext, R.string.success_add, toast_duration).show()
        }
    }

    fun goBack(view: View) {
        finish()
    }
}