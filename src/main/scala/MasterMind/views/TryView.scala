package MasterMind.views

object TryView {
  def write(triesLeft:Int):Unit =
    ConsoleIO.writeln(s"Tries left $triesLeft.")
}
