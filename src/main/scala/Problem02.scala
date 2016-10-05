package NinetyNineProblems

import java.util.NoSuchElementException

object P02 {
  def penultimate[A](xs:List[A]) : A = xs match {
    case x :: _ :: Nil => x
    case h :: tail     => penultimate(tail)
    case _             => throw new NoSuchElementException
  }
}