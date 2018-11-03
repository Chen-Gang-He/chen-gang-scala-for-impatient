package com.chengang.ch3

/**
  * Repeat the preceding assignment, but produce a new array with the swapped values. Use for / yield .
  */
object Ex3 extends App {

  def swap(array: Array[Int]): Array[Int] = {
    (for (i <- 0.until(array.length)) yield {
      if (i % 2 != 0)
        array(i - 1)
      else if (array.length == 1 || array.length - 1 == i)
        array(i)
      else
        array(i + 1)
    }
      ).toArray

  }



  swap(Array(1, 2, 3, 4, 5)).foreach(println)


}
