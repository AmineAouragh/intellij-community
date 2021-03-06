// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.intellij.ide.actions

import com.intellij.ide.IdeBundle
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.module.ModuleManager
import com.intellij.openapi.project.Project
import com.intellij.projectImport.ProjectAttachProcessor

class CloseProjectAction : CloseProjectsActionBase() {
  override fun canClose(project: Project, currentProject: Project) = project === currentProject

  override fun shouldShow(e: AnActionEvent) = e.project != null

  override fun update(e: AnActionEvent) {
    super.update(e)

    if (ProjectAttachProcessor.canAttachToProject() && e.project != null && ModuleManager.getInstance(e.project!!).modules.size > 1) {
      e.presentation.setText(IdeBundle.messagePointer("action.close.projects.in.current.window"))
    }
  }
}