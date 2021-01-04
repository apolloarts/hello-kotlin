package com.apolloarts.leetcode.medium

/*
https://leetcode.com/problems/string-compression/

Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length.
The compressed string s should not be returned separately, but instead be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

After you are done modifying the input array, return the new length of the array.


Follow up:
Could you solve it using only O(1) extra space?



Example 1:

Input: chars = ["a","a","b","b","c","c","c"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
Example 2:

Input: chars = ["a"]
Output: Return 1, and the first character of the input array should be: ["a"]
Explanation: The only group is "a", which remains uncompressed since it's a single character.
Example 3:

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
Example 4:

Input: chars = ["a","a","a","b","b","a","a"]
Output: Return 6, and the first 6 characters of the input array should be: ["a","3","b","2","a","2"].
Explanation: The groups are "aaa", "bb", and "aa". This compresses to "a3b2a2". Note that each group is independent even if two groups have the same character.


Constraints:

1 <= chars.length <= 2000
chars[i] is a lower-case English letter, upper-case English letter, digit, or symbol.
 */

class Solution {
    fun compress(chars: CharArray): Int {

        var prev = '\u0000'
        var counter = 1

        var result = ""

        for(i in chars.indices) {
            var current = chars[i]

            if (current == prev && i > 0) {
                counter++
            } else {
                if(counter > 1) {
                    result += "$prev$counter"
                } else {
                    if (i != 0) {
                        result += "$prev"
                    }
                }
                counter = 1
            }

            if (i == chars.size - 1) {
                result += "$current$counter"
            }

            prev = chars[i]
        }

        val output = result.toCharArray().size

        return output
    }

    // O(n) time and O(1) space with two pointers
    fun compress2(chars: CharArray): Int {
        if (chars.isEmpty()) return 0

        var charsSize = chars.size
        var length = 0
        var counter = 1

        for (i in 1..charsSize - 1) {
            if (chars[i] != chars[i - 1]) {
                chars[length++] = chars[i - 1]
                if (counter > 1) {
                    val s = counter.toString()
                    for (i in 0..s.length - 1) {
                        chars[length++] = s[i]
                    }
                }
                counter = 0
            }
            counter++
        }

        if (counter > 0) {
            chars[length++] = chars[charsSize - 1]
            if (counter > 1) {
                val s = counter.toString()
                for (i in 0..s.length - 1) {
                    chars[length++] = s[i]
                }
            }
        }

        return length
    }

    fun test() {
        var test = 0
        var test2 = test++
        println("$test : $test2")
    }

}

fun main() {
    val input1 = charArrayOf('a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b')

    val input2 = charArrayOf('a', 'a', 'a', 'b', 'b', 'a', 'a')

    val input3 = charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')

    val solution = Solution()

    println("${solution.compress(input1)}")  // 4
    println("${solution.compress(input2)}") // 6
    println("${solution.compress(input3)}") // 6
    println("${solution.compress2(input3)}") // 6
    solution.test()
}