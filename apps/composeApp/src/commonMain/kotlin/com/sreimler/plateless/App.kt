package com.sreimler.plateless

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sreimler.plateless.presentation.Screen
import com.sreimler.plateless.presentation.calculator.CalculatorScreenRoot
import com.sreimler.plateless.presentation.icons.AppIcons
import com.sreimler.plateless.presentation.theme.AppGreen
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import plateless.composeapp.generated.resources.Res
import plateless.composeapp.generated.resources.app_icon_description
import plateless.composeapp.generated.resources.app_name
import plateless.composeapp.generated.resources.calculator

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        Scaffold(
            contentWindowInsets = WindowInsets.systemBars,
            topBar = {
                CenterAlignedTopAppBar(
                    title = {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                imageVector = AppIcons.Burger,
                                contentDescription = stringResource(
                                    Res.string.app_icon_description,
                                    Res.string.app_name
                                ),
                                colorFilter = ColorFilter.tint(AppGreen),
                                modifier = Modifier.size(32.dp)
                            )
                            Spacer(Modifier.width(8.dp))
                            Text(
                                text = stringResource(Res.string.app_name).uppercase(),
                                fontSize = 26.sp,
                                fontWeight = FontWeight.Bold,
                                color = AppGreen
                            )
                        }
                    }
                )
            },
            bottomBar = {
                NavigationBar {
                    Screen.navItems.forEach { screen ->
                        NavigationBarItem(
                            selected = screen.title.asString() == stringResource(Res.string.calculator),
                            label = { Text(screen.title.asString()) },
                            icon = { Icon(imageVector = screen.icon, contentDescription = screen.title.asString()) },
                            onClick = { }
                        )
                    }
                }
            }
        ) { innerPadding ->
            CalculatorScreenRoot(
                modifier = Modifier.padding(innerPadding).padding(top = 32.dp).padding(horizontal = 16.dp)
            )
        }
    }
}

