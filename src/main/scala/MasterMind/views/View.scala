package MasterMind.views

import MasterMind.models.Game
import MasterMind.models.Combination

object View {

  def startTurn(game:Game) = {
    SecretView.write()
    TryView.write(game.getTriesLeft)
  }

  def getCombination(game:Game):Combination ={
    CombinationView.readCombination(Combination.LENGTH)
  }

  def finishTurn(game:Game) = {

  }

  def finishGame(game: Game) = {
    if (game.isWinner)
      ConsoleIO.writeln("\nYou Win!!!")
    else
      ConsoleIO.writeln("\nYou lose")
  }
}
