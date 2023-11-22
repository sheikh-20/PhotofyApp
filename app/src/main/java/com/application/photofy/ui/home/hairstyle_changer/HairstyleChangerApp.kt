package com.application.photofy.ui.home.hairstyle_changer

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

@Composable
fun HairstyleChangerApp(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = {
            HairstyleChangerTopAppbar()
        }
    ) { paddingValues ->
        HairstyleChangerScreen(modifier = modifier, paddingValues = paddingValues)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun HairstyleChangerTopAppbar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
            Text(text = "AI Hairstyle Changer",
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = modifier
                    .fillMaxWidth()
                    .wrapContentWidth(align = Alignment.CenterHorizontally))
        },
        navigationIcon = { IconButton(onClick = { }) {
            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = null)
        } },
    )
}