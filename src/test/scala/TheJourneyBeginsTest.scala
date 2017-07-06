import TheJourneyBegins._
import org.scalatest.{BeforeAndAfterAll, FunSuite}


/**
  * Created by buns on 7/6/2017.
  */
class TheJourneyBeginsTest extends FunSuite with BeforeAndAfterAll {
  test("Numbers can be added") {
    assert(add(1,2) == 3)
    assert(add(0,1000) == 1000)
    assert(add(57,4) == 61)
  }

  test("A century can be determined given the year") {
    assert(centuryFromYear(1905) == 20)
    assert(centuryFromYear(1700) == 17)
    assert(centuryFromYear(2001) == 21)
    assert(centuryFromYear(45) == 1)
    assert(centuryFromYear(8) == 1)
    assert(centuryFromYear(374) == 4)
    assert(centuryFromYear(200) == 2)
  }

  test ("A string can be tested to see if it's a palindrome") {
    assert(checkPalindrome("aabaa") == true)
    assert(checkPalindrome("abac") == false)
    assert(checkPalindrome("a") == true)
    assert(checkPalindrome("az") == false)
    assert(checkPalindrome("abacaba") == true)
    assert(checkPalindrome("aaabaaaa") == false)
    assert(checkPalindrome("zzzazzazz") == false)
    assert(checkPalindrome("hlbeeykoqqqqokyeeblh") == true)
  }
  override def afterAll(): Unit = {
    println(s"${this.getClass.getSimpleName}: Finished executing tests")
  }
}
