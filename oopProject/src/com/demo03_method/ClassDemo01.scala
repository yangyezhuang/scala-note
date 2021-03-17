package com.demo03_method

// 案例：演示如何在类中定义成员方法
object ClassDemo01 {

  // 1.定义Customer类
  class Customer {
    // 2. 定义成员变量（姓名，性别），定义成员方法printHello()
    var name: String = _
    var sex = ""

    // 定义成员方法
    //    def printHello(msg: String) = {
    //      println(msg)
    //    }

    //简化版
    def printHello(msg: String) = println(msg)
  }



  def main(args: Array[String]): Unit = {
    val c = new Customer
    c.name = "张三"
    c.sex = "male"

    println(c.name, c.sex)
    c.printHello("hello,scala")
  }

}
