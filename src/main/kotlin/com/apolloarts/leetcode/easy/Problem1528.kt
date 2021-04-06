package com.apolloarts.leetcode.easy

class Solution1528 {
    fun restoreString(s: String, indices: IntArray): String {

        var charArray1 = s.toCharArray()
        var charArray2 = CharArray(indices.size)

        for (i in indices.indices) {
            val pos1 = indices[i]

            val a = charArray1[i]
            charArray2[pos1] = a
        }

        return charArray2.concatToString()

        // for LeetCode
        // return charArray2.joinToString("")
    }

    fun restoreString2(s: String, indices: IntArray): String {

        var charArray1 = s.toCharArray()

        for (i in indices.indices) {
            val pos1 = indices[i]

            val a = charArray1[i]
            val b = charArray1[pos1]

            charArray1[pos1] = a
            charArray1[i] = b

            val c = indices[pos1]
            indices[i] = c
            indices[pos1] = pos1
        }

        return charArray1.concatToString()

        // for LeetCode
        // return charArray2.joinToString("")
    }
}

fun main() {
    val solution1518 = Solution1528()

//    val input1 = intArrayOf(4, 5, 6, 7, 0, 2, 1, 3)
//    val s1 = "codeleet"
//
//    val output1 = solution1518.restoreString(s1, input1)
//    println("$output1")
//
//    val input2 = intArrayOf(0,1,2)
//    val s2 = "abc"
//
//    val output2 = solution1518.restoreString(s2, input2)
//    println("$output2")

    val input3 = intArrayOf(3, 1, 4, 2, 0)
    val s3 = "aiohn"

    //val output3 = solution1518.restoreString(s3, input3)
    //println("$output3")

    println("${solution1518.restoreString2(s3, input3)}")
}