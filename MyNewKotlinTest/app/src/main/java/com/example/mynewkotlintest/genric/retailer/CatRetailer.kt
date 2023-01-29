package com.example.mynewkotlintest.genric.retailer

import com.example.mynewkotlintest.genric.Cat

class CatRetailer: Retailer<Cat> {
    override fun sell(): Cat {
        println("Sell Cat")
        return Cat("")
    }
}