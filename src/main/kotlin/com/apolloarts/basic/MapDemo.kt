package com.apolloarts.basic

/**
 * Use filter instead of iterator-loop to remove element
 * https://stackoverflow.com/questions/48577158/remove-data-from-list-while-iterating-kotlin
 *
 */
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


    var mmap1 = mutableMapOf(1 to "mtest1", 2 to "mtest2")
    mmap1.forEach {
            k, v -> println("$k = $v")
    }

    val map2 = map1.filter { e -> e.value != "test2" }

    map2.forEach {
            k, v -> println("$k = $v")
    }
}