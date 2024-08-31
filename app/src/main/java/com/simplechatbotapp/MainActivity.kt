package com.simplechatbotapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.simplechatbotapp.ui.theme.SimpleChatbotAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val chatViewModel=ViewModelProvider(this)[ChatViewModel::class.java]
        setContent {
            SimpleChatbotAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding->
                    ChatPage(modifier = Modifier.padding(innerPadding),chatViewModel)
                }



                }
            }
        }
    }

