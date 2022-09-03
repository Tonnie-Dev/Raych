package com.uxstate.raych

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.uxstate.raych.ui.theme.RaychTheme
import timber.log.Timber

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Timber.plant(Timber.DebugTree())
        setContent {
            RaychTheme {

                var fact by remember {
                    mutableStateOf("")
                }
                val factsAboutRay = listOf<String>(
                        "She is a Savage",
                        "She is Cute",
                        "She is beautiful",
                        "She is Smart",
                        "She Dances gracefully",
                        "She likes Jeep Wrangler",
                        "She does White Roses"
                )


                Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                ) {




                    Text(text = fact)


                    //Space
                    Spacer(modifier = Modifier.height(32.dp))




                    //Button

                    Button(onClick = {


                        fact = factsAboutRay.random()

                        Timber.i("Button clicked - value is $fact")


                    }


                    ) {

                        Text(text = "Facts About Ray")

                    }




                }


            }
        }
    }
}



