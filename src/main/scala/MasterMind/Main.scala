package MasterMind

import MasterMind.models.Game
import MasterMind.views.View

object Main {

  var game = new Game()

  def main(args: Array[String]): Unit = {
    do {
      View.startTurn(game)
      game = game.proposeCombination(View.getCombination(game))
      View.finishTurn(game)
    } while (!game.isFinished)
   View.finishGame(game)
  }
}
