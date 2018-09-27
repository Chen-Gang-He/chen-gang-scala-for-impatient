package com.chengang.ch3

import scala.util.Random

/**
  * Created by che on 9/27/2018.
  */
/**
  * Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n (exclusive).
  */
object Ex1 extends App {

  def randArray(n: Int): Array[Int] = {
     new Array[Int](n).map(_ => Random.nextInt(n) )
  }
  val a = randArray(10)
  println(a.mkString(","))


}
