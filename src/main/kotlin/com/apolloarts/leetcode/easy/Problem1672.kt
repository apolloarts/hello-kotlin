package com.apolloarts.leetcode.easy

/*
  https://leetcode.com/problems/richest-customer-wealth/
*/


class Solution1672 {
    fun maximumWealth(accounts: Array<IntArray>): Int {

        var wealthiestTotal = 0

        for (i in 0..accounts.size - 1) {
            val customerWealth = accounts.get(i).reduce { sum, i -> sum + i }
//            wealthiestTotal = if (customerWealth > wealthiestTotal) {
//                customerWealth
//            } else {
//                wealthiestTotal
//            }
            wealthiestTotal = wealthiestTotal.coerceAtLeast(customerWealth)
        }

        return wealthiestTotal
    }
}

fun main() {
    val solution = Solution1672()
    val input = arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5))

    val wealth = solution.maximumWealth(input)
    println("wealth: ${wealth}")
}