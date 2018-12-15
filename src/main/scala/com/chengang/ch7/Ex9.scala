package com.chengang.ch7

/**
  * Write a program that imports the java.lang.System class, reads the user name from the user.name system property,
  * reads a password from the Console object, and prints a message to the standard error stream
  * if the password is not "secret" .
  *
  * Otherwise, print a greeting to the standard output stream.
  * Do not use any other imports, and do not use any qualified names (with dots).
  */
object Ex9 extends App {
  if (args.length > 0 && args(1) == "secrete") {
    val props = System.getProperties()
    val userName = props.getProperty("user.name")
    println("user name: %s".format(userName))
    println("password :")
    val password = io.StdIn.readLine()
    if (password != "secret") println("this not secret")
    else {
      println("Greeting")
    }
  } else println("no password set")

}
