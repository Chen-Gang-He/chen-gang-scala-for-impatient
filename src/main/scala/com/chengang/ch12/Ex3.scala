package com.chengang.ch12
/**
 * Implement the factorial function using to and reduceLeft , without a loop or recursion.
 */
object Ex3 extends App {
  def factorial(n: Int) = {
    (1 to n).reduceLeft(_ * _)
  }

  assert(factorial(5) == 120)

}
