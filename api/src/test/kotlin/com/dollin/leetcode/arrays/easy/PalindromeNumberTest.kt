package com.dollin.leetcode.arrays.easy

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class PalindromeNumberTest {

    @Test
    fun `leetcode tests`() {
        val palindromeNumber = PalindromeNumber()
        assertTrue(palindromeNumber.isPalindrome(121))
        assertFalse(palindromeNumber.isPalindrome(-121))
        assertFalse(palindromeNumber.isPalindrome(10))
        assertFalse(palindromeNumber.isPalindrome(10511))
        assertFalse(palindromeNumber.isPalindrome(1011))
        assertTrue(palindromeNumber.isPalindrome(10344301))
        assertTrue(palindromeNumber.isPalindrome(9934399))
    }
}