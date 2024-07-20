// ui/theme/Theme.kt
package com.example.myapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mymodeapp.ThemeName
import com.example.mymodeapp.ThemeViewModel
import md_theme_dark_onPrimary
import md_theme_dark_primary
import md_theme_dark_primaryContainer
import md_theme_light_onPrimary
import md_theme_light_primary
import md_theme_light_primaryContainer

// [START android_compose_material3_theme_color_setup]
private val LightColorScheme = lightColorScheme(
    primary = md_theme_light_primary,
    onPrimary = md_theme_light_onPrimary,
    primaryContainer = md_theme_light_primaryContainer,
    // ..
)
private val DarkColorScheme = darkColorScheme(
    primary = md_theme_dark_primary,
    onPrimary = md_theme_dark_onPrimary,
    primaryContainer = md_theme_dark_primaryContainer,
    // ..
)

@Composable
fun MyAppTheme(
    themeViewModel: ThemeViewModel = viewModel(),
    content: @Composable() () -> Unit
) {
    val theme by themeViewModel.theme.collectAsState()

    MaterialTheme(
        colorScheme = if (theme == ThemeName.DARK) {
            DarkColorScheme
        } else {
            LightColorScheme
        }
    ) {
        content()
    }
}
