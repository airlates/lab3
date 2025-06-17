package com.example.lab3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstStringInput = findViewById<EditText>(R.id.firstStringInput)
        val secondStringInput = findViewById<EditText>(R.id.secondStringInput)
        val concatButton = findViewById<Button>(R.id.concatButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        concatButton.setOnClickListener {
            val firstString = firstStringInput.text.toString()
            val secondString = secondStringInput.text.toString()

            // Дозаписываем вторую строку в конец первой
            val combinedString = firstString + secondString

            resultTextView.text = "Результат: $combinedString"
        }
    }
}