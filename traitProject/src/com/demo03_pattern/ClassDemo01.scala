package com.demo03_pattern

// 演示：适配器模式
/*
  当特质中有多个抽象方法, 而我们只需要用到其中的某一个或者某几个方法时, 不得不将该特质中的所有抽象方法给
  重写了, 这样做很麻烦. 针对这种情况, 我们可以定义一个抽象类去继承该特质, 重写特质中所有的抽象方法, 方法体
  为空. 这时需要使用哪个方法, 只需要定义类继承抽象类, 重写指定方法即可. 这个抽象类就叫: 适配器类. 这
  种设计模式(设计思想)就叫: 适配器设计模式
 */
object ClassDemo01 {

  // 定义一个特质，添加6个抽象方法
  trait PlayLOL {
    def top()
    def mid()
    def adc()
    def support()
    def jungle()
    def student()
  }

  // 定义抽象类Player继承特质，重写特质中的抽象方法，方法体都为空
  abstract class Player extends PlayLOL { // 充当适配器
    override def top(): Unit = {}
    override def mid(): Unit = {}
    override def adc(): Unit = {}
    override def support(): Unit = {}
    override def jungle(): Unit = {}
    override def student(): Unit = {}
  }

  // 定义普通类GreenHand，继承Player，重写support()和student()方法
  class GreenHand extends Player {
    override def support(): Unit = println("不死不回城")

    override def student(): Unit = println("骂我就挂机")
  }

  def main(args: Array[String]): Unit = {
    val g = new GreenHand
    g.support()
    g.student()
  }
}
