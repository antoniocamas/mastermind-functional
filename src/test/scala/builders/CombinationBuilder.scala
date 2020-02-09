package builders

import MasterMind.models.{Combination, SecretCombination}
import builders.SecretCombinationBuilder

object CombinationBuilder {

  def build(coindicendesWithSecret: Int): Combination =
    new Combination(buildColors(coindicendesWithSecret))

  def build:Combination =
    build(0)

  def buildReversed(coindicendesWithSecret:Int): Combination =
    new Combination(buildColors(coindicendesWithSecret).reverse)

  private def buildColors(coindicendesWithSecret:Int): List[Int] =
    1.to(coindicendesWithSecret).toList.map(n => 1) ::: 1.to(Combination.LENGTH - coindicendesWithSecret).toList.map(n => 2)
}
