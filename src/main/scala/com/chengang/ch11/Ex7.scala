package com.chengang.ch11

import java.lang.Long.parseLong

/**
  * Implement a class BitSequence that stores a sequence of 64 bits packed in a Long value.
  * Supply apply and update operators to get and set an individual bit.
  */

object Ex7 extends App {

  class BitSequence(s: String) {
    var bitInt = parseLong(s, 2)
    var l = java.lang.Long.parseLong(s, 2)

    def apply(i: Int) = bitInt & (1 << i)

    def update(i: Int, v: Boolean) {
      bitInt = v match {
        case true => bitInt | (1 << i)
        case false => bitInt ^ (1 << i)
      }
    }
  }

  val b = new BitSequence("010101010101010101010101010101010101010101010101010101010101110")

  println(b(10))
  b(0) = true

  assert(b.toString == "3074457345618258607")

}
