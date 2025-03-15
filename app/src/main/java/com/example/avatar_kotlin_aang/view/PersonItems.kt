package com.example.avatar_kotlin_aang.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.avatar_kotlin_aang.model.Homes
import com.example.avatar_kotlin_aang.screen.Screen
import com.example.avatar_kotlin_aang.viewModel.PersonViewModel

@Composable
fun PersonItems(
    homes: Homes,
    navController: NavController,
    personViewModel: PersonViewModel
) {
    Column(modifier = Modifier.clickable {personViewModel.selectedPerson.value = homes
        navController.navigate(Screen.DetailScreen.route) }){
        Text(
            homes.Name,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}