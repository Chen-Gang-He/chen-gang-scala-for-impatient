package com.chengang.ch11

/**
  * Provide a class Matrix —you can choose whether you want to implement 2 × 2 matrices,
  * square matrices of any size, or m × n matrices.
  *
  * Supply operations + and * . The latter should also work with scalars, for example mat * 2 .
  *
  * A single element should be accessible as mat(row, col) .
  */

object Ex8 extends App {

  class Matrix(val m: Array[Array[Double]]) {
    val w = m(0).length
    val h = m.length

    def apply(x: Int, y: Int): Double = m(x)(y)

    def update(x: Int, y: Int, v: Double): Unit = {
      m(x)(y) = v
    }

    def f(other: Matrix, f: ((Double, Double) => Double)): Array[Array[Double]] = {
      if (this.dim != other.dim)
        throw new Exception("Can only add matrix with same size")
      (for (r <- 0 until h) yield m(r).zip(other.m(r)).map(t => f(t._1, t._2))).toArray
    }

    def dim = (w, h)

    def +(other: Matrix): Matrix = new Matrix(f(other, (a, b) => a + b))

    def *(other: Matrix): Matrix = new Matrix(f(other, (a, b) => a * b))

    def *(v: Double): Matrix = {
      new Matrix((for (i <- m.indices) yield m(i).map(_ * v)).toArray)
    }

    override def toString: String = m.map(_.mkString(" ")).mkString("\r\n")

  }

  val m = new Matrix(Array(Array(1.0, 2.0, 3.0), Array(4.0, 5.0, 6.0)))

  val n = new Matrix(Array(Array(1.0, 2.0, 3.0), Array(4.0, 5.0, 6.0)))

  println((m * 2 + n) * m)

}
