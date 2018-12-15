package com.chengang.ch7

import java.util.{HashMap => JavaHashMap}

import scala.collection.mutable.HashMap


/**
  * Write a program that copies all elements from a Java hash map into a Scala hash map.
  *
  * Use imports to rename both classes.
  */
object Ex6 extends App {

  val javaHashMap = new JavaHashMap[String, String]()
  javaHashMap.put("a", "a")
  javaHashMap.put("b", "b")

  val hashMap = new HashMap[String, String]
  val iterator = javaHashMap.entrySet().iterator()
  while (iterator.hasNext) {
    val pair = iterator.next()
    hashMap += (pair.getKey -> pair.getValue)
  }


  hashMap.foreach(t => println("key: %s, value: %s".format(t._1, t._2)))
}


