package com.egeez.app.presentation.ui.login

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(){
    Box(modifier = Modifier
        .fillMaxHeight(0.95f)
        .padding(top = 20.dp)) {
        Text("Login Screen")
        Button(onClick = {  }) {
            
        }
    }
}