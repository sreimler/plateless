package com.sreimler.plateless.presentation

import com.sreimler.plateless.domain.AppError
import plateless.composeapp.generated.resources.Res
import plateless.composeapp.generated.resources.error_gross_less_than_tare
import plateless.composeapp.generated.resources.error_negative_weight
import plateless.composeapp.generated.resources.error_zero_or_negative_servings

/**
 * Utility function that converts an [AppError] to a [UiText] instance with a corresponding string resource attached.
 */
fun AppError.toUiText(): UiText = when (this) {
    AppError.GrossWeightLessThanTare -> UiText.ErrorResourceString(Res.string.error_gross_less_than_tare, this)
    AppError.NegativeWeight -> UiText.ErrorResourceString(Res.string.error_negative_weight, this)
    AppError.ZeroOrNegativeServings -> UiText.ErrorResourceString(Res.string.error_zero_or_negative_servings, this)
}
