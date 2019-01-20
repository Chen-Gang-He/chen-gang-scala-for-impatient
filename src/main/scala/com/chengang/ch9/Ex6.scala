package com.chengang.ch9

import java.io.PrintWriter

import scala.io.Source

/**
  * Make a regular expression searching for quoted strings "like this, maybe with \" or \\" in a Java or C++ program.
  * Write a Scala program that prints out all such strings in a source file.
  */

object Ex6 extends App {
  //val out_url = getClass.getResource("/")
  val out = new PrintWriter("ch9_ex6_out.txt")
  val url = getClass.getResource("/ch9_ex6.txt")
  //Source.fromURL(url).mkString.foreach(println(_))
  """\\\"""".r.findAllIn(Source.fromURL(url).mkString).foreach(s => out.println(s))


}
