package com.application.photofy.ui.onboarding

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.application.photofy.ui.onboarding.login.LoginScreen
import com.application.photofy.ui.onboarding.login.LoginWithPasswordScreen
import com.application.photofy.ui.onboarding.reset.CodeVerificationScreen
import com.application.photofy.ui.onboarding.reset.CreateNewPasswordScreen
import com.application.photofy.ui.onboarding.reset.PasswordResetScreen
import com.application.photofy.ui.onboarding.signup.EnterPersonalDetailsScreen
import com.application.photofy.ui.onboarding.signup.SignupWithPasswordScreen

@Composable
fun OnboardingApp(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController()) {

    Scaffold(
        topBar = {
            OnboardingTopAppbar()
        }
    ) { paddingValues ->
        NavHost(modifier = modifier.padding(paddingValues), navController = navController, startDestination = OnboardingScreen.Start.name) {

            composable(route = OnboardingScreen.Start.name) {
                OnboardingScreen(modifier = modifier) {
                    navController.navigate(OnboardingScreen.Login.name)
                }
            }

            composable(route = OnboardingScreen.Login.name) {
                LoginScreen(
                    onSignInClick = {
                        navController.navigate(OnboardingScreen.LoginWithPassword.name)
                    },
                    onSignUpClick = {
                        navController.navigate(OnboardingScreen.SignupWithPassword.name)
                    }
                )
            }

            composable(route = OnboardingScreen.LoginWithPassword.name) {
                LoginWithPasswordScreen(
                    onResetPasswordClick = {
                        navController.navigate(OnboardingScreen.ResetPassword.name)
                    }
                )
            }

            composable(route = OnboardingScreen.SignupWithPassword.name) {
                SignupWithPasswordScreen(
                    onSignupClick = {
                        navController.navigate(OnboardingScreen.EnterPersoanlDetails.name)
                    }
                )
            }

            composable(route = OnboardingScreen.EnterPersoanlDetails.name) {
                EnterPersonalDetailsScreen()
            }

            composable(route = OnboardingScreen.ResetPassword.name) {
                PasswordResetScreen(
                    onContinueClick = {
                        navController.navigate(OnboardingScreen.CodeVerification.name)
                    }
                )
            }

            composable(route = OnboardingScreen.CodeVerification.name) {
                CodeVerificationScreen(
                    onContinueClick = {
                        navController.navigate(OnboardingScreen.CreateNewPassword.name)
                    }
                )
            }

            composable(route = OnboardingScreen.CreateNewPassword.name) {
                CreateNewPasswordScreen(
                    onContinueClick = {

                    }
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun OnboardingTopAppbar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {  },
        navigationIcon = { IconButton(onClick = { }) {
            Icon(imageVector = Icons.Outlined.ArrowBack, contentDescription = null)
        } },
        colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Transparent)
    )
}

enum class OnboardingScreen {
    Start, Login, LoginWithPassword,
    SignupWithPassword, EnterPersoanlDetails,
    ResetPassword, CodeVerification, CreateNewPassword,

}