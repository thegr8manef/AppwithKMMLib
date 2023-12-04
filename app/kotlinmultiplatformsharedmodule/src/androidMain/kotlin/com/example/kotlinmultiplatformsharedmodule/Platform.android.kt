package com.example.kotlinmultiplatformsharedmodule

class AndroidPlatform : Platform {
    override val name: String = android.os.Build.BRAND
}

actual fun getPlatform(): Platform = AndroidPlatform()