package MasterMind.views

import MasterMind.models.Color

object ColorView {

  val colors = List(('R',1), ('G', 2), ('B' ,3), ('Y', 4), ('O', 5), ('P' ,6))

  def getNumColors:Int =
    Color.NUM_COLORS

  def translate(char:Char): Int = {
    def searchInColors(remainingColors: List[(Char, Int)], char: Char): Int = {
      remainingColors match {
        case Nil => 0
        case (color, value) :: tail if (color == char.toUpper) => value
        case _ :: tail => searchInColors(tail, char)
      }
    }
    searchInColors(this.colors, char)
  }
}
