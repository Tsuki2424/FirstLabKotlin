package com.example.firstlabkotlin

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var tvMain: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain = findViewById(R.id.tvMain)
    }

    fun onBtnChangeTextClick(view: View) {
        tvMain.text = "Text changed!"
    }
    fun onBtnChangeColorClick(view: View) {
        tvMain.setTextColor(getColor(android.R.color.holo_red_dark))
    }
}