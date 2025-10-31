package com.sreimler.plateless.presentation

import com.sreimler.plateless.domain.AppError
import plateless.composeapp.generated.resources.*

/**
 * Utility function that converts an [AppError] to a [UiText] instance with a corresponding string resource attached.
 */
fun AppError.toUiText(): UiText = when (this) {
    AppError.GrossWeightLessThanTare -> UiText.ResourceString(Res.string.error_gross_less_than_tare, this)
    AppError.NegativeWeight -> UiText.ResourceString(Res.string.error_negative_weight, this)
    AppError.ZeroOrNegativeServings -> UiText.ResourceString(Res.string.error_zero_or_negative_servings, this)
}
