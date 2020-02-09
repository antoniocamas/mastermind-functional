package MasterMind.views

import MasterMind.models.Game

object ResultView {
  def write(game:Game):Unit =
    game.getLatestResult match {
      case (black, white) => ConsoleIO.writeln(s"Blacks: $black Whites: $white")
    }

}
