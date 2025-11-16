package com.sreimler.plateless.presentation

import androidx.compose.ui.graphics.vector.ImageVector
import com.sreimler.plateless.presentation.icons.AppIcons
import plateless.composeapp.generated.resources.Res
import plateless.composeapp.generated.resources.calculator
import plateless.composeapp.generated.resources.containers
import plateless.composeapp.generated.resources.settings

sealed class Screen(
    val route: String,
    val title: UiText,
    val icon: ImageVector
) {
    object Calculator : Screen("calculator", UiText.ResourceString(Res.string.calculator), AppIcons.Calculate)
    object Containers : Screen("containers", UiText.ResourceString(Res.string.containers), AppIcons.List)
    object Settings : Screen("settings", UiText.ResourceString(Res.string.settings), AppIcons.Settings)

    companion object {
        val navItems = listOf(Calculator, Containers, Settings)
    }
}
