package com.sreimler.plateless.domain

/**
 * Calculates and returns the net weight of food in a container.
 * @param tareWeight The weight of the empty container.
 * @param grossWeight The total weight of the container with food.
 * @return The net weight of the food in the container.
 */
fun calculateNetWeight(tareWeight: Double, grossWeight: Double): AppResult<Double> {
    return when {
        // Validate inputs
        grossWeight < 0 || tareWeight < 0 -> return AppResult.Failure(AppError.NegativeWeight)
        grossWeight < tareWeight -> return AppResult.Failure(AppError.GrossWeightLessThanTare)
        else -> AppResult.Success(grossWeight - tareWeight)
    }
}

/**
 * Calculates the weight of an individual serving of food.
 * @param netWeight The net weight of food to be divided into servings.
 * @param servings The number of servings.
 * @return The net weight per serving.
 */
fun calculateServingWeight(netWeight: Double, servings: Double): AppResult<Double> {
    return when {
        // Validate inputs
        servings <= 0.0 -> AppResult.Failure(AppError.ZeroOrNegativeServings)
        else -> AppResult.Success(netWeight / servings)
    }
}
