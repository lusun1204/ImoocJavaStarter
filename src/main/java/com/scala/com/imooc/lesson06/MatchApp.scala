package com.scala.com.imooc.lesson06

import scala.util.Random

object MatchApp extends App {

  val names = Array("fur", "sk", "sf")
  val name = names(Random.nextInt(names.length))

  name match {
    case "fur" => println("先知")
    case "sf" => println("影魔")
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
  }

}
