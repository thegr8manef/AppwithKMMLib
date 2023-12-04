plugins {
    id("org.jetbrains.kotlin.multiplatform")
    id("com.android.library")
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

}

android {
    namespace = "com.example.kotlinmultiplatformsharedmodule"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
}
