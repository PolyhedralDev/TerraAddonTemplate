plugins {
    java
}

group = "com.yourname"
version = "0.1.0"

repositories {
    mavenCentral()
    maven { url = uri("https://repo.codemc.org/repository/maven-public") }
}

dependencies {
    testImplementation("junit", "junit", "4.12")

    // Terra API
    compileOnly("com.dfsek.terra.common:common:5.0.0-BETA+7f11373f")

    // Other things you might want
    compileOnly("com.dfsek:Tectonic:1.2.3")
    compileOnly("com.dfsek:Paralithic:0.3.2")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}