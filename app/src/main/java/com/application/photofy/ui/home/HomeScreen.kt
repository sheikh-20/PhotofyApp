package com.application.photofy.ui.home

import android.app.Activity
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Diamond
import androidx.compose.material.icons.rounded.Diamond
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.application.photofy.R
import com.application.photofy.ui.home.anime_generator.AnimeGeneratorActivity
import com.application.photofy.ui.home.avatar_generator.AvatarGeneratorActivity
import com.application.photofy.ui.home.bg_changer.BgChangerActivity
import com.application.photofy.ui.home.bg_remover.BgRemoverActivity
import com.application.photofy.ui.home.cartoon_generator.CartoonActivity
import com.application.photofy.ui.home.change_facial.ChangeFacialActivity
import com.application.photofy.ui.home.edit_photo.EditPhotoActivity
import com.application.photofy.ui.home.hairstyle_changer.HairstyleChangerActivity
import com.application.photofy.ui.home.magic_eraser.MagicEraserActivity
import com.application.photofy.ui.home.photo_enhancer.PhotoEnhancerActivity
import com.application.photofy.ui.home.room_design.RoomDesignActivity
import com.application.photofy.ui.home.scene_generator.SceneGeneratorActivity
import com.application.photofy.ui.home.transform.TransformActivity
import com.application.photofy.ui.theme.PhotofyTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier, bottomPadding: PaddingValues = PaddingValues()) {
    
    val context = LocalContext.current

    val cardList = listOf<HomeCardData>(
        HomeCardData(text = "AI Avatar Generator", onClick = {
            AvatarGeneratorActivity.startActivity(context as Activity)
        }),
        HomeCardData(text = "AI Scene Generator", onClick = {
            SceneGeneratorActivity.startActivity(context as Activity)
        }),
        HomeCardData(text = "AI Anime Generator", onClick = {
            AnimeGeneratorActivity.startActivity(context as Activity)
        }),
        HomeCardData(text = "AI Cartoonizer", onClick = {
            CartoonActivity.startActivity(context as Activity)
        }),
        HomeCardData(text = "AI Transform", onClick = {
            TransformActivity.startActivity(context as Activity)
        }),
        HomeCardData(text = "AI Room Design", onClick = {
            RoomDesignActivity.startActivity(context as Activity)
        }),
        HomeCardData(text = "AI Photo Enhancer", onClick = {
            PhotoEnhancerActivity.startActivity(context as Activity)
        }),
        HomeCardData(text = "AI Magic Eraser", onClick = {
            MagicEraserActivity.startActivity(context as Activity)
        }),
        HomeCardData(text = "AI Change Facial Expressions", onClick = {
            ChangeFacialActivity.startActivity(context as Activity)
        }),
        HomeCardData(text = "AI Hairstyle Changer", onClick = {
            HairstyleChangerActivity.startActivity(context as Activity)
        }),
        HomeCardData(text = "AI Background Remover", onClick = {
            BgRemoverActivity.startActivity(context as Activity)
        }),
        HomeCardData(text = "AI Background Changer", onClick = {
            BgChangerActivity.startActivity(context as Activity)
        }),
        HomeCardData(text = "AI Sky Background Replacer", onClick = {

        }),
        HomeCardData(text = "AI Photo Colorizer", onClick = {  })
    )

    Column(modifier = modifier
        .fillMaxSize()
        .padding(top = bottomPadding.calculateTopPadding()),
        verticalArrangement = Arrangement.spacedBy(16.dp)) {

        Card(modifier = modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp), onClick = {  }) {
            Column(modifier = modifier
                .fillMaxWidth()
                .padding(16.dp), verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(text = "Edit Photo", style = MaterialTheme.typography.titleLarge)
                Text(text = "Unleash your creativity with \nthe AI multi-editing toolbox!",
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Start,
                    maxLines = 2,)
                Button(onClick = { EditPhotoActivity.startActivity(context as Activity) }) {
                    Text(text = "Select Photo")
                }
            }
        }

        LazyVerticalGrid(
            modifier = modifier.fillMaxWidth(),
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(cardList) {
                HomeCard(homeCardData = it)
            }
        }
    }
}

data class HomeCardData(val text: String = "", val onClick: () -> Unit = {})

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
private fun HomeCard(modifier: Modifier = Modifier, homeCardData: HomeCardData = HomeCardData()) {
    Card(modifier = modifier
        .fillMaxWidth()
        .size(180.dp),
        onClick = homeCardData.onClick) {

        Column(modifier = modifier.fillMaxSize().wrapContentSize(align = Alignment.BottomStart)) {
            Text(modifier = modifier.padding(8.dp), text = homeCardData.text)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeScreenLightThemePreview() {
    PhotofyTheme(darkTheme = false) {
        HomeScreen()
    }
}

@Preview(showBackground = true, showSystemUi = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun HomeScreenDarkThemePreview() {
    PhotofyTheme(darkTheme = true) {
        HomeScreen()
    }
}