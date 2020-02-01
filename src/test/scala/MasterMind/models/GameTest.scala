package MasterMind.models

import builders.{GameBuilder, SecretCombinationBuilder, CombinationBuilder}
import org.scalatest.FunSuite

class GameTest extends FunSuite {

  test("Number of tries are counted down") {
    var sut = GameBuilder.build
    val initialTries = sut.getTriesLeft
    sut = sut.proposeCombination(CombinationBuilder.build)
    assert( initialTries == sut.getTriesLeft + 1)
  }

  test("Game reached max attempts") {
    var sut = GameBuilder.buildFinishedGame
    assert(sut.isFinished)
  }

  test("Game Won") {
    var sut = GameBuilder.build
    assert(sut.proposeCombination(SecretCombinationBuilder.build).isWinner)
  }

  test("Game Lost") {
    var sut = GameBuilder.buildFinishedGame
    assert(sut.isWinner == false)
  }

  test("Winner Result") {
    var sut = GameBuilder.build
    assertResult((Combination.LENGTH,0))(sut.proposeCombination(SecretCombinationBuilder.build).getLatestResult)
  }
}