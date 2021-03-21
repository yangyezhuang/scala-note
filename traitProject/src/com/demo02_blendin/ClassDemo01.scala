package com.demo02_blendin

// 演示：对象混入trait
/*
  动态混入：值让某个类的对象临时可以访问某个特质中的成员
 */
object ClassDemo01 {

  // 定义一个特质
  trait Logger {
    def log(msg: String) = println(msg)
  }

  // 定义User类，该类和特质Logger之间无任何关系
  class User {

  }

  def main(args: Array[String]): Unit = {
    val u = new User with Logger
    u.log("对象混入trait")
  }

}
