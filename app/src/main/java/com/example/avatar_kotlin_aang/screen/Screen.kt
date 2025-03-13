package com.example.avatar_kotlin_aang.screen

sealed class Screen(val route:String) {
    data object HomeScreen: Screen("home_screen")

    data object DetailScreen: Screen("detail_screen")
}