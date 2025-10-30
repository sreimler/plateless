package com.sreimler.plateless.presentation

import androidx.lifecycle.ViewModel
import com.sreimler.plateless.domain.Container
import com.sreimler.plateless.domain.DomainError
import com.sreimler.plateless.domain.calculateNetWeight
import com.sreimler.plateless.domain.calculateServingWeight
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class CalculatorViewModel : ViewModel() {

    private val _state = MutableStateFlow(CalculatorState())
    val state: StateFlow<CalculatorState> = _state

    private val _errors = MutableSharedFlow<Throwable>()
    val errors: SharedFlow<Throwable> = _errors

    fun onTareWeightChanged(tareWeight: Double) {
        _state.update { it.copy(tareWeight = tareWeight) }
        updateCalculation()
    }

    fun onGrossWeightChanged(grossWeight: Double) {
        _state.update { it.copy(grossWeight = grossWeight) }
        updateCalculation()
    }

    fun onServingsChanged(servings: Double) {
        _state.update { it.copy(servings = servings) }
        updateCalculation()
    }

    private fun updateCalculation() {
        try {
            val currentState = _state.value
            val netWeight = calculateNetWeight(currentState.tareWeight, currentState.grossWeight)
            val servingWeight = calculateServingWeight(netWeight, currentState.servings)

            _state.update {
                it.copy(
                    netWeight = netWeight,
                    servingWeight = servingWeight,
                    errors = emptyList()
                )
            }
        } catch (e: DomainError) {
            _state.update { it.copy(
                netWeight = 0.0,
                servingWeight = 0.0,
                errors = listOf(e)
            ) }
        }
    }

    fun onContainerSelected(container: Container) {
        // Load details of stored container
        _state.update { it.copy(selectedContainer = container) }
        updateCalculation()
    }

    fun onSaveContainer(container: Container) {
        // TODO: define ux for saving a new container
    }
}
