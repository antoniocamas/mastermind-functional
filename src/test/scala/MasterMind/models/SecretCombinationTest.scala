package MasterMind.models

import org.scalatest.FunSuite
import org.scalatest.Matchers._

class SecretCombinationTest extends FunSuite {

  test("SecretCombination constructor type"){
    val sut = new SecretCombination()
    sut shouldBe a [SecretCombination]
  }
}
