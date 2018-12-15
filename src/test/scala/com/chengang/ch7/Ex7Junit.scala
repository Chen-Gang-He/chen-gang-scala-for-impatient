package scala.com.chengang.ch7

import java.util.{HashMap => JavaHashMap}

import com.chengang.ch7.Ex7
import org.junit.Assert.assertEquals
import org.junit.Test
import org.scalatest.junit.AssertionsForJUnit

import scala.collection.mutable

/**
  * Created by che on 12/15/2018.
  */
class Ex7Junit extends AssertionsForJUnit {

  @Test def verifyJava2ScalaHashMap() {
    val javaHashMap = new JavaHashMap[String, String]()
    javaHashMap.put("a", "b")
    javaHashMap.put("b", "c")

    val scalaHashMap = mutable.HashMap(("a", "b"), ("b", "c"))
    assertEquals(Ex7.java2ScalaHashMap(javaHashMap), scalaHashMap)
  }

}
