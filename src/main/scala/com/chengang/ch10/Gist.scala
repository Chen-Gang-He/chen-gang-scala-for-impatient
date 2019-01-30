package com.chengang.ch10

import java.io.PrintWriter

/**
  * Created by che on 1/22/2019.
  */
object Gist extends App {

  trait Logged {
    def log(msg: String) {}
  }

  trait ConsoleLogger extends Logged {
    override def log(msg: String): Unit = println(msg)
  }

  trait ShortLogger extends Logged {
    val maxLength: String

    override def log(msg: String) {
      println("maxLength: " + maxLength)
      if (msg.length > maxLength.toInt)
        super.log(msg.substring(0, maxLength.toInt))
      else super.log(msg)
    }
  }

  trait FileLogger extends Logged {
    val fileName: String
    println("fileName: " + fileName)
    lazy val out = new PrintWriter(fileName)

    override def log(msg: String): Unit = {
      out.println(msg)
      out.close()
      super.log(msg)
    }
  }

  class Dummy {
  }

  class Dummy2 extends ConsoleLogger with ShortLogger {
    val maxLength: String = "11"
  }


  val dummy = new Dummy with ShortLogger {
    val maxLength = "10"
  }

  dummy.log("1234567891011")

  val dummy2 = new Dummy2()

  dummy2.log("1234567891011")

  val dummy3 = new Dummy with ConsoleLogger with FileLogger {
    val fileName = "c:\\src\\test2.txt"
  }

  dummy3.log("xxxxxxxxxxxx")
}
