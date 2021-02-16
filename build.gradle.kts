plugins {
    java
}

group = "com.yourname"
version = "0.1.0"

repositories {
    mavenCentral()
    maven { url = uri("https://papermc.io/repo/repository/maven-public/") }
    flatDir {
        dirs("../libs")
    }
}

dependencies {
    testImplementation("junit", "junit", "4.12")
    compileOnly("com.destroystokyo.paper:paper-api:1.16.5-R0.1-SNAPSHOT")
    compileOnly(fileTree("./libs/"))
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}