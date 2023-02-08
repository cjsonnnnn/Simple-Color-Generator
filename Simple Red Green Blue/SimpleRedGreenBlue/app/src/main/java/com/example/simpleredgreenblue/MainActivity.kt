package com.example.simpleredgreenblue

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.graphics.Color
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // define button
        val theButton = findViewById<Button>(R.id.mainButton)
        theButton.setOnClickListener(){
            // define all EditTexts
            val xx = findViewById<EditText>(R.id.editText1)
            val yy = findViewById<EditText>(R.id.editText2)
            val zz = findViewById<EditText>(R.id.editText3)

            // define generated color text
            val colorText = "#" + xx.getText().toString() + yy.getText().toString() + zz.getText().toString()

            // define TextView
            val textView = findViewById<TextView>(R.id.theTextView)

            try{
                // define color object
                val colorObject = Color.parseColor(colorText)

                // change the text
                textView.text = colorText

                // change the background
                textView.setBackgroundColor(colorObject)
            } catch (e:Exception){
                // change the text
                textView.text = "invalid color inputted"
            }
        }
    }
}