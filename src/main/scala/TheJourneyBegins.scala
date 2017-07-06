/**
  * Created by buns on 7/6/2017.
  */
object TheJourneyBegins {
  def add(param1: Int, param2: Int): Int = {
    param1 + param2
  }

  def centuryFromYear(year: Int): Int = {
    math.ceil(year.toDouble / 100).toInt
  }

  def checkPalindrome(inputString: String): Boolean = {
    inputString.reverse == inputString
  }
}
