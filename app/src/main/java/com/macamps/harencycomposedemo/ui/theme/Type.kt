package com.macamps.harencycomposedemo.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.macamps.harencycomposedemo.R

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
val fonts = FontFamily(
    Font(R.font.mulish_black, weight = FontWeight.Black),
    Font(R.font.mulish_bold, weight = FontWeight.Bold),
    Font(R.font.mulish_regular, weight = FontWeight.Medium),
    Font(R.font.mulish_semi_bold, weight = FontWeight.SemiBold),
    )