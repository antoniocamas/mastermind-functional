package MasterMind.views

import MasterMind.models.Game
import MasterMind.models.Combination

object View {

  def startTurn(game:Game) = {
    SecretView.write()
    TryView.write(game)
    ColorView.write()
  }

  def getCombination(game:Game):Combination =
    CombinationView.readCombination

  def finishTurn(game:Game) =
    ResultView.write(game)

  def finishGame(game: Game) =
    if (game.isWinner)
      ConsoleIO.writeln("\nYou Win!!!")
    else
      ConsoleIO.writeln("\nYou lose")
}
