package com.example.pia12androiduppg2lars

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Xyrow(bokstav : String) {
    Column {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
            .height(100.dp)
            .background(Color(245, 245, 245)),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(bokstav,
                fontSize = 50.sp,
                fontFamily = FontFamily.Serif,
                color = Color(255, 100, 0)
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
    }

}