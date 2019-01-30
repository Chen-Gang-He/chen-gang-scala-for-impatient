package com.chengang.ch10

/**
  * Provide a CryptoLogger trait that encrypts the log messages with the Caesar cipher.
  * The key should be 3 by default, but it should be overridable by the user.
  *
  * Provide usage examples with the default key and a key of –3.
  */

object Ex4 extends App {

  trait Logger {
    def log(msg: String) {}
  }

  trait ConsoleLogger extends Logger {
    override def log(msg: String): Unit = println(msg)
  }

  trait CryptoLogger extends Logger {
    val key = 3

    override def log(msg: String): Unit = {

      val encryptedChars = for (c <- msg.toUpperCase()) yield {
        c match {
          case a if a >= 'A' && a <= 'Z' => encrypt(a, 'A', 26)
          case a => if (a >= '0' && a <= '9') encrypt(a, '0', 10)
          case _ => c
        }

      }
      super.log(encryptedChars.mkString(""))


    }

    def encrypt(input: Char, r: Char, m: Int): Char = {
      val out = ((input - r + key) % m + r).toChar
      println(out)
      out
    }
  }


  class Dummy {

  }

  val dummy = new Dummy with ConsoleLogger with CryptoLogger {
    override val key = 4
  }

  dummy.log("abc1233")
}

