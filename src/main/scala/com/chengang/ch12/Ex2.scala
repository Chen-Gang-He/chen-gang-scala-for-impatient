package com.chengang.ch12

/**
 * How do you get the largest element of an array with reduceLeft ?
 */
object Ex2 extends App {
  def max[T](a: Iterable[T]) (implicit order: T => Ordered[T]): T = {
    a.reduceLeft((e, i) => if (e >= i ) e else i)
  }
  Array(1, 3, 4, 10).reduceLeft((e, i) => if (e >= i ) e else i)

}
