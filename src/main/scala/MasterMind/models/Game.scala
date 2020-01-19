package MasterMind.models

import scala.util.Random

class Game(proposedCombinations:List[Combination],secretCombination:Combination ) {

  //val a = List(1 to 3).map(n=> Random.nextInt(10))
  def this() = this(Nil, new Combination(List(1, 2, 3)))

  private val MAX_LONG = 2
  private val proposedCombinations_ = proposedCombinations
  private val secretCombination_ = secretCombination

  def proposeCombination(newCombination:Combination):Game = {
    new Game(newCombination::this.proposedCombinations_, this.secretCombination_)
  }

  def getTriesLeft: Int =
    this.MAX_LONG - this.proposedCombinations_.length

  def isFinished:Boolean =
    this.isWinner || this.proposedCombinations_.length >= this.MAX_LONG

  def isWinner:Boolean =
    proposedCombinations_ match {
      case Nil => false
      case head :: _ => head == secretCombination_
    }
}
