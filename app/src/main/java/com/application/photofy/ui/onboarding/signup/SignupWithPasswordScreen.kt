package com.application.photofy.ui.onboarding.signup

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.application.photofy.R
import com.application.photofy.ui.onboarding.component.EmailComponent
import com.application.photofy.ui.onboarding.component.PasswordComponent
import com.application.photofy.ui.onboarding.component.SocialLoginComponent
import com.application.photofy.ui.theme.PhotofyTheme


@Composable
fun SignupWithPasswordScreen(modifier: Modifier = Modifier, onSignupClick: () -> Unit = { }) {

    val focusManager = LocalFocusManager.current

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(modifier = modifier
        .fillMaxSize()
        .padding(top = 16.dp, bottom = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween) {

        Text(
            text = "Hello there",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Start,
            modifier = modifier.fillMaxWidth().padding(horizontal = 16.dp)
        )

        Text(
            text = "Please enter your email & password to create an account.",
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Start,
            modifier = modifier.fillMaxWidth().padding(horizontal = 16.dp)
        )

        Column(modifier = modifier.padding(horizontal = 16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {

            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text(text = "Email")

                EmailComponent(
                    email = email,
                    onEmailUpdate = { email = it },
                    focusManager = focusManager)
            }

            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(text = "Password")

                PasswordComponent(
                    password = password,
                    onPasswordUpdate = { password = it },
                    focusManager = focusManager
                )
            }

            Row(modifier = modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Start) {
                Checkbox(checked = false, onCheckedChange = {})
                Text(text = "I agree to Photofy Terms and Privacy Policy.", style = MaterialTheme.typography.labelLarge)
            }
        }

        Divider(modifier = modifier.fillMaxWidth())

        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Forgot the password?", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.titleMedium)
        }

        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = "Already have an account?")
            TextButton(onClick = {    }) {
                Text(text = "Sign In", fontWeight = FontWeight.Bold, style = MaterialTheme.typography.titleMedium)
            }
        }

        Row(modifier = modifier
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.CenterHorizontally).padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            Divider(modifier = modifier.weight(1f), color = Color.LightGray)
            Text(text = "or continue with")
            Divider(modifier = modifier.weight(1f), color = Color.LightGray)
        }

        Row(modifier = modifier
            .fillMaxWidth()
            .wrapContentWidth(align = Alignment.CenterHorizontally),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            SocialLoginComponent(
                icon = R.drawable.ic_facebook,
                onClick = {   })

            SocialLoginComponent(
                icon = R.drawable.ic_google,
                onClick = {   })

            SocialLoginComponent(
                icon = R.drawable.ic_github,
                onClick = {   })
        }

        Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {

            Divider(modifier = modifier.fillMaxWidth())

            Button(onClick = onSignupClick,
                modifier = modifier
                    .shadow(
                        elevation = 4.dp,
                        ambientColor = MaterialTheme.colorScheme.outlineVariant,
                        spotColor = MaterialTheme.colorScheme.outlineVariant,
                        shape = RoundedCornerShape(50)
                    )
                    .fillMaxWidth().requiredHeight(50.dp).padding(horizontal = 16.dp),
                colors = ButtonDefaults.filledTonalButtonColors(containerColor = Color.Red)) {

                Text(text = stringResource(id = R.string.sign_up), color = colorResource(id = R.color.white), modifier = modifier.padding(4.dp))
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SignupWithPasswordLightThemePreview() {
    PhotofyTheme(darkTheme = false) {
        SignupWithPasswordScreen()
    }
}


@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun SignupWithPasswordDarkThemePreview() {
    PhotofyTheme(darkTheme = true) {
        SignupWithPasswordScreen()
    }
}