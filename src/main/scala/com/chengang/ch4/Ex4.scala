package com.chengang.ch4

import scala.io.Source

/**
  * Repeat the preceding exercise with a sorted map, so that the words are
  * printed in sorted order.
  */

object Ex4 extends App {

  val url = getClass.getResource("c:\\src\\sit1.sh")
  val file = Source.fromFile(new java.io.File("c:\\src\\sit1.sh"))
  val words = file.mkString.split("\\s+")
  val wordCount = collection.immutable.SortedMap[String, Int]()
  val wordCount2 = wordCount ++ (for (w <- words.distinct) yield (w, words.count(_ == w)))

  wordCount2.foreach(t => println("k: %s, c: %d".format(t._1, t._2)))

}
