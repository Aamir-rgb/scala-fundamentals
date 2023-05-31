package lectures.part1basics

object Function extends App{

  def aFunction(a:String,b:Int):String = {
    a +" "+ b
  }
  println(aFunction("hello",3))

  def aParameterLessFunction():Int = 42
  println(aParameterLessFunction())
  //println(aParameterLessFunction)
 def aRepeatedFunction(aString:String,n:Int):String = {
   if(n==1) aString
   else aString+ aRepeatedFunction(aString, n-1)
 }
  println(aRepeatedFunction("hello",3))
  def aFunctionWithSideEffect(aString:String):Unit = println(aString)

  def aBigFunction(n:Int):Int = {
    def aSmallerFunction(a:Int,b:Int):Int = a+b
    aSmallerFunction(n,n-1)
  }
 def aGreeting(name:String,age:Int):String = {
   "Hi, my name is $name and I am $age years old"
 }
 def aFactorial(n:Double):Double = {
   if(n <=1) 1
   else n*aFactorial(n-1)
 }
 //println(aFactorial(100))


  def aFibonacci(n:Int):Int = {
    if (n <= 2) 1
    else  aFibonacci(n - 1) + aFibonacci(n - 2)
  }
  println(aFibonacci(8))
}
