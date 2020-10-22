group = rootProject.group
version = rootProject.version

plugins {
    kotlin("jvm")
    kotlin("kapt")
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("compiler-embeddable"))
    implementation(gradleKotlinDsl())
    implementation(kotlin("gradle-plugin-api"))
    compileOnly("com.google.auto.service", "auto-service", "1.0-rc4")
    compile(project(":reflekt-core"))
}

