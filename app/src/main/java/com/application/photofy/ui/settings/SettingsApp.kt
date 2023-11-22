package com.application.photofy.ui.settings

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SettingsApp(modifier: Modifier = Modifier) {
    Scaffold(topBar = { SettingsTopAppbar() }) { paddingValues ->
        SettingsScreen(modifier = modifier, bottomPadding = paddingValues)
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun SettingsTopAppbar() {
    TopAppBar(
        title = { Text(text = "Settings") },
        navigationIcon = { Icon(imageVector = Icons.Rounded.ArrowBack, contentDescription = null) },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Transparent)
        )
}