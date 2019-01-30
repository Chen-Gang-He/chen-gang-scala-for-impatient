package com.chengang.ch10

import java.awt.Point

/**
  * Define a class OrderedPoint by mixing scala.math.Ordered[Point] into java.awt.Point .
  *
  * Use lexicographic ordering, i.e. ( x , y ) < ( x ’, y ’) if x < x’ or x = x’ and y < y ’.
  */
object Ex2 extends App {

  class OrderedPoint(x: Int, y: Int) extends Point(x, y) with scala.math.Ordered[Point] {
    def compare(that: Point): Int = {
      ((this.x - that.x).signum, (this.y - that.y).signum) match {
        case (-1, _) | (0, -1) => -1
        case (0, 0) => 0
        case _ => 1
      }
    }

  }

  assert(new OrderedPoint(1, 3) > new OrderedPoint(0, 2))
  assert(new OrderedPoint(1, 3) > new OrderedPoint(1, 2))


}
