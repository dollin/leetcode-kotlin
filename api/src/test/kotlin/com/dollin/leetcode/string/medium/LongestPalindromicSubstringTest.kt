package com.dollin.leetcode.string.medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LongestPalindromicSubstringTest {

    @Test
    fun `default tests`() {
        val longestPalindromicSubstring = LongestPalindromicSubstring()
        assertEquals("bad", longestPalindromicSubstring.longestPalindrome("babad"))
        assertEquals("bb", longestPalindromicSubstring.longestPalindrome("cbbd"))
    }
}