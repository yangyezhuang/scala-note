package com.demo04_constructor

//案例: 演示trait的构造机制
object ClassDemo01 {

  //1. 创建Logger父特质
  trait Logger {
    println("执行Logger构造器  2")
  }

  //2. 创建MyLogger子特质, 继承Logger特质

  trait MyLogger extends Logger {
    println("执行MyLogger构造器  4")
  }

  //3. 创建TimeLogger子特质, 继承Logger特质.
  trait TimeLogger extends Logger {
    println("执行TimeLogger构造器  3")
  }

  //4. 创建父类Person
  class Person {
    println("执行Person构造器  1")
  }

  //5. 创建子类Student, 继承Person类及TimeLogger和MyLogger特质.
  class Student extends Person with TimeLogger with MyLogger {
    println("执行Student构造器 5")
  }

  def main(args: Array[String]): Unit = {
    /*
      执行顺序
        1. 执行父类的构造器
        2. 按照从左到右的顺序，执行特质中的构造器
        3. 当特质有父特质时，会先执行父特质中的内容，且父特质只执行一次
        4. 最后在执行本类（子类）的构造器
     */
    val s = new Student

  }
}
