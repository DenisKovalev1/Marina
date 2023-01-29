package com.example.mynewkotlintest.genric

class Contest<T: Pet> {

    private val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore (t: T, score : Int = 0) {
        if (score >= 0 ) scores.put(t, score)
    }

    fun getWinner (): MutableList<T> {
        val winners: MutableList<T> = mutableListOf()
        val highScore = scores.values.maxOrNull()
        for ((t, score) in scores){
            if (score == highScore) winners.add(t)
        }
        return winners
    }
}