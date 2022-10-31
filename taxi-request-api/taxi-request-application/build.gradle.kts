tasks.getByName("bootJar") {
    enabled = false
}

tasks.getByName("jar") {
    enabled = true
}

dependencies {
    implementation(project(":taxi-request-api:taxi-request-domain"))
    implementation(project(":shared"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
}
