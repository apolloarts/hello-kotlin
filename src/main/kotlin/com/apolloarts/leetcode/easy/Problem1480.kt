package com.apolloarts.leetcode.easy

import com.apolloarts.leetcode.easy.Solution as Solution

/*
https://leetcode.com/problems/running-sum-of-1d-array/
*/


class Solution1480 {
    fun runningSum(nums: IntArray): IntArray {
        if (nums.size == 1) {
            return nums
        }

        for (i in 1..nums.size - 1) {
            val prev = nums[i - 1]
            val current = nums[i]
            val runningSum = prev + current
            nums[i] = runningSum
        }

        return nums
    }

    fun runningSumSlower(nums: IntArray): IntArray {
        var sum = 0
        return nums.map() { sum += it; sum }.toIntArray()
    }

}

fun main() {
    val solution = Solution1480()
    val input = intArrayOf(1, 2, 3, 4)

    val runningSums = solution.runningSum(input)
    runningSums.forEach {
        println("${it}")
    }
}