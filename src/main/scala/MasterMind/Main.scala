package MasterMind

import MasterMind.models.Game
import MasterMind.views.CombinationView
import MasterMind.views.GameView

object Main {

  var game = new Game()


  def main(args: Array[String]): Unit = {
    do {
      GameView.write(game)
      game = game.proposeCombination(CombinationView.readCombination(3))
    } while (!game.isFinished)



  }


}
