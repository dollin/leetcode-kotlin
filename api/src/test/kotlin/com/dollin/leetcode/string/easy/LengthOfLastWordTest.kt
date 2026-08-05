package com.dollin.leetcode.string.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LengthOfLastWordTest {

    @Test
    fun `leetcode tests`() {
        val lengthOfLastWord = LengthOfLastWord()
        assertEquals(4, lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "))
        assertEquals(6, lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"))
        assertEquals(5, lengthOfLastWord.lengthOfLastWord("hello world"))
    }
}
