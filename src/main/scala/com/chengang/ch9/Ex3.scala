package com.chengang.ch9

import scala.io.Source

/**
  * Write a Scala code snippet that reads a file and prints all words with more than 12 characters to the console.
  * Extra credit if you can do this in a single line.
  */

object Ex3 extends App {

  val url = getClass.getResource("c:\\src\\m.txt")


  //"""\w{2,}""".r.findAllIn(Source.fromFile("c:\\src\\m.txt").mkString).foreach{println(_)}

  """\w{12,}""".r.findAllIn(Source.fromFile("c:\\src\\m.txt").mkString).foreach(println(_))


}
