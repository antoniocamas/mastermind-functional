package builders

import MasterMind.models.Game

object GameBuilder {

  def build:Game =
    new Game(Nil, SecretCombinationBuilder.build)

  def buildFinishedGame:Game = {
    def finishTheGame(game:Game):Game =
      game.getTriesLeft match {
        case 1 => game.proposeCombination(CombinationBuilder.build)
        case _ => finishTheGame(game.proposeCombination(CombinationBuilder.build))
      }

    finishTheGame(build)
  }
}
