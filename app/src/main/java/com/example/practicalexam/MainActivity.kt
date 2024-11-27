package com.example.practicalexam

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicalexam.ui.theme.PracticalExamTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticalExamTheme  {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    EventEase(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun EventEase(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp), // Padding for the entire column
        verticalArrangement = Arrangement.Top, // Align children at the top
        horizontalAlignment = Alignment.CenterHorizontally // Center align children horizontally
    ) {
        // Row at the top
        Row(
            modifier = Modifier
                .fillMaxWidth(), // Fill the width of the column
            verticalAlignment = Alignment.CenterVertically // Align items in the center vertically
        ) {
            Image(
                painter = painterResource(R.drawable.baseline_arrow_back_24),
                contentDescription = null
            )
            Text(
                text = "EventEase",
                modifier = Modifier.padding(start = 10.dp)
            )
            Image(
                painter = painterResource(R.drawable.),
                contentDescription = null,
                modifier = Modifier.padding(start = 180.dp)
            )
        }
        Image(
            painter = painterResource(R.drawable.event),
            contentDescription = "Event Image",
            modifier = Modifier
                .padding(top = 20.dp)
                .fillMaxWidth()
        )
        Row {
            Text(
                text = "Tech Conference 2024",
                modifier = Modifier.te
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PracticalExamTheme  {
        EventEase()
            }
}