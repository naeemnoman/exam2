package com.naeemnoman.serialno3.userprofileregestration_dipti_amad_l4_04_17

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var listButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     listButton = findViewById(R.id.profileListBtn)

        listButton.setOnClickListener {
            startActivity(Intent(this, ProfileListActivity_04_17::class.java))
            finish()
        }
    }
}