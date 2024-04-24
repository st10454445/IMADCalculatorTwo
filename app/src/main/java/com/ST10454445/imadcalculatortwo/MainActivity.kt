package com.ST10454445.imadcalculatortwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var etNum1 : EditText?= null
    var etNum2 : EditText?= null
    var tvDisp : TextView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)
        tvDisp = findViewById(R.id.tvDisp)

        val btnAdd = findViewById<Button>(R.id.btnAdd)
        btnAdd.setOnClickListener{add()}

        val btnSub = findViewById<Button>(R.id.btnSub)
        btnSub.setOnClickListener{sub()}

        val btnMul = findViewById<Button>(R.id.btnMul)
        btnMul.setOnClickListener{mul()}

        val btnDiv= findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener{div()}

        val btnSqr = findViewById<Button>(R.id.btnSqr)
        btnSqr.setOnClickListener{sqr()}

        val btnPow = findViewById<Button>(R.id.btnPow)
        btnPow.setOnClickListener{pow()}


        val btnNextSc = findViewById<Button>(R.id.btnNextScreen)
        btnNextSc.setOnClickListener {
            //call the next screen
            val intent = Intent(this, MainActivity2::class.java)
            //start your next activity
            startActivity(intent)
        }
    }

    private fun add(){}
    private fun sub(){}
    private fun mul(){}
    private fun div(){}
    private fun sqr(){}
    private fun pow(){
        var intNum1 = etNum1?.toString()!!.toInt()
        var intNum2 = etNum2?.toString()?.toInt()
        var intAnswer : Int = 0

        for (i in 1..intNum2!!){
            intAnswer = intAnswer * intNum1
        }
        tvDisp?.text = intAnswer.toString()
        }
}
