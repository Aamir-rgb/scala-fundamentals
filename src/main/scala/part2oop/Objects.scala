package part2oop

object Objects {
  //Scala does not have class level functionality
  def main(args: Array[String]):Unit = {
    val Linda = new Person("Linda")
    val Jacob= new Person("Jacob")

    //Scala Object = Singleton Instance
    println(Linda == Jacob)

  }
  //object will not receive parameter
  object Person {
     val N_EYES = 2
     def canFly: Boolean = false


    def from(mother:Person,father:Person):Person = new Person("Bubble")
    def apply(mother:Person,father:Person):Person = new Person("Bubble")


    val Mary = Person
    val John = Person

    println(Mary == John)
    println(Person.N_EYES)
    println(Person.canFly)



    //println(Linda == Jacob)

//    val bubble = Person.from(Linda,Jacob)
//    println(bubble)

//    val bubbleRedefined = Person.apply(Linda,Jacob)
//    println(bubbleRedefined)
//
//    println(bubble == bubbleRedefined)
  }

  class Person(val name:String) {

  }

  //Scala Object = Singleton Instance


}
