package com.babulmirdha.youtube_player

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import io.github.the_best_is_best.kyoutube.KYoutube

@Composable
fun YoutubePlayerScreen() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Text("YouTube Player", style = MaterialTheme.typography.h4)
        Spacer(Modifier.height(16.dp))
        
        Box(modifier = Modifier.fillMaxWidth().aspectRatio(16f / 9f)) {
//            YouTubePlayer(videoId = "MlQaPCZh_Mg") // Change videoId as needed
            KYoutube("MlQaPCZh_Mg")
        }

        Spacer(Modifier.height(16.dp))

        Box(
            modifier = Modifier.fillMaxWidth()
                .fillMaxHeight(.5f).clip(RoundedCornerShape(15.dp))
        ) {
            KYoutube("MlQaPCZh_Mx")
        }


    }



}