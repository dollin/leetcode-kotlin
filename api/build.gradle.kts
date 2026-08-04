plugins {
    alias(libs.plugins.kotlin.jvm)
//    alias(libs.plugins.kotlin.spring)
//    alias(libs.plugins.spring.boot)
//    alias(libs.plugins.spring.dependency.management)
//    alias(libs.plugins.versions)
//    alias(libs.plugins.ktlint)
    alias(libs.plugins.detekt)
}

kotlin {
    jvmToolchain(21)
}

repositories {
    mavenCentral()
}

dependencies {
//    implementation(libs.kotlin.logging)
    testImplementation(libs.junit.jupiter)
//    testImplementation("org.springframework.boot:spring-boot-starter-test") {
//        exclude(module = "mockito-core")
//    }
    testRuntimeOnly(libs.junit.platform.launcher)
}

tasks.test {
    useJUnitPlatform()
    jvmArgs("-XX:+EnableDynamicAgentLoading")
}

detekt {
    config.setFrom("$rootDir/detekt.yml")
    buildUponDefaultConfig = true
}

tasks.check {
    dependsOn(tasks.named("detekt"))
}
