tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

dependencies {
    implementation(project(":shared"))

    implementation(project(":user-api:user-interfaces"))
    implementation(project(":user-api:user-application"))
    implementation(project(":user-api:user-domain"))
    implementation(project(":user-api:user-infrastructure"))

    implementation(project(":taxi-request-api:taxi-request-interfaces"))
    implementation(project(":taxi-request-api:taxi-request-application"))
    implementation(project(":taxi-request-api:taxi-request-domain"))
    implementation(project(":taxi-request-api:taxi-request-infrastructure"))

    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-jdbc")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("org.springdoc:springdoc-openapi-ui:1.6.11")

    implementation("org.flywaydb:flyway-core")
    implementation("org.flywaydb:flyway-mysql")

    runtimeOnly("io.micrometer:micrometer-registry-prometheus")

    runtimeOnly("mysql:mysql-connector-java")
    testRuntimeOnly("com.h2database:h2")
}
