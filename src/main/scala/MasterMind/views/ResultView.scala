package MasterMind.views

object ResultView {
  def writeln(result:(Int, Int)):Unit =
    result match {
      case (black, white) => ConsoleIO.writeln(s"Blacks: $black Whites: $white")
    }

}
