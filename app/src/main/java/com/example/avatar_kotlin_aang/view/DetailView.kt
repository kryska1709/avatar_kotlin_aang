package com.example.avatar_kotlin_aang.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.avatar_kotlin_aang.ui.theme.Aqua22
import com.example.avatar_kotlin_aang.ui.theme.NeonBlue
import com.example.avatar_kotlin_aang.viewModel.PersonViewModel

@Composable
fun DetailView(
    navController: NavController,
    personViewModel: PersonViewModel,
) {

    Column (
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = ScrollState(1)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ){
        personViewModel.selectedPerson.value?.let {
            Image(
                painterResource(it.Image),
                contentDescription = null,
                modifier = Modifier
                    .border(
                        brush = Brush.linearGradient(
                            listOf(NeonBlue, Color.Magenta, Aqua22),
                            start = Offset.Zero,
                            end = Offset.Infinite,
                            tileMode = TileMode.Clamp
                        ),
                        width = 3.dp,
                        shape = RectangleShape
                    )
            )
            Text(
                it.Name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                it.Description,
                fontSize = 22.sp,
                fontWeight = FontWeight.Thin,
                modifier = Modifier.padding(18.dp,8.dp)
            )
        }
    }
}