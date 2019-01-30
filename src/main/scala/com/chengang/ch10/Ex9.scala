package com.chengang.ch10

import java.io.{BufferedInputStream, FileInputStream}

/**
  * Using the logger traits from this chapter, add logging to the solution of the preceding problem
  * that demonstrates buffering.
  */

object Ex9 extends App {

  trait Logger {
    def log(msg: String): Unit = {
    }
  }

  trait Buffering extends Logger {
    this: FileInputStream =>
    val bi = new BufferedInputStream(this)

    override def read(): Int = {
      log("Current available: " + bi.available + ":" + this.available)
      bi.read()
    }

    override def log(msg: String): Unit = {
      println(msg)
      super.log(msg)
    }

  }

  trait IterableBuffering extends Logger with Iterable[Byte] {
    this: FileInputStream =>
    val bi = new BufferedInputStream(this)

    override def read(): Int = {
      log("Current available: " + bi.available + ":" + this.available)
      bi.read()
    }

    def iterator = new Iterator[Byte] {
      override def hasNext: Boolean = bi.available > 0

      override def next(): Byte = bi.read().toByte
    }

    override def log(msg: String): Unit = {
      println(msg)
      super.log(msg)
    }

  }

  val f = new FileInputStream("c:\\src\\ch10_ex7.txt") with Buffering

  Iterator.continually(f.read()).takeWhile(_ != -1).foreach(b => println(b.toChar))
  // takeWhile is a must to stop calling read method

  val iterableBuffering = new FileInputStream("c:\\src\\ch10_ex7.txt") with IterableBuffering
  println(iterableBuffering.map(_.toChar).mkString)
}
