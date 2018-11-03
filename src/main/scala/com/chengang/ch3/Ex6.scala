package com.chengang.ch3

import scala.collection.mutable.ArrayBuffer

/**
  * How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted order?
  * How do you do the same with an ArrayBuffer[Int] ?
  */
object Ex6 extends App {

  println(Array(5, 3, 1).sortWith(_>_).mkString(","))

  println(ArrayBuffer(33, 23, 45).sortWith(_>_).mkString(","))

}
