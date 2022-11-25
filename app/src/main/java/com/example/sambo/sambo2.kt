package com.example.sambo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class sambo2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sambo2)
    }

    fun opened2(view: View) {
        val b = Intent(this, sambo3::class.java)
        startActivity(intent)
    }
}