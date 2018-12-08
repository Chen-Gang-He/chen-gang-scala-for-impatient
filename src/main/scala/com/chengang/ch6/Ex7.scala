package com.chengang.ch6

import com.chengang.ch6.Ex6.CardSuits._

/**
  * Implement a function that checks whether a card suit value from the preceding exercise is red.
  */

object Ex7 extends App {

  def isRed(cardSuits: CardSuits): Boolean = cardSuits == hearts || cardSuits == diamonds


  assert(isRed(hearts) == true)

}
