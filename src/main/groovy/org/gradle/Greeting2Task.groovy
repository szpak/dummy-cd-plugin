package org.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

class Greeting2Task extends DefaultTask {
    @Input
    String greeting = 'hello from Greeting2Task'

    @TaskAction
    def greet() {
        println greeting
    }
}