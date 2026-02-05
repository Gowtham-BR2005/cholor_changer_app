package com.example.exp

import android.os.Bundle
import android.graphics.Color
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random




class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            var systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var count:Int=10
        var myButton: Button = findViewById(R.id.btn)
        var mytext: TextView = findViewById(R.id.text1)
        var textSizeValue = 30f


        myButton.setOnClickListener {
            val textcolor = Color.rgb(
                Random.nextInt(256),
                Random.nextInt(256),
                Random.nextInt(256)
            )
            val bgcolor = Color.rgb(
                Random.nextInt(256),
                Random.nextInt(256),
                Random.nextInt(256)
            )
            mytext.setTextColor(textcolor)
            mytext.setBackgroundColor(bgcolor)

            textSizeValue += 7f;
            mytext.textSize = textSizeValue

        }
    }
}