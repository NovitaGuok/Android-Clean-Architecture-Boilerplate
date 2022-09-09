package com.example.myapplication.presentation.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.myapplication.R

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.W400,
        color = Black100,
        fontSize = 16.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.W700,
        fontSize = 16.sp,
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        color = GraniteGray,
        fontSize = 12.sp
    )
)

val textRegular12 = TextStyle(
    fontSize = 12.sp,
    fontFamily = FontFamily(Font(R.font.opensans_regular)),
)
val textRegular14 = TextStyle(
    fontSize = 14.sp,
    fontFamily = FontFamily(Font(R.font.opensans_regular))
)
val textRegular16 = TextStyle(
    fontSize = 16.sp,
    fontFamily = FontFamily(Font(R.font.opensans_regular))
)
val textSemiBold12 = TextStyle(
    fontSize = 12.sp,
    fontFamily = FontFamily(Font(R.font.opensans_semibold))
)
val textSemiBold14 = TextStyle(
    fontSize = 14.sp,
    fontFamily = FontFamily(Font(R.font.opensans_semibold))
)
val textBold12 = TextStyle(
    fontSize = 12.sp,
    fontFamily = FontFamily(Font(R.font.opensans_bold)),
)
val textBold14 = TextStyle(
    fontSize = 14.sp,
    fontFamily = FontFamily(Font(R.font.opensans_bold)),
)
val textBold16 = TextStyle(
    fontSize = 16.sp,
    fontFamily = FontFamily(Font(R.font.opensans_bold)),
)
val textBold18 = TextStyle(
    fontSize = 18.sp,
    fontFamily = FontFamily(Font(R.font.opensans_bold)),
)
val textBold20 = TextStyle(
    fontSize = 20.sp,
    fontFamily = FontFamily(Font(R.font.opensans_bold)),
)