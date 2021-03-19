package com.demo01_extends


// 演示单例对象继承
object ClassDemo03 {

  // 定义Person类
  class Person {
    var name = ""

    def sayHello() = println("Hello,Scala!")
  }

  // 定义单例对象Student，继承自Person
  object Student extends Person {}

  def main(args: Array[String]): Unit = {
    Student.name = "tom"
    println(Student.name)
    Student.sayHello()
  }
}
