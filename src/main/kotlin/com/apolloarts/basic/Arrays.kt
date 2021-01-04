package com.apolloarts.basic


fun main() {
    val colors: Array<String> = arrayOf("green", "red", "blue")
    for (i in colors.indices) {
        println("$i : ${colors[i]}")
    }

    // use .indices to get the array's current index
    val numbers: Array<Int> = arrayOf(1, 2, 3)
    for (i in numbers.indices) {
        println("$i : ${numbers.get(i)}")
    }

    //ArrayList in Kotlin is supported by Collections methods
    val numbers2: ArrayList<Int> = arrayListOf(1, 2, 3, 4)
    for (i in numbers2.indices) {
        println("$i : ${numbers2.filter { i % 2 == 0 }}")
    }
    println("even numbers : ${numbers2.filter { i: Int -> i % 2 == 0 }}")
}