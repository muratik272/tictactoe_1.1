package com.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu)
        btn1.setOnClickListener{
            val intent = Intent(this,ProcessActivity::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener{
            val intent = Intent(this,ProcessActivity::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener{
            val intent = Intent(this,SettingsActivity::class.java)
            startActivity(intent)
        }
    }

}