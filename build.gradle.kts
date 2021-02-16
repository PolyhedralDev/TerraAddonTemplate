plugins {
    java
}

group = "com.yourname"
version = "0.1.0"

repositories {
    mavenCentral()
    maven { url = uri("https://papermc.io/repo/repository/maven-public/") }
    maven { url = uri("https://repo.codemc.org/repository/maven-public") }
}

dependencies {
    testImplementation("junit", "junit", "4.12")
    compileOnly("com.destroystokyo.paper:paper-api:1.16.5-R0.1-SNAPSHOT")
    compileOnly("com.dfsek.terra.common:common:4.2.0-BETA+b3a4c3af")
    compileOnly("com.dfsek.terra.bukkit:bukkit:4.2.0-BETA+48296fb1")
    compileOnly("com.dfsek:Tectonic:1.3.0")
    compileOnly("com.dfsek:Paralithic:0.3.2")
    implementation("org.bstats:bstats-bukkit:1.7")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}