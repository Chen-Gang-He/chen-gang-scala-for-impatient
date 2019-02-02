package com.chengang.ch11

import scala.collection.mutable.ArrayBuffer

/**
  * HTML table. For example,
  * | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
  * should produce <table><tr><td>Java</td><td>Scala</td></tr><tr><td>Gosling...
  */
object Ex5 extends App {

  class Table {
    private var tables = ArrayBuffer[ArrayBuffer[String]](ArrayBuffer())

    def |(cell: String): Table = {
      tables(tables.length - 1) += cell
      this
    }

    def ||(cell: String): Table = {
      tables += ArrayBuffer[String](cell)
      this
    }

    override def toString: String = {
      tables.map(_.mkString("<td>", "</td><td>", "</td>")).mkString("<table><tr>", "</tr><tr>", "</tr></table>")
    }
  }

  object Table {
    def apply(): Table = new Table()
  }

  val table = Table() | "Java" | "Scala" || "Gosling" | "Odersky" || "JVM" | "JVM, .NET"
  println(table)
}
