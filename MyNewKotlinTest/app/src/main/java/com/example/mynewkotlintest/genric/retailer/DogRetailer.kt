package com.example.mynewkotlintest.genric.retailer

import com.example.mynewkotlintest.genric.Dog

class DogRetailer: Retailer<Dog> {
    override fun sell(): Dog {
    println("Sell Dog")
    return Dog("")
    }
}