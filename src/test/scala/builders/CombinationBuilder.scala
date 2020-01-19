package builders

import MasterMind.models.{Combination, SecretCombination}
import builders.SecretCombinationBuilder

object CombinationBuilder {

  def build:Combination =
    new Combination(1.to(Combination.LENGTH).toList)
}
