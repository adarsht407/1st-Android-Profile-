package com.example.profile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profile.ui.theme.ProfileTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    //Greeting("Android")
                    Card(modifier= Modifier)
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier) {
    Column(

                horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
        modifier = modifier

            ) {

        Column (verticalArrangement = Arrangement.Top){
            Text(text = "Adarsh Tiwari", textAlign = TextAlign.Center, fontSize = 20.sp, color = Color.White)
            Text(text = "Android Developer Enthusiast", fontSize = 10.sp,color = Color.White)
        }
                Column(verticalArrangement = Arrangement.Bottom) {
                    Text(text = "9163443521", fontSize = 10.sp,color = Color.White)
                    Text(text = "adarsht408@gmail.com", fontSize = 10.sp,color = Color.White)
                    Text(text = "Dont ask anymore", fontSize = 10.sp,color = Color.White)
                }

        }

}
@Composable
fun Card(modifier: Modifier.Companion){

    val img=   painterResource(R.drawable._0230306_220702)
    Box(){

        Image(
            painter = img,
            contentDescription = null,
            alpha=0.8F,
            contentScale = ContentScale.Crop

        )
        Greeting("Adarsh Tiwari",modifier = modifier
            .fillMaxSize()
            .padding(8.dp))

    }

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProfileTheme {
        Card(Modifier)
    }
}
