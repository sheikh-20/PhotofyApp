package com.application.photofy.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Diamond
import androidx.compose.material3.AssistChip
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.application.photofy.R

@Composable
fun HomeApp(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { HomeTopAppbar() }
    ) { paddingValues ->
        HomeScreen(modifier = modifier, bottomPadding = paddingValues)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun HomeTopAppbar(modifier: Modifier = Modifier) {
    TopAppBar(title = {
        Column(modifier = modifier.padding(8.dp), verticalArrangement = Arrangement.SpaceBetween) {
            Text(text = "Welcome back", style = MaterialTheme.typography.bodyMedium)

            Text(text = "Sheikh Mohideen",
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold
            )
        }
    },
        navigationIcon = {
            Image(painter = painterResource(id = R.drawable.doctor_strange),
                contentDescription = null,
                modifier = modifier
                    .padding(start = 16.dp)
                    .size(50.dp)
                    .clip(RoundedCornerShape(50)),
                contentScale = ContentScale.Crop)
        },
        actions = {
            AssistChip(
                modifier = modifier.padding(end = 16.dp),
                onClick = { /*TODO*/ },
                label = {
                    Row(verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                        Image(imageVector = Icons.Rounded.Diamond, contentDescription = null)
                        Text(text = "PRO")
                    }
                },
                shape = RoundedCornerShape(50),
            )
        },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Transparent))
}