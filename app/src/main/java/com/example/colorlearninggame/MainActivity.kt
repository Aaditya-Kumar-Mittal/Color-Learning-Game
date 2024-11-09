package com.example.colorlearninggame

import android.graphics.Color
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val backgroundContainer = findViewById<FrameLayout>(R.id.background_container)

        // Map colors to their names
        val colorMap = mapOf(
            R.id.redCard to Pair("Red", Color.parseColor("#FFFF0000")),
            R.id.greenCard to Pair("Green", Color.parseColor("#FF00FF00")),
            R.id.blueCard to Pair("Blue", Color.parseColor("#FF0000FF")),
            R.id.yellowCard to Pair("Yellow", Color.parseColor("#FFFFFF00")),
            R.id.purpleCard to Pair("Purple", Color.parseColor("#FF800080")),
            R.id.pinkCard to Pair("Pink", Color.parseColor("#FFFFC0CB")),
            R.id.orangeCard to Pair("Orange", Color.parseColor("#FFFFA500")),
            R.id.brownCard to Pair("Brown", Color.parseColor("#FFA52A2A")),
            R.id.cyanCard to Pair("Cyan", Color.parseColor("#FF00FFFF")),
            R.id.magentaCard to Pair("Magenta", Color.parseColor("#FFFF00FF")),
            R.id.grayCard to Pair("Gray", Color.parseColor("#FF808080")),
            R.id.limeCard to Pair("Lime", Color.parseColor("#FF00FF00")),
            R.id.tealCard to Pair("Teal", Color.parseColor("#FF008080")),
            R.id.indigoCard to Pair("Indigo", Color.parseColor("#FF4B0082")),
            R.id.violetCard to Pair("Violet", Color.parseColor("#FF8A2BE2")),
            R.id.maroonCard to Pair("Maroon", Color.parseColor("#FF800000")),  // New color
            R.id.turquoiseCard to Pair("Turquoise", Color.parseColor("#FF40E0D0")),  // New color
            R.id.goldCard to Pair("Gold", Color.parseColor("#FFFFD700"))  // New color
        )


        // Set click listeners on each card
        for ((cardId, colorInfo) in colorMap) {
            findViewById<CardView>(cardId).setOnClickListener {
                val (colorName, colorValue) = colorInfo
                backgroundContainer.setBackgroundColor(colorValue) // Change background color
                Toast.makeText(this, colorName, Toast.LENGTH_SHORT).show() // Show color name
            }
        }
    }
}