package com.chengang.ch2

/**
  * Created by che on 9/27/2018.
  */

/**
  * Write a function product(s : String) that computes the product, as described in the preceding exercises.
  */
object Ex8 extends App {
  def product(s: String) = {
    s.map(_.toLong).product
  }

  assert(product("Hello") == 9415087488L)


}
