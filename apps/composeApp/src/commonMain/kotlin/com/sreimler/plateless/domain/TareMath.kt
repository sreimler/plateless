package com.sreimler.plateless.domain

/**
 * Calculates and returns the net weight of food in a container.
 * @param tareWeight The weight of the empty container.
 * @param grossWeight The total weight of the container with food.
 * @return The net weight of the food in the container.
 */
fun calculateNetWeight(tareWeight: Double, grossWeight: Double): Double {
    // Check for invalid inputs
    if (grossWeight < tareWeight || grossWeight < 0 || tareWeight < 0) throw DomainError.InvalidInputs

    return grossWeight - tareWeight
}

/**
 * Calculates the weight of an individual serving of food.
 * @param netWeight The net weight of food to be divided into servings.
 * @param servings The number of servings.
 * @return The net weight per serving.
 */
fun calculateServingWeight(netWeight: Double, servings: Double): Double {
    // Check for invalid inputs
    if (servings <= 0) throw DomainError.InvalidInputs

    return netWeight / servings
}
