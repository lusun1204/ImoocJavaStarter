package com.scala.com.imooc.lesson04

object ConstructorApp {
  def main(args: Array[String]): Unit = {
    val person = new Person("SK", 18)
    println(person.name + ":" + person.age + ":" + person.school)

    val person2 = new Person("FUR", 28, "Male")
    println(person2.name + ":" + person2.age + ":" + person2.school + ":" + person2.gender)
  }

}

/**
 * (val name: String, val age: Int) 跟在类后面的这一串, 是一个主构造器
 *
 * @param name
 * @param age
 */

//主构造器是跟在class后面的部分
//this 后面的部分是附属构造器, 附属构造器可以有多个, 但参数类型一定不能相同!!!!!
// 比如
// this(name: String, age: Int, gender: String)
// this(name1: String, age1: Int, gender1: String)
// 这种情况会报错!, 因为String, Int, String 重复出现了2次, 只要保留1个就好
class Person(val name: String, val age: Int) {
  println("Person Constructor enter...")

  val school = "USC"
  var gender: String = _

  def this(name: String, age: Int, gender: String) {
    this(name, age) // 附属构造器的第一行代码必须调用主构造器或者其他构造器
    this.gender = gender
  }


  println("Person Constructor leave...")
}