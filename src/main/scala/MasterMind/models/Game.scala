package MasterMind.models

class Game(proposedCombinations:List[Combination],secretCombination:SecretCombination ) {

  def this() = this(Nil, new SecretCombination())

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
