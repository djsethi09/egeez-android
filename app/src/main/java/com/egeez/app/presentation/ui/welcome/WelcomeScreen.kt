package com.egeez.app.presentation.ui.welcome

import androidx.compose.foundation.BorderStroke
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.layout.ContentScale
import androidx.navigation.NavHostController
import com.egeez.app.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.egeez.app.presentation.theme.AeonikTypography
import com.egeez.app.presentation.ui.login.LoginScreen
import com.egeez.app.presentation.ui.login.SignUpScreen
import com.egeez.app.presentation.ui.signup.SignUpViewModel
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun WelcomeScreen(

    navController: NavHostController,
    //welcomeViewModel: WelcomeViewModel = hiltViewModel()
    signUpViewModel: SignUpViewModel
){
    val image = painterResource(id = R.drawable.background)
    val sheetState = rememberBottomSheetState(initialValue = BottomSheetValue.Collapsed)
    val scope = rememberCoroutineScope()
    val bottomSheetScaffoldState = rememberBottomSheetScaffoldState(
        bottomSheetState = sheetState
    )
    BottomSheetScaffold(
        scaffoldState = bottomSheetScaffoldState,
        sheetShape = RoundedCornerShape(30.dp),
        sheetPeekHeight = 0.dp,
        modifier = Modifier.fillMaxSize(),
        sheetElevation = 2.dp,
        sheetContent = { SignUpScreen(signUpViewModel) }) {
        Box {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(R.drawable.background),
                contentDescription = "background_image",
                contentScale = ContentScale.FillBounds
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Oh, Geez!", color = Color.White, style = AeonikTypography.h1,
                    fontWeight = FontWeight.Bold, fontSize = 60.sp
                )
                Text(
                    text = "Welcome!", color = Color.White, style = AeonikTypography.h1,
                    fontWeight = FontWeight.SemiBold, fontSize = 50.sp
                )
                Spacer(modifier = Modifier.fillMaxWidth().height(15.dp))
                Text(
                    text = "Welcome to Egeez! Experience \nmagic like you’ve never \nexperienced before!",
                    color = Color.White,
                    style = AeonikTypography.h4,
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(40.dp), Arrangement.Bottom,
                horizontalAlignment = Alignment.End
            ) {
                Button(
                    onClick = {
                        scope.launch {
                            if (sheetState.isCollapsed) {
                                sheetState.expand()
                            } else if (sheetState.isExpanded) {
                                sheetState.collapse()
                            }
                        }
                    },
                    modifier = Modifier.fillMaxWidth().height(45.dp),
                    shape = RoundedCornerShape(6.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.White,
                        contentColor = Color.Black
                    )
                ) {
                    Text("Log In or Sign Up", color = Color.Black, style = AeonikTypography.h5)
                }
                Spacer(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 10.dp)
                )
                OutlinedButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth().height(45.dp),
                    shape = RoundedCornerShape(6.dp),
                    border = BorderStroke(1.dp, Color.White),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Transparent,
                        contentColor = Color.White
                    )
                ) {
                    Text("Log In with Face ID", style = AeonikTypography.h5)
                }
//            BottomSheetDialogComponent(coroutineScope,bottomSheetScaffoldState)
            }
        }
    }
//    Text("Welcome Screen! Egeez")
}