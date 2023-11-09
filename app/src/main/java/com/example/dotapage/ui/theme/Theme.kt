package com.example.dotapage.ui.theme

import android.app.Activity
import android.graphics.Color.argb
import android.graphics.Color.parseColor
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80,
    background = Color.Red,
    onBackground = Color.Red
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40,
    background = Color.Red,
    onBackground = Color.Red

    /* Other default colors to override

    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun DotaPageTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

object AppTheme {
    object BgColors {
        val primary: Color = Color(parseColor("#050B18"))
        val secondary: Color = Color(parseColor("#000000"))
        var tertiary: Color = Color(parseColor("#1A1F29"))
        var genreTag: Color = Color(argb(61, 68, 169, 244))
    }
    object ButtonColors {
        val primary: Color = Color(parseColor("#F4D144"))
        val secondary: Color = Color(parseColor("#3861A1"))
    }
    object TextColors {
        val primary: Color = Color(argb(179, 238, 242, 251))
        val secondary: Color = Color(argb(102, 255, 255, 255))
        val title: Color = Color(parseColor("#FFFFFF"))
        val button: Color = Color(parseColor("#050B18"))
        var genreTag: Color = Color(parseColor("#44A9F4"))
    }
}