package com.turbosoft.openglplayground

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<MaterialButton>(R.id.btn_hello)
        btn.setOnClickListener {
            startActivity(Intent(this, GLSurfaceViewActivity::class.java))
        }
    }
}