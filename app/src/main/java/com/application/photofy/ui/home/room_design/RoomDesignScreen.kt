package com.application.photofy.ui.home.room_design

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.application.photofy.ui.theme.PhotofyTheme

@Composable
fun RoomDesignScreen(modifier: Modifier = Modifier, paddingValues: PaddingValues = PaddingValues()) {

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun RoomDesignLightThemePreview() {
    PhotofyTheme(darkTheme = false) {
        RoomDesignScreen()
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun RoomDesignDarkThemePreview() {
    PhotofyTheme(darkTheme = true) {
        RoomDesignScreen()
    }
}