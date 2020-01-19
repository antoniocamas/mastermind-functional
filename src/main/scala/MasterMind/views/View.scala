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

  def winner:Unit =
    ConsoleIO.writeln("You Win!!!")

  def loser:Unit =
    ConsoleIO.writeln("You lose")

}
