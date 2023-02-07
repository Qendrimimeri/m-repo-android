package com.example.first

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first.ui.theme.FirstTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Image(painter = painterResource(id = R.drawable.login), contentDescription = "login image", Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
            Column(Modifier
                .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                LogoBg()
                LoginForm()
            }
        }
    }
}


@Composable
fun LogoBg(){
    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(.5f),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Image background",
            Modifier.fillMaxSize(.45f)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            "MIRE SE VINI!",
            fontSize = 28.sp,
            color = Color.White,
            fontWeight = FontWeight(600)
        )
    }
}

@Composable
fun LoginForm(){
    val email = remember { mutableStateOf("")}
    val password = remember { mutableStateOf("")}
    Column(
        Modifier
            .fillMaxWidth(0.85f)
            .fillMaxHeight()
    ) {
        Text(
            text = "Adresen elektronike",
            color = Color(0xFF0F615C),
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(7.dp))
        TextField(
            value = email.value,
            onValueChange = {
                email.value = it
            },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp),
            placeholder = { Text(text = "mrepo@gmail.com")},
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color(0xFFc2dcda),
                focusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Fjalëkalimin",
            color = Color(0xFF0F615C),
            fontSize = 16.sp
        )
        Spacer(modifier = Modifier.height(7.dp))
        TextField(
            value = password.value,
            onValueChange = {
                password.value = it
            },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp),
            placeholder = { Text(text = "**********")},
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color(0xFFc2dcda),
                focusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF8A98C))
        ) {
            Text(text = "Simple Button", Modifier.padding(horizontal = 0.dp, vertical = 10.dp))
        }
    }
}