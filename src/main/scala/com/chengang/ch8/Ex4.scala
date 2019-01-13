package com.chengang.ch8

import scala.collection.mutable.ArrayBuffer

/**
  * Define an abstract class Item with methods price and description . A SimpleItem is an item whose price
  * and description are specified in the constructor. Take advantage of the fact that a val can override a def .
  *
  * A Bundle is an item that contains other items. Its price is the sum of the prices in the bundle.
  * Also provide a mechanism for adding items to the bundle and a suitable description method.
  *
  */
object Ex4 extends App {

  abstract class Item {
    def price: Double

    def description: String
  }

  class SimpleItem(val price: Double, val description: String) extends Item {

  }

  class Bundle() extends Item {
    var items: ArrayBuffer[Item] = ArrayBuffer[Item]()

    def addItem(item: Item): Unit = {
      items += item
    }

    def price: Double = {
      items.map(_.price).reduce(_ + _)
    }

    def description = items.map(_.description).mkString(",")

  }

  val si1 = new SimpleItem(4.5, "ring")
  val si2 = new SimpleItem(6.5, "necklace")

  val b = new Bundle()
  b.addItem(si1)
  b.addItem(si2)
  println(b.description)
  assert(b.price == 11.0)
  assert(b.description == "ring,necklace")

}
