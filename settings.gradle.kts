rootProject.name = "taxi-dispatch-app"
include("server")
include("shared")
include(
    "user-api",
    "user-api:user-interfaces",
    "user-api:user-application",
    "user-api:user-domain",
    "user-api:user-infrastructure",
)
include(
    "taxi-request-api",
    "taxi-request-api:taxi-request-interfaces",
    "taxi-request-api:taxi-request-application",
    "taxi-request-api:taxi-request-domain",
    "taxi-request-api:taxi-request-infrastructure",
)
include("query-api")
include("batch-api")

pluginManagement {
    val kotlinVersion: String by settings
    val springBootVersion: String by settings
    val springDependencyManagementVersion: String by settings

    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "org.jetbrains.kotlin.jvm" -> useVersion(kotlinVersion)
                "org.jetbrains.kotlin.plugin.spring" -> useVersion(kotlinVersion)
                "org.jetbrains.kotlin.plugin.jpa" -> useVersion(kotlinVersion)
                "org.springframework.boot" -> useVersion(springBootVersion)
                "io.spring.dependency-management" -> useVersion(springDependencyManagementVersion)
            }
        }
    }
}
