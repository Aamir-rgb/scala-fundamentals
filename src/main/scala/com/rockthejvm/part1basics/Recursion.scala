package com.rockthejvm.part1basics

import scala.annotation.tailrec

object Recursion {

  //Repetition = Recursion
   def sumUntil(n:Integer):Integer = {
     if(n <=0) return 0;
     else  n +sumUntil(n-1)
   }

  def sumUntil_v2(n: Int): Int = {
    @tailrec
    def sumUntilTailrec(x: Int, accumulator: Int): Int =
      if (x <= 0) accumulator
      else sumUntilTailrec(x - 1, accumulator + x) // TAIL recursion = recursive call occurs LAST in its code path
    sumUntilTailrec(n, 0)
  }
    def sumNumbersBet(a:Int,b:Int):Int = {
      if(a > b) 0
      else a+sumNumbersBet(a+1,b)
    }
  def sumNumbersBet_v2(a: Int,b:Int): Int = {
    @tailrec
    def sumNumbersBetTailrec(currentNumber: Int, accumulator: Int): Int =
      if (currentNumber > b) accumulator
      else sumNumbersBetTailrec(currentNumber+1, currentNumber+accumulator) // TAIL recursion = recursive call occurs LAST in its code path
    sumNumbersBetTailrec(a, 0)
  }

    def main(args: Array[String]): Unit = {
     println(sumUntil(2000))
    println(sumUntil_v2(20000))
      println(sumNumbersBet_v2(4,8))
  }

    //Exercises
    //1 Concatenate a String n times
    def stringConcat(n: Int,s:String): String = {
      @tailrec
      def stringTailrec(currentNumber: Int, accumulator: String): String =
        if (currentNumber > n) accumulator
        else stringTailrec(currentNumber-1, s+accumulator) // TAIL recursion = recursive call occurs LAST in its code path
      stringTailrec(n, "")
    }
    //2 Make a fibonacci series using tail recursion
    def fibonacci(n: Int): Int = {
      def fiboTailrec(i: Int, last: Int, previous: Int): Int =
        if (i >= n) last
        else fiboTailrec(i + 1, last + previous, last)

      if (n <= 2) 1
      else fiboTailrec(2, 1, 1)
    }

  // 3 - yes, rephrasing:
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else if (n % t == 0) false
      else isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }



}
