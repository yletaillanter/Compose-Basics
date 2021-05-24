package com.ylt.composeplayground

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val purple200 = Color(0xFFB188DA)
val purple500 = Color(0xFFA23DCD)
val purple700 = Color(0xFF5C0488)
val teal200 = Color(0xFF099AA1)


val DarkColors = darkColors (
    primary = purple200,
    primaryVariant = purple700,
    secondary = teal200
)

val LightColors = lightColors (
    primary = purple500,
    primaryVariant = purple700,
    secondary = teal200
)