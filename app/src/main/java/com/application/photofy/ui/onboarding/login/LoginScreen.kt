package com.application.photofy.ui.onboarding.login

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.application.photofy.R
import com.application.photofy.ui.onboarding.component.LoginComponent
import com.application.photofy.ui.theme.PhotofyTheme

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween) {

        Icon(painter = painterResource(id = R.drawable.ic_movie),
            contentDescription = null,
            modifier = modifier.size(200.dp))

       Column(verticalArrangement = Arrangement.spacedBy(16.dp),
           horizontalAlignment = Alignment.CenterHorizontally) {
           Text(text = stringResource(id = R.string.app_name),
               style = MaterialTheme.typography.headlineLarge,
               fontWeight = FontWeight.SemiBold,
               textAlign = TextAlign.Center)

           Text(text = "Welcome, Let's dive into your account!",
               style = MaterialTheme.typography.bodyLarge,
               textAlign = TextAlign.Center)
       }

        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            LoginComponent(icon = R.drawable.ic_google, text = R.string.continue_with_google) {

            }
            LoginComponent(icon = R.drawable.ic_facebook, text = R.string.continue_with_facebook) {

            }
            LoginComponent(icon = R.drawable.ic_github, text = R.string.continue_with_github) {

            }
        }

        Button(onClick = { }, modifier = modifier.fillMaxWidth()) {
            Text(text = "Sign In With Password")
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = stringResource(R.string.don_t_have_an_account))
            TextButton(onClick = {  }) {
                Text(text = stringResource(R.string.sign_up),
                    color = MaterialTheme.colorScheme.primary,
                    fontWeight = FontWeight.Bold)
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun LoginScreenLightThemePreview() {
    PhotofyTheme(darkTheme = false) {
        LoginScreen()
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun LoginScreenDarkThemePreview() {
    PhotofyTheme(darkTheme = true) {
        LoginScreen()
    }
}