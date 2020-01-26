package MasterMind.models

object Result {

  def getResult(proposedCombination:Combination, secretCombination: SecretCombination): (Int, Int) = {
    (proposedCombination.getBlacks(secretCombination), proposedCombination.getWhites(secretCombination))
  }

}
