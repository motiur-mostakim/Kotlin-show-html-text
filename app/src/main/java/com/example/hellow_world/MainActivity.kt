package com.example.hellow_world

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hellow_world.R.drawable
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
fun MyApp() {
    Hellow_worldTheme {
        Surface(Modifier.fillMaxSize(),color = MaterialTheme.colorScheme.surface) {
            ProfessionalScreenDesign()
        }
    }
}

// Box example

//@Composable
//fun BoxExample() {
//    Box(
//        modifier = Modifier
//            .background(Color.Green).size(200.dp),
//        contentAlignment = Alignment.Center,
//    ) {
//        Icon(
//            imageVector = Icons.Default.Delete,
//            contentDescription = null,
//            modifier = Modifier.size(200.dp)
//        )
//    }
//}


// show column and Row example
@Composable
fun ColumnAndRowExample(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Motur-Mostakim")
        Text("MR Mostakim")
        Text("Motiur Rahman Mostakim")

        Row(
            modifier = modifier
                .fillMaxWidth()
                .background(color = Color.Gray),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Spacer(modifier = modifier.padding(start = 16.dp))
//            Icon(Icons.Default.Person, contentDescription = null, modifier = modifier)
            Spacer(modifier = modifier.padding(start = 8.dp))
            Text("Motiur-Mostakim")

        }
    }
}


// ShowImage
@Composable
fun ImageCustomize(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = drawable.goodafternoon_bg_image),
        contentDescription = null,
        modifier = Modifier
            .size(height = 200.dp, width = 200.dp)
            .padding(all = 16.dp)
            .clip(CircleShape)
            .border(width = 2.dp, shape = CircleShape, color = Color.Blue)
    )
}

// show text and html text
@Composable
fun TestExample(
    name: String, modifier: Modifier = Modifier,
    htmlText: String = """
       <h1>Jetpack Compose</h1>
       <p>
           Build <b>better apps</b> faster with <a href="https://www.android.com">Jetpack Compose</a>
       </p>
    """.trimIndent(),
) {
    val offset = Offset(5.0f, 10.0f)
    Text(
        text = AnnotatedString.fromHtml(
            htmlString = htmlText, linkStyles = TextLinkStyles(
                style = SpanStyle(
                    color = Color.Blue,
                    textDecoration = TextDecoration.Underline,
                    fontStyle = FontStyle.Italic
                )
            )
        ),
        modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp()
}