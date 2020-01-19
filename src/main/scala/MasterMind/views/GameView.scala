package MasterMind.views

import MasterMind.models.Game

object GameView {

  def write(game:Game) = {
    SecretView.write()
    val tries = game.getTriesLeft
    println(s"Tries left $tries. ")
  }

}
