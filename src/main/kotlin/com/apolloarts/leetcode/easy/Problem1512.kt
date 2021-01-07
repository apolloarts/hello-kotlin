package com.apolloarts.leetcode.easy

class Solution1512 {
    fun numIdenticalPairs(nums: IntArray): Int {

        var counter = 0
        val list = mutableListOf<Int>()
        for (i in nums.indices) {
            val value = nums[i]
            val numberOfSameElements = list.filter { it == value }.size

            counter += numberOfSameElements
            list.add(value)
        }
        return counter
    }

    fun numIdenticalPairs2(nums: IntArray): Int {
        var s = 0
        val item = IntArray(101) { 0 }
        for (num in nums) {
            val test = item[num]++
            s += test
            println("s: $s")
        }
        return s
    }
}

fun main() {
    val input1 = intArrayOf(1, 2, 3, 1, 1, 3)
    val solution1512 = Solution1512()
//    val output1 = solution1512.numIdenticalPairs(input1)
//    println("counter: $output1")

    val output2 = solution1512.numIdenticalPairs2(input1)
    println("counter: $output2")
}