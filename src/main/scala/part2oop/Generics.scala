package part2oop

object Generics extends App {
  class MyList[A] {

  }
  class MyMap[Key,Value]
  val listOfIntegers = new MyList[Int]
  val listOfString = new MyList[String]
  val listOfBooleans = new MyList[Boolean]
  var listOfFloat = new MyList[Float]

  //var listOfObject = new MyList[listOfIntegers] will throw error
  //Variance Problem A

  //Generic Methods
  object MyList {
    def empty[A]:MyList[A] = ???
  }
  class Animal
    class Cat extends Animal
    class Dog extends Animal
    class CoVarianceList[+A]
    //List[cat] extends List[Animal]
    val animal:Animal = new Cat
    val animalList:CoVarianceList[Animal] = new CoVarianceList[Cat]

  //No Invariance
  class InvariantList[A]
  val invariantAnimalList:InvariantList[Animal] = new InvariantList[Animal]

  //Contravariant
//  class ContravariantList[-A]
//  val contravariantList:ContravariantList[Cat] = new ContravariantList[Animal]

  //Contravariant
  class Trainer[-A]
  val trainer:Trainer[Cat] = new Trainer[Animal]

}
