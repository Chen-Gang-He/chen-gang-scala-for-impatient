package com.chengang.ch4

/**
  * What happens when you zip together two strings, such as "Hello".zip("World") ? Come up with a plausible use case.
  */

object Ex10 extends App{

  val z = "Hello".zip("World")

  Array("a", "b", "c", "d").zip(Array(1, 2, 3, 4))

  //It returns IndexedSeq[(Char, Char)]

  val d = "Hello World!".zip("Hello world!  ").filter(t => t._1 != t._2)

  println(s"difference $d")

  assert( d == IndexedSeq(('W', 'w')))
}
