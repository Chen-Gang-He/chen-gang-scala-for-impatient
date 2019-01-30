package com.chengang.ch10

import java.io.{BufferedInputStream, FileInputStream}

/**
  * In the java.io library, you add buffering to an input stream with a BufferedInputStream decorator.
  * Reimplement buffering as a trait. For simplicity, override the read method.
  */

object Ex8 extends App {

  trait Buffering {
    this: FileInputStream =>
    val bi = new BufferedInputStream(this)

    override def read(input: Array[Byte]): Int = {
      bi.read(input)
    }
  }

  val f = new FileInputStream("c:\\src\\ch10_ex7.txt") with Buffering
  val bytes = new Array[Byte](100)
  f.read(bytes)
  f.close()
  //bytes.filter(_ != None).foreach(x => println(x.toChar))
  println(bytes.map(_.toChar).mkString)
}
