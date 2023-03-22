package com.paulo.studykmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
