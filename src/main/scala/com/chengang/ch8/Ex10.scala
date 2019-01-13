package com.chengang.ch8

/**
  * The file scala/collection/immutable/Stack.scala contains the definition
  * class Stack[A] protected (protected val elems: List[A])
  *
  * Explain the meanings of the protected keywords. (Hint: Review the discussion of private constructors in Chapter 5 .)
  */

object Ex10 extends App {

  class Person protected(protected val name: String) {
    def this(n: String, age: Int) {
      this(n)
    }
  }

  class Manager(n: String) extends Person(n)

  class Ant(name: String) extends Person(name) {
    //def getPersonName :String = {
    //  val person = new Person("Chengang", 12)
    //  person.name
    //}

    def getName = this.name


  }

  //A protected constructor can only be accessed by an auxiliary constructor from same or descendant class
  val ant = new Ant("Ant")
  //println(ant.getPersonName)
  println(ant.getName)


}
