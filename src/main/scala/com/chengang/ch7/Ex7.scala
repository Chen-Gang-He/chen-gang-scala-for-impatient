package com.chengang.ch7

//import scala.collection.mutable

/**
  * Created by che on 12/8/2018.
  */
object Ex7 extends App {

  import java.util.{HashMap => JavaHashMap}

  import scala.collection.mutable.HashMap

  def java2ScalaHashMap[A, B](hashMap: JavaHashMap[A, B]) = {
    val i = hashMap.entrySet().iterator()
    val scalaHashMap = new HashMap[A, B]()
    while (i.hasNext) {
      val pair = i.next()
      scalaHashMap += (pair.getKey -> pair.getValue)
    }

    scalaHashMap
  }

  val javaHashMap = new JavaHashMap[String, String]()
  javaHashMap.put("a", "a")
  javaHashMap.put("b", "b")
  java2ScalaHashMap(javaHashMap).foreach(t => println("key: %s, value: %s".format(t._1, t._2)))

}
