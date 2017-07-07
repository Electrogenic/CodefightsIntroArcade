import RichAssertions.AssertAll
import TheJourneyBegins._
import org.scalatest.{BeforeAndAfterAll, FunSuite}


/**
  * Created by buns on 7/6/2017.
  */
class TheJourneyBeginsTest extends FunSuite
  with BeforeAndAfterAll with AssertAll {

  test("Numbers can be added") {
    assertAll(
      (add(1, 2), 3),
      (add(0, 1000), 1000),
      (add(57, 4), 61))
  }

  test("A century can be determined given the year") {
    assertAll(
      (centuryFromYear(1905), 20),
      (centuryFromYear(1700), 17),
      (centuryFromYear(2001), 21),
      (centuryFromYear(45), 1),
      (centuryFromYear(8), 1),
      (centuryFromYear(374), 4),
      (centuryFromYear(200), 2))
  }

  test("A string can be tested to see if it's a palindrome") {
    assertAll(
      (checkPalindrome("aabaa"), true),
      (checkPalindrome("abac"), false),
      (checkPalindrome("a"), true),
      (checkPalindrome("az"), false),
      (checkPalindrome("abacaba"), true),
      (checkPalindrome("aaabaaaa"), false),
      (checkPalindrome("zzzazzazz"), false),
      (checkPalindrome("hlbeeykoqqqqokyeeblh"), true))
  }
}


