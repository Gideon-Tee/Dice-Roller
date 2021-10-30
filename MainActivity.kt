package eu.tutorials.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button2)

        rollButton.setOnClickListener {
        rollDice()

        }

    }

    private fun rollDice() {
        val dice = Dice(6)
        val rollResult = dice.roll()
        val tvDiceRoll: TextView = findViewById(R.id.textView)
        tvDiceRoll.text = rollResult.toString()
    }
}
class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}