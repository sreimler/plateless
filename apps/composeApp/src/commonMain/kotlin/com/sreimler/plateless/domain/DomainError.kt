package com.sreimler.plateless.domain

/**
 * Sealed error class containing all custom errors of the domain layer.
 */
sealed class DomainError : Throwable() {
    object GrossWeightLessThanTare : DomainError()
    object NegativeWeight : DomainError()
    object ZeroOrNegativeServings : DomainError()
}
