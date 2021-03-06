package com.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Handler().postDelayed({
            val intent = Intent(this,MenuActivity::class.java)
            startActivity(intent)
            finish() },2000)
        setContentView(R.layout.activity_main)
    }
    override fun onRestart() {
        super.onRestart()
        finish()
    }
}