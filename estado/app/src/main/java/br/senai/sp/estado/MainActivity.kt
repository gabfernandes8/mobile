package br.senai.sp.estado

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.estado.ui.theme.EstadoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EstadoTheme {
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

    // val =  valor não muda
    // valor muda
    var nomeState = androidx.compose.runtime.remember {
        androidx.compose.runtime.mutableStateOf("")
    }

    var checkboxState = androidx.compose.runtime.remember {
        androidx.compose.runtime.mutableStateOf(false)
    }

    Column {
        OutlinedTextField(
            value = nomeState.value,
            onValueChange = {
                nomeState.value = it
            }
        )
        androidx.compose.material3.Text(text = nomeState.value)
        androidx.compose.foundation.layout.Row {
            androidx.compose.material3.Checkbox(
                checked = checkboxState.value,
                onCheckedChange = {
                    checkboxState.value = it
                }
            )
            androidx.compose.material3.Button(
                onClick = {
                    checkboxState.value = !checkboxState.value
                }
            ) {
                
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    EstadoTheme {
        Greeting()
    }
}