package com.chengang.ch8

import java.awt.Rectangle

/**
  * Provide a class Square that extends java.awt.Rectangle and has three constructors: one that constructs a square
  * with a that constructs a square with corner (0, 0) and width 0 .
  */

object Ex7 extends App {

  class Square(x: Int, y: Int, width: Int) extends Rectangle(x, y, width, width) {
    def this(width: Int) {
      this(0, 0, width)
    }

    def this() {
      this(0, 0, 0)
    }
  }

  val s1 = new Square(1, 2, 3)
  println("Center(%.2f, %.2f)".format(s1.getCenterX, s1.getCenterY))


}
