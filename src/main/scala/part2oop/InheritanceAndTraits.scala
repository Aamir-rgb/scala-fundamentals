package part2oop

import scala.language.postfixOps

object InheritanceAndTraits extends App{

  sealed class Animal {
   def eat = println("nomnom")
   val creatureType = "wild"
  }
  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }
  val cat = new Cat
  cat.crunch
  class Person(name:String,age:Int) {
    def this(name:String) = this(name,0)
  }
  class Adult(name:String,age:Int,idCard:String) extends Person(name)


  //Overriding
  class Dog(override val creatureType: String) extends Animal {
    override def eat = println("crunch,crunch")
    //override val creatureType = "domestic"
  }
  var dog = new Dog("K9")
  dog.eat
  //Overriding works for method as it works for vals and vars
  println(dog.creatureType)

  //Final class can not be extended
  //Use final on member
  //Use final on the entire class

  //type substitution broad polymorphism
  val unknownAnimal:Animal = new Dog("K9")
  unknownAnimal.eat
}
