/**
  * Created by buns on 7/12/2017.
  */
object EdgeOfTheOcean {

  def adjacentElementsProduct(inputArray: Array[Int]): Int = {
    inputArray.sliding(2).map(_ product).max
  }

  def shapeArea(n: Int): Int = {
    n * n + (n -1) * (n - 1)
  }
}
