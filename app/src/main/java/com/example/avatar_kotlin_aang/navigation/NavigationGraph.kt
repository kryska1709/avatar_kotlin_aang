package com.example.avatar_kotlin_aang.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.avatar_kotlin_aang.screen.Screen
import com.example.avatar_kotlin_aang.view.DetailView
import com.example.avatar_kotlin_aang.view.HomeView

@Composable
fun NavigationGraph(
    navHostController: NavHostController
){
    NavHost(
        navController = navHostController,
        startDestination = Screen.HomeScreen.route
    ){
        composable(route = Screen.HomeScreen.route){
        HomeView(navHostController)
        }

        composable(route = Screen.DetailScreen.route){
        DetailView(navHostController)
        }
    }
}