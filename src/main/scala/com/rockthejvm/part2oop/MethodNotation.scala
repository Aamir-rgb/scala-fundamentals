package com.rockthejvm.part2oop

object MethodNotation {

  //Define a Class Person
  class Person(val name: String, age: Int, favouriteMovie: String) {

    //Method definition for likes
    //    def likes(movie:String):Boolean = {
    // Infix version of likes
    infix def likes(movie: String): Boolean = {
      movie == favouriteMovie
    }

    //Another Flavour Of Infix Definition
    infix def +(person: Person): String = {
      s"${this.name} is hanging out with ${person.name}"
    }

    infix def +(n: Int): Int = {
      n
    }

    infix def !!(progLanguage: String): String = {
      s"${this.name} wonders how can $progLanguage be so cool"
    }

    def unary_- : String = {
      s"$name's alter ego"
    }

    def apply(): String = s"My name is $name and I really enjoy watching $favouriteMovie "
  }

  val Mary: Person = new Person("Mary", 34, "Inception")
  val John: Person = new Person("John", 38, "Shawshank Redemption")

  def main(args: Array[String]): Unit = {
    println(Mary.likes("Fight Club"))
    println(Mary likes "Fight Club")
    println(Mary + John)
    println(Mary.+(John))
    println(2.+(3))
    println(Mary !! "Scala")
    println(-Mary)
    println(Mary.apply())
    println(Mary())
  
  }
}
