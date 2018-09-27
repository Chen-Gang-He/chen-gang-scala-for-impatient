package com.chengang.ch2

/**
  * Created by che on 9/27/2018.
  */

/**
  * Make the function of the preceding exercise a recursive function.
  */
object Ex9 extends App {
  def product(s: String): Long = {
    if (s.length() == 1 ) s.head.toLong
    else
      {
        s.head.toLong * product(s.tail)
      }
  }

  assert(product("Hello") == 9415087488L)

}
