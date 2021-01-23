package main.scala.com.imooc.lesson03

object functionApp {
  def main(args: Array[String]): Unit = {
    println(sum(2, 3))
    println("Hello, Scala developer!")
    println(three())
    println(three) //没有入参的函数,括号可以省略
    sayHello()
    sayname("tt")
    sayname()

    config()
    config("/bin/propertiy/spark-test.config")

    println(distance(10, 5))
    println(distance(time = 20, speed = 5))

    println(ManySum(1,2,3,4,5))
  }

  def sum(a: Int, b: Int): Int = {
    a + b
  }

  def three(): Int = {
    1 + 2
  }

  def sayHello(): Unit = {
    println("say hello")

  } // Unit表示不需要返回值

  def sayname(name: String = "tk") = {
    println(name)
  }

  /**
   * 默认参数, 如果没有自定义,则返回默认设置的值, 如果自定义了, 返回自定义的值
   *
   * @param file
   */
  def config(file: String = "/bin/propertiy/spark.config") = {
    println(file)
  }

  /**
   * 命名参数, 可以任意调换参数的位置传参
   *
   * @param speed
   * @param time
   * @return
   */

  def distance(speed: Float, time: Float): Float = {
    speed * time
  }

  /**
   * 可变参数, 传递多个相同的参数, 使用增强For循环实现
   * 传有限的数量的参数,可以枚举的传递,但数量多的话不现实
   *
   * @param numbers
   */
  def ManySum(numbers: Int*): Int = {
    var result = 0
    for (number <- numbers) { //类似Java增强For循环
      result += number
    }
    result
  }

  /**
   * 循环表达式
   * 1 to 10 = 1.to(10)
   * res5: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
   * Range(1,10)
   * res7: scala.collection.immutable.Range = Range(1, 2, 3, 4, 5, 6, 7, 8, 9)
   * Range(1,10,8)
   * res12: scala.collection.immutable.Range = Range(1, 9)
   * 1 until 10
   * res16: scala.collection.immutable.Range = Range(1, 2, 3, 4, 5, 6, 7, 8, 9)
   */
  for (i<- 1 to 10 if i%2 == 0){
    println(i)
  }
  val course=Array("spark","Flink","scala")
  for (i <- course){
    println(i)
  }
  //course 是course里面的每个元素
  // => 就是作用到左边的每一个元素, 变成另外一个结果
  course.foreach(course => print(course + " "))

  var (num,sum) = (100,0)
  while (num>0) { //出口
    sum=sum+num
    num=num-1 //步长
  }
  println(sum)
}

