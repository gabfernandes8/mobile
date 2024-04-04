package br.senai.sp.jandira.navegacao.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun Login(controleNavegacao: NavHostController) {

    var emailState = remember {
        mutableStateOf("")
    }

    var senhaState = remember {
        mutableStateOf("")
    }

    var msgErroState = remember {
        mutableStateOf("")
    }

    Surface(modifier = Modifier
        .fillMaxSize(),
        color = Color(0xFF6C7FE7)
    ) {

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                // deixar o texto clicável
                modifier = Modifier
                .clickable {
                           controleNavegacao.navigate("home")
                },
                text = "Login",
                fontSize = 48.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(64.dp))

            OutlinedTextField(
                value = emailState.value,
                onValueChange = {
                                emailState.value = it
                },
                label = {
                    Text(text = "E-mail", color = Color.White)
                },
                maxLines = 1
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = senhaState.value,
                onValueChange = {
                                senhaState.value = it
                },
                label = {
                    Text(text = "Senha", color = Color.White)
                },
                maxLines = 1
            )
            
            Text(
                text = msgErroState.value,
                color = Color.Red,
                fontWeight = FontWeight.ExtraBold
            )

            Spacer(modifier = Modifier.height(32.dp))

            Button(onClick = {
                if (emailState.value == "aluno" && senhaState.value == "1234"){

                    msgErroState.value = ""

                    // seleciona a rota se as informacoes do if estiver certo
                    controleNavegacao.navigate("home")

                } else {
                    msgErroState.value = "Usuário ou senha incorretos!"
                }
            }) {
                Text(text = "Entrar")
            }
        }

    }

}

@Preview
@Composable
fun LoginPreview() {

    //Login(controleNavegacao)

}