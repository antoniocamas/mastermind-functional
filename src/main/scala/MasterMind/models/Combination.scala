package MasterMind.models

object Combination {

  val LENGTH = 3
}

class Combination(combination:List[Int]) {

  private val combination_ = combination

  override def equals(that: Any): Boolean =
    that match {
      case that:Combination => this.combination_ == that.combination_
      case _ => false
    }

  override def toString: String = this.combination_.toString()

}
