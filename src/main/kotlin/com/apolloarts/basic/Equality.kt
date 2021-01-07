package com.apolloarts.basic

fun main() {
    val s1 = "test"
    val s2 = "test"
    val s3 = String(charArrayOf('t', 'e', 's', 't'))
    val s4 = "test2"

    println(s1 == s2)  // true, structural equality
    println(s1 == s3)  // true, structural equality
    println(s1 === s3)  // false, referential equality
    println(s1.equals(s2)) // true, structural equality
    println(s1 == s4)  //false
}