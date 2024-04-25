package com.luba.leetcode_study
// Task 2: Change the 'sum' function so that it was declared as an extension to List<Int>.
fun sum(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}
fun List<Int>.mySum(): Int {
    var result = 0
    for (item in this) {
        result += item
    }
    return result
}

fun main(args: Array<String>) {
    val sum = sum(listOf(1, 2, 3))
    println(sum)    // 6
    println(listOf(1,1,1).mySum()) // 3
}