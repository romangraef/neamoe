plugins {
    kotlin("js") version "1.6.0"
    kotlin("plugin.serialization") version "1.6.0"
    id("com.github.node-gradle.node") version "3.1.1"
}

repositories {
    mavenCentral()
}

kotlin {
    js(IR) {
        browser {
            commonWebpackConfig {
                sourceMaps = true
                cssSupport.enabled = true
            }
        }
        binaries.executable()
    }
}

val processResources by tasks.getting(Copy::class)

dependencies {
    implementation(enforcedPlatform("org.jetbrains.kotlin-wrappers:kotlin-wrappers-bom:0.0.1-pre.256-kotlin-1.5.31"))
    implementation("org.jetbrains.kotlin-wrappers:kotlin-styled")
    implementation(npm("@fontsource/comic-mono", "^4.5.0"))
    implementation(npm("prop-types", "^15.6.2"))
}



group = "moe.nea"
version = "1.0-SNAPSHOT"