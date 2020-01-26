package builders

import MasterMind.models.{Combination, SecretCombination}
import builders.SecretCombinationBuilder

object CombinationBuilder {

  def build(numberOfOnes: Int): Combination =
    new Combination(buildColors(numberOfOnes))

  def build:Combination =
    build(0)

  def buildReversed(numberOfOnes:Int): Combination =
    new Combination(buildColors(numberOfOnes).reverse)

  private def buildColors(numberOfOnes:Int): List[Int] =
    1.to(numberOfOnes).toList.map(n => 1) ::: 1.to(Combination.LENGTH - numberOfOnes).toList.map(n => 2)
}
