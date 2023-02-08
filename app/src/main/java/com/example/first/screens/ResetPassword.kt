package com.example.first.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first.R


@Composable
fun ResetPasswordScreen(){
    Image(painter = painterResource(id = R.drawable.login), contentDescription = "login image", Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
    Column(Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        LogoResetBg()
        ResetForm()
    }
}

@Composable
fun LogoResetBg(){
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
    }
}
@Composable
fun ResetForm(){
    val email = remember { mutableStateOf("") }
    Column(
        Modifier
            .fillMaxWidth(0.85f)
            .fillMaxHeight()
    ) {
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
            placeholder = { Text(text = "Email adresa") },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color(0xFFebf3f3),
                focusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF8A98C))
        ) {
            Text(text = "Kyçu", Modifier.padding(7.dp), color= Color.White, fontSize = 16.sp)
        }
    }
}