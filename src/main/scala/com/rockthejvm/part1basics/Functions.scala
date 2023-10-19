package com.rockthejvm.part1basics

object Functions {

  def aFunction(a:String,b:Int) :String = {
    a+" "+b

  }

  //Function Invocation
  val aFunctionInvocation = aFunction("Scala",9999999)

  def aNoArgFunction():Int = 45
  def aParameterLessFunction:Int = 45

  //Functions can be recursive
  def StringConcatenation(str:String,n:Int): String = {
   if(n ==0) ""
   else if (n == 1) str
   else str + StringConcatenation(str,n-1)
  }

  val scalax3 = StringConcatenation("Scala",3)

  //when you need loops use recursion

  def aVoidFunction(aString:String):Unit = {
    println(aString)
  }

  def computeDoubleWithSideEffects(aString:String):String = {
    aVoidFunction(aString)
    aString+aString
  }//discouraging side effects

  def aBigFunction(n:Int):Int = {
    def aSmallerFunction(a:Int,b:Int):Int = a + b
    aSmallerFunction(n,n+1)
  }

  /** Exercises
   *  */

  //1 A greeting function (name,age) => Hi my name is $name and $age years old
  def greeting(name:String,age:Int):Unit = {
    println(s"Hi My name is $name and I am $age years old")
  }

  //2 Factorial Function n -> 1,2 ,3,n
  def aFactorial(n:Int):Int = {
    if (n <=0) 0
    else if (n == 1) 1
    else n * aFactorial(n-1)
  }
  greeting("Aamir",35)
  println(aFactorial(5))

  //3 Fibonacci
  def fibonacci(n:Int):Int = {
    if(n <= 2) 1
    else fibonacci(n-1)+fibonacci(n-2)
  }

  println(fibonacci(5))

  //4
  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }
  println(isPrime(7))
  def main(args: Array[String]): Unit = {

    println(scalax3)

  }

}
