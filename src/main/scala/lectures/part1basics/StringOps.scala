package lectures.part1basics

object StringOps extends App {

  val str:String = "Hello,I am learning scala";
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println((str.startsWith("Hello")))
  println(str.replace(" ","-"))
  println(str.toLowerCase())
  println(str.length)

  //Scala Specific String Interpolators
  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  val name = "aamir"
  val age = 19
  val greeting = s"Hello,my name is $name and I am $age years old"
  val anotherGreeting = s"Hello,my name is $name and I am ${age+1} years old"
  println('a'+:aNumberString:+'z')
  println(str.reverse)
  println(str.take(2))
  println(greeting)
  println(anotherGreeting)

  //F Interpolators
 val speed = 1.2f
 println(f"$name%s can eat 2.2f burgers per minute")

  //Raw Interpolators
  val escaped = "This is  a \n newline"
  println(escaped)
  }
