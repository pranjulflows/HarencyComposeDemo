package com.macamps.harencycomposedemo.ui.auth.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.macamps.harencycomposedemo.ui.auth.login.viewModel.LoginSharedViewModel
import com.macamps.harencycomposedemo.utils.ApiState

@Composable
fun showDialog(sharedViewModel: LoginSharedViewModel) {
    var showDialog by remember { mutableStateOf(false) }

    when (sharedViewModel.loginApiStateFlow.collectAsState().value) {
        ApiState.Loading -> {
            showDialog = true
        }
        ApiState.Empty -> {}
        else -> {
            showDialog = false
        }
    }

    if (showDialog) {
        Dialog(
            onDismissRequest = { showDialog = false },
            DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.White, shape = RoundedCornerShape(8.dp))
            ) {
                CircularProgressIndicator()
            }
        }
    }
}