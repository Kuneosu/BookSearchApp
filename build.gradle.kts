// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin") version "2.0.1" apply false
    // safe-args
    id("androidx.navigation.safeargs.kotlin") version "2.5.0" apply false
    // kotlin-serialization
    id("org.jetbrains.kotlin.plugin.serialization") version "1.6.10" apply false
}