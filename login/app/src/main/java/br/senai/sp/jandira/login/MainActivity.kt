package br.senai.sp.jandira.login

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.login.ui.theme.LoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
                }
            }
        }
    }
}

@Composable
fun LoginScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(
                    top = 100.dp,
                    bottom = 100.dp
                ),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Text(text = "Login", fontSize = 32.sp, fontWeight = FontWeight.ExtraBold)
            Box(
                modifier = Modifier
                    .background(
                        color = Color(0xFF4D7B9F),
                        shape = RoundedCornerShape(12.dp)
                    )
                    .height(330.dp)
                    .width(340.dp)
                    .padding(20.dp)

            ) {
                Column {
                    Text(
                        text = "Email:",
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(bottom = 5.dp),
                        color = Color.White
                    )
                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    Text(
                        text = "Senha:",
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(
                                top = 30.dp,
                                bottom = 5.dp
                            ),
                        color = Color.White
                    )
                    TextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Checkbox(
                            checked = true, onCheckedChange = {},
                            colors = CheckboxDefaults.colors(
                                checkedColor = Color(0x89D24E35)
                            )
                        )
                        Text(text = "Lembrar", color = Color.White)
                    }
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0x89D24E35)
                        )
                    ) {
                        Text(text = "Entrar", fontSize = 20.sp)
                    }
                }
            }
            Row {
                Text(text = "Desenvolvido por ")
                Text(text = "Gabriela Fernandes", color = Color(0xFFCF9E76), fontWeight = FontWeight.Bold)
            }

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LoginScreenPreview() {
    LoginTheme {
        LoginScreen()
    }
}

@Composable
fun Teste() {
    Surface(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .height(600.dp),
        color = Color(0xFFFFE500),
    ) {
        Box(
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color(0x99E7C46D))

        ) {
            Column(
                modifier = Modifier
                    .background(color = Color(0xfffffff))
                    .align(Alignment.Center)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly
            )
            {
                Text(
                    text = "tuquinho",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 32.sp
                )
                Text(
                    text = "<3",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 32.sp
                )
                Text(
                    text = "bibi",
                    fontFamily = FontFamily.Cursive,
                    fontSize = 32.sp
                )
            }


        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TestePreview() {
    Teste()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LoginTheme {
    }
}