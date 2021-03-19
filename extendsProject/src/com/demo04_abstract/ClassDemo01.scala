package com.demo04_abstract


// 抽象类入门
// 细节：抽象类的子类：1.如果也是抽象类，则不用重写父类的抽象方法，1。如果是普通类，则必须重写父类所有的抽象方法
object ClassDemo01 {

  // 定义抽象类
  /*
  如果类中有抽象字段或者抽象方法, 那么该类就应该是一个抽象类.
    抽象字段: 没有初始化值的变量就是抽象字段.
    抽象方法: 没有方法体的方法就是一个抽象方法.
   */
  abstract class Shape {
    def area(): Double
  }

  // 重写父类的抽象方法
  class Square(var edge: Double) extends Shape {
    override def area(): Double = edge * edge
  }

  class Rectangle(var length: Double, var width: Double) extends Shape {
    override def area(): Double = length * width
  }

  class Circle(val raius: Double) extends Shape {
    override def area(): Double = Math.PI * raius * raius
  }


  def main(args: Array[String]): Unit = {
    val s1 = new Square(5)
    println(s"s1：${s1.area()}")

    val s2 = new Rectangle(3, 4)
    println(s"s1：${s2.area()}")

    val s3 = new Circle(1)
    println(s"s3：${s3.area()}")
  }

}
