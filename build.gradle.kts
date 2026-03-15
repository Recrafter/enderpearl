plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.intellij.platform)
}

repositories {
    mavenCentral()

    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdea(libs.versions.idea)
        pluginVerifier()
    }
}

intellijPlatform {
    pluginConfiguration {
        id = "io.github.recrafter.enderpearl"
        version = "${libs.versions.idea}-0.1.0"

        vendor {
            name = "Recrafter"
            email = "diskria@proton.me"
            url = "https://github.com/Recrafter/enderpearl/"
        }

        name = "Ender Pearl"
        description = "The ultimate UX companion for the Recrafter ecosystem. " +
            "Seamlessly bridging Crafter Gradle Plugin, Lapis KSP, and your workspace. " +
            "Fwoomp!"
    }
}

tasks {
    buildSearchableOptions {
        enabled = false
    }
}
