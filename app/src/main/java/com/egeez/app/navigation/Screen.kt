package com.egeez.app.navigation
sealed class Screen(val route: String) {
    object Welcome : Screen(route = "welcome_screen")
}