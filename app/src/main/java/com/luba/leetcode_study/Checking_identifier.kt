package com.luba.leetcode_study
//Task 1 Implement the function that checks whether a string is valid identifier.
// A valid identifier is a non empty string, that starts with a letter or underscore,
// and consists of only letters, digits and underscores.
//
fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty() || s[0].isDigit()) return false
    for (ch in s) {
        if (!isValidCharacter(ch)) return false
    }
    return true

}

fun isValidCharacter(ch: Char) = ch == '_' || ch in 'a'..'z' || ch in 'A'..'Z' || ch.isDigit()


fun main (){
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}
