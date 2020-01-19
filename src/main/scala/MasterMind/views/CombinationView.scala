package MasterMind.views

import MasterMind.models.Combination

object CombinationView {

  def translate(char:Char): Int =
    char.toUpper match {
      case 'R' => 1
      case 'G' => 2
      case 'B' => 3
      case 'Y' => 4
      case 'O' => 5
      case 'P' => 6
      case _ => 0
    }

  def readElements:List[Int] = {
    print("Propose Combination: ")
    scala.io.StdIn.readLine().toList.filter(_ != ' ').map(translate).filter(_ > 0)
  }

  def readCombination(nElements:Int):Combination = {
    val combination = readElements
    combination.length match {
      case p if (p == nElements) => new Combination(combination)
      case _ => readCombination(nElements)
    }
  }
}
