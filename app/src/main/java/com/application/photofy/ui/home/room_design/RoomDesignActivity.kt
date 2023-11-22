package com.application.photofy.ui.home.room_design

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.application.photofy.ui.home.transform.TransformActivity
import com.application.photofy.ui.theme.PhotofyTheme

class RoomDesignActivity: ComponentActivity() {

    companion object {
        fun startActivity(activity: Activity?) {
            val intent = Intent(activity, RoomDesignActivity::class.java)
            activity?.startActivity(intent)
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhotofyTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RoomDesignApp()
                }
            }
        }
    }
}