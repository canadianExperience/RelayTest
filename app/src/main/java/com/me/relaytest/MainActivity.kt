package com.me.relaytest

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.me.relaytest.testcard.TestCard
import com.me.relaytest.ui.theme.RelayTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RelayTestTheme {
                RelayCard(modifier = Modifier, context = applicationContext)
            }
        }
    }
}

@Composable
fun RelayCard(
    modifier: Modifier,
    context: Context
){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(all = 16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TestCard(
            modifier = modifier
                .width(200.dp)
                .height(100.dp),
            background = Color.LightGray,
            onClick = {
                Toast.makeText(
                    context,
                    "Relay Card Clicked",
                    Toast.LENGTH_LONG
                ).show()
            }
        )
    }
}