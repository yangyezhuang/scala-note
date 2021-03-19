package com.demo06_animal

object ClassDemo01 {

  // 定义抽象类
  abstract class Animal {
    var name = ""
    var age = 0

    def run() = println("动物会跑步...")

    def eat() // 抽象方法。因为猫狗吃的不一样
  }


  // 创建猫类并继承Animal类
  class Cat extends Animal {
    // 重写父类的eat()方法
    override def eat(): Unit = println("猫吃鱼")

    // 定义自己的方法
    def catchMouse() = println("猫会抓老鼠")
  }

  class Dog extends Animal {
    override def eat(): Unit = println("狗吃骨头")

    def lookHome() = println("狗会看家")
  }


  def main(args: Array[String]): Unit = {
    // 利用多态创建猫类
    val c: Animal = new Cat
    c.name = "加菲猫"
    c.age = 5
    println(c.name, c.age)
    c.run()
    c.eat()
    // 盘对对象是否是猫类
    if (c.isInstanceOf[Cat]) {
      val c2 = c.asInstanceOf[Cat]
      c2.catchMouse()
    } else {
      println("传入的不是猫类对象")
    }
    println("-" * 10)


    val d: Animal = new Dog
    d.name = "小白"
    d.age = 8
    println(d.name, d.age)
    d.run()
    d.eat()
    if (d.isInstanceOf[Dog]) {
      val d2 = d.asInstanceOf[Dog]
      d2.lookHome()
    } else {
      println("传入的不是狗类对象")
    }
  }
}
