package com.rockthejvm.part2oop

import java.time.{LocalDate, ZoneId}
import java.time.format.DateTimeFormatter
import java.util.Date
import scala.language.postfixOps

object OOPExercises {
  val newName:String  = "Johnathan"

  //Exercise 1 Writer Class
//  class Writer(var firstName:String,var surName:String,val year:Date) {
class Writer(var firstName:String,var surName:String,var year:Int){
    //fullName(method)
    def fullName():String = {
      return s"${firstName} ${surName}"
    }

    //Aux Constructor
//    def this(surName:String)  =
//      this ("", surName, new Date())

    def this(surName:String)  = {
        this ("", surName,1973)
    }
  }
  //Exercise 1 Novel Class
  class Novel(name:String,yearOfRelease:Int,var author:Writer) {

     def authorAge():Int = {
       val writeDob : Int = author.year
       val age = yearOfRelease - writeDob
      return age
     }
     def isWrittenBy(author:Writer):String = {
       s"${name} is written by ${author.fullName()}"
     }
     def copy(newYearOfRelease:Int):Novel = {
       return new Novel(name,newYearOfRelease,author)
     }
  }

  //Exercise 2 Counter Immutable Class
  class Counter(count:Int = 0) {
    def increment():Counter = {
      new Counter(count+1)
    }

    def increment(n:Int): Counter = {
      if(n<=0) this
      else increment().increment(n-1)  //Vulnerable To Stack Over Flow Error
    }
    def decrement():Counter = {
      if(count == 0) this
      else new Counter(count-1)
    }
    def decrement(n:Int): Counter = {
      if(n<=0) this
      else decrement().decrement(n-1)
    }
    def print():Unit = {
      println(s"Current Count : $count")
    }
  }
  def main(args: Array[String]): Unit = {

    //Date Formatter Class From Java

    val dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy")
    val hardcodedDateString = "20-11-2023"
    val hardcodedLocalDate = LocalDate.parse(hardcodedDateString, dateFormat)
    val hardcodedDate = Date.from(hardcodedLocalDate.atStartOfDay(ZoneId.systemDefault()).toInstant())



//    var writer = new Writer("Ruskin","Bond",hardcodedDate)
//    println("Writer Before Name Updated")
//    println(writer.fullName())
//    writer.firstName = "Salman"
//    writer.surName = "Rushdie"
//    println("Writer After Name Update")
//    println(writer.fullName())
//    val writer2 = new Writer("Dinkar")
//    println(writer2.fullName())

//Writer Clas Instantiation
    var writer = new Writer("Ruskin","Bond",1962)
    println("Writer Before Name Updated")
    println(writer.fullName())
    writer.firstName = "Salman"
    writer.surName = "Rushdie"
    println("Writer After Name Update")
    println(writer.fullName())
    val writer2 = new Writer("Dinkar")
    println(writer2.fullName())

    //Novel Class Instantiation
    var novel:Novel = new Novel("The Room On The Roof",1985,writer)
    val newEdition:Novel = novel.copy(1995)
    println(novel.authorAge())
    println(novel.isWrittenBy(writer))
  //  println(novel.copy(1995))
    println(newEdition.authorAge())

    val counter =  new Counter(0)
    counter.print()
    counter.increment().print()
    counter.print()
    counter.increment()
    counter.decrement().print()
    counter.print()
    counter.increment(10).print()
    counter.increment(15000).print()

  }

}
