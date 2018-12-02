package com.chengang.ch4

/**
  * Write a function lteqgt(values: Array[Int], v: Int) that returns a triple containing the counts of values less
  * than v , equal to v , and greater than v .
  */
object Ex9 extends App{

  def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {
    (values.count(_ < v), values.count(_ == v), values.count(_ > v))
  }

  val v = Array(3, 4, 5, 5, 7, 10)

  println(lteqgt(v, 5))

}
