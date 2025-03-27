plugins {
    id("java")
    id("checkstyle")  // Assurez-vous d'avoir le plugin Checkstyle
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.register<Checkstyle>("checkstyle") {
    source = sourceSets["main"].allSource + sourceSets["test"].allSource
    include("**/*.kt")  // Si vous utilisez Kotlin

    // Configuration des rapports
    reports {
        html.required.set(true)  // Crée le rapport HTML
        xml.required.set(false)  // Désactive le rapport XML
    }
}
