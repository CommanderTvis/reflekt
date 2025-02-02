plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap")
    // Uncomment it for using the last kotlin compiler version
    // The full list of the build can be found here:
    // https://teamcity.jetbrains.com/buildConfiguration/Kotlin_KotlinPublic_BuildNumber?mode=builds&tag=bootstrap
    // (see builds with <boostrap> tag)
    // Note: uncomment it also in the settings.gradle.kts
    // maven {
    // url = uri("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap")
    // }
}

dependencies {
    implementation(libs.gradle.plugin.kotlin)
    implementation(libs.gradle.plugin.diktat)
    implementation(libs.gradle.plugin.detekt)
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
    kotlinOptions {
        jvmTarget = "11"
    }
}
