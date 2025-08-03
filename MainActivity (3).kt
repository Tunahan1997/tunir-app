package com.tunir.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Greeting("Tunir")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Merhaba, $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting("Tunir")
}
