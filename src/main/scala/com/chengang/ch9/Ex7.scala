package com.chengang.ch9

import scala.io.Source

/**
  * Write a Scala program that reads a text file and prints all tokens in the file that are not floating-point numbers.
  * Use a regular expression.
  */
object Ex7 extends App {

  val url = getClass.getResource("/ch9_ex7.txt")

  Source.fromURL(url).mkString.split("""\s+""").filter("""[0-9\.]+""".r.findFirstIn(_) == None).foreach(println(_))


}
