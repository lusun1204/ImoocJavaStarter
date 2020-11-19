package main.scala.com.imooc.lesson04

object lesson04 {
  def main(args: Array[String]): Unit = {
    val person = new People()
    person.name = "Messi"
    person.watchFootBall("Barcelona")
    print(person.name + " .. " + person.age)
    person.printInfo()


  }

  class People {
    //定义属性
    var name: String = _;
    // _是占位符, 表示先给name赋值,等使用的时候重新赋值;
    //只有var可以使用占位符
    val age: Int = 18;

    /**
     * scala 会自动生成get/set方法, 对var生成get/set,对val生成get方法
     */

    //定义方法
    def eat(): String = {
      name + "eat..."
      //最后一行作为返回值返回方法体
    }

    def sleepTime(): Int = {
      12
    }

    def watchFootBall(teamName: String): Unit = {
      println(name + " is watching match of " + teamName)
    }

    private  [ this ] val gender = "male"
    def printInfo():Unit = {
      println("gender " + gender)
    }
  }

}
