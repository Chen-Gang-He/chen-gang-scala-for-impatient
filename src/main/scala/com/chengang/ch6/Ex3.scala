package com.chengang.ch6

/**
  * Define an Origin object that extends java.awt.Point . Why is this not actually a good idea?
  * (Have a close look at the methods of the Point class.)
  */
object Ex3 extends App {

  object Origin extends java.awt.Point {}

  Origin.move(1, 2)

}
