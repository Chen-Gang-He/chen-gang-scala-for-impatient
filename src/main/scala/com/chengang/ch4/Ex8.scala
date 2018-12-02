package com.chengang.ch4

/**
  * Write a function minmax(values: Array[Int]) that returns a pair containing
  * the smallest and largest values in the array.
  */
object Ex8 extends App {

  def minmax(value: Array[Int]) : (Int, Int) = {
    (value.min, value.max)
  }
  val v = Array(12, 3, 3, 4, 6, 1)
  println(minmax(v))

}
