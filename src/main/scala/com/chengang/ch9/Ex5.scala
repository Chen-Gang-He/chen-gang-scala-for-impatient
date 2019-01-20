package com.chengang.ch9

import scala.math.pow

/**
  * Write a Scala program that writes the powers of 2 and their reciprocals to a file, with the exponent ranging
  * from 0 to 20. Line up the columns: 1 1 2 0.5 4 0.25 ... ...
  */
object Ex5 extends App {
  0.to(20).map(pow(2, _).toInt).foreach(x => println("%d  ".format(x) + (1D / x).toString))

}
