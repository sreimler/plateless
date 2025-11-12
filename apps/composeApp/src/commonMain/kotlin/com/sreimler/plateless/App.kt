package com.sreimler.plateless

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sreimler.plateless.presentation.calculator.CalculatorScreenRoot
import com.sreimler.plateless.presentation.calculator.CalculatorViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        // TODO: add scaffold and navigation
        // scaffold will also contain screen title and icon
        Column {
            CalculatorScreenRoot(
                viewModel = CalculatorViewModel(),
                modifier = Modifier.padding(horizontal = 16.dp).padding(top = 32.dp)
            )
        }
    }
}

