package com.chengang.ch10

import java.io._

/**
  * Implement a class IterableInputStream that extends java.io.InputStream with the trait Iterable[Byte] .
  */

object Ex10 extends App {

  class IterableInputStream(is: InputStream) extends InputStream with Iterable[Byte] {
    def iterator = new Iterator[Byte] {
      def hasNext = is.available() > 0

      def next() = is.read.toByte
    }

    //
    def read = is.read
  }

  val iis = new IterableInputStream(new FileInputStream("c:\\src\\ch10_ex7.txt")).iterator

  println(iis.takeWhile(_ != -1).map(_.toChar).mkString)


}
