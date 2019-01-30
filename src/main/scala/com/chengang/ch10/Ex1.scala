package com.chengang.ch10

/**
  * The java.awt.Rectangle class has useful methods translate and grow that are unfortunately absent
  * from classes such as java.awt.geom.Ellipse2D .
  *
  * In Scala, you can fix this problem. Define a trait RectangleLike with concrete methods translate and grow .
  *
  * Provide any abstract methods that you need for the implementation, so that you can mix in the trait like this:
  *
  * val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
  * egg.translate(10, -10)
  * egg.grow(10, 20)
  */

object Ex1 extends App {

  trait RectangleLike {
    this: java.awt.geom.Ellipse2D =>
    def translate(dx: Int, dy: Int): Unit = {
      setFrame(getX + dx, getY + dy, getWidth, getHeight)
    }

    def grow(dw: Int, dh: Int): Unit = {
      setFrame(getX, getY, getWidth + dw, getHeight + dh)
    }
  }

  val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike

  egg.translate(10, 10)

  println("x: %f, y: %f".format(egg.x, egg.y))

  egg.grow(10, 10)

  println("w: %f, h: %f".format(egg.width, egg.height))


}
