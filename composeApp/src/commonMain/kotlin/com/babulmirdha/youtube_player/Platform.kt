package com.babulmirdha.youtube_player

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform