package com.apolloarts.basic

class InitOrderDemo(name: String) {
    var firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints ${name}")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }

    fun test1() {
        println("firstProperty: $firstProperty")
    }

    fun updateFirstProperty(firstProperty: String) {
        this.firstProperty = firstProperty;
    }
}

fun main() {
    val init = InitOrderDemo("Apollo")
    init.test1()
    init.updateFirstProperty("new property 1")
    init.test1()
}