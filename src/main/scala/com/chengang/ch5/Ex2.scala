package com.chengang.ch5

/**
  * Write a class BankAccount with methods deposit and withdraw, and a read-only property balance.
  */

object Ex2 extends App {

  class BankAccount(private var _balance: Double) {
    def balance: Double = _balance

    def deposit(amount: Double): Unit = {
      _balance += amount
    }

    def withdraw(amount: Double): Unit = {
      _balance -= amount
    }
  }

  val chengangAccount = new BankAccount(10.1)
  chengangAccount.withdraw(2.1)
  println(chengangAccount.balance)

}
