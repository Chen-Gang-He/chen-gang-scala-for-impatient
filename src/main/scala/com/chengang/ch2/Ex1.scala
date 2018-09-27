package com.chengang.ch2

/**
  * Created by che on 9/26/2018.
  */

/**
  * The signum of a number is 1 if the number is positive, –1 if it is negative, and 0 if it is zero.
  * Write a function that computes this value.
  */
object Ex1 extends App {
  def signum(int: Int) = {
    if (int > 0) 1 else if (int < 0 ) -1 else 0
  }
  assert(signum(-2) == -1)
  assert(signum(2) == 1)
  assert(signum(0) == 0)

}
