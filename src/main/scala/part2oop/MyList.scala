//package part2oop
//
//abstract class MyList[A] {
//
//  def head:A
//  def tail:MyList[A]
//  def isEmpty:Boolean
//  def add[B >: A](element:B):MyList[B]
//  def printElement:String
//  override def toString:String = "["+printElement+"]"
//
//  def map[B](transformer:MyTransformer[A,B]):MyList[B]
//
//}
//object Empty extends MyList {
//  def head:Int = throw new NoSuchElementException
//  def tail:MyList = throw new NoSuchElementException
//  def isEmpty: Boolean = true
//  def add(element:Int):MyList = new Cons(element,Empty)
//  def printElement: String = ""
//}
//
//class Cons[+A](h:A,t:MyList[A]) extends MyList[A] {
//  def head:A = h
//  def tail:MyList[A] = t
//  def isEmpty: Boolean = false
//  def add[B >:A](element:B):MyList[B] = new Cons(element,this)
//  def printElement: String = if (t.isEmpty) ""+h else  h +" "+t.printElement
//}
//trait MyPredicate[-T] {
//  def test(elem:T):Boolean
//}
//
//trait MyTransformer[A,B] {
//  def transform(elem:A):B
//}
//object ListTest extends App {
//  val list = new Cons(1,new Cons(2,new Cons(3,Empty)))
//  println(list.tail.head)
//  println(list.add(4).head)
//  println(list.isEmpty)
//  println(list.toString)
//}