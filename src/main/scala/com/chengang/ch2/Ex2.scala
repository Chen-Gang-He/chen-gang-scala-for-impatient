package com.chengang.ch2

/**
  * Created by che on 9/26/2018.
  */

/**
  * What is the value of an empty block expression {} ? What is its type?
  */
object Ex2 extends App {

  assert( {} == ())

  assert({}.isInstanceOf[Unit])


}
