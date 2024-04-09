package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        // Initialize views
        val buttonSkills = findViewById<Button>(R.id.B1)
        val buttonEducation = findViewById<Button>(R.id.button2)
        val buttonWorkExperience = findViewById<Button>(R.id.btn3)
        val buttonAchievements = findViewById<Button>(R.id.BTN4)

        // Set click listeners for buttons
        buttonSkills.setOnClickListener {
            val intent = Intent(this, SkillsActivity::class.java)
            startActivity(intent)
        }

        buttonEducation.setOnClickListener {
            val intent = Intent(this, EducationActivity::class.java)
            startActivity(intent)
        }

        buttonWorkExperience.setOnClickListener {
            val intent = Intent(this, WorkExperienceActivity::class.java)
            startActivity(intent)
        }

        buttonAchievements.setOnClickListener {
            val intent = Intent(this, AchievementsActivity::class.java)
            startActivity(intent)
        }
    }
}
