package com.application.photofy.ui.home.cartoon_generator

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.application.photofy.ui.theme.PhotofyTheme

@Composable
fun CartoonGeneratorScreen(modifier: Modifier = Modifier, paddingValues: PaddingValues = PaddingValues()) {
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun CartoonGeneratorLightThemePreview() {
    PhotofyTheme(darkTheme = false) {
        CartoonGeneratorScreen()
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun CartoonGeneratorDarkThemePreview() {
    PhotofyTheme(darkTheme = true) {
        CartoonGeneratorScreen()
    }
}