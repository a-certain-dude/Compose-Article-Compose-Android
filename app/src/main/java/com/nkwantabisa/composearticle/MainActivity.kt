package com.nkwantabisa.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.nkwantabisa.composearticle.ui.theme.ComposeArticleTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Wallpapers
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                ArticleLayout()
                }

            }
        }
    }
}
@Composable
fun ArticleLayout(modifirer: Modifier = Modifier){

    Column {
        ArticleImage()
        FirstText(stringResource(R.string.firstText))
        SecondText(stringResource(R.string.secondText))
        ThirdText(stringResource(id = R.string.thirdText))
    }

}

@Composable
fun ArticleImage (modifier : Modifier = Modifier ){
    val image = painterResource(R.drawable.bg_compose_background)
    Image(painter = image,contentDescription = "compose article")
}

@Composable
fun FirstText (firstText:String,modifier: Modifier = Modifier){
    Text(text = firstText,
        fontSize = 24.sp,
        modifier = Modifier.padding(
            start = 16.dp,
            top = 16.dp,
            end = 16.dp,
            bottom = 16.dp)
        )
}

@Composable
fun SecondText (secondText : String,modifier : Modifier = Modifier){
    Text(text = secondText,
        modifier = Modifier.padding(start = 16.dp,
            top = 16.dp,
            end = 16.dp,
            bottom = 16.dp), textAlign = TextAlign.Justify)

}

@Composable
fun ThirdText (thirdText : String, modifier: Modifier = Modifier) {
    Text(text = thirdText,
        modifier = Modifier.padding(
            start = 16.dp,
            end = 16.dp,
            bottom = 16.dp,
            top = 16.dp), textAlign = TextAlign.Justify)
}






@Preview(showBackground = true, showSystemUi = true,
    wallpaper = Wallpapers.NONE
)
@Composable
fun ArticlePreview() {
    ComposeArticleTheme {

        ArticleLayout()

    }
}