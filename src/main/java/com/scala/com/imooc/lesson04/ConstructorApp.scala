package com.scala.com.imooc.lesson04

object ConstructorApp {
  def main(args: Array[String]): Unit = {
    val person = new Person("SK", 18)
    println(person.name + ":" + person.age + ":" + person.school)

    val person2 = new Person("FUR", 28, "Male")
    println(person2.name + ":" + person2.age + ":" + person2.school + ":" + person2.gender)

    val student1 = new Student("toto", 18, "Female", "Math")
    println(student1.name + ":" + student1.age + ":" + student1.school + ":" + student1.gender + ":" + student1.major)

    println(student1)
    println(student1.toString)
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

//继承
//继承即可以继承主构造器, 也可以继承附属构造器
//extend后面的父类参数属性, 写不写都可以, 例如(name:String)也可以写(name)
class Student(name: String, age: Int, gender: String, val major: String) extends Person(name: String, age: Int, gender: String) {
  println("Person Student enter...")

  //重写(在继承关系中, 子类可以对父类的属性或者方法进行重写)
  override val school = "NCEPU"

  override def toString: String = "Person: super.toString"

  println("Person Student leave...")
}

