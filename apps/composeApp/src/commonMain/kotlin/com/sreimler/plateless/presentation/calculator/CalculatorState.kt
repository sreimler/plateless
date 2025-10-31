package com.sreimler.plateless.presentation.calculator

import androidx.compose.runtime.Immutable
import com.sreimler.plateless.domain.Container
import com.sreimler.plateless.presentation.UiText
import kotlin.uuid.ExperimentalUuidApi

/**
 * Represents the current state of the serving size calculator.
 * @property activeContainer The (optional) [Container] that is used for calculations.
 * @property grossWeight The total weight of the container with food.
 * @property netWeight The total weight of food (without container).
 * @property servings The number of servings to break the net food weight down to.
 */
@Immutable
data class CalculatorState(
    val activeContainer: Container,
    val savedContainerList: List<Container> = listOf(),
    val grossWeight: Double = 0.0,
    val netWeight: Double = 0.0,
    val servings: Double = 1.0,
    val servingWeight: Double = 0.0,
    val errors: List<UiText> = listOf()
)
