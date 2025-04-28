package com.example.kotlinmultiplatformtst

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform