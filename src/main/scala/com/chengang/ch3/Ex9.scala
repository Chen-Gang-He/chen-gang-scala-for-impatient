package com.chengang.ch3

import java.util.TimeZone

/**
  * Make a collection of all time zones returned by java.util.TimeZone.getAvailableIDs that are in America.
  * Strip off the "America/" prefix and sort the result.
  */
object Ex9 extends App {
  val prefix = "America/"
  //TimeZone.getAvailableIDs.foreach(println)
  TimeZone.getAvailableIDs.filter(_.startsWith(prefix)).map(x => x.replaceAll(prefix, "")).sorted.foreach(println)


}
