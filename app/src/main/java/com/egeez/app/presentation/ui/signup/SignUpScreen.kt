package com.egeez.app.presentation.ui.signup

import android.widget.Space
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowLeft
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavController
import com.egeez.app.navigation.Screen
import com.egeez.app.presentation.theme.*
import com.egeez.app.presentation.ui.signup.SignUpFormViewModel

@Composable
fun SignUpScreen(viewModel: SignUpFormViewModel,navController:NavController){

    Box(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(0.95f)
        .background(Color.White)
        .verticalScroll(rememberScrollState())
        .padding(top = 20.dp)) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    Icons.Filled.KeyboardArrowLeft,
                    "back", modifier = Modifier.padding(start = 15.dp)
                )
                Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceBetween) {
                    Text(
                        "Create Account",
                        style = AeonikTypography.h5,
                        fontWeight = FontWeight.Bold
                    )
                    Text("Create username & password",
                        style = AeonikTypography.h6,)
                }
                Icon(
                    Icons.Filled.Close,
                    "close", modifier = Modifier.padding(end = 15.dp)
                )
            }
            Divider(color = GreyBorder, modifier = Modifier.padding(top = 20.dp))
            Spacer(modifier = Modifier.padding(top = 20.dp))
            Column() {

                Text("Name", modifier = Modifier.padding(bottom = 2.dp), fontWeight = FontWeight.SemiBold)
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(fraction = 0.8f),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Grey1,
                        unfocusedBorderColor = GreyBorder
                    ),
                    shape = RoundedCornerShape(12.dp),
                    value = "",
                    onValueChange = { },
                    //label = { Text("Username") },
                    placeholder = { Text("Name") },
                    keyboardActions = KeyboardActions { ImeAction.Next }
                )
            }
            Spacer(modifier = Modifier.padding(top = 20.dp))
            Column() {
                Text("Email", modifier = Modifier.padding(bottom = 2.dp), fontWeight = FontWeight.SemiBold)
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(fraction = 0.8f),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Grey1,
                        unfocusedBorderColor = GreyBorder
                    ),
                    shape = RoundedCornerShape(12.dp),
                    value = "",
                    onValueChange = { },
                    //label = { Text("Username") },
                    placeholder = { Text("Email") },
                    keyboardActions = KeyboardActions { ImeAction.Next }
                )
            }
            Spacer(modifier = Modifier.padding(top = 20.dp))
            Column() {
                Text("Phone Number", modifier = Modifier.padding(bottom = 2.dp), fontWeight = FontWeight.SemiBold)
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(fraction = 0.8f),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Grey1,
                        unfocusedBorderColor = GreyBorder
                    ),
                    shape = RoundedCornerShape(12.dp),
                    value = "+1234567890",
                    onValueChange = { },
                    //label = { Text("Username") },
                    placeholder = { Text("Phone Number") },
                    keyboardActions = KeyboardActions { ImeAction.Next }
                )
            }
            Spacer(modifier = Modifier.padding(top = 20.dp))
            Column() {
                Text("Password", modifier = Modifier.padding(bottom = 2.dp), fontWeight = FontWeight.SemiBold)
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(fraction = 0.8f),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Grey1,
                        unfocusedBorderColor = GreyBorder
                    ),
                    shape = RoundedCornerShape(12.dp),
                    value = "+1234567890",
                    onValueChange = { },
                    //label = { Text("Username") },
                    placeholder = { Text("Password") },
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    keyboardActions = KeyboardActions { ImeAction.Next }
                )
            }
            Spacer(modifier = Modifier.padding(top = 20.dp))
            Column() {
                Text("Confirm Password", modifier = Modifier.padding(bottom = 2.dp), fontWeight = FontWeight.SemiBold)
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(fraction = 0.8f),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Grey1,
                        unfocusedBorderColor = GreyBorder
                    ),
                    shape = RoundedCornerShape(12.dp),
                    value = "+1234567890",
                    onValueChange = { },
                    //label = { Text("Username") },
                    placeholder = { Text("Confirm Password") },
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    keyboardActions = KeyboardActions { ImeAction.Next }
                )
            }
            Spacer(modifier = Modifier.padding(top = 20.dp))
            Divider(color = GreyBorder, modifier = Modifier.fillMaxWidth(fraction = 0.8f))
            Row(Modifier.fillMaxWidth(fraction = 0.8f),horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically){
                Text("Enable Geolocation")
                Switch(
                    checked = true,
                    onCheckedChange = { },
                    colors = SwitchDefaults.colors(checkedThumbColor = PrimaryBlue, checkedTrackColor = PrimaryBlue,)
                )
            }
            Spacer(modifier = Modifier.padding(top = 20.dp))
            Row(Modifier.fillMaxWidth(fraction = 0.8f), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically){
                Text("Enable Face ID")
                Switch(
                    checked = false,
                    onCheckedChange = { },
                    colors = SwitchDefaults.colors(checkedThumbColor = PrimaryBlue, checkedTrackColor = PrimaryBlue,)
                )
            }
            Spacer(modifier = Modifier.padding(top = 30.dp))
            Button(
                onClick = {
                },
                modifier = Modifier
                    .fillMaxWidth(fraction = 0.8f)
                    .height(45.dp),
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = PrimaryBlue,
                    contentColor = White
                )
            ) {
                Text("Next", color = Color.White, style = AeonikTypography.h5)
            }
            Spacer(modifier = Modifier.padding(top = 30.dp))
        }
    }
}