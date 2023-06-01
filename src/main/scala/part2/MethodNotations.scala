package part2;


object MethodNotations extends App{
  class Person(val name:String,favouriteMovie:String,val age: Int = 0) {
    def likeMovie(movie:String):Boolean = {
      movie == favouriteMovie;
    }
    def +(person:Person):String = {
      s"${this.name} is hanging out with ${person.name}"
    }
    def unary_! : String = s"$name, what the heck?!"
    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"
    def apply(n: Int): String = s"$name watched $favouriteMovie $n times"
  }
  val Mary = new Person("Mary","Inception")
  println(Mary.likeMovie("Inception"))

  //Infix Notation In Scala
  println(Mary likeMovie "Inception");

  val Tom = new Person("Tom","Fight Club")
  println(Mary + Tom);
  //Operator In Scala


  //All Operators are methods in Scala

  //Prefix Notation
  //Unary operator only works with -,+,!,~
}
