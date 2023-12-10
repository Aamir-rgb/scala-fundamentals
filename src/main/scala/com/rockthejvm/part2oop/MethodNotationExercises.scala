package com.rockthejvm.part2oop

object MethodNotationExercises {

  class Person(var name: String, val age: Int, var favouriteMovie: String) {

    def this(personName:String) = {
     this(personName,0,"")
    }
    def likes(movie:String):String = {
      favouriteMovie = movie
      s"${name} likes ${movie}"
    }

    //A + Operator that returns the nickname of Person
    infix def +(nickName:String):String = {
      s"${name+" "+nickName}"
    }
    def unary_+ : Person = {
      new Person(name,age+1,favouriteMovie)
    }
    def apply(n:Int):String = {
      s"${name} watched ${favouriteMovie} ${n} times."
    }
}

  var Mary:Person = new Person("Mary",32,"Inception")
  def main(args: Array[String]): Unit = {
    println(Mary.name)
    println(Mary.likes("Inception"))
    println(Mary + "the RockStar")
    println((+Mary).age)
    println(Mary(2))

  }

}
