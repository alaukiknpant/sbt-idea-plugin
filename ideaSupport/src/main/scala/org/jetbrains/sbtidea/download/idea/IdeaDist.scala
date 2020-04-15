package org.jetbrains.sbtidea.download.idea

import java.net.URL

import org.jetbrains.sbtidea.download.api._

abstract class IdeaDist extends IdeaArtifact {
  override type R = IdeaDist
  override protected def usedInstaller: Installer[IdeaDist] = new IdeaDistInstaller(caller.buildInfo)
}

case class IdeaDistImpl(caller: AbstractIdeaDependency, dlUrl: URL) extends IdeaDist