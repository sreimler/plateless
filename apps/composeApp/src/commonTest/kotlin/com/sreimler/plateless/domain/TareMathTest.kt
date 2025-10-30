package com.sreimler.plateless.domain

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith


class TareMathTest {

    @Test
    fun calculateNetWeight_returnsCorrectNetWeight() {
        val tare = 200.0
        val gross = 450.0
        val result = calculateNetWeight(tare, gross)
        assertEquals(250.0, result)
    }

    @Test
    fun calculateNetWeight_returnsZeroWhenTareEqualsGross() {
        val tare = 100.0
        val gross = 100.0
        val result = calculateNetWeight(tare, gross)
        assertEquals(0.0, result)
    }

    @Test
    fun calculateNetWeight_rejectsTareLargerThanGross() {
        val tare = 400.0
        val gross = 200.0
        assertFailsWith(
            exceptionClass = DomainError.GrossWeightLessThanTare::class,
            block = { calculateNetWeight(tare, gross) }
        )
    }

    @Test
    fun calculateNetWeight_rejectsNegativeInputWeights() {
        val tare = -500.0
        val gross = -100.0
        assertFailsWith(
            exceptionClass = DomainError.NegativeWeight::class,
            block = { calculateNetWeight(tare, gross) }
        )
        assertFailsWith(
            exceptionClass = DomainError.NegativeWeight::class,
            block = { calculateNetWeight(tare, 0.0) }
        )
        assertFailsWith(
            exceptionClass = DomainError.NegativeWeight::class,
            block = { calculateNetWeight(0.0, gross) }
        )
    }

    @Test
    fun calculateServingWeight_returnsCorrectServingWeight() {
        val net = 500.0
        val servings = 5.0
        val result = calculateServingWeight(net, servings)
        assertEquals(100.0, result, absoluteTolerance = 0.01)
    }

    @Test
    fun calculateServingWeight_calculatesFractionsCorrectly() {
        val net = 100.0
        val servings = 3.0
        val result = calculateServingWeight(net, servings)
        assertEquals(33.33, result, absoluteTolerance = 0.01)
    }

    @Test
    fun calculateServingWeight_calculatesFractionalServingsCorrectly() {
        val net = 100.0
        val servings = 1.5
        val result = calculateServingWeight(net, servings)
        assertEquals(66.66, result, absoluteTolerance = 0.01)
    }

    @Test
    fun calculateServingWeight_throwsExceptionWhenServingsIsZeroOrNegative() {
        val net = 500.0
        val zeroServings = 0.0
        val negativeServings = -1.0
        assertFailsWith(
            exceptionClass = DomainError.ZeroOrNegativeServings::class,
            block = { calculateServingWeight(net, zeroServings) }
        )
        assertFailsWith(
            exceptionClass = DomainError.ZeroOrNegativeServings::class,
            block = { calculateServingWeight(net, negativeServings) }
        )
    }
}
