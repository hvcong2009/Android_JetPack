package com.example.jetpackexample

import android.graphics.Paint.Style
import android.os.Bundle
import android.widget.CheckBox
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.*
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
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

//            Column(modifier = Modifier.fillMaxWidth(),
//            horizontalAlignment = Alignment.CenterHorizontally) {
//                ImageCircleCompose()
//                Spacer(modifier = Modifier.height(10.dp))
//                ImageCircleShadowCompose()
//                Spacer(modifier = Modifier.height(10.dp))
//                ImageShadowCompose()
//                Spacer(modifier = Modifier.height(10.dp))
//                //ImageUrlCompose()
//        }
        //endregion

        // region_Button
//        SimpleButton()
//        Spacer(modifier = Modifier.height(15.dp))
//        ClickableButton()
//        Spacer(modifier = Modifier.height(15.dp))
//        TapGesturesButton()
//        Spacer(modifier = Modifier.height(15.dp))
//        DisableSimpleButton()
//        Spacer(modifier = Modifier.height(15.dp))
//        RoundedCornerButton()
//        Spacer(modifier = Modifier.height(15.dp))
//        BorderSimpleButton()
//        Spacer(modifier = Modifier.height(15.dp))
//        ElevationSimpleButton()
//        Spacer(modifier = Modifier.height(15.dp))
//        OutlineSimpleButton()
//        Spacer(modifier = Modifier.height(15.dp))
//        TextSimpleButton()
//        Spacer(modifier = Modifier.height(15.dp))
//        IconSimpleButton()
        // endregion
        
        //region_RadioButton
//        RadioButtonCompose()
//        Spacer(modifier = Modifier.height(15.dp))
//        RadioButtonWithTextTitle("Class 1")
//        Spacer(modifier = Modifier.height(15.dp))
//        RadioButtonUseIconCompose("Class 1")
//        Spacer(modifier = Modifier.height(15.dp))
//        CustomRadioButton()
//        Spacer(modifier = Modifier.height(15.dp))
        //endregion

        //region_CheckBox
//        CheckBoxWithTitle("Check me")
//        Spacer(modifier = Modifier.height(15.dp))
//        CheckBoxUseIcon("Check me")
        //endregion

        //region_TextField
        TextFieldCompose()
        Spacer(modifier = Modifier.height(15.dp))
        OutlineTextFieldCompose()
        Spacer(modifier = Modifier.height(15.dp))
        PasswordTextFieldCompose()
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
        modifier = Modifier
            .size(200.dp, 200.dp)
            .border(BorderStroke(2.dp, color = Color.Gray), shape = CircleShape)
            .clip(shape = CircleShape),
        contentScale = ContentScale.FillBounds)
}

@Composable
fun ImageCircleShadowCompose() {
    Image(painterResource(id = R.drawable.city_banner),
        contentDescription = "descriptions",
        modifier = Modifier
            .size(200.dp, 200.dp)
            .border(BorderStroke(2.dp, color = Color.Gray), shape = CircleShape)
            .clip(shape = CircleShape)
            .shadow(elevation = 16.dp, shape = RoundedCornerShape(size = 16.dp)),
        contentScale = ContentScale.FillBounds)
}

@Composable
fun ImageShadowCompose() {
    Image(painterResource(id = R.drawable.city_banner),
        contentDescription = "descriptions",
        modifier = Modifier
            .size(200.dp, 200.dp)
            .shadow(elevation = 50.dp, shape = RoundedCornerShape(size = 10.dp))
            .aspectRatio(2f),
        contentScale = ContentScale.FillBounds)
}

// https://st.quantrimang.com/photos/image/2021/03/10/Hinh-nen-dep-cute-2.jpg
@Composable
fun ImageUrlCompose() {
    Image(rememberAsyncImagePainter(model = "https://st.quantrimang.com/photos/image/2021/03/10/Hinh-nen-dep-cute-2.jpg",
    placeholder = painterResource(id = R.drawable.city_banner)),
        contentDescription = null)
}

//endregion

