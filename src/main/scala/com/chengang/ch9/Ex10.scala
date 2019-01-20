package com.chengang.ch9

import java.io._

import scala.collection.mutable.ArrayBuffer

/**
  * Expand the example with the serializable Person class that stores a collection of friends.
  * Construct a few Person objects, make some of them friends of another, and then save an Array[Person] to a file.
  *
  * Read the array back in and verify that the friend relations are intact.
  */

object Ex10 extends App {

  class Person(val name: String) extends Serializable {
    private val friends = new ArrayBuffer[Person]()

    def addFriend(p: Person): Unit = {
      friends += p
    }

    def isFriend(p: Person) = friends.contains(p)
  }

  val chengang = new Person("Chen-Gang")
  val joyce = new Person("Joyce")
  val fiona = new Person("Fiona")
  chengang.addFriend(joyce)
  chengang.addFriend(fiona)
  joyce.addFriend(fiona)
  fiona.addFriend(joyce)

  val persons = Array(chengang, joyce, fiona)
  val out = new ObjectOutputStream(new FileOutputStream("c:\\src\\test.obj"))

  out.writeObject(persons)
  out.close()

  val in = new ObjectInputStream(new FileInputStream("c:\\src\\test.obj"))

  val Array(p1, p2, p3) = in.readObject().asInstanceOf[Array[Person]]

  println(p1.name)


}
