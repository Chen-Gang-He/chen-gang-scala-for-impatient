package com.chengang.ch3

import org.apache.logging.log4j.core.util.Assert

/**
  * Write a code snippet that produces all values from an array with duplicates removed. (Hint: Look at Scaladoc.)
  */
object Ex7 extends App {
  assert(Array(12, 3, 4, 4).distinct.deep == Array(12, 3, 4).deep)

}
