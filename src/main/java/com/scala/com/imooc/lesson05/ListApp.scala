package com.scala.com.imooc.lesson05

object ListApp extends App {
  /**
   * Nil是一个不可变的List
   * val Nil = scala.collection.immutable.Nil
   */


  /**
   * List example
   */
  val l = List(1,2,3,4,5)
  println(l.head)
  println(l.tail)

  /**
   * 可变的List
   */
  val l5 = scala.collection.mutable.ListBuffer[Int]()
  l5 +=1
  l5 +=(3,2)
  println(l5)

  //List -
  //没有的元素也可以减掉, 不会报错
  l5 -=(22,3)
  println(l5)

  l5.isEmpty
}
