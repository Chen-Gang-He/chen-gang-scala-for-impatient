package com.chengang.ch9

import scala.io.Source

/**
  * Write a Scala code snippet that reverses the lines in a file (making the last line the first one, and so on).
  */

object Ex1 extends App {

  val f = Source.fromFile("c:\\src\\sit1.sh")

  f.getLines().toArray.reverse.foreach(line => println(line))

}
