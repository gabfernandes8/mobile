package br.senai.sp.jandira.aula01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.aula01.ui.theme.Aula01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula01Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    androidx.compose.foundation.layout.Column {
                        Cartao("Tuco Lopes", Color.LightGray)
                        Cartao("Gabriela", Color.Magenta)
                        Cartao("Ryan Alves me detesta", Color.Blue)
                        Cartao("Sofrendo", Color.Black)
                    }
                }
            }
        }
    }
}

@Composable
fun Cartao(titulo: String, corTitulo: Color) {
    Column {
        Text(text = titulo, fontSize = 32.sp, color = Color(0xFFA72727))
        Text(text = "Gabriela")
        Row {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.LightGray
                )
            ) {
                Text(text = "s")
            }
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.LightGray
                )
            ){
                Text(text = "n")
            }
        }
    }
}