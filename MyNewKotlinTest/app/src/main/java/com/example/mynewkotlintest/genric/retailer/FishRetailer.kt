package com.example.mynewkotlintest.genric.retailer

import com.example.mynewkotlintest.genric.Fish

class FishRetailer: Retailer<Fish> {
    override fun sell(): Fish {
        println("Sell Fish")
        return Fish("")
    }
}