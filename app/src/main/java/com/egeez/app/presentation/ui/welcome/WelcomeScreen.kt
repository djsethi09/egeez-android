package com.egeez.app.presentation.ui.welcome

import android.content.res.ColorStateList
import android.graphics.drawable.ColorStateListDrawable
import android.widget.EditText
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.layout.ContentScale
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.NavHostController
import com.egeez.app.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.egeez.app.presentation.theme.AeonikTypography

//import androidx.hilt.navigation.compose.hiltViewModel
@Composable
fun WelcomeScreen(

    navController: NavHostController,
    //welcomeViewModel: WelcomeViewModel = hiltViewModel()
){
    val image = painterResource(id = R.drawable.background)
    Box {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(R.drawable.background),
            contentDescription = "background_image",
            contentScale = ContentScale.FillBounds
        )
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
            Text(text = "Oh, Geez!", color = Color.White, style = AeonikTypography.h1,
                fontWeight = FontWeight.Bold, fontSize = 40.sp)
            Text(text = "Welcome!", color = Color.White, style = AeonikTypography.h1,
                fontWeight = FontWeight.SemiBold)
            Spacer(modifier = Modifier.fillMaxWidth())
            Text(text="Welcome to Egeez! Experience \nmagic like you’ve never \nexperienced before!",
                color=Color.White, style = AeonikTypography.h4, textAlign = TextAlign.Center)
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(40.dp),Arrangement.Bottom,
        horizontalAlignment = Alignment.End) {
            Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(3.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White,
                    contentColor = Color.Black)
            ) {
                Text("Log In or Sign Up", color = Color.Black)
            }
            Spacer(modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 5.dp))
            OutlinedButton(onClick = { /*TODO*/ },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(3.dp),
                border=BorderStroke(1.dp,Color.White),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Transparent,
                    contentColor = Color.White)
            ) {
                Text("Log In with Face ID")
            }
        }
    }
//    Text("Welcome Screen! Egeez")
}