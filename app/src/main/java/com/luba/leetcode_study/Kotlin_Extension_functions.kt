package com.luba.leetcode_study

fun main() {
    println("Hi friend".append(" Nice to meet you"))
    println("Friend".removeFirstAndLastChars())
}

fun String.append(toAppend:String): String = this.plus(toAppend)

fun String.removeFirstAndLastChars(): String = this.substring(1, this.length-1)
