package edu.newhaven.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val tag = "mainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById(R.id.button1) as Button
        val btn2 = findViewById(R.id.button2) as Button

        btn.setOnClickListener {
            Log.d(tag , "clicked true button")
            Toast.makeText(this@MainActivity, "Yes!!! Peregrine Falcon can reach speeds of up to 240 miles per hour (mph) while diving!  ", Toast.LENGTH_SHORT).show();
        }

        btn2.setOnClickListener {
            Log.d(tag , "clicked false button")
            Toast.makeText(this@MainActivity, "NO...Peregrine Falcon can reach speeds of up to 240 miles per hour (mph) while diving! ", Toast.LENGTH_SHORT).show();
        }
    }
}
