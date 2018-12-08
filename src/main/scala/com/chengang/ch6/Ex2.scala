package com.chengang.ch6

/**
  * The preceding problem wasn’t very object-oriented.
  * Provide a general superclass UnitConversion and define objects
  * InchesToCentimeters , GallonsToLiters , and MilesToKilometers that extend it.
  */
object Ex2 extends App {

  abstract class UnitConversion {
    def convertUnit(value: Double): Double
  }

  object inchesToCentimeters extends UnitConversion {
    def convertUnit(value: Double): Double = value * 2.54
  }

  object GallonsToLiters extends UnitConversion {
    def convertUnit(value: Double): Double = value * 3.78541178
  }

  object MilesToKilometers extends UnitConversion {
    def convertUnit(value: Double): Double = value * 1.609344
  }

}
