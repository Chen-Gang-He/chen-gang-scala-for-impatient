package com.chengang.ch8

/**
  * Design a class Point whose x and y coordinate values can be provided in a constructor.
  * Provide a subclass LabeledPoint whose constructor takes a label value and x and y coordinates, such as
  *
  * new LabeledPoint("Black Thursday", 1929, 230.07)
  */
object Ex5 extends App {

  class Point(val x: Double, val y: Double)

  class LabeledPoint(val label: String, x: Double, y: Double) extends Point(x, y)


  val labeledPoint = new LabeledPoint("Center", 0.0, 0.0)


  assert(labeledPoint.label == "Center" && labeledPoint.x == 0.0D && labeledPoint.y == 0.0D)

}
