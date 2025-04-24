package com.example.calculatorwithfeature

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val editTextOne = findViewById<EditText>(R.id.editTextOne)
        val editTextTwo = findViewById<EditText>(R.id.editTextTwo)
        val add = findViewById<Button>(R.id.buttonAdd)
        val multiply = findViewById<Button>(R.id.buttonMultiply)
        val subtract = findViewById<Button>(R.id.buttonMinus)
        val divide = findViewById<Button>(R.id.buttonDivide)
        val result = findViewById<TextView>(R.id.answer)
        val buttonClear = findViewById<Button>(R.id.buttonClear)

        add!!.setOnClickListener {
            val number1 = editTextOne.text.toString().toInt()
            val number2 = editTextTwo.text.toString().toInt()
            val sum = number1 + number2
            result.text = "$sum"
        }
        multiply!!.setOnClickListener {
            val number1 = editTextOne.text.toString().toInt()
            val number2 = editTextTwo.text.toString().toInt()
            val sum = number1 * number2
            result.text = "$sum"
        }
        subtract!!.setOnClickListener {
            val number1 = editTextOne.text.toString().toInt()
            val number2 = editTextTwo.text.toString().toInt()
            val sum = number1 - number2
            result.text = "$sum"
        }
        divide!!.setOnClickListener {
            val number1 = editTextOne.text.toString().toInt()
            val number2 = editTextTwo.text.toString().toInt()
            val sum = number1 / number2
            result.text = "$sum"
        }
        buttonClear.setOnClickListener {
            editTextOne.text.clear()
            editTextTwo.text.clear()
            result.text = " "
        }

    }
}

