package com.example.vaibhav.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.btn_roll_dice)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.btn_count_up)
        countButton.setOnClickListener { countUp() }
    }

    //Increments the dice roll by 1
    private fun countUp() {
        val resultText: TextView = findViewById(R.id.txt_hello_world)
        if(resultText.text.contains("Hello")) {
            resultText.text = "1";
        } else {
            var tempValue = resultText.text.toString().toInt()
            if(tempValue < 6) {
                tempValue++
                resultText.text = tempValue.toString()
            }
        }
    }

    // Roll the dice with random 6
    private fun rollDice() {
        val txtResult: TextView = findViewById(R.id.txt_hello_world)
        val randomNumber = (1..6).random()
        txtResult.text = randomNumber.toString()
    }
}