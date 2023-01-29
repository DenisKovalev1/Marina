package com.example.mynewkotlintest

import com.example.mynewkotlintest.genric.Cat
import com.example.mynewkotlintest.genric.Contest
import com.example.mynewkotlintest.genric.Fish
import com.example.mynewkotlintest.genric.retailer.FishRetailer
import com.example.mynewkotlintest.genric.retailer.Retailer

fun main() {
    val cat = Cat("Баки")
    val cat1 = Cat("Борис")
    val fish = Fish("Локи")

    val catContest = Contest<Cat>()
    catContest.addScore(cat, 34)
    catContest.addScore(cat1, 21)
    val topCat = catContest.getWinner().first()
    println("Cat contest winner is ${topCat.name}")
    val fisfReteiler: Retailer<Fish> = FishRetailer()
    fisfReteiler.sell()
}