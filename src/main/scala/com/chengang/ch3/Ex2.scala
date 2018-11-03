package com.chengang.ch3

/**
  * What is the value of an empty block expression {} ? What is its type?
  */

object Ex2 extends App {

  def swap(array: Array[Int]) : Array[Int] = {
    val l = array.length
    for (i <- 1.until(l) if i % 2 != 0) {
      val temp = array(i)
      array(i) = array(i - 1)
      array(i - 1) = temp
    }
    array
  }

  swap(Array(1, 2, 3 ,4, 5)).foreach(println)
}
