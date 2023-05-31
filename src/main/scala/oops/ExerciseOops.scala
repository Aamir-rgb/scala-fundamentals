package oops

/*********
 * Md Aamir Iqubal
 */
object ExerciseOops extends App {
  val w = new Writer("Ramdhari","Singh","Dinkar",1989);
  println(w.fullName());
  val w1 = new Writer("Rashtra","Kawi","Nirala",2012)
  val nv = new Novel("An Evening In Paris",2020,w);

  println(nv.authorAge())
  println(nv.isWrittenBy(w))
  println(nv.copy(2023));
  println(nv.isWrittenByCheck(w1))

}

class Writer(val firstName : String,val lastName : String,val surName : String,val year : Int) {
  def fullName():String = {
    val Name = firstName+' '+lastName+' '+surName;
    return Name;
  }

}


class Novel(val name : String,val yearOfRelease:Int,val author:Writer) {
  def authorAge():Int = {
    val authorAge  = yearOfRelease-author.year;
    return authorAge;
  }
  def isWrittenBy(author:Writer):String = {
    val Str = s"Book ${name} is written by ${author.fullName()}";
    return Str;
  }
  def isWrittenByCheck(author:Writer):Boolean = {
    author == this.author;
  }
  def copy(newYear:Int):Novel = {
    return new Novel(name,newYear,author);
  }

}

class Counter(val count:Int) {
  def incrementCounter = {
    println("Incrementing the value");
    new Counter(count+1);
  }
  def decrementCounter = {
    println("Incrementing the value");
    new Counter(count+1);
  }
  def incrementCounter(n:Int) = new Counter(count+1)
  def decrementCounter (n:Int)= new Counter(count+1)

  /***
  def incrementCounter():Counter = {
    if(n <=0) this
    else {
      incrementCounter.incrementCounter(n);
    }
  }
  Another Version Of Increment Counter */

  /***
  def decrementCounter():Counter = {
    if(n <=0) this
    else {
      decrementCounter.decrementCounter(n);
    }
  }
  Another Version Of Decrement Counter */
}
