package com.example.sambo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun opened(view: View) {
        val a = Intent(this@MainActivity2, sambo2::class.java)
        startActivity(a)
    }


}
