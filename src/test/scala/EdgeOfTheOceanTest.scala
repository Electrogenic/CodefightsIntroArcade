import EdgeOfTheOcean._
import RichAssertions.AssertAll
import org.scalatest.FunSuite

/**
  * Created by buns on 7/12/2017.
  */
class EdgeOfTheOceanTest extends FunSuite
  with AssertAll {

  test("Given an array of integers, find the pair of adjacent " +
    "elements that has the largest product and return that product.\n") {
    val f = adjacentElementsProduct _
    assertAll(
      (f(Array(3, 6, -2, -5, 7, 3)), 21),
      (f(Array(-1, -2)), 2),
      (f(Array(5, 1, 2, 3, 1, 4)), 6),
      (f(Array(1, 2, 3, 0)), 6),
      (f(Array(9, 5, 10, 2, 24, -1, -48)), 50),
      (f(Array(5, 6, -4, 2, 3, 2, -23)), 30),
      (f(Array(4, 1, 2, 3, 1, 5)), 6),
      (f(Array(-23, 4, -3, 8, -12)), -12),
      (f(Array(1, 0, 1, 0, 1000)), 0))
  }
}
