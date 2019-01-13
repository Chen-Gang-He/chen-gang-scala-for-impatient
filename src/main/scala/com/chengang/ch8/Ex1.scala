package com.chengang.ch8

/**
  * Extend the following BankAccount class to a CheckingAccount class that charges $1 for every deposit
  * and withdrawal.
  *
  * class BankAccount(initialBalance: Double) {
  * private var balance = initialBalance
  * def currentBalance = balance
  * def deposit(amount: Double) = { balance += amount; balance }
  * def withdraw(amount: Double) = { balance -= amount; balance }
  * }
  *
  */
object Ex1 extends App {

  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance

    def currentBalance = balance

    def deposit(amount: Double) = {
      balance += amount;
      balance
    }

    def withdraw(amount: Double) = {
      balance -= amount;
      balance
    }
  }

  class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {

    def charge(amount: Double): Unit = {
      super.withdraw(amount)
    }

    override def deposit(amount: Double): Double = {
      charge(1)
      super.deposit(amount)
    }

    override def withdraw(amount: Double): Double = {
      charge(1)
      super.withdraw(amount)
    }

  }

  val account = new CheckingAccount(10)
  account.deposit(10)
  assert(account.currentBalance == 19)

}
