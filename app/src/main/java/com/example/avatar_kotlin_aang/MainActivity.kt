package com.example.avatar_kotlin_aang

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.avatar_kotlin_aang.navigation.NavigationGraph
import com.example.avatar_kotlin_aang.ui.theme.Avatar_kotlin_aangTheme
import com.example.avatar_kotlin_aang.viewModel.PersonViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Avatar_kotlin_aangTheme {
                val navController = rememberNavController()
                val personViewModel:PersonViewModel = viewModel()
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Box(
                    modifier = Modifier
                        .padding(innerPadding)
                        .background(color = Color.Black)
                ){
                    NavigationGraph(
                        navHostController = navController,
                        personViewModel = personViewModel)
                    }
                }
            }
        }
    }
}

