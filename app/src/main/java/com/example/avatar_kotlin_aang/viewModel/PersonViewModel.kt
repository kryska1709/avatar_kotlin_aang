package com.example.avatar_kotlin_aang.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.avatar_kotlin_aang.model.Homes

class PersonViewModel: ViewModel() {
    val selectedPerson = mutableStateOf<Homes?>(null)
}