package com.dollin.leetcode.string.medium

/**
 * https://leetcode.com/problems/multiply-strings/description/
 *
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
 *
 * Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
 *
 *
 *
 * Example 1:
 *
 * Input: num1 = "2", num2 = "3"
 * Output: "6"
 * Example 2:
 *
 * Input: num1 = "123", num2 = "456"
 * Output: "56088"
 *
 *
 * Constraints:
 *
 * 1 <= num1.length, num2.length <= 200
 * num1 and num2 consist of digits only.
 * Both num1 and num2 do not contain any leading zero, except the number 0 itself.
 *
 */
class MultipleStrings {
    fun multiply(num1: String, num2: String): String {
        if (num1 == "0" || num2 == "0") return "0"
        val workings = mutableMapOf<Int, Int>()
        for ((xInd, xVal) in num1.toCharArray().reversed().withIndex()) {
            for ((yInd, yVal) in num2.toCharArray().reversed().withIndex()) {
                var index = xInd + yInd
                var working = (workings[index] ?: 0) + (xVal.digitToInt() * yVal.digitToInt())
                if (working == 0) {
                    workings[index] = 0
                }
                while (working > 0) {
                    workings[index] = working % 10
                    working /= 10
                    index++
                    working += workings[index] ?: 0
                }
            }
        }
        return workings.values.reversed().joinToString("")
    }
}
