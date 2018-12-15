package com.chengang.ch7

/**
  * Write a package random with functions nextInt(): Int , nextDouble(): Double , and setSeed(seed: Int): Unit .
  * To generate random numbers, use the linear congruential generator next = (previous × a + b ) mod 2 n ,
  * where a = 1664525, b = 1013904223, n = 32, and the inital value of previous is seed.
  */
package object Random {

  private var previous: Double = 0
  val a = 1664525
  val b = 1013904223
  val n = 32

  def setSeed(value: Int): Unit = {
    previous = value
  }

  def nextInt(): Int = {
    previous = (previous * a + b) % scala.math.pow(2, n)
    previous.toInt
  }

  def nextDouble(): Double = {
    previous = (previous * a + b) % scala.math.pow(2, n)
    previous
  }
}


object Ex3 extends App {

  println(Random.nextInt())

  println(Random.nextDouble())

}
