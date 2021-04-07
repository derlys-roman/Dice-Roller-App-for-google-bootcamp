package com.example.appdetestes

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button1)
        val imageOfDice: ImageView = findViewById(R.id.imageView2)
        rollButton.setOnClickListener {
            val dice = DiceRoller()
            when (dice.roller().toInt()) {
                1 -> imageOfDice.setImageResource(R.drawable.dice_1)
                2 -> imageOfDice.setImageResource(R.drawable.dice_2)
                3 -> imageOfDice.setImageResource(R.drawable.dice_3)
                4 -> imageOfDice.setImageResource(R.drawable.dice_4)
                5 -> imageOfDice.setImageResource(R.drawable.dice_5)
                6 -> imageOfDice.setImageResource(R.drawable.dice_6)
            }
        }
    }
}