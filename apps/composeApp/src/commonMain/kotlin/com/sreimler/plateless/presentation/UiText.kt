package com.sreimler.plateless.presentation

import androidx.compose.runtime.Composable
import com.sreimler.plateless.domain.AppError
import org.jetbrains.compose.resources.StringResource
import org.jetbrains.compose.resources.stringResource

sealed class UiText {

    data class DynamicString(val value: String) : UiText()
    data class ResourceString(val resource: StringResource) : UiText()
    data class ErrorResourceString(val resource: StringResource, val error: AppError? = null) : UiText()

    @Composable
    fun asString(): String = when (this) {
        is DynamicString -> value
        is ResourceString -> stringResource(resource)
        is ErrorResourceString -> stringResource(resource)
    }
}
