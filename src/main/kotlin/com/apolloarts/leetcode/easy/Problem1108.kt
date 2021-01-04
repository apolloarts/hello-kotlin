package com.apolloarts.leetcode.easy

import com.apolloarts.leetcode.easy.Solution as Solution

/*
https://leetcode.com/problems/defanging-an-ip-address/
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
*/


class Solution {
    fun defangIPaddr(address: String): String {

        return address.replace(".", "[.]")
    }

    fun defangIPaddrFaster(address: String): String {
        val tokens = address.split(".")

        var result = ""
        for (i in tokens.indices) {
            if (i == tokens.size - 1) {
                result += tokens[i]
                break
            }
            result += "${tokens[i]}[.]"
        }
        return result
    }
}

fun main() {
    val solution = Solution()
    val input = "1.1.1.1"

    println("${solution.defangIPaddr(input)}")

    println("${solution.defangIPaddrFaster(input)}")
}