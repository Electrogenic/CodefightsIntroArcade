package RichAssertions

/**
  * Created by buns on 7/6/2017.
  */
trait AssertAll {
  implicit class FunByName[T](getValue: => T ) extends Proxy {
    def apply(): T = getValue
    def self: T = apply()
  }

  def assertAll(funExpectedResultPair: ((FunByName[Any], Any))*): Unit = {
    funExpectedResultPair.foreach {
      case (f, expectedResult) => assert(f() == expectedResult)
    }
  }
}
