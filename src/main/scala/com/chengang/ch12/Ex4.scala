package com.chengang.ch12

/**
 * The previous implementation needed a special case when n < 1. Show how you can avoid this with foldLeft .
 * (Look at the Scaladoc for foldLeft .
 * It’s like reduceLeft , except that the first value in the chain of combined values is supplied in the call.)
 */
object Ex4 extends App {
  def factorial(n: Int) = {
    (1 to n).fold(1)(_ * _)
  }

  assert(factorial(5) == 120)

  assert(factorial(0) == 1)

  assert(factorial(-10) == 1)

}
