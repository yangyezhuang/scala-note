package com.demo01_trait

// 演示：特质中的成员
object ClassDemo04 {

  // 定义一个特质Hero
  trait Hero {
    // 具体字段
    var name = "关羽"
    // 抽象字段
    var arms: String

    // 具体方法
    def eat() = println("喝酒吃肉，养精蓄锐！")

    // 抽象方法
    def toWar()
  }

  // 定义Generals类继承特质
  class Generals extends Hero {
    override var arms: String = "青龙偃月刀"

    override def toWar(): Unit = println(s"武将${name}带着武器${arms}，上阵杀敌！")
  }

  def main(args: Array[String]): Unit = {
    val g = new Generals
    g.eat()
    g.toWar()
  }

}
