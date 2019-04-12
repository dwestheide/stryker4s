package stryker4s.model

import java.nio.file.Path

import scala.meta.Tree

case class MutatedFile(fileOrigin: Path, tree: Tree, mutants: Seq[Mutant], excludedMutants: Int)
