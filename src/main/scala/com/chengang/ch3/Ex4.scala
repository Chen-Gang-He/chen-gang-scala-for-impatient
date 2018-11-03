package com.chengang.ch3

/**
  * Given an array of integers, produce a new array that contains all positive values of the original array,
  * in their original order, followed by all values that are zero or negative, in their original order.
  */
object Ex4 {

  def prod(array: Array[Int]) : Array[Int] = {
    array.filter(_ > 0) ++ array.filter(_ <= 0)
  }

  prod(Array(-1, 2, 3 ))

}
