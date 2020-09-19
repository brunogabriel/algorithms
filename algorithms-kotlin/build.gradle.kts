import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        jcenter()
    }
}

plugins {
    kotlin("jvm") version "1.4.10"
    application
    id("io.gitlab.arturbosch.detekt").version("1.13.1")
}

repositories {
    jcenter()
}

group = "io.github.brunogabriel"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

detekt {
    failFast = false // fail build on any finding
    buildUponDefaultConfig = true // preconfigure defaults
    config = files("$projectDir/config/detekt.yml")
    reports {
        html.enabled = true // observe findings in your browser with structure and code snippets
        xml.enabled = false // checkstyle like format mainly for integrations like Jenkins
        txt.enabled = false // similar to the console output, contains issue signature to manually edit baseline files
    }
}

dependencies {
    testImplementation(kotlin("test-junit"))
    testImplementation("org.assertj:assertj-core:3.11.1")
    testImplementation("io.mockk:mockk:1.10.0")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }
    withType<io.gitlab.arturbosch.detekt.Detekt> {
        this.jvmTarget = "1.8"
    }
}

application {
    mainClassName = "MainKt"
}
