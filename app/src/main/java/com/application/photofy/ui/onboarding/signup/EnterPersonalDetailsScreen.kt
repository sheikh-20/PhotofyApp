package com.application.photofy.ui.onboarding.signup

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.rounded.ArrowDropDown
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.application.photofy.ui.theme.PhotofyTheme
import kotlinx.coroutines.launch

@Composable
fun EnterPersonalDetailsScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .padding(top = 16.dp, bottom = 32.dp)
        .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween) {

        Text(
            text = "Enter personal info",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Start,
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Text(
            text = "Please enter your profile. Don't worry, only you can see your personal data. No one else will be able to see it. Or you can skip it for now",
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Start,
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        Image(imageVector = Icons.Outlined.AccountCircle,
            contentDescription = null,
            modifier = modifier.size(200.dp))

        Column(modifier = modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp)) {

            Column(modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)) {

                Text(text = "Full Name", fontWeight = FontWeight.SemiBold, style = MaterialTheme.typography.titleMedium)

                OutlinedTextField(
                    value = "",
                    onValueChange = { },
                    label = { Text(text = "Full Name") },
                    modifier = modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(30),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Next,
                        keyboardType = KeyboardType.Text
                    ),
                    keyboardActions = KeyboardActions(onNext = { })
                )

            }

            Column(modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)) {

                Text(
                    text = "Nick Name",
                    fontWeight = FontWeight.SemiBold,
                    style = MaterialTheme.typography.titleMedium
                )

                OutlinedTextField(
                    value = "",
                    onValueChange = { },
                    label = { Text(text = "Nick Name") },
                    modifier = modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(30),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Next,
                        keyboardType = KeyboardType.Text
                    ),
                    keyboardActions = KeyboardActions(onNext = {  })
                )
            }

            Column(modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)) {

                Text(
                    text = "Email",
                    fontWeight = FontWeight.SemiBold,
                    style = MaterialTheme.typography.titleMedium
                )

                OutlinedTextField(
                    value = "",
                    onValueChange = {  },
                    label = { Text(text = "Email") },
                    trailingIcon = { Icon(imageVector = Icons.Rounded.Email, contentDescription = null) },
                    modifier = modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(30),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Next,
                        keyboardType = KeyboardType.Email
                    ),
                    keyboardActions = KeyboardActions(onNext = { })
                )
            }

            Column(modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)) {

                Text(
                    text = "Phone Number",
                    fontWeight = FontWeight.SemiBold,
                    style = MaterialTheme.typography.titleMedium
                )

                OutlinedTextField(
                    value = "",
                    onValueChange = {  },
                    label = { Text(text = "Phone Number") },
                    modifier = modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(30),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Next,
                        keyboardType = KeyboardType.Phone
                    ),
                    keyboardActions = KeyboardActions(onNext = {  })
                )
            }

            Column(modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)) {

                Text(
                    text = "Gender",
                    fontWeight = FontWeight.SemiBold,
                    style = MaterialTheme.typography.titleMedium
                )


                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text(text = "Gender") },
                    trailingIcon = { Icon(
                        imageVector = Icons.Rounded.ArrowDropDown,
                        contentDescription = null
                    ) },
                    modifier = modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(30),
                    keyboardOptions = KeyboardOptions.Default.copy(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Text
                    ),
                    keyboardActions = KeyboardActions(onDone = {  })
                )
            }

        }

        Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {

            Divider(modifier = modifier.fillMaxWidth())

            Row(modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp)) {

                OutlinedButton(onClick = {  }, modifier = modifier
                    .weight(1f)
                    .requiredHeight(50.dp)) {
                    Text(text = "Skip")
                }

                Button(
                    onClick = {    },
                    modifier = modifier
                        .weight(1f)
                        .requiredHeight(50.dp)) {

                        Text(text = "Continue")

                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun EnterPersonalDetailsLightThemePreview() {
    PhotofyTheme(darkTheme = false) {
        EnterPersonalDetailsScreen()
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun EnterPersonalDetailsDarkThemePreview() {
    PhotofyTheme(darkTheme = true) {
        EnterPersonalDetailsScreen()
    }
}