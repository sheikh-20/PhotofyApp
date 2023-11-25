package com.application.photofy.ui.onboarding

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.application.photofy.ui.onboarding.login.LoginScreen
import com.application.photofy.ui.onboarding.login.LoginWithPasswordScreen
import com.application.photofy.ui.onboarding.signup.SignupWithPasswordScreen

@Composable
fun OnboardingApp(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController()) {

    Scaffold { paddingValues ->
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
                LoginWithPasswordScreen()
            }

            composable(route = OnboardingScreen.SignupWithPassword.name) {
                SignupWithPasswordScreen()
            }
        }
    }
}

enum class OnboardingScreen {
    Start, Login, LoginWithPassword, SignupWithPassword
}