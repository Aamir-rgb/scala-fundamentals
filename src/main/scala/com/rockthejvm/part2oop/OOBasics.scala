package com.rockthejvm.part2oop



object OOBasics {

  //classes
  //constructor structure -> list of the arguments of the all elements of constructor
  class Person(val name:String,age:Int) {
    //Fields
    val allCaps = name.toUpperCase()

    //Methods -> Functions attached to every sing element of the class
    def greet(name:String): String = {
      //this.name refers to constructor name $name refers to argument of methods
      s"${this.name} says: Hi ${name}"
    }
    def greet(): String = {
      //this.name refers to constructor name $name refers to argument of methods
      s"Hi everyone my name is ${name}"
    }

    //Overloading greet methods with two different signatures

    //Aux Constructor
    def this(name:String) =
      this(name,0)
    def this() =
      this("Jane Doe")
  }

   //If you want to access constructor argument as fields you must use val
     val aPerson:Person = new Person("John",26)
     val john = aPerson.name
     val johnYelling = aPerson.allCaps
     val johnSaysHiToDaniel = aPerson.greet("Daniel")
     val johnSaysHi = aPerson.greet()

  def main(args: Array[String]): Unit = {


  }
}
