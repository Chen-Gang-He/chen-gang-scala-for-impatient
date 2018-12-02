package com.chengang.ch4
//import java.util
import java.util.{Scanner, TreeMap}
import scala.collection.mutable.Map
import scala.collection.JavaConversions.mapAsScalaMap
/**
  * Repeat the preceding exercise with a java.util.TreeMap that you adapt to the Scala API.
  */
object Ex5 extends App {
  val wordCount: Map[String, Int] = new java.util.TreeMap[String, Int]()
  //val tree = new TreeMap[String, Int]()
  val in = new java.util.Scanner(new java.io.File("c:\\src\\c.txt"))
  while (in.hasNext()) {
    val line = in.next()
    println(line)
    for (w <- line.split("\\W+")) {
      wordCount(w) = wordCount.getOrElse(w, 0) + 1
    }
  }
   wordCount.foreach(println)


}
