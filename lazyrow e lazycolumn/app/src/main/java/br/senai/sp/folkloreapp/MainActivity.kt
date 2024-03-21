package br.senai.sp.folkloreapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.folkloreapp.ui.theme.FolkloreAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FolkloreAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Image(
        painter = painterResource(id = R.drawable.ts_costas),
        contentDescription = "Background do app",
        contentScale = ContentScale.Crop
    )

    Surface (
        color = Color(0xff88000000)
    ){

        Column(modifier = Modifier
            .padding(16.dp)
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text(text = "Buscar músicas...")
                },
                shape = RoundedCornerShape(16.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedContainerColor = Color(0xffffffff),
                    unfocusedTrailingIconColor = Color(0xff292929),
                    unfocusedPlaceholderColor = Color(0xff292929),
                    unfocusedBorderColor = Color(0xFF292929),
                    focusedContainerColor = Color(0xffffffff),
                    focusedTrailingIconColor = Color(0xff292929),
                    focusedPlaceholderColor = Color(0xff292929),
                    focusedBorderColor = Color(0xff292929)
                ),
                trailingIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                       Icon(
                           imageVector = Icons.Default.Search,
                           contentDescription = "",

                       )

                    }
                }

            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "Músicas",
                fontWeight = FontWeight.Bold,
                color = Color(0xffffffff),
                fontSize = 18.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

//`           LazyRow {
//                items(20)
//        }

            LazyColumn{
                items(20){
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(180.dp)
                            .padding(
                                bottom = 8.dp
                            ),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0x33FFFFFF)
                        ),
                        border = BorderStroke(
                            width = 1.dp,
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color(0xff2A2638),
                                    Color(0xffB38361)

                                )
                            )
                        )
                    ) {
                        Row(modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Card(modifier = Modifier
                                .size(
                                    width = 90.dp,
                                    height = 90.dp
                                ),
                                border = BorderStroke(
                                    width = 1.dp,
                                    brush = Brush.linearGradient(
                                        listOf(
                                            Color(0xff2A2638),
                                            Color(0XFFB38361)
                                        )
                                    ),

                                ),
                                shape = CircleShape
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.ts_de_ladinho),
                                    contentDescription = "",
                                    contentScale = ContentScale.Crop
                                )
                            }
                            Column(modifier = Modifier
                                .padding(10.dp)) {
                                Row(modifier = Modifier
                                    .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.Center
                                ) {
                                    Text(
                                        text = "the 1",
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Center
                                    )
                                }

                                Text(
                                    text = "I'm doing good, I'm on some new shit\n" +
                                        "Been saying \"yes\" instead of \"no\"\n" +
                                        "I thought I saw you at the bus stop, I didn't though\n" +
                                        "I hit the ground running each night\n" +
                                        "I hit the Sunday matinée\n" +
                                        "You know the greatest films of all time were never made\n" +
                                        "I guess you never know, never know\n" +
                                        "And if you wanted me, you really should've showed\n" +
                                        "And if you never bleed, you're never gonna grow\n" +
                                        "And it's alright now\n" +
                                        "But we were something, don't you think so?\n" +
                                        "Roaring 20s, tossing pennies in the pool\n" +
                                        "And if my wishes came true\n" +
                                        "It would've been you\n" +
                                        "In my defense, I have none\n" +
                                        "For never leaving well enough alone\n" +
                                        "But it would've been fun\n" +
                                        "If you would've been the one\n" +
                                        "(Ooh)\n" +
                                        "I have this dream you're doing cool shit\n" +
                                        "Having adventures on your own\n" +
                                        "You meet some woman on the internet and take her home\n" +
                                        "We never painted by the numbers, baby\n" +
                                        "But we were making it count\n" +
                                        "You know the greatest loves of all time are over now\n" +
                                        "I guess you never know, never know\n" +
                                        "And it's another day waking up alone\n" +
                                        "But we were something, don't you think so?\n" +
                                        "Roaring 20s, tossing pennies in the pool\n" +
                                        "And if my wishes came true\n" +
                                        "It would've been you\n" +
                                        "In my defense, I have none\n" +
                                        "For never leaving well enough alone\n" +
                                        "But it would've been fun\n" +
                                        "If you would've been the one\n" +
                                        "I, I, I persist and resist the temptation to ask you\n" +
                                        "If one thing had been different\n" +
                                        "Would everything be different today?\n" +
                                        "We were something, don't you think so?\n" +
                                        "Rosé flowing with your chosen family\n" +
                                        "And it would've been sweet\n" +
                                        "If it could've been me\n" +
                                        "In my defense, I have none\n" +
                                        "For digging up the grave another time\n" +
                                        "But it would've been fun\n" +
                                        "If you would've been the one\n" +
                                        "(Ooh)",
                                    fontSize = 12.sp,
                                    lineHeight = 16.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            }
                        }
                    }
                }
            }

        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    FolkloreAppTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            Greeting()
        }
    }
}