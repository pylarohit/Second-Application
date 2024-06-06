package com.rohit.secondapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var name: EditText? = null
    var city: EditText? = null
    var college: EditText? = null
    var check: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.name)
        city = findViewById(R.id.city)
        college = findViewById(R.id.college)
        check = findViewById(R.id.check)
        check?.setOnClickListener {
            val check1 = "${name?.text} ${city?.text} ${college?.text}"
            if (check1.isNullOrBlank()) {
                Toast.makeText(this, "Recorded : $check1", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Data is Empty", Toast.LENGTH_LONG).show()
            }
        }
    }
}