package com.chengang.ch6

//import scala.swing.ScrollPane.BarPolicy.Value

/**
  * Write an enumeration describing the four playing card suits so that the toString method returns ♣, ♦, ♥, or ♠.
  */


object Ex6 extends App {

  object CardSuits extends Enumeration {
    type CardSuits = Value
    val spades = Value("\u2660")
    val diamonds = Value("\u2666")
    val hearts = Value("\u2665")
    val clubs = Value("\u2663")
  }


  for (c <- CardSuits.values) println("id:%d value:%s".format(c.id, c))


}
