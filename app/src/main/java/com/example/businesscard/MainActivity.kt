package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinesscardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinesscardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFF073042)
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Section Logo, Nom et Fonction
        LogoSection()
        
        Spacer(modifier = Modifier.height(200.dp))
        
        // Section Coordonnées
        ContactSection()
    }
}

@Composable
fun LogoSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        // Logo Android
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "Logo Android",
            modifier = Modifier.size(120.dp)
        )
        
        Spacer(modifier = Modifier.height(8.dp))
        
        // Nom
        Text(
            text = "Jennifer Doe",
            fontSize = 40.sp,
            fontWeight = FontWeight.Light,
            color = Color.White,
            textAlign = TextAlign.Center
        )
        
        // Fonction
        Text(
            text = "Développeuse Android",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3ddc84),
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Composable
fun ContactSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp)
    ) {
        ContactItem(
            icon = Icons.Default.Phone,
            text = "+33 6 12 34 56 78",
            contentDescription = "Numéro de téléphone"
        )
        
        ContactItem(
            icon = Icons.Default.Share,
            text = "@AndroidDev",
            contentDescription = "Réseau social"
        )
        
        ContactItem(
            icon = Icons.Default.Email,
            text = "jennifer.doe@android.com",
            contentDescription = "Adresse email"
        )
    }
}

@Composable
fun ContactItem(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    text: String,
    contentDescription: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription,
            tint = Color(0xFF3ddc84),
            modifier = Modifier.size(24.dp)
        )
        
        Spacer(modifier = Modifier.width(24.dp))
        
        Text(
            text = text,
            fontSize = 14.sp,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinesscardTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFF073042)
        ) {
            BusinessCard()
        }
    }
}