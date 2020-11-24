package com.scala.com.imooc.lesson05

object MapApp extends App{

  /**
   * 默认不可变
   */
  val a = Map("PK" ->18,"zhangSan" ->30)

  /**
   * 可变的Map
   */
  val b = scala.collection.mutable.Map("PK" ->18,"zhangSan" ->30)

  /**
   * 开发中获取某个Key的关键值这么写
   */
  b.getOrElse("PK",10)

  /**
   * 开发中添加1个元素
   */
  b("t1")=1

  /**
   * 开发中添加多个元素
   */
  b+=("t2"->10,"t3"->20)

  /**
   * 开发中删除1个元素
   */
  b-="t2"

  /**
   * 开发中删除多个元素
   */
  b-=("t2","haha")

  /**
   * 遍历Map中的元素
   */
  for((key,value) <- b){
    println(key+":"+value)
  }
  //Or
  for(key <- b.keySet){
    println(key+":"+b.getOrElse(key,9))
  }
  //Or
  for(value <- b.values){
    println(value)
  }
}
