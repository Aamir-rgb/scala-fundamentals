package com.rockthejvm.part2oop

object Inheritance {

  class Animal {
    val creatureType = "wild"

    def eat(): Unit = {
      println("nomnomnom")

    }
  }

  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name) {

  }

  class Cat extends Animal {
    def crunch(): Unit = {
      eat()
      println("crunch, crunch")
    }
  }

  //Overriding
  class Dog extends Animal {
    override val creatureType = "Domestic"

    override def eat(): Unit = {
      println("mmmm I like this bone")
    }

  }

  def main(args: Array[String]): Unit = {
    val cat: Cat = new Cat()
    cat.eat()
    cat.crunch()
  }
}