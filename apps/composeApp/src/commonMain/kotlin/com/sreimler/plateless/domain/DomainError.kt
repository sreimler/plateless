package com.sreimler.plateless.domain

/**
 * Sealed error class containing all custom errors of the domain layer.
 */
sealed class DomainError : Throwable() {
    object InvalidInputs : DomainError()
}
