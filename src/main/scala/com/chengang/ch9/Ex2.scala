package com.chengang.ch9

import java.io.PrintWriter

import scala.io.Source

/**
  * Write a Scala program that reads a file with tabs, replaces each tab with spaces so that tab stops are
  * at n -column boundaries, and writes the result to the same file.
  */
object Ex2 extends App {
  val f = Source.fromFile("c:\\src\\m.txt")
  val arrayOfArray = f.getLines().toArray.map(line => line.split("\t"))

  val columnCount = arrayOfArray.map(a => a.length).max

  val columnLength = arrayOfArray.filter(_.length == columnCount).map(a => a.map(_.length))

  columnLength.foreach(x => println(x.mkString(",")))

  val columnMaxLength = Range(0, columnCount).map(i => columnLength.map(a => a(i)).max)
  //
  println(columnMaxLength)

  val targetA = arrayOfArray.map(a => Range(0, columnCount).
    map(i => "%s%s".format(a(i), " " * (columnMaxLength(i) - a(i).length))))

  targetA.foreach(a => println(a.mkString(" ")))

  val out = new PrintWriter("c:\\src\\mm.txt")
  targetA.foreach(a => out.write(a.mkString("", " ", "\n")))
  out.close()

}
