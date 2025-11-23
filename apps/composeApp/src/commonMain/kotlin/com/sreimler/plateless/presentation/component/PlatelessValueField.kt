package com.sreimler.plateless.presentation.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.sreimler.plateless.presentation.UiText
import com.sreimler.plateless.presentation.theme.VeryLightGray
import com.sreimler.plateless.presentation.theme.VeryLightGreen

@Composable
fun PlatelessValueField(
    label: String,
    leadingIcon: ImageVector,
    modifier: Modifier = Modifier,
    value: Double = 0.0,
    onValueChange: (Double) -> Unit,
    unit: UiText? = null
) {
    // TODO: migrate to state based BasicTextField for better IME control
    OutlinedTextField(
        value = if (value % 1.0 == 0.0) value.toInt().toString() else value.toString(),
        onValueChange = { newValue ->
            newValue.toDoubleOrNull()?.let { onValueChange(it) }
        },
        label = { Text(text = label) },
        leadingIcon = {
            Icon(
                imageVector = leadingIcon,
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        },
        suffix = { unit?.let { Text(unit.asString()) } },
        singleLine = true,
        modifier = modifier.fillMaxWidth(),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = VeryLightGreen,
            unfocusedBorderColor = VeryLightGray
        ),
        shape = RoundedCornerShape(8.dp)
    )
}
