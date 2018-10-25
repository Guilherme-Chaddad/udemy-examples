package com.example.courseandroidapp

data class Habit(val title: String, val description: String, val image: Int)

fun getSampleHabits(): List<Habit> {
    return listOf(
        Habit("Go for a walk", "A nice walk in the sun gets you ready for the day ahead", R.drawable.walk),
        Habit("Drink a gllas of water", "A refreshing glass of water gets you hydrated", R.drawable.water)
    )
}