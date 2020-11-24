package com.scala.com.imooc.lesson05

object ArrayApp extends App {
  val a = new Array[String](5)
  a.length

  var b = new Array[String](6)

  val c = Array("t1","t2",1)

  println(a)
  println(b)

  println("~~~~~可变数组~~~~")
  //可变数组
  val d = scala.collection.mutable.ArrayBuffer[Int]()

  d+=1
  d+=2
  d+=(3,4)
  d++=Array(5,6,7)
//  d.insert(7,30)
//  d.remove(2,4)

  println(d)
  for (x <- 0 until d.length){
  //for (x <- d){
    println(x)
  }
  println("~~~~~可变数组~~~~")

  println("~~~~~转换为不可变数组~~~~")
  println(d.toArray.mkString(","))

  println("~~~~~转换为不可变数组~~~~")
  var z = new Array[Int](5)

  z(0)=1
  z(1)=2
  z(0/5)=3
  print(z(2))

  val z1 = Array("r1","r2")
  println(z1(0))

  for(x <- z){
    println(x)
  }
  println(z.sum)
  println(z.max)
  println(z.min)
}
