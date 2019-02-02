package com.chengang.ch11

/**
  * Define an unapplySeq operation for the RichFile class that extracts all path segments.
  * For example, for the file /home/cay/readme.txt , you should produce a sequence of three segments: home , cay , and readme.txt .
  */

object Ex10 extends App {

  object RichFile {
    def unapplySeq(s: String): Option[Seq[String]] =
      if (s == "") None
      else Some(s.split("/"))
  }

  val RichFile(a, b, o@_*) = "/a/b/c-d/readme.txt"

  println("p1: %s, p2: %s, other: %s".format(a, b, o))

}



