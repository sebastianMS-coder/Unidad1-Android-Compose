package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.Icon
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // GreetingImage(message = "Happy Birthday", from = "De: Sebastian")
                    // TaskCompletedScreen()
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(text = message, fontSize = 90.sp, lineHeight = 116.sp, textAlign = TextAlign.Center)
        Text(text = from, fontSize = 36.sp, modifier = Modifier.padding(16.dp).align(Alignment.End))
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier) {
        Image(painter = image, contentDescription = null, contentScale = ContentScale.Crop, alpha = 0.5F)
        GreetingText(message = message, from = from, modifier = Modifier.fillMaxSize())
    }
}

@Composable
fun TaskCompletedScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(text = "Nice work!", fontSize = 16.sp)
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFD2E8D4)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center
        ) {
            Icon(imageVector = Icons.Rounded.AccountCircle, contentDescription = null, modifier = Modifier.size(100.dp), tint = Color(0xFF073042))
            Text(text = "Sebastian Mendoza", fontSize = 40.sp)
            Text(text = "Systems Engineering", color = Color(0xFF006D3B), fontWeight = FontWeight.Bold)
        }
        Column(modifier = Modifier.padding(bottom = 32.dp)) {
            ContactRow(icon = Icons.Rounded.Phone, text = "+51 123 456 789")
            ContactRow(icon = Icons.Rounded.Share, text = "@SebastianDev")
            ContactRow(icon = Icons.Rounded.Email, text = "zmamanir@unmsm.edu.pe")
        }
    }
}

@Composable
fun ContactRow(icon: androidx.compose.ui.graphics.vector.ImageVector, text: String) {
    Row(modifier = Modifier.padding(8.dp)) {
        Icon(imageVector = icon, contentDescription = null, tint = Color(0xFF006D3B))
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = text, color = Color(0xFF073042))
    }
}
