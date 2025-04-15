package org.jetbrains.plugins.template.startup

import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

class MyPluginAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        Messages.showMessageDialog(
            e.project,
            "Hello from My Plugin!",
            "Greeting",
            Messages.getInformationIcon()
        )
    }
}
