package com.chengang.ch2

/**
  * Created by che on 9/26/2018.
  */

/**
  * Come up with one situation where the assignment x = y = 1 is valid in Scala. (Hint: Pick a suitable type for x .)
  */

object Ex3 extends App {

  var y: Int = 0

  val x = y = 1
  assert(x.isInstanceOf[Unit])
}
