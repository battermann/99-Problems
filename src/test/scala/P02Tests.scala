package NinetyNineProblems

import org.scalacheck.{Prop, Properties}
import org.scalacheck.Prop.forAll
import org.scalatest._

object P02Specification extends Properties("Problem 02") {
  property("list with three elements returns last element") = forAll { (c1: Char, c2: Char, c3: Char) =>
    c2 == P02.penultimate(List(c1,c2,c3))
  }

  property("throw NoSuchElementException if list is singleton") = forAll { (x: String) =>
    Prop.throws(classOf[NoSuchElementException])(P02.penultimate(List(x)))
  }
}

class P02Tests extends FlatSpec with Matchers {
  it should "throw NoSuchElementException if list is empty" in {
    a [NoSuchElementException] should be thrownBy {
      P01.last(List.empty)
    }
  }
}