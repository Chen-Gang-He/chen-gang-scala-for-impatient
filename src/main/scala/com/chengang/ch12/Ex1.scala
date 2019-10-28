package com.chengang.ch12
/**
 * Write a function values(fun: (Int) => Int, low: Int, high: Int) that yields a collection of function
 * inputs and outputs in a given range.
 *
 * For example, values(x => x * x, -5, 5) should produce a collection of pairs
 * (-5, 25) , (-4, 16) , (-3, 9) , . . ., (5, 25) .
 */
object Ex1 extends App{
  def values(fun: (Int) => Int, low: Int, high: Int) = {
//    (low to high) map {x =>
//      (x, fun(x))
//    }
    for (i <- low to high) yield (i, fun(i))
  }

  println(values(x => x * x, -5, 5))

}
