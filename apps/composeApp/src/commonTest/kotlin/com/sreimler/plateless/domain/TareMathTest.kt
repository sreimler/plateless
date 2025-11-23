package com.sreimler.plateless.domain

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue


class TareMathTest {

    @Test
    fun calculateNetWeight_returnsCorrectNetWeight() {
        val tare = 200.0
        val gross = 450.0

        when (val result = calculateNetWeight(tare, gross)) {
            is AppResult.Failure -> error("Expected Success but got Failure: ${result.error}")
            is AppResult.Success -> assertEquals(250.0, result.value)
        }
    }

    @Test
    fun calculateNetWeight_returnsZeroWhenTareEqualsGross() {
        val tare = 100.0
        val gross = 100.0

        when (val result = calculateNetWeight(tare, gross)) {
            is AppResult.Failure -> error("Expected Success but got Failure: ${result.error}")
            is AppResult.Success -> assertEquals(0.0, result.value)
        }
    }

    @Test
    fun calculateNetWeight_rejectsTareLargerThanGross() {
        val tare = 400.0
        val gross = 200.0

        when (val result = calculateNetWeight(tare, gross)) {
            is AppResult.Failure -> assertTrue { result.error is AppError.GrossWeightLessThanTare }
            is AppResult.Success -> error("Expected Failure but got Success")
        }
    }

    @Test
    fun calculateNetWeight_rejectsNegativeInputWeights() {
        val tare = -500.0
        val gross = -100.0

        when (val result = calculateNetWeight(tare, gross)) {
            is AppResult.Failure -> assertTrue { result.error is AppError.NegativeWeight }
            is AppResult.Success -> error("Expected Failure but got Success")
        }

        when (val result = calculateNetWeight(tare, 0.0)) {
            is AppResult.Failure -> assertTrue { result.error is AppError.NegativeWeight }
            is AppResult.Success -> error("Expected Failure but got Success")
        }

        when (val result = calculateNetWeight(0.0, gross)) {
            is AppResult.Failure -> assertTrue { result.error is AppError.NegativeWeight }
            is AppResult.Success -> error("Expected Failure but got Success")
        }
    }

    @Test
    fun calculateServingWeight_returnsCorrectServingWeight() {
        val net = 500.0
        val servings = 5.0

        when (val result = calculateServingWeight(net, servings)) {
            is AppResult.Failure -> error("Expected Success but got Failure: ${result.error}")
            is AppResult.Success -> assertEquals(100.0, result.value, absoluteTolerance = 0.01)
        }
    }

    @Test
    fun calculateServingWeight_calculatesFractionsCorrectly() {
        val net = 100.0
        val servings = 3.0

        when (val result = calculateServingWeight(net, servings)) {
            is AppResult.Failure -> error("Expected Success but got Failure: ${result.error}")
            is AppResult.Success -> assertEquals(33.33, result.value, absoluteTolerance = 0.01)
        }
    }

    @Test
    fun calculateServingWeight_calculatesFractionalServingsCorrectly() {
        val net = 100.0
        val servings = 1.5

        when (val result = calculateServingWeight(net, servings)) {
            is AppResult.Failure -> error("Expected Success but got Failure: ${result.error}")
            is AppResult.Success -> assertEquals(66.66, result.value, absoluteTolerance = 0.01)
        }
    }

    @Test
    fun calculateServingWeight_throwsExceptionWhenServingsIsZeroOrNegative() {
        val net = 500.0
        val zeroServings = 0.0
        val negativeServings = -1.0

        when (val result = calculateServingWeight(net, zeroServings)) {
            is AppResult.Failure -> assertTrue { result.error is AppError.ZeroOrNegativeServings }
            is AppResult.Success -> error("Expected Failure but got Success")
        }

        when (val result = calculateServingWeight(net, negativeServings)) {
            is AppResult.Failure -> assertTrue { result.error is AppError.ZeroOrNegativeServings }
            is AppResult.Success -> error("Expected Failure but got Success")
        }
    }
}
