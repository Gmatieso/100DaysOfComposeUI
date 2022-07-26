package com.example.dayoneofcomposeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dayoneofcomposeui.ui.theme.*
import com.example.dayoneofcomposeui.ui.theme.utils.FILTER_CONTENT_LIST

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DayOneOfComposeUITheme {
                Column(
                    modifier = Modifier
                        .background(Grey)
                        .fillMaxSize()
                ){
                    HeaderProfileComponent()
                    SearchInputComponent()
                    FilterOptionComponent()
                    MeditationTypesComponent()
                }

            }
        }
    }
}

@Preview
@Composable
fun HeaderProfileComponent() {
    // This exist to support the rest of the composables and the BadgedBox composable
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp, top = 15.dp)

    ) {
        // this Row exist to support the Image and Column Composables which has text composables
        Row( verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.profilepicture),
                contentDescription = "Profile Picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
            )
            //This column exist to support the two Text composables only
            Column(
                modifier = Modifier.padding(start = 10.dp)
            ) {
                // Welcome back Text
                Text(
                    text = "Welcome Back",
                    fontFamily = nunitoLight,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Start
                )
                // Name Text
                Text(
                    text = "Miranda Smith",
                    fontFamily = nunitoMedium,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Start
                )
            }

        }
        // This is a badgedBox
        BadgedBox(badge = { Badge(backgroundColor = Green) } ) {
            Icon(
                Icons.Default.Notifications,
                contentDescription = "Notification"
            )

        }

    }

}

@Preview
@Composable
fun SearchInputComponent() {
    OutlinedTextField(
        value = " ", onValueChange = {},
        placeholder = { Text(text = "Search", fontFamily = nunitoLight) },
        // put your vector icon here
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon" )
        },
        // put your drawable icon here
        trailingIcon = {
            Icon(painter = painterResource(id = R.drawable.filter),
                modifier = Modifier.size(24.dp), // size of the drawable icon
                contentDescription = "Filter Icon" )
        },
        modifier = Modifier
            .fillMaxWidth()
             .padding(top = 25.dp, start = 15.dp, end = 15.dp)
            .background(color = Color.White, shape = RoundedCornerShape(8.dp)),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.LightGray,
            unfocusedBorderColor = Color.White,
            cursorColor = Color.LightGray,
            trailingIconColor = Black
        )
    )

}

@Preview
@Composable
fun FilterOptionComponent() {
val filterOptions = FILTER_CONTENT_LIST
    LazyRow(
        Modifier.padding(top = 15.dp, start = 15.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(filterOptions.size) {
            ChipComponent(filter = filterOptions[it])
        }
    }
}

@Preview
@Composable
fun MeditationTypesComponent() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DayOneOfComposeUITheme {

    }
}