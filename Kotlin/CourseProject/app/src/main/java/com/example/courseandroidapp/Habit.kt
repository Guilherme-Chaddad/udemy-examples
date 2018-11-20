package com.example.courseandroidapp

import android.graphics.Bitmap

data class Habit(val title: String, val description: String, val image: Bitmap)

/*fun getSampleHabits(): List<Habit> {
  turn listOf(
      Habit("Go for a walk", "A nice walk in the sun gets you ready for the day ahead", R.drawable.walk),
      Habit("Drink a gllas of water", "A refreshing glass of water gets you hydrated", R.drawable.water)
  )
}*/