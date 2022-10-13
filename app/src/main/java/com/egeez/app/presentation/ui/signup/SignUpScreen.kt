package com.egeez.app.presentation.ui.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.egeez.app.presentation.ui.signup.SignUpViewModel

@Composable
fun SignUpScreen(viewModel: SignUpViewModel){
    Box(modifier = Modifier
        .fillMaxHeight(0.95f)
        .padding(top = 20.dp)) {
        Text("SignUp Screen")
        Button(onClick = { viewModel.step = 2 }) {

        }
    }
}