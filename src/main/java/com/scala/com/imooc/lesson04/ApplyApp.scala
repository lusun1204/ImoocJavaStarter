package com.scala.com.imooc.lesson04

object ApplyApp {
  def main(args: Array[String]): Unit = {
    /**
     * 第一步, 没有定义apply前的操作测试
     */
    //    for (i <- 1 to 10) {
    //      //Class中是需要new的, 但直接调用object是不需要的
    //      ApplyTest.incr
    //    }
    //    println(ApplyTest.count) //object本身就是一个单例对象
    /**
     * 第二步, 定义apply后的操作测试
     */
    val b = ApplyTest() // ==>调用了Object.apply方法

    val c = new ApplyTest()
    println(c)
    c()

    /**
     * 结论
     * 类名() ==> Object.apply
     * 对象() ==> Class.apply
     */


  }

}

/**
 * ApplyTest(class)是ApplyTest(object)的伴生类
 * ApplyTest(object)是ApplyTest(class)的伴生对象
 * 互为伴生关系
 */
class ApplyTest {

  /**
   * 第三步, 拷贝ApplyTest的方法到class里面
   */
  def apply() = {
    println("class ApplyTest apply...")
  }

}

object ApplyTest {
  println("object ApplyTest enter...")

  //1 定义一个count
  var count: Int = 0

  def incr = {
    count = count + 1
  }

  def apply() = {
    println("object ApplyTest apply...")

    //在object中的Apply Class中new class
    new ApplyTest
  }

  println("object ApplyTest out...")

}