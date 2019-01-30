package com.chengang.ch10

import java.io.PrintWriter

/**
  * There are dozens of Scala trait tutorials with silly examples of barking dogs or philosophizing frogs.
  * Reading through contrived hierarchies can be tedious and not very helpful, but designing your own is very illuminating.
  *
  * Make your own silly trait hierarchy example that demonstrates layered traits,
  * concrete and abstract methods, and concrete and abstract fields.
  */


object Ex7 extends App {

  trait Logger {
    def log(msg: String) {}

    def logInfo(msg: String): Unit = {
      log("INFO: " + msg)
    }

    def logWarn(msg: String): Unit = {
      log("WARN: " + msg)
    }

    def logError(msg: String): Unit = {
      log("ERROR: " + msg)
    }
  }

  trait ConsoleLogger extends Logger {
    override def log(msg: String): Unit = {
      println(msg)
      super.log(msg)
    }
  }

  trait FileLogger extends Logger {
    val fileName: String
    val out = new PrintWriter(fileName)

    override def log(msg: String): Unit = {
      out.println(msg)
      super.log(msg)
    }
  }

  class Foo {
  }

  val foo = new Foo with ConsoleLogger

  foo.logInfo("wer")
  foo.logWarn("wer")

  val foo2 = new {
    val fileName = "c:\\src\\ch10_ex7.txt"
  } with Foo with FileLogger with ConsoleLogger

  foo2.logInfo("wer")
  foo2.logWarn("wer")
  foo2.out.close()
}
