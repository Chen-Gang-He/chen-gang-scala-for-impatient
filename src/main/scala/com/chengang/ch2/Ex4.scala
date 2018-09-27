package com.chengang.ch2

/**
  * Created by che on 9/26/2018.
  */

/**
  * Write a Scala equivalent for the Java loop
  * for (int i = 10; i >= 0; i--) System.out.println(i);
  */
object Ex4 extends App {
  10.to(20, 1).foreach(x => println(x))
  (1 until(10)).reverse.foreach(println)
  

}
