
plugins {
    java
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    implementation("org.springframework:spring-context:3.0.2.RELEASE")
}

group = "com.springinaction"
version = "3.0.0"
description = "sample"
java.sourceCompatibility = JavaVersion.VERSION_1_8

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}
