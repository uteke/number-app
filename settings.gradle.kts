pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

enableFeaturePreview("VERSION_CATALOGS")

rootProject.name = "NumberApp"
include(":app")
