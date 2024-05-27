package com.example.compose_learn
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_learn.ui.theme.Compose_learnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_learnTheme {
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                   MainPreview()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainPreview() {
    Compose_learnTheme {
        //ArticleView()
        TaskCompletedView()
    }
}


//start of ArticleView

@Composable
fun ArticleView() {
    Column {
        HeaderImage()
        TitleText(
            text = "Jetpack Compose Tutorial",
            modifier = Modifier.padding(16.dp)
        )
        ContentText(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.",
            modifier = Modifier.padding(16.dp,0.dp)
        )
        ContentText(
            text = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            modifier = Modifier.padding(16.dp)
        )
    }
}


@Composable
fun HeaderImage() {
    Image(
        painter = painterResource(id = R.drawable.bg_compose_background),
        contentDescription = null
    )
}

@Composable
fun TitleText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        fontSize = 24.sp
        )
}

@Composable
fun ContentText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        textAlign = TextAlign.Justify
    )
}

//end of ArticleView
//start of TaskCompleted

@Composable
fun TaskCompletedView() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CompletedImage()
        TitleAlertText(text = "All tasks completed", modifier =Modifier.padding(top = 24.dp, bottom = 8.dp))
        DescriptionAlertText(text = "Nice work!")

    }
}

@Composable
fun CompletedImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_task_completed),
        contentDescription = null
    )
}

@Composable
fun TitleAlertText(text: String, modifier: Modifier) {
   Text(
        text = text,
        fontWeight = FontWeight.Bold,
        modifier = modifier
    )
}

@Composable
fun DescriptionAlertText(text: String) {
    Text(
        text = text,
        fontSize = 16.sp
    )
}
//end of TaskCompleted





