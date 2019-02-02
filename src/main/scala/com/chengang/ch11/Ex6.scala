package com.chengang.ch11

/**
  * Provide a class ASCIIArt whose objects contain figures such as /\_/\ ( ' ' ) ( - ) | | | precedence.
  */

object Ex6 extends App {

  class ASCIIArt(private val _lines: Array[String]) {
    def this(s: String) {
      this(s.split("\r\n"))
    }

    def +(other: ASCIIArt): ASCIIArt = {
      val out = for (i <- 0 until this._lines.length) yield other._lines.isDefinedAt(i) match {
        case true => _lines(i) + other._lines(i)
        case _ => _lines(i)
      }
      new ASCIIArt(out.toArray)
    }

    def /(other: ASCIIArt): ASCIIArt = {
      new ASCIIArt(this._lines ++ other._lines)

    }

    override def toString: String = _lines.mkString("\r\n")

  }

  object ASCIIArt {
    def apply(s: String): ASCIIArt = new ASCIIArt(
      s
    )
  }

  val a = new ASCIIArt(
    """ /\_/\
( ' ' )
(  -  )
 | | |
(__|__)""")

  val b = new ASCIIArt(
    """   -----
 / Hello \
<  Scala |
 \ Coder /
   -----""")

  val c = new ASCIIArt(
    """   -----
 / Hello \
<  Scala |
 \ Coder /
   -----""")


  println(a / c + b)

}
