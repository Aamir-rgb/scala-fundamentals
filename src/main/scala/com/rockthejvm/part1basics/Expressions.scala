package com.rockthejvm.part1basics

object Expressions {

  val meaningOfLife = 40 + 2

  //mathematical operations +, -, *, /,, bitwise |, &, <<, >>, >>>
  val mathExpression = 2 + 3 +4

  //Comparison Expression
  val equalityTest = 1 == 2

  //Boolean Expression !. ||, &&
  val nonEqualityTest = !equalityTest

  //Instructions vs Expressions
  //Expressions evaluated to a value, instructions are executed
  //we think in terms of expression

  //ifs are expression
  val aCondition = true
  val anIfExpression = if (aCondition) 45 else 99

   //Code Blocks
   val aCodeBlock = {
     val localValue = 78
     localValue + 54
   }

   //Everything is an expression
   //Exercise
   //1
   val someValue = {
     2 < 3
   }

   //2
   val someOtherValue = {
     if(someValue) 239 else 986
     42
   }

   //3
   val yetAnotherValue:Unit = println("Scala")
   val theUnit:Unit = ()

  def main(args: Array[String]): Unit = {

    println(if (aCondition) 45 else 99)
    println(someValue)
    println(someOtherValue)
    println(yetAnotherValue)
  }
}
