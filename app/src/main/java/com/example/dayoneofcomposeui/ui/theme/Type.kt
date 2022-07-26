package com.example.dayoneofcomposeui.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.dayoneofcomposeui.R


// For user to call use fonts in the design they must be defined here
val nunitoLight = FontFamily(Font(R.font.nunito_light))
val nunitoRegular = FontFamily(Font(R.font.nunito_regular))
val nunitoBold = FontFamily(Font(R.font.nunito_bold))
val nunitoMedium = FontFamily(Font(R.font.nunito_medium))

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)