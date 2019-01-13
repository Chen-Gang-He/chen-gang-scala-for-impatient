package com.chengang.ch8

/**
  * Compile the Person and SecretAgent classes in Section 8.6 , “ Overriding Fields ,” on page 89 and analyze
  * the class files with javap .
  *
  * How many name fields are there? How many name getter methods are there?
  *
  * What do they get? (Hint: Use the -c and -private options.)
  */

object Ex8 extends App {

  //public class com.chengang.Person {
  //  private final java.lang.String name;
  //  public java.lang.String name();
  //  public java.lang.String toString();
  //  public com.chengang.Person(java.lang.String);
  //}


  class Person(val name: String) {
    override def toString: String = getClass.getName + " Name: " + name
  }

  //public class com.chengang.SecretAgent extends com.chengang.Person {
  //  private final java.lang.String name;
  //  private final java.lang.String toString;
  //  public java.lang.String name();
  //  public java.lang.String toString();
  //  public com.chengang.SecretAgent(java.lang.String);
  //}


  class SecretAgent(codeName: String) extends Person(codeName) {
    override val name = "secret"
    override val toString = "secret"
  }

}
