/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin library project to get you started.
 */

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.3.61"

    id("org.jetbrains.dokka") version "0.10.0"

    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Web Socket Client
    implementation("com.neovisionaries:nv-websocket-client:2.9")

    // Http utils to manipulate URL properly
    implementation("org.apache.httpcomponents:httpclient:4.5.11")

    // JSON handling
    implementation("org.json:json:20190722")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    testImplementation("net.jodah:concurrentunit:0.4.6")
}

tasks.withType<Test> {
    testLogging {
        showStandardStreams = true
    }
}

tasks.dokka {
    outputFormat = "html"
    outputDirectory = "docs/"
}

