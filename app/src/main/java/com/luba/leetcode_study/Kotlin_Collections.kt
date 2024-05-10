package com.luba.leetcode_study

fun main() {
    //List
    val list = listOf("James", "Bob", "Paul", "Sebastian", "Jacob")

    for ((index, item) in list.withIndex()) {
        println("${item}: index ${index}")

    }
    //Mutable List
    val mList = mutableListOf(1, 2, 3, 4, 5)
    for (item in mList){
        println(item)
    }
    mList.add(6)
    mList.forEach { println("Added element ${it}") }

    //Set
    val set = setOf("US", "CA", "AU")
    println(set)
    val mSet = mutableSetOf(12, 14, 16)
    mSet.add(18)
    println(mSet)

    val secretMap = mapOf("Up" to 1, "Down" to 2, "Left" to 3, "Right" to 4)
    println(secretMap)
    println("Values: ${secretMap.values}")
    println("Keys: ${secretMap.keys}")

    if("Up" in secretMap) println("Yes Up is in map")


}