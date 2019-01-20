package com.chengang.ch9

import scala.io.Source

/**
  * Write a Scala program that reads a text file containing average, maximum, and minimum of the numbers in the file.
  */

object Ex4 extends App {

  val url = getClass.getResource("/numbers.txt")
  val numbers: Array[Double] = """[0-9\.]+""".r.findAllIn(Source.fromURL(url).mkString).map(_.toDouble).toArray
  val avg = numbers.sum / numbers.length
  println("The average: %f, max: %f, min: %f".format(avg, numbers.max, numbers.min))

}
