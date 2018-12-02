package com.chengang.ch4


import scala.io.Source
/**
  * Repeat the preceding exercise with an immutable map.
  */
object Ex3 extends App{
  //val wordCount = new scala.collection.mutable.HashMap[String,Int]
  val in = new java.util.Scanner(new java.io.File("c:\\src\\sit1.sh"))
  val file = Source.fromFile(new java.io.File("c:\\src\\sit1.sh"))
  val words = file.getLines().mkString.split("\\s+")
  val wordCount = (for (w <- words.distinct)
    yield (w, words.count(w == _))).toMap
  wordCount.foreach(t => println("key: " + t._1 + " value: " + t._2))

}
