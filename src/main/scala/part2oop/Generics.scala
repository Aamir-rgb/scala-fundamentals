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

  //Using static for Java
  //Note for defining generic type of methods
  object MyList {
    def empty[A]: MyList[A] = ???

    val emptyListOfIntegers = MyList.empty[Int]
  }
  class MyGenericClass[T] {
    def process(value: T): Unit = {
      // ... Implementation of process method ...
    }
  }
  val myObjInstance = new MyGenericClass[Int]()
  //Need to explore this section
//  val myObj = new MyGenericClass[myObjInstance[Int]]()


//Variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal
 //Three possible solutions for variance problem

 //Covariance List[Cat] extends List[Animal]
 class CovarianceList[+A]
 val animal:Animal = new Cat
 val animalList:CovarianceList[Animal] = new CovarianceList[Cat]

 //Invariant List[Animal] extends List[Animal]
  class InvariantList[A]
  val invariantAnimalList:InvariantList[Animal] = new InvariantList[Animal]
  //It won't work
  //val invariantAnimalList1:InvariantList[Animal] = new InvariantList[Cat]


//Contravariant List
  class ContravariantList[-A]
  val contravariantList:ContravariantList[Cat] = new ContravariantList[Animal]

  //Contravariant
  class Trainer[-A]
  val trainer:Trainer[Cat] = new Trainer[Animal]

}
