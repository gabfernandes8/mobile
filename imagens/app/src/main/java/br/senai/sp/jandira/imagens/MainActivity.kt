package br.senai.sp.jandira.imagens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imagens.ui.theme.ImagensTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImagensTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column {
        Row (modifier = Modifier
            .fillMaxWidth()
            .height(90.dp)
            .background(color = Color(0xFFF1D3DE))
            .padding(16.dp)
        ){
            Card(shape = CircleShape,
                modifier = Modifier
                    .size(width = 60.dp, height = 60.dp),
                border = BorderStroke(width = 2.dp, color = Color(0xFFE91E63)),
                elevation = CardDefaults.cardElevation(5.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.ts4k2),
                    contentDescription = "Taylor Swift com um vestido branco, de luvas pretas, no Grammy 2024.",
                    contentScale = ContentScale.Crop)
            }
            Column(modifier = Modifier
                .padding(start = 10.dp)) {
                Text(text = "Taylor Swift",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black)
                Text(text = "ts@email.com",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black)
            }
        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(color = Color(0x73661632)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "Digite seu nome")
                }
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "Digite seu endereço")
                })
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ImagensTheme {
        Greeting()
    }
}