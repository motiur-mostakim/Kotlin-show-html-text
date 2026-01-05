package com.example.hellow_world

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ResponsiveColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(modifier = modifier.weight(1f)) {
            MyBox(color = Color.Red, text = "First", modifier = modifier.weight(1f))
            MyBox(color = Color.Green, text = "Second", modifier = modifier.weight(1f))
        }
        Row(modifier = modifier.weight(1f)) {
            MyBox(color = Color.Yellow, text = "Third", modifier = modifier.weight(1f))
            MyBox(color = Color.Magenta, text = "Fourth", modifier = modifier.weight(1f))
        }

    }
}

@Composable
fun MyBox(modifier: Modifier = Modifier, color: Color, text: String) {
    Box(modifier = modifier
        .fillMaxHeight()
        .background(color = color),
        contentAlignment = Alignment.Center) {
        Text(text = text, style = TextStyle(fontSize = 30.sp, fontWeight = FontWeight.SemiBold))
    }
}


@Preview(showBackground = true)
@Composable
private fun ResponsiveColumnPreview() {
    ResponsiveColumn()
}