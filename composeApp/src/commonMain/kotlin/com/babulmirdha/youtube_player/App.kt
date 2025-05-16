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

        val videoIds = listOf(
            "BKoTLf_D4xo",
            "VUU56K2UB4E",
            "dJPw1XmKA7Q",
            "Mf2bHdpX4-s",
            "qQyMRL7PhiY",
            "0n8vfuwCeyc",
            "A7fZp9dwELo",
            "NWkSRKj2JSI",
            "vszkR6Dg9Lc",
            "JUtes-k-VX4",
            "qO3v3F31Vow",
            "Tv4pkivGvdU",
            "Jds2CU0_N_k",
            "bw1piBAOG9s",
            "X_hr0BNvDwM",
            "j5l5nfvP6Dg",
            "KxlUFKPCxeg",
            "WMYV9aekK4A",
            "rA88gvRoVfg",
            "5mvy3wCfDvo",
            "TLFG1_jFQ_Y",
            "W78Xg_pnJ1A",
            "IvvUbh-cnX4",
            "AOz1YPOKvEs",
            "RJoltAGkDFU",
            "Iy7EKhwKjPQ",
            "PJ9_v4ulvd4",
            "Abi8kwkfZbA"
        )
        YouTubePlayerList(videoIds)
    }
}