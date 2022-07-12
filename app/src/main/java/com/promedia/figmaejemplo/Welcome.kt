package com.promedia.figmaejemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.promedia.figmaejemplo.databinding.ActivityWelcomeBinding

class Welcome : AppCompatActivity() {
    private lateinit var b: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(b.root)
    }
}