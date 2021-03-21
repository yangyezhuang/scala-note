package com.demo03_pattern


// 演示：演示模板方法设计模式
object ClassDemo02 {

  abstract class Template {
    // 用来记录具体要获取执行时间的代码
    def code()

    // 具体的计算规则
    def getRuntime() = {
      val start = System.currentTimeMillis()
      code()
      val stop = System.currentTimeMillis()
      stop - start
    }
  }

  // 定义ForDemo类继承 Template
  class ForDemo extends Template {
    // 计算打印10000次所用时长
    override def code(): Unit = for (i <- 1 to 1000) println("hello,scala")
  }

  def main(args: Array[String]): Unit = {
    val f = new ForDemo
    println(f.getRuntime())
  }
}
