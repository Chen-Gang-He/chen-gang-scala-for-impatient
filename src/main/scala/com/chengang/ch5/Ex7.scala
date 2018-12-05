package com.chengang.ch5

/**
  * Write a class Person with a primary constructor that accepts a string containing a first name,
  * a space, and a last name, such as new Person("Fred Smith") . Supply read-only properties firstName and lastName .
  *
  * Should the primary constructor parameter be a var , a val , or a plain parameter? Why?
  */

object Ex7 extends App {

  class Person(_name: String) {
    val (firstName, lastName) = _name.split(" ") match {
      case Array(x: String, y: String, _*) => (x, y)
      case _ => (None, None)
    }

    //var _first: String = ""
    //var _last: String = ""
    //var _middle : String = ""
    val (_first, _middle, _last) = _name match {
      case Ex7.Name(first, last) => (first, "", last)
      case Ex7.Name(first, middle, last) => (first, middle, last)
    }
  }

  object Name {
    def unapplySeq(name: String): Option[Seq[String]] = {
      if (name == null) None
      else Some(name.split(" "))
    }
  }

  val a = new Person("a b c")

  println("firstName: %s LastName: %s _first: %s _last: %s _middle: %s".format(a.firstName, a.lastName, a._first, a._last, a._middle))



}
