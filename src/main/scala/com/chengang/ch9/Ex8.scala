package com.chengang.ch9

import scala.io.Source

/**
  * Write a Scala program that prints the src attributes of all img tags of a web page.
  * Use regular expressions and groups.
  */

object Ex8 extends App {

  val r = """<img([^>]+)src=\"([^\"]+)""".r

  for (r(a, b) <- r.findAllIn(Source.fromURL("""http://news.qq.com""").mkString)) println(b)

}
