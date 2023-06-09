package part2

object AbstractDataTypes extends App{
  abstract class Animal {
    val creatureType:String
    def eat:Unit

  }

  class Dog extends Animal{
    override val creatureType: String = "Canine"
    override def eat :Unit = println("crunch,crunch")
  }

  trait Carnivore {
    def eat(animal: Animal):Unit
  }
  class Crocodile extends Animal with Carnivore {
    override val creatureType: String = "Croc"
    override def eat :Unit = println("nomnomnom")

    override def eat(animal: Animal): Unit = println(s"I am a croc,I am eating ${animal.creatureType}")
  }
  var dog = new Dog
  var croc = new Crocodile
  croc.eat(dog)
}
