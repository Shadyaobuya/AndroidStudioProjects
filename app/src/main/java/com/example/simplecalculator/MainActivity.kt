package com.example.simplecalculator

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var eTFirstNumber = findViewById<EditText>(R.id.eTFirstNumber)
        var eTNumber2 = findViewById<EditText>(R.id.eTNumber2)
        var answer = findViewById<TextView>(R.id.tVanswer)
        var addBtn = findViewById<Button>(R.id.btnAdd)
        var subtractBtn=findViewById<Button>(R.id.btnSubtract)
        var multiplyBtn=findViewById<Button>(R.id.btnMultiply)
        var modulusBtn=findViewById<Button>(R.id.btnModulus)


        addBtn.setOnClickListener {
            var num1 = eTFirstNumber.text.toString().toInt()
            var num2 = eTNumber2.text.toString().toInt()
            var addResult=num1+num2
            answer.text="Answer: ${addResult}"


        }
        subtractBtn.setOnClickListener {
            var num1 = eTFirstNumber.text.toString().toInt()
            var num2 = eTNumber2.text.toString().toInt()
            var subtractResult=num1-num2
            answer.text="Answer: ${subtractResult}"

        }

        multiplyBtn.setOnClickListener {
            var num1 = eTFirstNumber.text.toString().toInt()
            var num2 = eTNumber2.text.toString().toInt()
            var multiplyResult=num1*num2
            answer.text="Answer:${multiplyResult}"

        }

        modulusBtn.setOnClickListener {
            var num1 = eTFirstNumber.text.toString().toInt()
            var num2 = eTNumber2.text.toString().toInt()
            var modulusResult=num1%num2
            answer.text="Answer:${modulusResult}"


        }

    }


    }


