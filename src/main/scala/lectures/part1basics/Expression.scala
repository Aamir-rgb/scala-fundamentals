package lectures.part1basics

object Expression extends App {

    val x = 1+2
    println(x)

  println(2+3*4)

  println(1 == x)

  println(!(1 == x))

  var avariable = 2
  avariable +=3
  println(avariable)

  //Instruction -> Do Something Expression ->Give Value

  val aCondition = true
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

