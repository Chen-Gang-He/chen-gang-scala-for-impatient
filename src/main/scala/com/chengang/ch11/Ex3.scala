package com.chengang.ch11

import scala.math._

/**
  * Implement the Fraction class with operations + - * / . Normalize fractions, for example turning 15/–6 into –5/2.
  * Divide by the greatest common divisor, like this:
  *
  * class Fraction(n: Int, d: Int) {
  * private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
  * private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d);
  * override def toString = num + "/" + den
  * def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
  * def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)
  * ..
  */


object Ex3 extends App {

  class Fraction(n: Int, d: Int) {
    private val _gcd = gcd(n, d)
    private val num: Int = if (d == 0) 1 else n * sign(n) / _gcd
    private val den: Int = if (d == 0) 0 else d * sign(n) / _gcd

    def +(other: Fraction) = new Fraction(num * other.den + den * other.num, den * other.den)

    def -(other: Fraction) = new Fraction(num * other.den - den * other.num, den * other.den)

    def *(other: Fraction) = new Fraction(num * other.num, den * other.den)

    def /(other: Fraction) = new Fraction(num * other.den, den * other.num)

    def sign(a: Int): Int = if (a > 0) 1 else if (a < 0) -1 else 0

    def gcd(a: Int, b: Int): Int = if (b == 0) abs(a) else gcd(b, a % b)

    override def toString = num + "/" + den

  }

  val f1 = new Fraction(2, 6)

  val f2 = new Fraction(2, 3)


  val f3 = f2 + f1
  println(f3)

  val f4 = f1 - f2

  println(f4)
}
