package br.senai.sp.jandira.contatos.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Cadastro() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "voltar"
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(text = "Novo Contato")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF0D3FA2),
                    titleContentColor = Color.White
                )
            )
        },
        content = {
            Surface(
                modifier = Modifier
                    .fillMaxSize()
                    .padding((it))
            ) {
                Column(
                    modifier = Modifier
                        .padding(24.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .size(150.dp),
                        contentAlignment = Alignment.BottomEnd
                    ) {
                        Card(
                            modifier = Modifier
                                .fillMaxSize(),
                            shape = CircleShape

                        ) {
                            Surface(
                                modifier = Modifier
                                    .fillMaxSize(),
                                shape = CircleShape,
                                border = BorderStroke(width = 1.dp, color = Color.LightGray)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Person,
                                    contentDescription = "pessoa",
                                    tint = Color.LightGray
                                )
                            }
                        }
                        Card(
                            modifier = Modifier
                                .size(
                                    40.dp
                                ),
                            shape = CircleShape,
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0xFF0D3FA2),
                                contentColor = Color.White
                            )

                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    imageVector = Icons.Default.AddAPhoto,
                                    contentDescription = "adicionar foto",
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(32.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth(),
                        label = {
                            Text(text = "Nome do contato")
                        },
                        shape = RoundedCornerShape(12.dp),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Person,
                                contentDescription = "",
                                tint = Color(0xFF0D3FA2)
                            )
                        },
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth(),
                        label = {
                            Text(text = "Email")
                        },
                        shape = RoundedCornerShape(12.dp),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = "",
                                tint = Color(0xFF0D3FA2)
                            )
                        },
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth(),
                        label = {
                            Text(text = "Telefone")
                        },
                        shape = RoundedCornerShape(12.dp),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.Phone,
                                contentDescription = "",
                                tint = Color(0xFF0D3FA2)
                            )
                        },
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier
                            .fillMaxWidth(),
                        label = {
                            Text(text = "Data de nascimento")
                        },
                        shape = RoundedCornerShape(12.dp),
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Default.CalendarMonth,
                                contentDescription = "",
                                tint = Color(0xFF0D3FA2)
                            )
                        },
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Checkbox(
                            checked = true,
                            onCheckedChange = {},
                            colors = CheckboxDefaults.colors(
                                checkmarkColor = Color.White,
                                checkedColor = Color(0xFF0D3FA2)
                            )
                        )
                        Text(text = "Amigo")
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(56.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF0D3FA2)
                        ),
                        shape = RoundedCornerShape(8.dp)
                    ) {
                        Text(
                            text = "Salvar contato",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    )
}

@Preview(showSystemUi = true)
@Composable
fun CadastroPreview() {
    Cadastro()
}