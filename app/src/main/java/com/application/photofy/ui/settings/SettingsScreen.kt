package com.application.photofy.ui.settings

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Switch
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowForwardIos
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Apps
import androidx.compose.material.icons.rounded.DarkMode
import androidx.compose.material.icons.rounded.Facebook
import androidx.compose.material.icons.rounded.HelpCenter
import androidx.compose.material.icons.rounded.Language
import androidx.compose.material.icons.rounded.Logout
import androidx.compose.material.icons.rounded.Payment
import androidx.compose.material.icons.rounded.PrivacyTip
import androidx.compose.material.icons.rounded.Security
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.application.photofy.R
import com.application.photofy.ui.theme.PhotofyTheme

@Composable
fun SettingsScreen(modifier: Modifier = Modifier,  bottomPadding: PaddingValues = PaddingValues()) {
    Column(modifier = modifier
        .fillMaxSize()
        .padding(top = bottomPadding.calculateTopPadding(), start = 16.dp, end = 16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)) {

        Row {
            Image(painter = painterResource(id = R.drawable.doctor_strange),
                contentDescription = null,
                modifier = modifier
                    .size(50.dp)
                    .clip(RoundedCornerShape(50)),
                contentScale = ContentScale.Crop)

            Column(modifier = modifier.padding(8.dp), verticalArrangement = Arrangement.SpaceBetween) {
                Text(text = "Sheikh Mohideen",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.SemiBold
                )
                Text(text = "sheikhzs1032@gmail.com", style = MaterialTheme.typography.bodyMedium)
            }
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(text = "General", style = MaterialTheme.typography.bodySmall)
            Divider()
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Icon(imageVector = Icons.Rounded.AccountCircle, contentDescription = null)
            Text(text = "Personal Info",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold)

            Spacer(modifier = modifier.weight(1f))

            Icon(imageVector = Icons.Outlined.ArrowForwardIos, contentDescription = null)
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Icon(imageVector = Icons.Rounded.Payment, contentDescription = null)
            Text(text = "Payment Methods",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold)

            Spacer(modifier = modifier.weight(1f))

            Icon(imageVector = Icons.Outlined.ArrowForwardIos, contentDescription = null)
        }


        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Icon(imageVector = Icons.Rounded.Security, contentDescription = null)
            Text(text = "Security",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold)

            Spacer(modifier = modifier.weight(1f))

            Icon(imageVector = Icons.Outlined.ArrowForwardIos, contentDescription = null)
        }


        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Icon(imageVector = Icons.Rounded.Language, contentDescription = null)
            Text(text = "Language",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold)

            Spacer(modifier = modifier.weight(1f))

            Text(text = "English(US)",
                style = MaterialTheme.typography.bodyMedium)


            Icon(imageVector = Icons.Outlined.ArrowForwardIos, contentDescription = null)
        }


        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Icon(imageVector = Icons.Rounded.DarkMode, contentDescription = null)
            Text(text = "Dark Mode",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold)

            Spacer(modifier = modifier.weight(1f))

            Switch(checked = false, onCheckedChange = {  })
        }


        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Text(text = "About", style = MaterialTheme.typography.bodySmall)
            Divider()
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Icon(imageVector = Icons.Rounded.Facebook, contentDescription = null)
            Text(text = "Follow us on social media",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold)

            Spacer(modifier = modifier.weight(1f))

            Icon(imageVector = Icons.Outlined.ArrowForwardIos, contentDescription = null)
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Icon(imageVector = Icons.Rounded.HelpCenter, contentDescription = null)
            Text(text = "Help Center",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold)

            Spacer(modifier = modifier.weight(1f))

            Icon(imageVector = Icons.Outlined.ArrowForwardIos, contentDescription = null)
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Icon(imageVector = Icons.Rounded.PrivacyTip, contentDescription = null)
            Text(text = "Privacy Policy",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold)

            Spacer(modifier = modifier.weight(1f))

            Icon(imageVector = Icons.Outlined.ArrowForwardIos, contentDescription = null)
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Icon(imageVector = Icons.Rounded.Apps, contentDescription = null)
            Text(text = "About Photofy",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold)

            Spacer(modifier = modifier.weight(1f))

            Icon(imageVector = Icons.Outlined.ArrowForwardIos, contentDescription = null)
        }

        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Icon(imageVector = Icons.Rounded.Logout, contentDescription = null)
            Text(text = "Logout",
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.SemiBold)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SettingsLightThemePreview() {
    PhotofyTheme(darkTheme = false) {
        SettingsScreen()
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun SettingsDarkThemePreview() {
    PhotofyTheme(darkTheme = true) {
        SettingsScreen()
    }
}