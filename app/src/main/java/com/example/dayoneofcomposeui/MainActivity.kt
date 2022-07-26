package com.example.dayoneofcomposeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.dayoneofcomposeui.ui.theme.DayOneOfComposeUITheme
import com.example.dayoneofcomposeui.ui.theme.Grey

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

}

@Preview
@Composable
fun SearchInputComponent() {

}

@Preview
@Composable
fun FilterOptionComponent() {

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