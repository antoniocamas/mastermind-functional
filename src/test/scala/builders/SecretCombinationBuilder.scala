package builders

import MasterMind.models.SecretCombination

object SecretCombinationBuilder {

  def build:SecretCombination =
    new SecretCombination(List(1,1,1))

}
