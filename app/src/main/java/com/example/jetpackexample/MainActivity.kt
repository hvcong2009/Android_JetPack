package com.example.jetpackexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackexample.ui.theme.JetpackExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    JetpackExampleTheme {
        HomeScreen()
    }
}

@Composable
fun HomeScreen() {
    Column(modifier = Modifier.padding(10.dp)) {
        //region _Text
//        TextUI()
//        Spacer(modifier = Modifier.height(15.dp))
//        MultipleStyleText()
        //endregion

        //region _Image
//        Column(modifier = Modifier.fillMaxWidth(),
//            horizontalAlignment = Alignment.CenterHorizontally) {
//            ImagePainterResourceCompose()
//            Spacer(modifier = Modifier.height(15.dp))
//            ImageVectorCompose()
//            Spacer(modifier = Modifier.height(15.dp))
//            ImageCustomPainterCompose()
//        }


//        Column(modifier = Modifier.fillMaxWidth(),
//            horizontalAlignment = Alignment.CenterHorizontally) {
//            ImageScalePainterResourceCompose(contentScale = ContentScale.Crop)
//            Spacer(modifier = Modifier.height(15.dp))
//            ImageScalePainterResourceCompose(contentScale = ContentScale.None)
//            Spacer(modifier = Modifier.height(15.dp))
//            ImageScalePainterResourceCompose(contentScale = ContentScale.Fit)
//            Spacer(modifier = Modifier.height(15.dp))
//            ImageScalePainterResourceCompose(contentScale = ContentScale.FillBounds)
//            Spacer(modifier = Modifier.height(15.dp))
//            ImageScalePainterResourceCompose(contentScale = ContentScale.FillHeight)
//            Spacer(modifier = Modifier.height(15.dp))
//            ImageScalePainterResourceCompose(contentScale = ContentScale.FillWidth)
//            Spacer(modifier = Modifier.height(15.dp))
//            ImageScalePainterResourceCompose(contentScale = ContentScale.Inside)
//            Spacer(modifier = Modifier.height(15.dp))
//        }

            Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
                ImageCircleCompose()
                Spacer(modifier = Modifier.height(15.dp))
                ImageCircleShadowCompose()
                Spacer(modifier = Modifier.height(15.dp))
                ImageShadowCompose()
        }
        //endregion
    }
}

//region _Text
@Composable
fun TextUI() {
    Text(text = stringResource(id = R.string.app_content),
//        color = Color.Blue,
        fontSize = 30.sp,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        style = TextStyle(
            color = Color.Red
        ),
        textDecoration = TextDecoration.LineThrough,
        maxLines = 3,
        overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun MultipleStyleText() {
    Text(text = buildAnnotatedString {
        withStyle(style = ParagraphStyle(TextAlign.End)) {
            withStyle(style = SpanStyle(color = Color.Blue)){
                append("H")
            }
            append("ello ")
            withStyle(style = SpanStyle(color = Color.Red)){
                append("M")
            }
            withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)){
                append("ina ")
            }
            append(stringResource(id = R.string.app_content))
        }
    })
}
//endregion

//region _Image
@Composable
fun ImagePainterResourceCompose() {
    Image(painterResource(id = R.drawable.city_banner),
        contentDescription = "descriptions")
}

@Composable
fun ImageScalePainterResourceCompose(contentScale: ContentScale) {
    Image(painterResource(id = R.drawable.city_banner),
        contentDescription = "descriptions",
        contentScale = contentScale,
        modifier = Modifier.size(300.dp, 100.dp),
        alignment = Alignment.BottomEnd)
}

@Composable
fun ImageCustomPainterCompose() {
    Image(ColorPainter(Color.Red),
        contentDescription = "descriptions",
        modifier = Modifier.size(300.dp,100.dp))
}

@Composable
fun ImageVectorCompose() {
    Image(imageVector = Icons.Filled.Person,
        contentDescription = "descriptions")
}

@Composable
fun ImageCircleCompose() {
    Image(painterResource(id = R.drawable.city_banner),
        contentDescription = "descriptions",
        modifier = Modifier.size(200.dp, 200.dp)
            .border(BorderStroke(2.dp, color = Color.Gray), shape = CircleShape)
            .clip(shape = CircleShape),
        contentScale = ContentScale.FillBounds)
}

@Composable
fun ImageCircleShadowCompose() {
    Image(painterResource(id = R.drawable.city_banner),
        contentDescription = "descriptions",
        modifier = Modifier.size(200.dp, 200.dp)
            .border(BorderStroke(2.dp, color = Color.Gray), shape = CircleShape)
            .clip(shape = CircleShape)
            .shadow(elevation = 16.dp, shape = RoundedCornerShape(size = 16.dp)),
        contentScale = ContentScale.FillBounds)
}

@Composable
fun ImageShadowCompose() {
    Image(painterResource(id = R.drawable.city_banner),
        contentDescription = "descriptions",
        modifier = Modifier.fillMaxSize()
            .shadow(elevation = 16.dp, shape = RoundedCornerShape(size = 16.dp)),
        contentScale = ContentScale.FillBounds)
}

//endregion