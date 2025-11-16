package com.sreimler.plateless.domain

import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

/**
 * A data class representing the food containers used in the app.
 *
 * @property id The unique identifier for the container.
 * @property name The name of the container.
 * @property type The [ContainerType] of the container, defaulting to [ContainerType.PLATE].
 * @property tareWeight The tare weight (empty weight) of the container.
 * @property isPrimary Boolean indicating if this is the primary container used in the app.
 * @property imageUri The uri pointing to an image of the container.
 */
@OptIn(ExperimentalUuidApi::class)
data class Container(
    val id: Uuid = Uuid.random(),
    val name: String = "",
    val type: ContainerType = ContainerType.PLATE,
    val tareWeight: Double = 0.0,
    val isPrimary: Boolean = false,
    val imageUri: String? = null
)

enum class ContainerType {
    PLATE,
    DEEP_PLATE,
    SMALL_BOWL,
    MIXING_BOWL,
    MUG,
    JAR,
    FOOD_STORAGE_CONTAINER
}
