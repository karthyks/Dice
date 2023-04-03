plugins {
    `kotlin-dsl`
}

gradlePlugin {
    plugins.register("project-tasks-plugin") {
        id = "project-gradle-tasks"
        implementationClass = "com.karthyks.plugin.ProjectTasks"
    }
}

dependencies {
    implementation(project(":version-system"))
}
