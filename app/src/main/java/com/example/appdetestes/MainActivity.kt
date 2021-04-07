package com.example.appdetestes

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button1)
        rollButton.setOnClickListener {
            val dice = DiceRoller()
            dice.roller().toString().also { textviewcentral.text = it }
        }
    }
}