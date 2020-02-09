package MasterMind.views

import MasterMind.models.Combination

object CombinationView {
  def readElements:List[Int] = {
    ConsoleIO.readString("Propose Combination").toList.filter(_ != ' ').map(ColorView.translate).filter(_ > 0)
  }

  def readCombination:Combination = {
    val combination = readElements
    combination.length match {
      case p if (p == Combination.LENGTH) => new Combination(combination)
      case _ => readCombination
    }
  }
}
