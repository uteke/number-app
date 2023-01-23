@file:Suppress("UnstableApiUsage")

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.uteke.numberapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.uteke.numberapp"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_11.toString()
    }
    compileOptions {
        targetCompatibility = JavaVersion.VERSION_11
        sourceCompatibility = JavaVersion.VERSION_11
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.androidx.compose.asProvider().get()
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.androidx.core)
    implementation(libs.androidx.lifecycle)
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.uiToolingPreview)
    implementation(libs.androidx.compose.material3)

    debugImplementation(libs.androidx.compose.uiTooling)
    debugImplementation(libs.androidx.compose.uiTestManifest)

    testImplementation(libs.junit4)
}