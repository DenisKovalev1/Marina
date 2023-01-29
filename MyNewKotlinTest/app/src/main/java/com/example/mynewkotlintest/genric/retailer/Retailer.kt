package com.example.mynewkotlintest.genric.retailer

interface Retailer<out T> {
    fun sell(): T
}