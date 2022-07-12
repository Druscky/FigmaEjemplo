package com.promedia.figmaejemplo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.promedia.figmaejemplo.databinding.ActivityMainBinding
import com.promedia.figmaejemplo.databinding.ActivityWelcomeBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        b.btnEntrar.setOnClickListener {
            val myIntent = Intent(this, Welcome::class.java)
            startActivity(myIntent)
        }
    }
}

