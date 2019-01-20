package com.chengang.ch9

import java.io.File

/**
  * Write a Scala program that counts how many files with .class extension are in a given directory and its
  * subdirectories.
  */

object Ex9 extends App {

  def getClassCount(file: File): Int = {
    val files = file.listFiles
    val dirs = files.filter(_.isDirectory)
    files.filter(_.isFile).count(f => """\.class$""".r.findFirstIn(f.getName).isDefined) +
      dirs.map(d => getClassCount(d)).sum
  }

  val in = new File("C:\\src\\IdeaProjects\\chen-gang-scala-for-impatient\\target")

  println(getClassCount(in))

}
