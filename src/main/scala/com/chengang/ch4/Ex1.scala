package com.chengang.ch4

/**
  * Set up a map of prices for a number of gizmos that you covet.
  * Then produce a second map with the same keys and the prices at a 10 percent discount.
  */

object Ex1 {

  def main(args: Array[String]): Unit = {
    val m = Map("Nexus 5" -> 300, "Nexus 7" -> 200, "Chromecast" -> 35)
    val discount = m.mapValues(_ * 0.90)
    //m.foreach((e: (String, Int)) => println(e._1 + "=" + e._2))
    discount.foreach((t: (String, Double)) => println("key: " + t._1 + "value: " + t._2.toString))
  }

}
