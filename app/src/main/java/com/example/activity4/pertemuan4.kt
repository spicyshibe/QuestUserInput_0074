package com.example.activity4

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun act4(modifier: Modifier = Modifier) {
    var textNama by remember { mutableStateOf("")}
    var textAlamat by remember { mutableStateOf("")}


}