package NinetyNineProblems

import org.scalacheck.{Prop, Properties}
import org.scalacheck.Prop.forAll
import org.scalatest._

object P03Specification extends Properties("Problem 03") {
  property("the index of the nth element should be n") = forAll  { (n:Int, xs:List[Int]) =>
    val distList = xs.distinct
    if(n >= 0 && n < distList.size) {
      val res = P03.nth(n, distList)
      distList.indexOf(res) == n
    } else
      Prop.throws(classOf[Exception])(P03.nth(n, distList))
  }
}