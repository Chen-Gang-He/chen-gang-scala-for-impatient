package com.chengang.ch2

/**
  * Created by che on 9/26/2018.
  */

/**
  * Write a procedure countdown(n: Int) that prints the numbers from n to 0.
  */
object Ex5 extends App {

  def countDown(i: Int): Unit = {
    i.to(1, -1).foreach(println)
  }

  countDown(10)

}
