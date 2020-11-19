package com.scala.com.imooc.lesson04

object AbstractApp {
  def main(args: Array[String]): Unit = {

    val student = new student2()
    println(student.name)
    println(student.age)

  }

}


/**
 * 类的一个或者多个方法没有完整的实现(只有定义,没有实现)
 * Scala中方法和属性都可以写抽象类
 */

abstract class Person2 {
  def speak

  val name:String
  val age:Int
}

/**
 * 用一个子类实现该抽闲类
 */
class student2 extends Person2 {
  override def speak: Unit = {
    println("speak a word!")
  }

  override val name: String = "Max"

  override val age: Int = 18
}