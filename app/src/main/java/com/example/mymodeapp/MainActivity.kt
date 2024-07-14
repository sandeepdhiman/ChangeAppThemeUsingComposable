package com.example.mymodeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.myapp.ui.theme.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            val context = LocalContext.current
            var isDarkTheme by remember { mutableStateOf( true) }

            MyAppTheme(isDarkTheme) {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.surface
                ){
                    Column(modifier=Modifier.fillMaxSize(),verticalArrangement= Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(text="Light Mode",modifier=Modifier.clickable{

                            isDarkTheme = !isDarkTheme
                        })

                        Spacer(modifier=Modifier.padding(0.dp,10.dp,0.dp,0.dp))
                        Text(text="Dark Mode",modifier=Modifier.clickable{

                            isDarkTheme = !isDarkTheme
                        })
                        Spacer(modifier=Modifier.padding(0.dp,10.dp,0.dp,0.dp))
                        Text(text="Default",modifier=Modifier.clickable{

                            isDarkTheme = !isDarkTheme
                        })
                    }
                }


            }

        }

}

}








