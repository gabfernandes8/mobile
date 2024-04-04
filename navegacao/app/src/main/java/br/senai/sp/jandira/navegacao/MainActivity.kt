package br.senai.sp.jandira.navegacao

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.navegacao.screens.Home
import br.senai.sp.jandira.navegacao.screens.Login
import br.senai.sp.jandira.navegacao.ui.theme.NavegacaoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavegacaoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    // lembrar das telas que passou anteriormente
                    val controleNavegacao = rememberNavController()

                    // rota de navegação
                    NavHost(
                        navController = controleNavegacao,
                        startDestination = "login"
                    ) {
                        // cria a rota
                        composable(route = "login"){ Login(controleNavegacao) }
                        composable(route = "home"){ Home() }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavegacaoTheme {
        Greeting("Android")
    }
}