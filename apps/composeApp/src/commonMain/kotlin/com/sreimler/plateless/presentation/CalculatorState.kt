package com.sreimler.plateless.presentation

import androidx.compose.runtime.Immutable
import com.sreimler.plateless.domain.Container

/**
 * Represents the current state of the serving size calculator.
 * @property selectedContainer The (optional) [Container] that is used for calculations.
 * @property tareWeight The empty weight of the food container.
 * @property grossWeight The total weight of the container with food.
 * @property netWeight The total weight of food (without container).
 * @property servings The number of servings to break the net food weight down to.
 */
@Immutable
data class CalculatorState(
    val selectedContainer: Container? = null,
    val containerList: List<Container> = listOf(),
    val tareWeight: Double = 0.0,
    val grossWeight: Double = 0.0,
    val netWeight: Double = 0.0,
    val servings: Double = 0.0,
    val servingWeight: Double = 0.0,
    val errors: List<Throwable> = listOf()
)
