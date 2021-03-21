package com.demo01_trait


// 类继承单个特质
object ClassDemo01 {

  // 定义特质类
  trait Logger {
    def log(msg: String) // 抽象方法

  }

  // 定义ConsoleLogger类，继承Logger特质
  class ConsoleLogger extends Logger {
    override def log(msg: String): Unit = println(msg)
  }

  def main(args: Array[String]): Unit = {
    val cl = new ConsoleLogger
    cl.log("演示：类继承单个特质")
  }
}
