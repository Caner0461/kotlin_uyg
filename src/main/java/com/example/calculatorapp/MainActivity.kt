
package com.example.calculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber = findViewById<EditText>(R.id.firstNumber)
        val secondNumber = findViewById<EditText>(R.id.secondNumber)
        val result = findViewById<TextView>(R.id.result)

        val addButton = findViewById<Button>(R.id.addButton)
        val subtractButton = findViewById<Button>(R.id.subtractButton)
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val divideButton = findViewById<Button>(R.id.divideButton)

        addButton.setOnClickListener {
            val num1 = firstNumber.text.toString().toDoubleOrNull()
            val num2 = secondNumber.text.toString().toDoubleOrNull()
            result.text = if (num1 != null && num2 != null) {
                (num1 + num2).toString()
            } else {
                "Lütfen iki sayı giriniz"
            }
        }

        subtractButton.setOnClickListener {
            val num1 = firstNumber.text.toString().toDoubleOrNull()
            val num2 = secondNumber.text.toString().toDoubleOrNull()
            result.text = if (num1 != null && num2 != null) {
                (num1 - num2).toString()
            } else {
                "Lütfen iki sayı giriniz"
            }
        }

        multiplyButton.setOnClickListener {
            val num1 = firstNumber.text.toString().toDoubleOrNull()
            val num2 = secondNumber.text.toString().toDoubleOrNull()
            result.text = if (num1 != null && num2 != null) {
                (num1 * num2).toString()
            } else {
                "Lütfen iki sayı giriniz"
            }
        }

        divideButton.setOnClickListener {
            val num1 = firstNumber.text.toString().toDoubleOrNull()
            val num2 = secondNumber.text.toString().toDoubleOrNull()
            result.text = if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    (num1 / num2).toString()
                } else {
                    "Bölme işlemi için sıfırdan farklı bir sayı giriniz"
                }
            } else {
                "Lütfen iki sayı giriniz"
            }
        }
    }
}
