package com.chengang.ch11

import com.chengang.Logging


/**
  * Define an unapplySeq operation for the RichFile class that extracts all path segments.
  * For example, for the file /home/cay/readme.txt , you should produce a sequence of three segments: home , cay , and readme.txt .
  */

object Ex10 extends {
  override val appName = "ex10"
} with App with Logging {

  //System.setProperty("log4j.configurationFile", "conf/log4j2.xml")

  //val logger = LoggerFactory.getLogger(this.getClass.getName)

  object RichFile {
    def unapplySeq(s: String): Option[Seq[String]] =
      if (s == "") None
      else Some(s.split("/").filter(_ != ""))
  }

  val RichFile(a, b, o@_*) = "/a/b/c-d/readme.txt"

  logInfo("p1: %s, p2: %s, other: %s".format(a, b, o))
  logError("p1: %s, p2: %s, other: %s".format(a, b, o))

  println("p1: %s, p2: %s, other: %s".format(a, b, o))

}



