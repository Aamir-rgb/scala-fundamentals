package part2oop

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit
  }

  /** Default Constructor Anonymous Classes */
  val giraffeAnimal: Animal = new Animal {
    override def eat: Unit = println("Giraffe is a tall animal")
  }
  //Output for below line it's the way anonymous class reference are printed
  // part2oop.AnonymousClasses$$anon$1@1060b431
  println(giraffeAnimal)

  //Output for below line is because output we are giving in eat and () this is for Unit return type
  // Giraffe is a tall animal
  //()
  println(giraffeAnimal.eat)

  //What actually goes inside the compiler
  //  class part2oop.AnonymousClasses$$anon$1@1060b431 extends Animal {
  //    override def eat = println("Giraffe is a tall animal")
  //  }

  /** Parametarized Constructor Anonymous Classes */
  class Student(name: String) {
    def sayGoodMorning: Unit = println("Good Morning from ${name}")
  }

  val Shyam = new Student("Shyam") {
    override def sayGoodMorning: Unit = println("Good Morning from Shyam")
  }
  //Note: You must pass argument in Constructor otherwise it will throw error
  //Output for the below mentioned line
  //Good Morning from Shyam
  //()
  println(Shyam.sayGoodMorning)

  /** Traits Anonymous Classes */
  trait StudentType {
    def studType: Unit
  }

  val studentShyam = new StudentType {
    override def studType = println("Shyam is a post graduate Student")
  }
}
