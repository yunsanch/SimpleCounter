package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num = findViewById<TextView>(R.id.changingNum)
        val upgrade =findViewById<Button>(R.id.UpgradeButton)
        val button = findViewById<Button>(R.id.AddButton)
        button.setOnClickListener {
            counter++
            num.text =counter.toString()
//            Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show()
            if (counter >= 10) {
                upgrade.visibility =View.VISIBLE
                upgrade.setOnClickListener {
                    button.text = "ADD 2"
                    button.setOnClickListener {
                        counter +=2
                        num.text = counter.toString()
                    }
                    upgrade.visibility =View.GONE
                }
            }
        }



    }
    var counter = 0
}