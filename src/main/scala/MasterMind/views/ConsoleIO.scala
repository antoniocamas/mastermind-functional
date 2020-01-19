package MasterMind.views

object ConsoleIO {

  def write(message:String): Unit =
    print(message)

  def writeln(message:String): Unit =
    write(message + "\n")

  def readString(title:String):String = {
    write(title + ": ")
    scala.io.StdIn.readLine()
  }

}
