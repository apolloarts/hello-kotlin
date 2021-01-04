package com.apolloarts.basic

fun main() {
    var map1 = mapOf(1 to "test1", 2 to "test2")

    map1.forEach {
            k, v -> println("$k = $v")
    }

    val iter1 = map1.iterator()
    iter1.forEach { e ->
        val k = e.key
        val v = e.value
        println("$k = $v")
    }
}