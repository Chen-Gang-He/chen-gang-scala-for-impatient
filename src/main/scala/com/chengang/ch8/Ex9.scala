package com.chengang.ch8

/**
  * In the Creature class of Section 8.10 , “ Construction Order and Early Definitions ,” on page 92 ,
  * replace val range with a def .
  *
  * What happens when you also use a def in the Ant subclass? What happens when you use a val in the subclass? Why?
  */

object Ex9 extends App {

  class Creature {
    val range: Int = 10
    val env: Array[Int] = new Array[Int](range)
  }

  class Ant extends Creature {
    override val range = 2
  }

  class CreatureA {
    def range: Int = 10

    val env: Array[Int] = new Array[Int](range)
  }

  class AntA extends CreatureA {
    override def range = 2
  }

  class AntB extends CreatureA {
    override val range = 2
  }

  val ant1 = new Ant
  println("Ant1 range: %d, env has %d dimensions".format(ant1.range, ant1.env.length))

  val antA = new AntA
  println("AntA range: %d, env has %d dimensions".format(antA.range, antA.env.length))
  assert(antA.env.length == 2)

  val antB = new AntB
  println("AntB range: %d, env has %d dimensions".format(antB.range, antB.env.length))
  assert(antB.env.length == 0)

}
