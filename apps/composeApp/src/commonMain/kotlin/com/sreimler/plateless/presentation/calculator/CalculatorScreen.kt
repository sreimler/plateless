@file:OptIn(ExperimentalMaterial3Api::class)

package com.sreimler.plateless.presentation.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.sreimler.plateless.domain.Container
import com.sreimler.plateless.presentation.UiText
import com.sreimler.plateless.presentation.component.PlatelessValueField
import com.sreimler.plateless.presentation.icons.AppIcons
import com.sreimler.plateless.presentation.theme.DarkRed
import com.sreimler.plateless.presentation.theme.LightGreen
import com.sreimler.plateless.presentation.theme.LightRed
import com.sreimler.plateless.presentation.theme.VeryLightGray
import com.sreimler.plateless.presentation.theme.VeryLightGreen
import org.jetbrains.compose.ui.tooling.preview.Preview
import kotlin.uuid.ExperimentalUuidApi

@Composable
fun CalculatorScreenRoot(
    viewModel: CalculatorViewModel,
    modifier: Modifier = Modifier
) {
    val state by viewModel.state.collectAsStateWithLifecycle()

    CalculatorScreen(
        state = state,
        onContainerSelected = viewModel::onSelectContainer,
        onSaveContainer = viewModel::onSaveContainer,
        onTareWeightChanged = viewModel::onTareWeightChanged,
        onGrossWeightChanged = viewModel::onGrossWeightChanged,
        onServingsChanged = viewModel::onServingsChanged,
        modifier = modifier,
        hasUnsavedChanges = viewModel.hasUnsavedChanges()
    )
}

@Composable
fun CalculatorScreen(
    state: CalculatorState,
    onContainerSelected: (Container) -> Unit,
    onSaveContainer: (String, Double) -> Unit,
    onTareWeightChanged: (Double) -> Unit,
    onGrossWeightChanged: (Double) -> Unit,
    onServingsChanged: (Double) -> Unit,
    modifier: Modifier = Modifier,
    hasUnsavedChanges: Boolean = false
) {
    Column(modifier = modifier) {
        // Container dropdown and save button
        ContainerDropdown(
            activeContainer = state.activeContainer,
            containers = state.savedContainerList,
            hasUnsavedChanges = hasUnsavedChanges,
            onContainerSelected = onContainerSelected,
            onSaveContainer = onSaveContainer
        )
        Spacer(Modifier.height(24.dp))

        // Tare Weight
        PlatelessValueField(
            label = "Tare Weight",
            value = state.activeContainer.tareWeight,
            onValueChange = onTareWeightChanged,
            leadingIcon = AppIcons.Scale,
            unit = "g"
        )
        Spacer(Modifier.height(16.dp))

        // Gross Weight
        PlatelessValueField(
            label = "Gross Weight",
            value = state.grossWeight,
            onValueChange = onGrossWeightChanged,
            leadingIcon = AppIcons.ForkSpoon,
            unit = "g"
        )
        Spacer(Modifier.height(16.dp))

        // Servings
        PlatelessValueField(
            label = "Servings",
            value = state.servings,
            onValueChange = onServingsChanged,
            leadingIcon = AppIcons.People
        )
        Spacer(Modifier.height(16.dp))

        // Error container
        if (state.errors.isNotEmpty()) {
            ErrorMessage(state.errors.last().asString())
        }
        Spacer(Modifier.height(24.dp))

        // Calculation Results
        Row {
            ResultBox("Net Weight", state.netWeight, "g", modifier = Modifier.weight(1f))
            Spacer(Modifier.width(16.dp))
            ResultBox("Weight / Serving", state.servingWeight, "g", modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun ErrorMessage(message: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth()
            .background(Color.White)
//            .border(width = 2.dp, color = LightRed, shape = RoundedCornerShape(8.dp))
            .background(color = LightRed, shape = RoundedCornerShape(8.dp))
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = AppIcons.Error,
            contentDescription = "Error",
            tint = DarkRed,
            modifier = Modifier.height(16.dp)
        )
        Spacer(Modifier.width(8.dp))
        Text(message, color = DarkRed, fontSize = 12.sp)
    }
}

@Composable
fun ContainerDropdown(
    activeContainer: Container,
    modifier: Modifier = Modifier,
    containers: List<Container> = listOf(),
    hasUnsavedChanges: Boolean = false,
    onContainerSelected: (Container) -> Unit,
    onSaveContainer: (String, Double) -> Unit
) {
    var menuExpanded by remember { mutableStateOf(false) }


        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier.weight(1f)) {
                // Container name and dropdown trigger
                Row(
                    modifier = Modifier.fillMaxWidth().clickable(enabled = containers.isNotEmpty()) {
                        menuExpanded = !menuExpanded
                    },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // TODO: enable later when icons have been implemented
//                    Icon(imageVector = AppIcons.RiceBowl, contentDescription = activeContainer.name)
//                    Spacer(Modifier.width(8.dp))
                    if (activeContainer.name.isEmpty()) {
                        Text(
                            text = "New Container",
                            modifier = Modifier.weight(1f),
                            color = VeryLightGray
                        )
                    } else {
                        Text(
                            text = activeContainer.name,
                            modifier = Modifier.weight(1f),
                            color = Color.Black
                        )
                    }

                    if (containers.isNotEmpty()) {
                        Icon(AppIcons.ArrowDropdown, contentDescription = "More options")
                    }
                }

                DropdownMenu(
                    expanded = menuExpanded,
                    onDismissRequest = { menuExpanded = false },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    containers.forEach { container ->
                        DropdownMenuItem(
                            text = { Text(container.name) },
                            leadingIcon = {
                                Icon(
                                    imageVector = AppIcons.RiceBowl,
                                    contentDescription = container.name
                                )
                            },
                            onClick = {
                                menuExpanded = false
                                onContainerSelected(container)
                            }
                        )
                    }
                }
            }

            Spacer(Modifier.width(16.dp))

            // Save button aligned to the end
            Button(
                // TODO: specify flows for saving new and updating existing containers
                // new containers should open a dialog to enter a name
                onClick = { onSaveContainer("", 0.0) }, enabled = hasUnsavedChanges,
                colors = ButtonColors(
                    containerColor = LightGreen,
                    contentColor = Color.Black,
                    disabledContainerColor = LightGreen,
                    disabledContentColor = VeryLightGray
                ),
                shape = RoundedCornerShape(8.dp),
                contentPadding = PaddingValues(horizontal = 8.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(imageVector = AppIcons.Save, contentDescription = "Save")
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Save", modifier)
                }
            }
        }

}

@Composable
fun ResultBox(title: String, value: Double, unit: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.background(VeryLightGreen, shape = RoundedCornerShape(16.dp)).padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(title, fontSize = 14.sp)
        Spacer(Modifier.height(8.dp))
        Text("${value.toInt()} $unit", fontSize = 22.sp, fontWeight = FontWeight.Bold)
    }
}

@ExperimentalUuidApi
@Composable
@Preview(showBackground = true)
fun CalculatorScreenPreview() {
    val state = CalculatorState(
        activeContainer = Container(),
        errors = listOf(UiText.DynamicString("Gross weight must be greater than tare weight."))
    )

    MaterialTheme {
        CalculatorScreen(
            state = state,
            onContainerSelected = {},
            onSaveContainer = { _,_ -> },
            onTareWeightChanged = {},
            onGrossWeightChanged = {},
            onServingsChanged = {},
        )
    }
}
