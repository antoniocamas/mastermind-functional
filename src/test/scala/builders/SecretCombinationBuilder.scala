package builders

import MasterMind.models.{SecretCombination, Combination}


object SecretCombinationBuilder {

  def build:SecretCombination =
    new SecretCombination(1.to(Combination.LENGTH).toList.map(n => 1))

}
