package MasterMind.views

import org.scalatest.FunSuite

class ColorViewTest extends FunSuite {

  test("translate Color Char to Int") {
    assertResult(1)(ColorView.translate('r'))
    assertResult(2)(ColorView.translate('g'))
    assertResult(3)(ColorView.translate('b'))
    assertResult(4)(ColorView.translate('y'))
    assertResult(5)(ColorView.translate('o'))
    assertResult(6)(ColorView.translate('p'))
  }

  test("translate UnknownColor ") {
    assertResult(0)(ColorView.translate('q'))
    assertResult(0)(ColorView.translate('1'))
  }

}
