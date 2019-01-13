package com.chengang.ch8

/**
  * Extend the BankAccount class of the preceding exercise into a class SavingsAccount that earns interest every month
  * (when a method earnMonthlyInterest is called) and has three free deposits or withdrawals every month.
  * Reset the transaction count in the earnMonthlyInterest method.
  */
object Ex2 extends App {

  class SavingsAccount(initialBalance: Double) extends Ex1.BankAccount(initialBalance) {
    private var checkCount = 0

    def earnMonthlyInterest(interest: Double = 0.01): Double = {
      super.deposit(super.currentBalance * interest)
      checkCount = 0
      super.currentBalance
    }

    def charge: Unit = {
      checkCount += 1
      if (checkCount > 3) super.withdraw(1)
    }

    override def withdraw(amount: Double): Double = {
      charge; super.withdraw(amount)
    }


    override def deposit(amount: Double): Double = {
      charge; super.deposit(amount)
    }

  }


  val MyAccount = new SavingsAccount(100)

  MyAccount.deposit(10)
  MyAccount.withdraw(20)
  MyAccount.deposit(10)

  assert(MyAccount.currentBalance == 100.0)

  MyAccount.deposit(10)

  assert(MyAccount.currentBalance == 109.0)

  MyAccount.earnMonthlyInterest()

  assert(MyAccount.currentBalance == 110.09)

  MyAccount.deposit(10)

  assert(MyAccount.currentBalance == 120.09)


}
