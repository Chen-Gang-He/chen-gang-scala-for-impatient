package com.chengang.ch5

/**
  * Reimplement the Time class from the preceding exercise so that the internal representation is the number of minutes
  * since midnight (between 0 and 24 × 60 – 1).
  *
  * Do not change the public interface. That is, client code should be unaffected by your change.
  */

object Ex4 extends App {

  class Time (hr: Int, min: Int) {
    private var _hour = hr
    private val _min: Int = min match {
      case i: Int if i % 60 == 0 =>  _hour += i / 60; 0
      case i: Int if i <= 0 => _hour += i / 60; Math.floorMod(i, 60)
      case i: Int if i > 0 => _hour += i / 60; i % 60
    }

    _hour = _hour match {
      case i: Int if i % 24 == 0 => 0
      case i: Int if i > 0 => i % 24
      case _ => Math.floorMod(_hour, 60)
    }

    private val _time = _hour * 60 + _min

    def hour: Int = _hour

    def minute: Int = _min

    def before(other: Ex4.Time): Boolean = {
      _time < other._time
    }

    override def toString: String = "Time: %d Min: %d".format(_hour, _min)
  }


  println(new Time(21, 123))

}
