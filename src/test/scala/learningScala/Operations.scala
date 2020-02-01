package learningScala

import org.scalatest.FunSuite

class Operations extends FunSuite {
  test("test filter with bools") {
    assertResult(List(2,2))((List(true, true, false),List(2,2,1)).zipped.collect{case (a,b) if a => b })
  }

  test("test count trues") {
    assertResult(2)(List(true, true, false).count(_ == true))
  }

}
