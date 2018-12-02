package com.chengang.ch4

import java.util.Calendar._
/**
  * Define a linked hash map that maps "Monday" to java.util.Calendar.MONDAY , and similarly for the other weekdays.
  * Demonstrate that the elements are visited in insertion order.
  */
object Ex6 extends App{

  val week = new collection.mutable.LinkedHashMap[String, Int]()

  val p = i

  week.put("Monday", MONDAY)
  week.put("TUESDAY", TUESDAY)


  val days = scala.collection.mutable.LinkedHashMap(
    "MONDAY" -> java.util.Calendar.MONDAY,
    "TUESDAY" -> java.util.Calendar.TUESDAY,
    "WEDNESDAY" -> java.util.Calendar.WEDNESDAY,
    "THURSDAY" -> java.util.Calendar.THURSDAY,
    "FRIDAY" -> java.util.Calendar.FRIDAY,
    "SATURDAY" -> java.util.Calendar.SATURDAY,
    "SUNDAY" -> java.util.Calendar.SUNDAY
  )

  week.foreach(t => println("K: %s, v: %s".format(t._1, t._2)))
}
