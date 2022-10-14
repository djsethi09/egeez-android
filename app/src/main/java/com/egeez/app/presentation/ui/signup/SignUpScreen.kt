package com.egeez.app.presentation.ui.signup

import android.widget.Space
import androidx.activity.viewModels
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.egeez.app.navigation.Screen
import com.egeez.app.presentation.ui.signup.SignUpFormViewModel

@Composable
fun SignUpScreen(viewModel: SignUpFormViewModel,navController:NavController){

    Box(modifier = Modifier
        .fillMaxHeight(0.95f)
        .padding(top = 20.dp)) {
        Text("SignUp Screen")
        Column() {
            Button(onClick = { viewModel.onNextClicked() }) {
                Text(text = "Next")
            }
            Spacer(modifier = Modifier.height(30.dp))
            Button(onClick = { navController.navigate(Screen.Home.route) }) {
                Text(text = "Home")
            }
        }

    }
}