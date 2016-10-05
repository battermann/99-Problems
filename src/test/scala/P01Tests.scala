package NinetyNineProblems

import org.scalacheck.{Prop, Properties}
import org.scalacheck.Prop.forAll
import org.scalatest._

object P01Specification extends Properties("Problem 01") {
  property("singleton list returns its only element") = forAll { (i:Int) =>
    i == P01.last(List(i))
  }

  property("list with three elements returns last element") = forAll { (c1: Char, c2: Char, c3: Char) =>
    c3 == P01.last(List(c1,c2,c3))
  }
}

class P01Tests extends FlatSpec with Matchers {
  it should "throw NoSuchElementException if list is empty" in {
    a [NoSuchElementException] should be thrownBy {
      P01.last(List.empty)
    }
  }
}