package com.sreimler.plateless.presentation.calculator

import com.sreimler.plateless.domain.Container
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull
import kotlin.uuid.ExperimentalUuidApi

@OptIn(ExperimentalUuidApi::class)
class CalculatorViewModelTest {

    private val viewModel = CalculatorViewModel()

    @Test
    fun onTareWeightChanged_updatesTareWeightInState() {
        val tareA = 100.0
        val tareB = 200.0

        // Verify initial weight is 0.0
        assertEquals(0.0, viewModel.state.value.activeContainer.tareWeight)

        // Change tare weight
        viewModel.onTareWeightChanged(tareA)
        assertEquals(tareA, viewModel.state.value.activeContainer.tareWeight)

        // Change tare weight again to verify successful consecutive update
        viewModel.onTareWeightChanged(tareB)
        assertEquals(tareB, viewModel.state.value.activeContainer.tareWeight)
    }

    @Test
    fun onGrossWeightChanged_updatesGrossWeightInState() {
        val grossA = 100.0
        val grossB = 200.0

        // Verify initial weight is 0.0
        assertEquals(0.0, viewModel.state.value.grossWeight)

        // Change gross weight
        viewModel.onGrossWeightChanged(grossA)
        assertEquals(grossA, viewModel.state.value.grossWeight)

        // Change gross weight again to verify successful consecutive update
        viewModel.onGrossWeightChanged(grossB)
        assertEquals(grossB, viewModel.state.value.grossWeight)
    }

    @Test
    fun onServingsChanged_updatesServingsInState() {
        val servingsA = 2.0
        val servingsB = 1.5

        // Verify initial servings are 1.0
        assertEquals(1.0, viewModel.state.value.servings)

        // Change servings
        viewModel.onServingsChanged(servingsA)
        assertEquals(servingsA, viewModel.state.value.servings)

        // Change servings again to verify successful consecutive update
        viewModel.onServingsChanged(servingsB)
        assertEquals(servingsB, viewModel.state.value.servings)
    }

    @Test
    fun onChangeInputs_willNotCalculateUntilGrossWeightIsEntered() {
        val tare = 100.0
        val gross = 200.0
        val servings = 2.0

        // Triggering a calculation with gross weight 0 and tare > 0 would throw an error - verify that doesn't happen
        viewModel.onTareWeightChanged(tare)
        assertEquals(0, viewModel.state.value.errors.size)
        assertEquals(0.0, viewModel.state.value.netWeight)

        // Verify the same for a subsequent servings number change
        viewModel.onServingsChanged(servings)
        assertEquals(0, viewModel.state.value.errors.size)
        assertEquals(0.0, viewModel.state.value.netWeight)

        // Verify calculation _will_ take place once gross weight is added
        viewModel.onGrossWeightChanged(gross)
        assertEquals(0, viewModel.state.value.errors.size)
        assertEquals(100.0, viewModel.state.value.netWeight)
    }

    @Test
    fun onChangeName_willChangeNameOfActiveContainer() {
        val newName = "Test Container"

        // Verify auto-generated dummy container
        assertEquals("", viewModel.state.value.activeContainer.name)

        viewModel.onContainerNameChanged(newName)
        assertEquals(newName, viewModel.state.value.activeContainer.name)
    }

    @Test
    fun onErrorDismissed_removesErrorFromState() {
        // Verify no errors initially
        assertEquals(0, viewModel.state.value.errors.size)

        // Add one error and verify in the state
        val grossWeight = -100.0
        viewModel.onGrossWeightChanged(grossWeight)
        assertEquals(1, viewModel.state.value.errors.size)

        // Dismiss the error
        val error = viewModel.state.value.errors.first()
        viewModel.onErrorDismissed(error)
        assertEquals(0, viewModel.state.value.errors.size)
    }

    @Test
    fun onContainerSelect_updatesActiveContainerInState() {
        val containerA = Container(name = "Container A")
        val containerB = Container(name = "Container B")

        // Verify auto-generated dummy container selected initially
        val currentState = viewModel.state.value
        assertEquals(0, currentState.savedContainerList.size)
        assertEquals("", currentState.activeContainer.name)
        assertEquals(0.0, currentState.activeContainer.tareWeight)

        // Select container
        viewModel.selectContainer(containerA)
        assertEquals(containerA, viewModel.state.value.activeContainer)

        // Select a different container to verify successful consecutive update
        viewModel.selectContainer(containerB)
        assertEquals(containerB, viewModel.state.value.activeContainer)
    }

    @Test
    fun onDeleteContainer_whenNoSavedContainers_willCreateNewActiveContainer() {
        // Verify auto-generated dummy container selected initially
        val currentState = viewModel.state.value
        assertEquals(0, currentState.savedContainerList.size)
        assertEquals("", currentState.activeContainer.name)

        // Store id of this dummy container
        val id = currentState.activeContainer.id

        // Delete and verify that new container gets created
        viewModel.onDeleteContainer()
        val newContainer = viewModel.state.value.activeContainer
        assertNotNull(newContainer.id)
        assertNotEquals(id, newContainer.id)
    }

    @Test
    fun onCreateContainer_willCreateNewActiveContainer() {
        // Verify auto-generated dummy container selected initially
        val currentState = viewModel.state.value
        assertEquals("", currentState.activeContainer.name)

        // Store id of this dummy container
        val id = currentState.activeContainer.id

        // Verify no saved containers
        assertEquals(0, currentState.savedContainerList.size)

        viewModel.onCreateContainer()

        // Verify still no saved containers
        assertEquals(0, viewModel.state.value.savedContainerList.size)

        // Verify that new container gets created
        val newContainer = viewModel.state.value.activeContainer
        assertNotNull(newContainer.id)
        assertNotEquals(id, newContainer.id)
    }

    @Test
    fun hasUnsavedChanges_willReflectUnsavedChangesInActiveContainer() {
        // TODO: implement with mock repo and/or mock state
    }

    @Test
    fun onSaveContainer_willStoreActiveContainerInStateList() {
        // TODO: implement with mock repo and/or mock state
    }
}
