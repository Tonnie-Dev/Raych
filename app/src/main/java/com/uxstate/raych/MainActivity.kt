package com.uxstate.raych

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.uxstate.raych.ui.theme.RaychTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RaychTheme {

                val factsAboutRay = listOf<String>(
                        "She is a Savage",
                        "She is Cute",
                        "She is beautiful",
                        "She is Smart",
                        "She Dances gracefully",
                        "She likes Jeep Wrangler",
                        "She does White Roses"
                )

var fact = ""
                Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                ) {







                    //Space
                    Spacer(modifier = Modifier.height(32.dp))




                    //Button

                    Button(onClick = {


                        fact = factsAboutRay.random()



                    }


                    ) {

                        Text(text = "Facts About Ray")

                    }




                }


            }
        }
    }
}


@Composable
fun FactAboutRachel(fact: String) {
    Text(text = fact)
}

