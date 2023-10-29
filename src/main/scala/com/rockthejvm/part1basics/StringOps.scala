package com.rockthejvm.part1basics

object StringOps {

  val aString:String = "Hello! I am learning scala"

  //String Functions
  val secondChar = aString.charAt(1)
  val firstWord = aString.substring(0,5)
  val words = aString.split(" ")
  val startsWithHello = aString.startsWith("Hello")
  val allDashes = aString.replace(" ","-")
  val allUppercase = aString.toUpperCase()
  val nChars = aString.length

  //other functions
  val reversed = aString.reverse
  val aBunchOfchars = aString.take(10)

  //parse to numeric
  val numbersAsString = "2"
  val number = numbersAsString.toInt

  //interpolation
  val name = "Alice"
  val age = 12
  val greeting = "Hello  I'm "+name+" and I am "+age+" years old."
  val greeting_v2 = s"Hello, I'm $name and I'm $age years old."
  val greeting_v3 = s"Hello, I'm $name and I will be turning  ${age+1} years old."

  //f interpolation
  val speed = 1.2f
  val myth =f"$name can eat $speed%2.2f burgers per minute"

  //raw interpolation
  val escapes = "This is a \n newline"


  def main(args: Array[String]): Unit = {
   println(myth)
    println(escapes)
  }

}
