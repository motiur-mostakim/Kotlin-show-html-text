package com.example.hellow_world

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.fromHtml
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.example.hellow_world.ui.theme.Hellow_worldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp(){
    Hellow_worldTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Greeting(
                name = "Mostakim",
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier, htmlText: String = """
       <h1>Jetpack Compose</h1>
       <p>
           Build <b>better apps</b> faster with <a href="https://www.android.com">Jetpack Compose</a>
       </p>
    """.trimIndent()) {
    val offset = Offset(5.0f, 10.0f)
    Text(
        text = AnnotatedString.fromHtml(htmlString = htmlText, linkStyles = TextLinkStyles(
            style = SpanStyle(
                color = Color.Blue,
                textDecoration = TextDecoration.Underline,
                fontStyle = FontStyle.Italic
            )
        )),
        modifier.fillMaxSize().wrapContentSize(Alignment.Center)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp()
}