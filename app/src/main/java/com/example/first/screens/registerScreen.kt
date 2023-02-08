package com.example.first.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.first.R
import com.example.first.components.CutomInputForm


@Composable
fun Register (){
    Image(
        painter = painterResource(id = R.drawable.register),
        contentDescription = "register background image",
        Modifier.fillMaxSize(),
        contentScale = ContentScale.Crop
    )
    Column (Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Box(modifier = Modifier.padding(25.dp, 20.dp, 0.dp, 0.dp)){
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo",
                Modifier.fillMaxWidth(.1f)
            )
        }
        RegisterForm()
    }
}

@Composable
fun RegisterForm(){
    val name = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }
    val phone = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val confirmPassword = remember { mutableStateOf("") }

    Column(
        Modifier
            .fillMaxWidth(0.85f)
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(80.dp))
        CutomInputForm(name, "Emri edhe mbiemri")
        Spacer(modifier = Modifier.height(20.dp))
        CutomInputForm(email, "Email adresa")
        Spacer(modifier = Modifier.height(20.dp))
        CutomInputForm(email, "Numri i telefonit")
        Spacer(modifier = Modifier.height(20.dp))
        CutomInputForm(email, "Fjalekalimi")
        Spacer(modifier = Modifier.height(20.dp))
        CutomInputForm(email, "Konfirmo fjalekalimin")
        Spacer(modifier = Modifier.height(30.dp))
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFF8A98C))
        ) {
            Text(text = "Regjistrohu", Modifier.padding(7.dp), color= Color.White, fontSize = 16.sp)
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "OSE", color = Color(0xFFF8A98C), fontSize = 18.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth(.45f),
                border = BorderStroke(1.dp, Color(0xFFF8A98C)),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
            ) {
                Text(text = "Google", Modifier.padding(7.dp), color= Color.Blue, fontSize = 16.sp)
            }
            Spacer(modifier = Modifier.width(40.dp))
            OutlinedButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                border = BorderStroke(1.dp, Color(0xFFF8A98C)),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White
                )
            ) {
                Image(painter = painterResource(id = R.drawable.rks_trust_logo), contentDescription = "")
            }
        }
    }
}