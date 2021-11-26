import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.lab1_nak.R

class StudentAdapter(private val mStudent: List<Student>) :
    RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View, private val context: Context) :
        RecyclerView.ViewHolder(itemView), View.OnClickListener {
        val nameTextView: TextView = itemView.findViewById<TextView>(R.id.student_name)
        val gradeTextView: TextView = itemView.findViewById<TextView>(R.id.student_grade)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            val student: Student = mStudent[position]
            Toast.makeText(context, student.name, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val studentView = inflater.inflate(R.layout.item_student, parent, false)
        return ViewHolder(studentView, context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val student: Student = mStudent[position]
        val textView = holder.nameTextView
        textView.text = student.name
        val textViewG = holder.gradeTextView
        textViewG.text = student.grade
    }

    override fun getItemCount(): Int {
        return mStudent.size
    }
}