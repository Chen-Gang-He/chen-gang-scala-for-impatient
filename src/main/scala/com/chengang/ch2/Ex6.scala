package com.chengang.ch2

/**
  * Created by che on 9/26/2018.
  */

/**
  * Write a for loop for computing the product of the Unicode codes of all letters in a string.
  * For example, the product of the characters in "Hello" is 9415087488L .
  */

object Ex6 extends App {
  var i: Long = 1

  for (c <- "Hello") i *= c.toLong

  println(i)

}
