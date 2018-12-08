package com.chengang.ch6


/**
  * Write a Scala application, using the App trait, that prints the command-line arguments in reverse order,
  * separated by spaces.
  *
  * For example, scala Reverse Hello World should print World Hello .
  */

object Ex5 extends App {

  if (args.length > 1) println(args.reverse.mkString(" "))

}
