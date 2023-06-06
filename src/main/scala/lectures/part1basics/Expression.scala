package lectures.part1basics

object Expression extends App {

  //Expressions are evaluated to a value and they hve a type.Here 1+2 is an expression
    println(x)

  //Operators + - * / & | ^ << >> >>>(right shift with zero extension)
  println(2+3*4)

  // == != > >= < <=
  println(1 == x)


  //! && ||
  println(!(1 == x))
  var avariable = 2

  //Also works with -= *= /= ..... side effects
  avariable +=3
  println(avariable)
  val aCondition = true

  //Instruction -> Do Something Expression ->Give Value

  //Everything in scala is an expression
  //If in scala is an expression
  val x = 1+2
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)

  var i = 0
  while(i < 10) {
    println(i)
    i += 1
  }
    val aWeirdValue = (avariable = 3)
    print(aWeirdValue)
  val aCodeBlock = {
    val y = 2
    val z = y+1
  }
  println(aCodeBlock)
}

