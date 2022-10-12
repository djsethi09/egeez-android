package com.egeez.app.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.egeez.app.navigation.Screen
import com.egeez.app.navigation.SetupNavGraph
import com.egeez.app.presentation.theme.AppTheme
import com.egeez.app.presentation.ui.splash.SplashViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject lateinit var splashViewModel: SplashViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()//.setKeepOnScreenCondition(
            //!splashViewModel.isLoading.value
//        )
//        setContentView(R.layout.activity_main)
        setContent {
            AppTheme{
                val navController = rememberNavController()
                SetupNavGraph(navController = navController, startDestination = Screen.Welcome.route)
            }
        }
    }
}