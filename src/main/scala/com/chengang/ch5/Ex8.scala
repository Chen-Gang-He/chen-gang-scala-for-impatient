package com.chengang.ch5

/**
  * Make a class Car with read-only properties for manufacturer, model name, and model year, and a read-write property
  * for the license plate.
  *
  * Supply four constructors. All require the manufacturer and model name. Optionally, model year and license plate
  * can also be specified in the constructor. If not, the model year is set to -1 and the license plate
  * to the empty string. Which constructor? Why?
  */

object Ex8 extends App{

  class Car(val manufacturer: String, val modelName: String, val licencePlate: String = "", val _modelYear: Int = -1)

}
