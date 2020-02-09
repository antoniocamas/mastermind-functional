package MasterMind.views

import MasterMind.models.Game

object TryView {
  def write(game:Game):Unit = {
    val triesLeft = game.getTriesLeft
    ConsoleIO.writeln(s"Tries left $triesLeft.")
  }
}
