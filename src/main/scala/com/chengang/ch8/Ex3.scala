package com.chengang.ch8

/**
  * Consult your favorite Java or C++ textbook that is sure to have an example of a toy inheritance hierarchy,
  * perhaps involving employees, pets, graphical shapes, or the like.
  *
  * Implement the example in Scala.
  */
object Ex3 extends App {

  class Employee(val name: String, private var _salary: Double) {
    val id: Int = Employee.nextId

    def salary = _salary

    def raiseSalary(percent: Double): Double = {
      _salary += _salary * percent
      _salary
    }
  }

  object Employee {
    var id: Int = 0

    def nextId: Int = {
      id += 1; id
    }
  }

  class Manager(name: String, salary: Double) extends Employee(name, salary) {
    var bonus: Double = 0

    def getSalary = salary + bonus
  }

  val chenGang = new Employee("chen-gang", 100.0)
  println("name : %s id: %d, salary: %.1f".format(chenGang.name, chenGang.id, chenGang.salary))
  val john = new Manager("John", 100.0)
  println("name : %s id: %d, salary: %.1f".format(john.name, john.id, john.salary))


}
