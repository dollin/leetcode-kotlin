package com.dollin.leetcode.arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class TwoSumTest {

    @Test
    fun `twosum test with many elements`() {
        val twoSum = TwoSum()
        assertArrayEquals(intArrayOf(1, 5), twoSum.twoSum(intArrayOf(1, 2, 9, 4, 5, 6), 8))
    }

    @Test
    fun `twosum with array with 2 elements`() {
        val solution = TwoSum()
        assertArrayEquals(intArrayOf(0, 1), solution.twoSum(intArrayOf(2, 3), 5))
    }

//    @ParameterizedTest
//    @MethodSource("paramArgs")
//    fun `test two sum returns correct indices`(
//        expectedIndices: IntArray,
//        intArray: IntArray,
//        targetSum: Int,
//    ) {
//        val twoSum = TwoSum()
//        assertArrayEquals(expectedIndices, twoSum.twoSum(intArray, targetSum))
//    }
//
//    companion object {
//        @JvmStatic
//        fun paramArgs(): Stream<Arguments> {
////            TODO("Not yet implemented")
//        }
//    }
}
