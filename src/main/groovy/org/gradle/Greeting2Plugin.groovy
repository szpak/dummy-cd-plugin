package org.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class Greeting2Plugin implements Plugin<Project> {
    void apply(Project target) {
        target.task('hello', type: Greeting2Task)
    }
}
