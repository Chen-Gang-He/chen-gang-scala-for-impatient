package com.chengang.ch5

/**
  * Improve the Counter class in Section 5.1 , “Simple Classes and Parameterless Methods,”
  * on page 49 so that it doesn’t turn negative at Int.MaxValue .
  */
object Ex1 extends App {

  class Counter(private var value: Int) {
    def Increment(): Unit = {
      if (value < Int.MaxValue)
        value += 1
    }

    def current: Int = value
  }

}
