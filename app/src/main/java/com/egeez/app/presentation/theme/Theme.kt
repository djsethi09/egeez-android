package com.egeez.app.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightThemeColors = lightColors(
    primary = PrimaryBlue,
    primaryVariant = PrimaryBlueVariantLight,
    onPrimary = White,
    secondary = SecondaryGrey,
    secondaryVariant = SecondaryGreyVariantDark,
    onSecondary = White,
    error = RedErrorDark,
    onError = RedErrorLight,
    background = Grey1,
    onBackground = Color.Black,
    surface = Color.White,
    onSurface = Black2,
)

private val DarkThemeColors = darkColors(
    primary = PrimaryBlue,
    primaryVariant = PrimaryBlueVariantLight,
    onPrimary = White,
    secondary = SecondaryGrey,
    secondaryVariant = SecondaryGreyVariantDark,
    onSecondary = White,
    error = RedErrorDark,
    onError = RedErrorLight,
    background = Grey1,
    onBackground = Color.Black,
    surface = Color.White,
    onSurface = Black2,
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    MaterialTheme(
        colors = if (darkTheme) DarkThemeColors else LightThemeColors,
        typography = AeonikTypography,
        shapes = AppShapes,
        content=content
    )
}





























