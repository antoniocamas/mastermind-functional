package MasterMind.models

import builders.{SecretCombinationBuilder, CombinationBuilder}
import org.scalatest.FunSuite

class CombinationTest extends FunSuite {

  test("test getBlacks") {
    val sut = CombinationBuilder.build(Combination.LENGTH)
    assertResult(0)(sut.getBlacks(CombinationBuilder.build))
    assertResult(1)(sut.getBlacks(CombinationBuilder.build(1)))
    assertResult(2)(sut.getBlacks(CombinationBuilder.build(2)))
    assertResult(Combination.LENGTH)(sut.getBlacks(sut))
  }

  test("test getWhites") {
    val sut = CombinationBuilder.build(Combination.LENGTH)
    assertResult(0)(sut.getWhites(CombinationBuilder.build))
    assertResult(0)(sut.getWhites(CombinationBuilder.buildReversed(1)))
    assertResult(0)(sut.getWhites(CombinationBuilder.buildReversed(2)))
    assertResult(0)(sut.getWhites(sut))
  }

  test("test ComplicatedCombination") {
    val sut = new Combination(List(1,2,3,4,1,2))
    assertResult(2)(sut.getBlacks(new Combination(List(2,1,3,4,4,1))))
    assertResult(3)(sut.getWhites(new Combination(List(2,1,3,4,4,1))))
  }

  test("test two combinations are equal") {
    assert(CombinationBuilder.build == CombinationBuilder.build)
  }

  test("test two combinations are not equal") {
    assert(CombinationBuilder.build != CombinationBuilder.build(1))
  }
}