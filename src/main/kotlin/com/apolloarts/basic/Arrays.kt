package com.apolloarts.basic


fun main() {
    val colors: Array<String> = arrayOf("green", "red", "blue")
    for (i in colors.indices) {
        println("$i : ${colors[i]}")
    }
}