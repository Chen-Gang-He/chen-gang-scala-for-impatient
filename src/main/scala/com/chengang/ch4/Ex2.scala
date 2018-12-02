package com.chengang.ch4


/**
  * Write a program that reads words from a file. Use a mutable map to count how often each word appears.
  * To read the words, simply use a java.util.Scanner :
  * val in = new java.util.Scanner(new java.io.File("myfile.txt")) while (in.hasNext()) process in.next()
  *
  * Or look at Chapter 9 for a Scalaesque way. At the end, print out all words and their counts.
  */

object Ex2 extends App {
  val wordCount = new scala.collection.mutable.HashMap[String,Int]
  val in = new java.util.Scanner(new java.io.File("c:\\src\\c.txt"))
  while (in.hasNext()) {
    val line = in.next()
    println(line)
    for (w <- line.split("\\W+")) wordCount(w) = wordCount.getOrElse(w, 0) + 1
  }


  wordCount.foreach(t => println("key: " + t._1 + " value: " + t._2))

}