//region_Button
@Composable
fun ClickableButton() {
    Text(text = "Click me", modifier = Modifier.clickable {
        
    })
    
    Column(modifier = Modifier
        .size(100.dp)
        .clickable {

        }) {
        Image(painter = painterResource(id = R.drawable.city_banner), contentDescription = "descriptions")
        Text(text = "Name")
    }
}

@Composable
fun TapGesturesButton() {
    val textContent = remember {
        mutableStateOf("doing...")
    }
    
    Text(text = textContent.value)
    
    Text(text = "Action", modifier = Modifier.pointerInput(Unit) {
        detectTapGestures(onDoubleTap = {
            textContent.value = "doubleTap"
        }, onLongPress = {
            textContent.value = "longPress"
        }, onPress = {
            textContent.value = "press"
        }, onTap = {
            textContent.value = "tap"
        })
    })
}

@Composable
fun SimpleButton() {
    val count = remember {
        mutableStateOf(0)
    }
    Text(text = "Click count ${count.value}")
    Button(onClick = {
                     count.value ++
                     },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue, contentColor = Color.Black, disabledBackgroundColor = Color.Gray, disabledContentColor = Color.DarkGray)) {
        Icon(Icons.Default.Add, contentDescription = "descriptions")
        Text(text = "Add", style = TextStyle(color = Color.White))
    }
}

@Composable
fun DisableSimpleButton() {
    Button(onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(disabledBackgroundColor = Color.Gray, disabledContentColor = Color.DarkGray),
        enabled = false) {
        Column() {
            Icon(Icons.Default.Add, contentDescription = "descriptions")
            Text(text = "Add", style = TextStyle(color = Color.White))
        }
    }
}

@Composable
fun RoundedCornerButton() {
    Button(onClick = { /*TODO*/ },
        shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp)) {
        Text(text = "Rounded corner button")
    }
}

@Composable
fun BorderSimpleButton() {
    Button(onClick = { /*TODO*/ },
        border = BorderStroke(width = 2.dp, color = Color.Red),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)
    ) {
        Text(text = "Border button", color = Color.Blue)
    }
}

@Composable
fun ElevationSimpleButton() {
    Button(onClick = { /*TODO*/ },
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.White),
        elevation = ButtonDefaults.elevation(defaultElevation = 15.dp, pressedElevation = 30.dp, disabledElevation = 5.dp)) {
        Text(text = "Elevation button", color = Color.Cyan)
    }
}

@Composable
fun OutlineSimpleButton() {
    OutlinedButton(onClick = { /*TODO*/ }) {
        Text(text = "Outline button", color = Color.Magenta)
    }
    
}

@Composable
fun TextSimpleButton() {
    TextButton(onClick = { /*TODO*/ }) {
        Text(text = "Text button", color = Color.Green)
    }
}

@Composable
fun IconSimpleButton() {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(imageVector = Icons.Default.Person, contentDescription = "icon button")
    }
}
//endregion

//region_RadioButton
@Composable
fun RadioButtonCompose() {
    RadioButton(selected = true,
        enabled = true,
        onClick = { /*TODO*/ },
        colors = RadioButtonDefaults.colors(selectedColor = Color.Green, unselectedColor = Color.DarkGray, disabledColor = Color.LightGray)
    )
    RadioButton(selected = false,
        enabled = true,
        onClick = { /*TODO*/ },
        colors = RadioButtonDefaults.colors(selectedColor = Color.Green, unselectedColor = Color.DarkGray, disabledColor = Color.LightGray)
    )
    RadioButton(selected = false,
        enabled = false,
        onClick = { /*TODO*/ },
        colors = RadioButtonDefaults.colors(selectedColor = Color.Green, unselectedColor = Color.DarkGray, disabledColor = Color.LightGray)
    )
}

@Composable
fun RadioButtonWithTextTitle(title:String) {
    Row() {
        RadioButton(selected = false,
            enabled = false,
            onClick = { /*TODO*/ },
            colors = RadioButtonDefaults.colors(selectedColor = Color.Green, unselectedColor = Color.DarkGray, disabledColor = Color.LightGray)
        )
        Text(text = title)
    }
}

