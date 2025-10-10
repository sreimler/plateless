package com.sreimler.plateless

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform