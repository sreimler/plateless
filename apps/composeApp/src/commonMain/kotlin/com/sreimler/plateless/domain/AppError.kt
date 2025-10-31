package com.sreimler.plateless.domain

/**
 * Sealed error class containing all error types of the app.
 */
sealed class AppError : Throwable() {
    object GrossWeightLessThanTare : AppError()
    object NegativeWeight : AppError()
    object ZeroOrNegativeServings : AppError()
}
