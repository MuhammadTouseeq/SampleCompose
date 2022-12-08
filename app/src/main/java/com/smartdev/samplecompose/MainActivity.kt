package com.smartdev.samplecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.smartdev.samplecompose.ui.theme.SampleComposeTheme
import org.intellij.lang.annotations.JdkConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun ColumnView() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(all = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Data 1")
        Text(text = "Data 2")
        Text(text = "Data 3")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ColumnView()
}