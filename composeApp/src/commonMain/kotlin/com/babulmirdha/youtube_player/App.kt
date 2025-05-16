package com.babulmirdha.youtube_player

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import youtubeplayerkmpapp.composeapp.generated.resources.Res
import youtubeplayerkmpapp.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {

        val videoIds = listOf("MlQaPCZh_Mg", "IiRKzFqHz6o", "yxqRPgl_uZI", "ORfwh-EBKVw","AzMimnWC4rA","sMwKrxZKUSc")
        YouTubePlayerList(videoIds)

        YouTubePlayerList(videoIds)
    }
}