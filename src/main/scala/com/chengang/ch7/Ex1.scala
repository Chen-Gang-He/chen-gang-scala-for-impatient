package com.chengang
package ch7

/**
  * Write an example program to demonstrate that package com.horstmann.impatient is not the same as
  * package com
  * package horstmann
  * package impatient
  */

object Ex1 extends App {
  //ch6 is accessible
  import ch6.Ex6.CardSuits._

  assert(ch6.Ex7.isRed(hearts))

}