@Composable
fun RadioButtonUseIconCompose(title: String) {
    var isSelected by remember {
        mutableStateOf(false)
    }
    Row(modifier = Modifier.selectable(
        selected = true,
        onClick = {isSelected = !isSelected},
        role = Role.RadioButton
    )) {
        Icon(if(isSelected)Icons.Default.Check else Icons.Default.CheckCircle, contentDescription = "description")
        Text(text = title)
    }
}

@Composable
fun CustomRadioButton() {
    val radioButtons = listOf(1,2,3)
    val selectedButton = remember {
        mutableStateOf(radioButtons.first())
    }
    radioButtons.forEach{
        val isSelected = it == selectedButton.value
        val colors = RadioButtonDefaults.colors(selectedColor = Color.Green, unselectedColor = Color.DarkGray, disabledColor = Color.LightGray)
        RadioButton(selected = isSelected, onClick = { selectedButton.value = it }, colors = colors)
    }
}
//endregion

//region_CheckBox
@Composable
fun CheckBoxWithTitle(title: String) {
    var isChecked by remember {
        mutableStateOf(true)
    }
    Row(modifier = Modifier.selectable(
        selected = isChecked,
        onClick = {
            isChecked = !isChecked
        },
        role = Role.Checkbox
    )) {
        Checkbox(checked = true, onCheckedChange = {

        }, colors = CheckboxDefaults.colors(checkedColor = Color.Blue, uncheckedColor = Color.Gray))
        Text(text = title)
    }
}

@Composable
fun CheckBoxUseIcon(title: String) {
    var isChecked by remember {
        mutableStateOf(true)
    }
    Row(modifier = Modifier.selectable(
        selected = isChecked,
        onClick = {
            isChecked = !isChecked
        },
        role = Role.Checkbox
    )) {
        Icon(if(isChecked)Icons.Default.Check else Icons.Default.CheckCircle, contentDescription = "description")
        Text(text = title)
    }
}
//endregion

//region_TextField
@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun TextFieldCompose() {
    var name by remember {
        mutableStateOf("")
    }

    val keyBoardController = LocalSoftwareKeyboardController.current

    TextField(
        value = name,
        onValueChange = {
            name = it
        },
        textStyle = TextStyle(color = Color.Blue, fontSize = 15.sp, fontWeight = FontWeight.Bold),
        label = { Text(text = "Name")},
        placeholder = { Text(text = "Input name") },
        leadingIcon = { Icon(Icons.Default.Person, contentDescription = "Descriptions") },
        trailingIcon = {
            IconButton(onClick = {
                name = ""
            }) {
                Icon(Icons.Default.Clear, contentDescription = "Descriptions")
            }
        },
        colors = TextFieldDefaults.textFieldColors(cursorColor = Color.Yellow,
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            trailingIconColor = Color.Green,
            leadingIconColor = Color.Cyan),
        shape = RoundedCornerShape(25.dp),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done,
//                keyboardType = KeyboardType.Phone,
                // Viết hoa chữ đầu của 1 từ, mỗi từ được xác định bởi khoảng trắng
                capitalization = KeyboardCapitalization.Words
            ),
        keyboardActions = KeyboardActions(onDone = {
                keyBoardController?.hide()
            })
        )
}

@Composable
fun OutlineTextFieldCompose() {
    var email by remember {
        mutableStateOf("")
    }
    OutlinedTextField(value = email,
        onValueChange = {
        email = it
        },
        label = { Text(text = "Email")},
        placeholder = { Text(text = "Input Email")},
        leadingIcon = { Icon(Icons.Default.Email, contentDescription = "Descriptions") }
    )
}

@Composable
fun PasswordTextFieldCompose() {
    var password by remember {
        mutableStateOf("")
    }

    var isShowPassword by remember {
        mutableStateOf(false)
    }

    OutlinedTextField(value = password,
        onValueChange = {
            password = it
        },
        label = { Text(text = "Password")},
        placeholder = { Text(text = "Input Password")},
        trailingIcon = { IconButton(onClick = { isShowPassword = !isShowPassword }) {
                Icon(if(isShowPassword) Icons.Default.Person else Icons.Default.Lock, contentDescription = "Descriptions")
            }
        },
        visualTransformation = if(isShowPassword) VisualTransformation.None else PasswordVisualTransformation()
    )
}
//endregion