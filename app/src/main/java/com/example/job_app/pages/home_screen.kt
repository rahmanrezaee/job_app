package com.example.job_app.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun homeScreen() {

    val searchValue  =  remember{
        mutableStateOf("")
    }

    Scaffold(

    ) {

        Column(
            Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(20.dp)

        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Text("Chats",style = TextStyle(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold,
                    fontFamily = FontFamily.SansSerif
                ))
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Edit, contentDescription = "edit button")
                }
            }

            Spacer(modifier = Modifier.height(10.dp).fillMaxWidth())
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(MaterialTheme.colors.primary)) {
            }



        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    homeScreen()
}