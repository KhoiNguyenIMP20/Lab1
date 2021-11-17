package com.example.lab1_nak

import Student
import StudentAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class StudentListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)

        var students = ArrayList<Student>()
        val rvStudent = findViewById<View>(R.id.student_recycler) as RecyclerView
        students.add(Student("Marny Wellson", 8.8))
        students.add(Student("John Doe", 9.2))
        students.add(Student("Tom Carlson", 7.3))

        val adapter = StudentAdapter(students)
        rvStudent.adapter = adapter
        rvStudent.layoutManager = LinearLayoutManager(this)
    }

    fun goBack(view: View) {
        finish()
    }

    fun studentitem_onClick(view: android.view.View) {

    }
}