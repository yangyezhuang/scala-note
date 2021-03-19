package com.demo02_override


// 演示方法重写
object ClassDemo01 {

  class Person {
    val name = "tom"
    var age = 23

    def sayHello() = println("Hello,Person")
  }

  class Student extends Person {
    override val name: String = "alice"
    // override val age: String = 25    // 这样写会报错，子类不能重写父类用var修饰的变量

    override def sayHello(): Unit = {
      super.sayHello()
      println("Hello,Student")
    }
  }

  def main(args: Array[String]): Unit = {
    val s = new Student
    println(s.name, s.age)
    s.sayHello()
  }
}
