package com.example.pia12androiduppg2lars

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pia12androiduppg2lars.ui.theme.PIA12AndroidUppg2LarsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PIA12AndroidUppg2LarsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    XYlist()
                }
            }
        }
    }
}

@Composable
fun XYlist() {

    var xyitems = remember {
        mutableStateListOf<String>()
    }



    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier
            .background(Color(0, 150, 255))
            .fillMaxWidth()
            .height(100.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier.weight(1F))

            Button(onClick = {
                xyitems.add("X")
                Log.i("TEST", xyitems.toString())
            }) {
                Text("X")
            }

            Spacer(modifier = Modifier.weight(1F))

            Button(onClick = {
                xyitems.add("Y")
                Log.i("TEST", xyitems.toString())
            }) {
                Text("Y")
            }

            Spacer(modifier = Modifier.weight(1F))
        }



        LazyColumn(modifier = Modifier.weight(1F)) {
            items(xyitems) {xyitem ->
                Xyrow(xyitem)
            }


        }

        Button(onClick = {
            xyitems.clear()
        }) {
            Text("Reset")
        }

        Spacer(modifier = Modifier.height(40.dp))

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
    PIA12AndroidUppg2LarsTheme {
        //Greeting("Android")
        XYlist()
    }
}