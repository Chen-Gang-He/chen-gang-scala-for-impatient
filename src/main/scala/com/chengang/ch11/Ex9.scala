package com.chengang.ch11

import com.chengang.Logging

/**
  * Define an unapply operation for the RichFile class that extracts the file path, name, and extension.
  * For example, the file /home/cay/readme.txt has path /home/cay , name readme , and extension txt .
  */

object Ex9 extends App with Logging {

  object RichFile {
    def unapply(s: String): Option[(String, String, String)] = {
      val reg = """(.+?)/([^/]+)\.([^\.]+)$""".r
      if (s == "") None
      else {
        val reg(p, n, e) = s
        Some(p, n, e)
      }
    }
  }

  val RichFile(p, n, e) = "/home/hadoop/xx-x/ab_xx.CSV.xxx"

  logInfo("p: %s, n: %s e: %s".format(p, n, e))
  logError("p: %s, n: %s e: %s".format(p, n, e))
  println("p: %s, n: %s e: %s".format(p, n, e))

}
