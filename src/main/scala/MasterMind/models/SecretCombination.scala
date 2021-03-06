package MasterMind.models

import scala.util.Random

class SecretCombination(combination:List[Int]) extends Combination(combination:List[Int]) {

  def this() = this(List.fill(Combination.LENGTH)(Random.nextInt(Color.NUM_COLORS) + 1))
}