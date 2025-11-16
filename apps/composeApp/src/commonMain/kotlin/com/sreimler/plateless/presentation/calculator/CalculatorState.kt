package com.sreimler.plateless.presentation.calculator

import androidx.compose.runtime.Immutable
import com.sreimler.plateless.domain.Container
import com.sreimler.plateless.presentation.UiText
import plateless.composeapp.generated.resources.Res
import plateless.composeapp.generated.resources.unit_grams

/**
 * Represents the current state of the serving size calculator.
 * @property activeContainer The (optional) [Container] that is used for calculations.
 * @property savedContainerList The list of containers saved in the repository.
 * @property grossWeight The total weight of the container with food.
 * @property netWeight The total weight of food (without container).
 * @property servings The number of servings to break the net food weight down to.
 * @property servingWeight The calculated weight per serving.
 * @property unit The weight unit used throughout the app.
 * @property errors Errors to be displayed to the user, as a [List] of [UiText]s.
 */
@Immutable
data class CalculatorState(
    val activeContainer: Container,
    val savedContainerList: List<Container> = listOf(),
    val grossWeight: Double = 0.0,
    val netWeight: Double = 0.0,
    val servings: Double = 1.0,
    val servingWeight: Double = 0.0,
    val unit: UiText = UiText.ResourceString(Res.string.unit_grams),
    val errors: List<UiText> = listOf()
)
