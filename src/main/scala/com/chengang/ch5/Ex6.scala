package com.chengang.ch5

/**
  * In the Person class of Section 5.1 , “Simple Classes and Parameterless Methods,” on page 49 ,
  * provide a primary constructor that turns negative ages to 0.
  */


object Ex6 extends App {

  class Person(private var _age : Int) {
    if (_age < 0) _age = 0

    def age: Int = _age

    def age_=(value: Int) {
      if (value > _age) _age = value
    }


  }

}
