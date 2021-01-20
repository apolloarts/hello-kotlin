package com.apolloarts.leetcode.easy

/*
  https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
*/


class Solution1431 {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
        var mostCandies = mutableListOf<Boolean>()

        var highestNumberOfCandies = 0
        for (i in candies.indices) {
            highestNumberOfCandies = highestNumberOfCandies.coerceAtLeast(candies[i])
        }

        for (j in candies.indices) {
            if (candies[j] + extraCandies >= highestNumberOfCandies) {
                mostCandies.add(true)
            } else {
                mostCandies.add(false)
            }
        }

        return mostCandies.toBooleanArray()
    }

    //Good to learn .max and .forEachIndexed, but my solution is faster.
    fun kidsWithCandies2(candies: IntArray, extraCandies: Int): BooleanArray {
        val results = BooleanArray(candies.size)
        val max_number : Int? = candies.max()

        candies.forEachIndexed{index, candy ->
            if(candy + extraCandies >=max_number!!){
                results[index] = true
            }
            else{
                results[index] = false
            }
        }
        return results
    }
}

fun main() {
    val solution = Solution1431()
    val input = intArrayOf(2, 3, 5, 1, 3)

    val kidsWithCandies = solution.kidsWithCandies(input, 3)
    kidsWithCandies.forEach {
        println("${it}")
    }
}