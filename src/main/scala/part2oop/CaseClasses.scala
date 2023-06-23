package part2oop

object CaseClasses extends App {

  case class Person(name:String,age:Int)

  // 1. class parameters are fields
  val jim = new Person("Jim", 34)
  println(jim.name)

  // 2. sensible toString
  // println(instance) = println(instance.toString) // syntactic sugar
  println(jim)

  // 3. equals and hashCode implemented OOTB
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)

  // 4. copy method of case class
  val jim3 = jim.copy(age = 48)
  println(jim3)

  // 5.
  val thePerson = Person
  val Mary = Person("Mary",23)
}
