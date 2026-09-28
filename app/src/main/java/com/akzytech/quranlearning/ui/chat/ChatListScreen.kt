package com.akzytech.quranlearning

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.akzytech.quranlearning.ui.auth.AuthScreen

@Composable
fun AppRoot() {
    var isAuthenticated by remember { mutableStateOf(false) }

    if (isAuthenticated) {
        QuranLearningApp()
    } else {
        AuthScreen(
            onLoginSuccess = { isAuthenticated = true }
        )
    }
}

