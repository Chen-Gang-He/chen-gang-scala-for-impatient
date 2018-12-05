package com.chengang.ch5

/**
  * Write a class Time with read-only properties hours and minutes and a method before(other: Time):
  * Boolean that checks whether this time comes before the other.
  *
  * A Time object should be constructed as new Time(hrs, min), where hrs is in military time format (between 0 and 23).
  */
object Ex3 extends App{

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

    def hour: Int = _hour

    def minute: Int = _min

    def before(other: Ex3.Time): Boolean = {
      hour < other.hour || (hour == other.hour && minute < other.minute)
    }

    override def toString: String = "Time: %d Min: %d".format(_hour, _min)
  }


  println(new Time(21, 123))


}
