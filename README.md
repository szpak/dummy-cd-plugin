# TODO

# Quick start

Add gradle-nexus-staging-plugin to the `buildscript` dependencies in your build.gradle file for root project:

    buildscript {
        repositories {
            mavenCentral()
            //Needed only for SNAPSHOT versions
            //maven { url "http://oss.sonatype.org/content/repositories/snapshots/" }
        }
        dependencies {
            classpath "io.gitlab.nexus-at:dummy-cd-plugin:0.1.16"
        }
    }

Apply the plugin:

    apply plugin: 'io.gitlab.nexus-at.dummy-cd'
