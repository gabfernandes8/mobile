package br.senai.sp.jandira.calculadora_imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadora_imc.ui.theme.Calculadora_imcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calculadora_imcTheme {
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
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .height(240.dp)
                .fillMaxWidth()
                .background(
                    color = Color(0xffe61753)
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(modifier = Modifier
                .width(80.dp)
                .height(80.dp)
                .padding(bottom = 10.dp),
                painter = painterResource(id = R.drawable.imc),
                contentDescription = ""
            )
            Text(
                text = "Calculadora IMC",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color.White
            )
        }
        Card(
            modifier = Modifier
                .offset(y = (-35.dp))
                .height(390.dp)
                .width(330.dp),
            colors = CardDefaults.cardColors(
                Color(0xffF7F3F2)),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 15.dp
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Seus dados",
                    textAlign = TextAlign.Center,
                    color = Color(0xffED145B),
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp
                )
                Column {
                    Text(
                        text = "Seu peso:",
                        color = Color(0xffED145B))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        placeholder = {
                            Text(
                                text = "Seu peso em KG",
                                color = Color(0xffAFA9A9)
                            )
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xffED145B),
                            unfocusedBorderColor = Color(0xffED145B)
                        ))
                }
                Column() {
                    Text(
                        text = "Sua altura:",
                        color = Color(0xffED145B))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        placeholder = {
                            Text(
                                text = "Sua altura em cm",
                                color = Color(0xffAFA9A9)
                            )
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(0xffED145B),
                            unfocusedBorderColor = Color(0xffED145B)
                        )
                    )

                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xffe61753)
                    ),
                    modifier = Modifier
                        .width(280.dp)
                        .height(55.dp),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = "Calcular",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
        Card(modifier = Modifier
            .height(130.dp)
            .width(330.dp),
            colors = CardDefaults.cardColors(
                Color(0xff329F6B)
            ),
            border = BorderStroke(1.dp, Color(0xffED145B))
        ){
            Row(modifier = Modifier
                .fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround)
            {
                Column(horizontalAlignment = Alignment.CenterHorizontally){
                    Text(
                        text = "Resultado",
                        fontSize = 15.sp,
                        color = Color.White,
                    )
                    Text(
                        text = "Peso ideal",
                        fontSize = 25.sp,
                        color = Color.White)
                }
                Text(
                    text = "21.3",
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 36.sp,
                    color = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Calculadora_imcTheme {
        Greeting()
    }
}