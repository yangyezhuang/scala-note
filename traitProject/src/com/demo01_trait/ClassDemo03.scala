package com.demo01_trait


// 演示：object单例对象继承特质
object ClassDemo03 {

  // 定义一个特质Logger，并添加抽象方法
  trait Logger {
    def log(msg: String)
  }

  // 定义一个特质Warning
  trait Warning {
    def warn(msg: String)
  }

  // 定义类ConsoleLogger继承两个特质
  object ConsoleLogger extends Logger with Warning {
    override def log(msg: String): Unit = println("打印日志信息：" + msg)

    override def warn(msg: String): Unit = println("控制台警告信息：" + msg)
  }


  // 调用单例对象的两个方法，可以直接使用对象名+方法来调用单例对象的方法
  def main(args: Array[String]): Unit = {
    ConsoleLogger.log("我是日志信息！")
    ConsoleLogger.warn("卧室较高消息！")
  }
}
