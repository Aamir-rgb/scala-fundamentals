package com.rockthejvm.part2oop

import com.rockthejvm.part2oop.OOBasics.Counter

object OOBasics {

  //classes
  class Person(val name: String,age: Integer){//constructor signature

    //fields
    val allCaps = name.toUpperCase()

    //method
    def greet(name:String):String = {
      s"${this.name} says:Hi, ${name}"
    }

    def greet(): String =
      s"Hi, everyone, my name is $name"

    // aux constructor
    def this(name: String) =
      this(name, 0)

    def this() =
      this("Jane Doe")
  }

  var aPerson:Person = new Person("John",26)
  val john = aPerson.name
  val johnSaysHiToDaniel = aPerson.greet("Daniel")
  val johnSaysHi= aPerson.greet()
  val genericPerson = new Person()

  /**Exercises
  //1. Create a novel and writer class
    //Writer firstname,surname, year
    //method full name
    //Novel name. year of release author
    //authorage
    //isWrittenBy(author)
  //copy(new year of release) = new instance of novel
  **/
//Exercise 1
  class Writer(firstName:String,surName:String,val year:Integer) {
    val x = this.year
    def fullName():String = {
      return firstName +" "+ surName
    }

  }

  class Novel(name:String,yearOfRelease:Integer,author:Writer) {

//    def authorAge():Integer = {
//      val age =  (Writer) - (yearOfRelease)
//    }

   def  isWrittenBy(author:Writer):Writer = {
     return author
   }
   def age():Integer = {
     return author.year - yearOfRelease
   }
   def copy(newYearOfRelease:Integer) :Novel = {
     return new Novel(name, newYearOfRelease, author)
   }
  }

  /**
   *
   * Exercise 2 ounter class
   * constructed with an initial count
   * increment and decrement
   * modify by returning a new instance of counter
   * print()
   */
class Counter(name :Integer = 0) {
    def increment():Counter={
      return new Counter(name+1)
    }
    def decrement():Counter={
      if(name == 0)this
      return new Counter(name-1)
    }
    def increment(n:Integer):Counter={
      if(n <= 0)this
      return new Counter(n+1)
    }
    def decrement(n:Integer):Counter={
      if(n <= 0)this
      return new Counter(n-1)
    }
    def print():Unit={
      println(s"Current count : $name")
    }
  }

  def main(args: Array[String]): Unit = {
    println(johnSaysHiToDaniel)
    println(johnSaysHi)
    val charlesDickens = new Writer("Charles", "Dickens", 1812)
    val charlesDickensImpostor = new Writer("Charles", "Dickens", 2021)
    val novel = new Novel("Great Expectations", 1861, charlesDickens)
    val newEdition = novel.copy(1871)
    println(charlesDickens.fullName())
    println(novel.age())
    println(novel.isWrittenBy(charlesDickensImpostor))
    println(novel.isWrittenBy(charlesDickens))
    println(newEdition.copy(1871))
    var counter = new Counter()
    counter.print()
    counter.increment().print()
    counter.decrement().print()

  }
}
