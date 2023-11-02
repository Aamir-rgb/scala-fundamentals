package com.rockthejvm.part2oop

import scala.language.postfixOps

object MethodNotations  {

  class Person(val name:String,val age:Int,favouriteMovie: String) {
    def likes(movie: String): Boolean = {
      movie == favouriteMovie
    }

    infix def +(person: Person): String = {
      s"${this.name} is hanging out with ${person.name}"

  }
      def !!(progLanguage: String): String = {
        s"${this.name} wonders how  ${progLanguage} can be so cool!"
      }

      //prefix position
      def unary_- :String = {
        s"$name's alter ego."
      }
      infix def isAlive: Boolean = true

      //Exercise 1 a +method that returns person with nickname
      infix def +(nickname: String): Person = {

        new Person(s"${name} ${nickname}",30,"FightClub")

      }

      //Exercise 2
      def unary_+ :Person = new Person(name,age+1,favouriteMovie)

      def apply(n:Int):String =
        s"${name} watched ${favouriteMovie} $n times."

  }


val Mary = new Person("Mary",34,"Inception")
  val John = new Person("John",36,"Fight Club")

  def main(args: Array[String]): Unit = {
    println(Mary.likes("Fight Club"))

    //infix notation only works for method with one argument
    println(Mary likes("Fight Club"))  //identical

    //operator
    println(Mary+John)
    println(Mary.+(John))
    println(Mary !! "Scala" )
    println(2 + 3)
    println(2.+(3)) // same
    println(-Mary)
    println(Mary.isAlive)
    println(Mary isAlive)

    //Exercise
    //1
    val maryWithNickname = Mary+"The RockStar"
    println(maryWithNickname.name)

    //2
    val maryOlder = +Mary
    println(maryOlder.age)

    println(Mary(10))

  }
}
