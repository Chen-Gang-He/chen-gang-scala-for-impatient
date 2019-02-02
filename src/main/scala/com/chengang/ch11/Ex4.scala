package com.chengang.ch11


/**
  * 4. Implement a class Money with fields for dollars and cents. Supply + , - operators as well as
  * comparison operators == and < .
  *
  * For example, Money(1, 75) + Money(0, 50) == Money(2, 25) should be true .
  *
  * Should you also supply * and / operators? Why or why not?
  */

object Ex4 extends App {

  class Money(d: Int, c: Int) {
    val _d = d + c / 100
    val _c = c % 100

    def +(money: Money): Money = {
      Money(this._d + money._d, this._c + money._c)
    }

    def -(money: Money): Money = {
      Money(this._d - money._d, this._c - money._c)
    }

    def ==(money: Money): Boolean = {
      this._d == money._d && this._c == money._c
    }

    def <(money: Money): Boolean = {
      this._d < money._d || (this._d == money._d && this._c < money._c)
    }
  }

  object Money {
    def apply(d: Int, c: Int): Money = new Money(d, c)

    def apply(f: Float): Money = {
      new Money((f * 100).toInt / 100, (f * 100).toInt % 100)
    }
  }

  assert(Money(1, 75) + Money(0, 50) == Money(2, 25))

}
