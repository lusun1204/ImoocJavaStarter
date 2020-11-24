package com.scala.com.imooc.lesson05

object TupleApp extends App {
  /**
   * 新建元组
   */
  val a = (1,2,3,4,5)

  /**
   * 取第一个元素
   */
  a._1

  /**
   * 遍历
   */
  for(i<- 0 until(a.productArity)){
    println(a.productElement(i))
  }
}
