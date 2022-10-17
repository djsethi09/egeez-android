package com.egeez.app.presentation.ui.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.rounded.Facebook
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.egeez.app.R
import com.egeez.app.presentation.theme.*

@Preview
@Composable
fun LoginScreen(){

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
                        Icons.Filled.Close,
                        "close", modifier = Modifier.padding(start = 15.dp)
                    )
                    Text(
                        "Log In or Sign Up",
                        style = AeonikTypography.h5,
                        fontWeight = FontWeight.Bold
                    )
                    Text("")
                }
                Divider(color = GreyBorder, modifier = Modifier.padding(top = 20.dp))
                Spacer(modifier = Modifier.padding(top = 20.dp))
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(fraction = 0.8f),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Grey1,
                        unfocusedBorderColor = GreyBorder
                    ),
                    shape = RoundedCornerShape(12.dp),
                    value = "dheeraj.bharat@egeez.com",
                    onValueChange = { },
                    label = { Text("Username") },
                    placeholder = { Text("Username") },
                    keyboardActions = KeyboardActions { ImeAction.Next }
                )
                Spacer(modifier = Modifier.padding(top = 20.dp))
                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(fraction = 0.8f),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Grey1,
                        unfocusedBorderColor = GreyBorder
                    ),
                    shape = RoundedCornerShape(12.dp),
                    value = "Password",
                    onValueChange = { },
                    label = { Text("Password") },
                    placeholder = { Text("Password") },
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    keyboardActions = KeyboardActions { ImeAction.Done }
                )
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
                    Text("Log In", color = Color.White, style = AeonikTypography.h5)
                }
                Spacer(modifier = Modifier.padding(top = 20.dp))
                Text("Forgot Password?", style = AeonikTypography.body2, color = Color.Gray)
                Spacer(modifier = Modifier.padding(top = 30.dp))
                Row() {
                    Text(
                        "Don't have an account?",
                        style = AeonikTypography.body2,
                        color = Color.Gray
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        "SIGN UP",
                        style = AeonikTypography.body2,
                        color = Color.DarkGray,
                        fontWeight = FontWeight.Bold
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Divider(
                        modifier = Modifier
                            .fillMaxWidth(fraction = 0.25f)
                            .padding(start = 0.dp)
                    )
                    Text("or", modifier = Modifier.padding(1.dp), color = Color.LightGray)
                    Divider(
                        modifier = Modifier
                            .fillMaxWidth(fraction = 0.4f)
                            .padding(end = 0.dp)
                    )
                }
                Spacer(modifier = Modifier.padding(top = 10.dp))
                OutlinedButton(
                    onClick = {
                    },
                    border = BorderStroke(1.dp, Color.Black),
                    modifier = Modifier
                        .fillMaxWidth(fraction = 0.8f)
                        .height(45.dp)
                        .background(color = Color.White),
                    shape = RoundedCornerShape(6.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White,
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.CenterStart)
                        ) {
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(
                                painter = painterResource(id = R.drawable.twitter),
                                modifier = Modifier
                                    .size(18.dp),
                                contentDescription = "drawable_icons",
                                tint= Color.Unspecified
                            )
                        }
                        Text(
                            "Continue with Twitter ",
                            color = Color.Black,
                            style = AeonikTypography.body1
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(top = 20.dp))
                OutlinedButton(
                    onClick = {
                    },
                    border = BorderStroke(1.dp, Color.Black),
                    modifier = Modifier
                        .fillMaxWidth(fraction = 0.8f)
                        .height(45.dp),
                    shape = RoundedCornerShape(6.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.CenterStart)
                        ) {
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(
                                painter = painterResource(id = R.drawable.facebook),
                                modifier = Modifier
                                    .size(18.dp),
                                contentDescription = "drawable_icons",
                                tint= Color.Unspecified
                            )
                        }
                        Text(
                            "Continue with Facebook ",
                            color = Color.Black,
                            style = AeonikTypography.body1
                        )
                    }
                }
                Spacer(modifier = Modifier.padding(top = 20.dp))
                OutlinedButton(
                    onClick = {
                    },
                    border = BorderStroke(1.dp, Color.Black),
                    modifier = Modifier
                        .fillMaxWidth(fraction = 0.8f)
                        .height(45.dp),
                    shape = RoundedCornerShape(6.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White,
//                        contentColor = Color.Black
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.CenterStart)
                        ) {
                            Spacer(modifier = Modifier.width(4.dp))
                            Icon(
                                painter = painterResource(id = R.drawable.google),
                                modifier = Modifier
                                    .size(18.dp),
                                contentDescription = "drawable_icons",
                                tint= Color.Unspecified
                            )
                        }
                        Text(
                            "Continue with Google",
                            color = Color.Black,
                            style = AeonikTypography.body1
                        )
                    }
                }
            }
        }
    }