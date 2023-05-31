package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n:Int):Int = {
    if(n<=1) 1
    else {
      println("Computing factorial of "+n+" - I need factorial of "+(n-1))
      val result = n*factorial(n-1)
      println("Computed factorial of "+n)
      result
    }
  }
  println(factorial(5
  ))

  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator) // TAIL RECURSION = use recursive call as the LAST expression
    factHelper(n, 1)
  }
  println(anotherFactorial(20000))
}
