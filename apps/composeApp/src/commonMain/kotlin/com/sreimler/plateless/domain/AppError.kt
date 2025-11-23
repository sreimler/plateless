package com.sreimler.plateless.domain

/**
 * Sealed error class containing all error types of the app.
 */
sealed class AppError {
    data object GrossWeightLessThanTare : AppError()
    data object NegativeWeight : AppError()
    data object ZeroOrNegativeServings : AppError()
}
