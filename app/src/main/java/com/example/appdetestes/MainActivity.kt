package com.example.appdetestes

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button1)
        val imageOfDice: ImageView = findViewById(R.id.imageView2)
        val imageOfDice2: ImageView = findViewById(R.id.imageView3)
        val dice = DiceRoller()
        imageOfDice.setImageResource(R.drawable.dice_1)
        imageOfDice2.setImageResource(R.drawable.dice_2)
        rollButton.setOnClickListener {
            when (dice.roller()) {
                1 -> imageOfDice.setImageResource(R.drawable.dice_1)
                2 -> imageOfDice.setImageResource(R.drawable.dice_2)
                3 -> imageOfDice.setImageResource(R.drawable.dice_3)
                4 -> imageOfDice.setImageResource(R.drawable.dice_4)
                5 -> imageOfDice.setImageResource(R.drawable.dice_5)
                6 -> imageOfDice.setImageResource(R.drawable.dice_6)
            }
            when (dice.roller()) {
                1 -> imageOfDice2.setImageResource(R.drawable.dice_1)
                2 -> imageOfDice2.setImageResource(R.drawable.dice_2)
                3 -> imageOfDice2.setImageResource(R.drawable.dice_3)
                4 -> imageOfDice2.setImageResource(R.drawable.dice_4)
                5 -> imageOfDice2.setImageResource(R.drawable.dice_5)
                6 -> imageOfDice2.setImageResource(R.drawable.dice_6)
            }
            dice.roller().toString().also { imageOfDice.contentDescription = it }
        }
    }
}