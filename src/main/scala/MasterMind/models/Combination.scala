package MasterMind.models

object Combination {

  val LENGTH = 4

  private def removeColor(colors: List[Int], color: Int): List[Int] = colors match {
    case `color` :: tail =>  tail
    case x :: tail => x :: removeColor(tail, color)
    case _ => Nil
  }
}

class Combination(combination:List[Int]) {

  private val combination_ = combination

  private def getBlackPositions(that:Combination): List[Boolean] =
    (that.combination_, this.combination_) match {
      case (Nil, _) => Nil
      case ((head :: tail), (thatHead :: thatTail)) if (head == thatHead) => true :: new Combination(tail).getBlackPositions(new Combination(thatTail))
      case ((_ :: tail), (_ :: thatTail)) => false :: new Combination(tail).getBlackPositions(new Combination(thatTail))
    }

  def getBlacks(secret:Combination):Int =
    this.getBlackPositions(secret).count(_ == true)

  private def countWhites(proposedColors:List[Int], possibleColors: List[Int]): Int =
    possibleColors match {
      case Nil => 0
      case color :: tail => {
        proposedColors.count(_ == color) match {
          case x if(x < 2) => x + countWhites(proposedColors, tail)
          case _ => 1 + countWhites(Combination.removeColor(proposedColors, color), tail)
        }
      }
    }

  def getWhites(that:Combination): Int = {
    val filteredThis = (this.getBlackPositions(that), this.combination_).zipped.collect { case (a, b) if (!a) => b }.toList
    val filteredThat = (this.getBlackPositions(that), that.combination_).zipped.collect { case (a, b) if (!a) => b }.toList
    countWhites(filteredThis, filteredThat)
  }

  override def equals(that: Any): Boolean =
    that match {
      case that:Combination => this.combination_ == that.combination_
      case _ => false
    }

  override def toString: String = this.combination_.toString()

}
