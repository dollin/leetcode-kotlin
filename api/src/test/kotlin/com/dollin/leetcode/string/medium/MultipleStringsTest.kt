package com.dollin.leetcode.string.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MultipleStringsTest {

    @Test
    fun `leetcode tests`() {
        val multipleStrings = MultipleStrings()
        assertEquals("56088", multipleStrings.multiply("123", "456"))
        assertEquals("3006", multipleStrings.multiply("6", "501"))
        assertEquals("738", multipleStrings.multiply("123", "6"))
        assertEquals("10", multipleStrings.multiply("2", "5"))
        assertEquals("0", multipleStrings.multiply("2", "0"))
    }
}
