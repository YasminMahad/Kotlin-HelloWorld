package com.example.sendmoney

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sendMoneyactivity : AppCompatActivity() {
    lateinit var btnTransactMoney: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnTransactMoney = findViewById(R.id.btnTransactMoney)
        btnTransactMoney.setOnClickListener {
            val intent = Intent(this, sendMoneyactivity::class.java)
            startActivity(intent)
        }
    }
}