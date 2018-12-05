package com.chengang.ch5

import scala.beans.BeanProperty

/**
  * Make a class Student with read-write JavaBeans properties name (of type String) and id (of type Long).
  *
  * What methods are generated? (Use javap to check.) Can you call the JavaBeans getters and setters in Scala?
  *
  * Should you?
  */
object Ex5 extends App {
  class Student (@BeanProperty val name: String,  @BeanProperty var id: Long)
  val chengang = new Student("Chen-Gang", 123)
  //
  //Compiled from "Ex5.scala"
  //public final class com.chengang.ch5.Ex5 {
  //  public static void main(java.lang.String[]);
  //  public static void delayedInit(scala.Function0<scala.runtime.BoxedUnit>);
  //  public static java.lang.String[] args();
  //  public static void scala$App$_setter_$executionStart_$eq(long);
  //  public static long executionStart();
  //  public static void delayedEndpoint$com$chengang$ch5$Ex5$1();
  //  public static com.chengang.ch5.Ex5$Student chengang();
  //}

  assert(chengang.getName == chengang.name)
}
