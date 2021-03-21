package com.demo05_extends

//案例: 演示特质继承类
object ClassDemo01 {

  //1. 定义Message类. 添加printMsg()方法, 打印"测试数据"
  class Message {
    def printMsg() = println("学号Scala，走到哪里都不怕")
  }

  //2. 创建Logger特质，继承Message类.
  trait Logger extends Message

  //3. 定义ConsoleLogger类, 继承Logger特质.
  class ConsoleLogger extends Logger

  def main(args: Array[String]): Unit = {
    //4. 创建ConsoleLogger类的对象, 并调用printMsg()方法.
    val c = new ConsoleLogger
    c.printMsg()
  }
}
