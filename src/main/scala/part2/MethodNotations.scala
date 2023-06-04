package part2

import scala.language.postfixOps;


object MethodNotations extends App {

  class Person(val name: String, favouriteMovie: String, val age: Int = 0) {
    def likeMovie(movie: String): Boolean = {
      movie == favouriteMovie;
    }

    def +(person: Person): String = {
      s"${this.name} is hanging out with ${person.name}"
    }

    def +(name1: String): Person = {
      // val per1 = new Person(this.name,favouriteMovie,age)
      var str = this.name + ' ' + name1
      val per1 = new Person(str, favouriteMovie, age)
      println(per1.age)
      println(str)
      return per1;
    }

    //      def +(name1:String):Person = {
    //        new Person(s"${name} $name1",favouriteMovie,age)
    //      }
    def unary_! : String = s"${name} what the heck are you doing ?";

    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi my name is $name and I like $favouriteMovie"
    //def apply(prince:String):Boolean = false

    def apply(n:Int):String = s"Mary watched ${favouriteMovie} ${n} times"

    def learns(thing: String): String = s"${name} is learning ${thing}"
    // My way of defining scala method
    //    def learnsScala() = {
    //
    //       new Person(this.name, favouriteMovie, age).learns
    //    }

    def learnsScala = this learns "Scala"
  }

    val Mary = new Person("Mary", "Inception")
    println(Mary.likeMovie("Inception"))

    //Infix Notation In Scala = Operator Notation = Syntactic Sugar
    //Syntactic Sugar -> It is a nice way of writing code that is equivalent to more complex code
    println(Mary likeMovie "Inception");

    val Tom = new Person("Tom", "Fight Club")
    println(Mary + Tom);
    //Operator In Scala
    println(1 + 2)

    //Prints the value 49 why because '.' ascii value of . = 47
    println(1 + '.' + (2))

    //All Operators are methods in Scala


    //Prefix Notation
    //Unary_prefix operator only works with -,+,!,~
    val x = -1
    println(x)
    //Equivalent to y= -24
    var y = 24
    y = y.unary_-
    println(y)

    //These two are equivalent
    println(!Mary)
    println(Mary.unary_!)

    //unary_~ operator
    var x1 = 42
    println(~x1)

    //Postfix Notation
    println(Mary.isAlive)

    //Syntactic Sugar
    println(Mary isAlive)

    //Apply
    println(Mary.apply())
    //can't supply unit value with infix notation because nullary method apply in class Person: (): String takes no arguments; use dotted invocation instead: (...).apply()
    //println(Mary apply())
    println(Mary())

    //println(Mary.apply("Elaf"))
    //println(Mary apply("Ramdhari"))

    //Exercises
    //1. Overload the + operator with String. It receives a new String and returns a new person with a nickname.
    println((Mary + ("The Rockstar")).apply())

    //2. To call unary operator we follow this approach .It can be translated to
    println((+Mary).age)

    //3. To call learns method
    println(Mary learns "Scala")

    //4. To call learnsScala method using postfix notation
    println(Mary.learnsScala)

    //5. To overload apply method and produce result something like "Mary watched inception 2 times"
    println(Mary.apply(2))
}