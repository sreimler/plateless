package com.sreimler.plateless.presentation.calculator

import androidx.lifecycle.ViewModel
import com.sreimler.plateless.domain.AppError
import com.sreimler.plateless.domain.Container
import com.sreimler.plateless.domain.calculateNetWeight
import com.sreimler.plateless.domain.calculateServingWeight
import com.sreimler.plateless.presentation.UiText
import com.sreimler.plateless.presentation.toUiText
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlin.uuid.ExperimentalUuidApi

/**
 * ViewModel for the main calculator of plateless.
 */
@OptIn(ExperimentalUuidApi::class)
class CalculatorViewModel : ViewModel() {

    // StateFlow holding the current screen state
    private val _state: MutableStateFlow<CalculatorState> = MutableStateFlow(createInitialState())
    val state: StateFlow<CalculatorState> = _state

    private fun createInitialState(): CalculatorState {
        // TODO: load containers from repo
        val savedContainers = listOf<Container>()
        val activeContainer = savedContainers.find { it.isPrimary } ?: Container()
        return CalculatorState(activeContainer = activeContainer, savedContainerList = savedContainers)
    }

    /**
     * Updates the tare weight of the active container in the [state] and triggers a calculation update.
     * This will not persist the values of the active container in the repository.
     * @param tareWeight The updated tare weight of the active container.
     */
    fun onTareWeightChanged(tareWeight: Double) {
        _state.update {
            it.copy(
                activeContainer = it.activeContainer.copy(tareWeight = tareWeight)
            )
        }
        updateCalculation()
    }

    /**
     * Updates the name of the active container in the [state].
     * This will not persist the values of the active container in the repository.
     * @param name The updated name of the active container.
     */
    fun onContainerNameChanged(name: String) {
        _state.update {
            it.copy(
                activeContainer = it.activeContainer.copy(name = name)
            )
        }
    }

    /**
     * Updates the [CalculatorState.grossWeight] in the [state] and triggers a calculation update.
     * @param grossWeight The updated gross weight.
     */
    fun onGrossWeightChanged(grossWeight: Double) {
        _state.update { it.copy(grossWeight = grossWeight) }
        updateCalculation()
    }

    /**
     * Updates the [CalculatorState.servings] in the [state] and triggers a calculation update.
     * @param servings The updated servings count.
     */
    fun onServingsChanged(servings: Double) {
        _state.update { it.copy(servings = servings) }
        updateCalculation()
    }

    /**
     * Dismisses the error [error], removing it from the [state].
     * @param error The error to be dismissed.
     */
    fun onErrorDismissed(error: UiText) {
        _state.update { it.copy(errors = it.errors - error) }
    }

    /**
     * Sets the selected [Container] as active in the [state] and triggers a calculation update.
     * @param container The container to be selected.
     */
    fun onSelectContainer(container: Container) {
        // Load details of stored container
        _state.update { it.copy(activeContainer = container) }
        updateCalculation()
    }

    /**
     * Creates or updates the currently active container in the repository.
     */
    fun onSaveContainer(name: String, tareWeight: Double) {
        // TODO: define user experience for saving a new container
        // TODO: save in repository
    }

    /**
     * Deletes the currently active container from the repository.
     */
    fun onDeleteContainer() {
        val toDelete = state.value.activeContainer
        // TODO: delete active container in repository
        // This should also trigger an update of state.savedContainers from the repo

        // Set the new active container - either the primary from the repo or create a new one
        _state.update {
            it.copy(
                activeContainer = _state.value.savedContainerList
                    .find { container -> container.isPrimary } ?: Container()
            )
        }
    }

    /**
     * Creates a new active container, discarding any unsaved changes in the currently active container.
     */
    fun onCreateContainer() {
        // TODO: verify unsaved changes - possibly in view only (e.g. with dialog)
        _state.update {
            it.copy(
                activeContainer = Container()
            )
        }
    }

    /**
     * Sets the currently active container as the primary container.
     * This function will persist these changes in the repository.
     */
    fun onSetActiveContainerAsPrimaryContainer() {
        // TODO: set active container as primary container in repo
        _state.update {
            it.copy(
                activeContainer = it.activeContainer.copy(isPrimary = true)
            )
        }
    }

    /**
     * Indicates if the current state of the active container is persisted in the repository.
     * @return `true` if unsaved changes, `false` otherwise.
     */
    fun hasUnsavedChanges(): Boolean {
        val currentState = state.value
        val currentVersion = currentState.activeContainer
        val savedVersion = currentState.savedContainerList.find { it.id == currentState.activeContainer.id }
        return savedVersion?.let { it != currentVersion } ?: (currentVersion.tareWeight != 0.0)
    }

    /**
     * Updates the calculation of net weight and weight per serving, given the current values in [state].
     */
    private fun updateCalculation() {
        // Check for required gross weight before calculating
        if (state.value.grossWeight == 0.0) return

        try {
            val currentState = state.value
            val netWeight = calculateNetWeight(currentState.activeContainer.tareWeight, currentState.grossWeight)
            val servingWeight = calculateServingWeight(netWeight, currentState.servings)

            _state.update {
                it.copy(
                    netWeight = netWeight,
                    servingWeight = servingWeight,
                    errors = emptyList()
                )
            }
        } catch (e: AppError) {
            _state.update {
                // Append new error to list of existing error UiTexts, if any
                it.copy(errors = it.errors + e.toUiText())
            }
        }
    }
}
