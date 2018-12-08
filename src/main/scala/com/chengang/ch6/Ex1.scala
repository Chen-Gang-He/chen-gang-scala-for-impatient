package com.chengang.ch6

/**
  * Write an object Conversions with methods inchesToCentimeters , gallonsToLiters , and milesToKilometers
  */
object Ex1 extends App {

  object Conversions {
    def inchesToCentimeters(inches: Double) = {
      inches * 2.54
    }

    def gallonsToLiters(gallons: Double) = {
      gallons * 3.78541178
    }

    def milesToKilometers(miles: Double) = {
      miles * 1.609344
    }
  }

}
