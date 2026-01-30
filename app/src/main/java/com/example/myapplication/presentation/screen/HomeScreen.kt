package com.example.myapplication.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay

@Composable
fun HomeScreen(viewModel: HomeViewModel) {
    LaunchedEffect(Unit) {
        delay(100) // тоже не обязательно просто для примера
        viewModel.loadInfo()
    }
    Scaffold() { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            if (viewModel.currentUser != null) {
                Image(
                    painter = painterResource(viewModel.currentUser!!.avatar),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Text("current user: ${viewModel.currentUser!!.name}")
            }
            Spacer(Modifier.height(50.dp))
            Text(text = "Users top:")
            for (user in viewModel.usersTop) {
                Row() {
                    Image(
                        painter = painterResource(user.avatar),
                        contentDescription = null,
                        modifier = Modifier.size(25.dp)
                    )
                    Text(text = user.name)
                }
            }
        }
    }

}