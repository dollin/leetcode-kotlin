package com.dollin.leetcode.string.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LongestPalindromicSubstringTest {

    @Test
    fun `default tests`() {
        val longestPalindromicSubstring = LongestPalindromicSubstring()
//        assertEquals("bad", longestPalindromicSubstring.longestPalindrome("babad"))
//        assertEquals("bb", longestPalindromicSubstring.longestPalindrome("cbbd"))
        assertEquals("babad", longestPalindromicSubstring.longestPalindrome("babad"))
        assertEquals("babad", longestPalindromicSubstring.longestPalindrome("babad"))
    }
}
