package MasterMind.views

import MasterMind.models.Combination

object SecretView {

  def write() = {
    def hideCombination(secretElements:List[Int]): String =
      secretElements match {
        case Nil => ""
        case head :: tail => "* " + hideCombination(tail)
      }

    ConsoleIO.writeln("\nSecret Combination")
    ConsoleIO.writeln(hideCombination(1.to(Combination.LENGTH).toList))
    ConsoleIO.writeln("======================")
  }
}
