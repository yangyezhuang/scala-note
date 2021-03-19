package com.demo05_inner


// 演示匿名内部类
/*
  使用场景
    1. 当对成员方法仅调用一次的时候
    2. 可以作为方法的实际参数进行传递
 */
object ClassDemo01 {

  abstract class Person {
    def sayHello() // 抽象方法
  }

  def show(p: Person) = p.sayHello()

  def main(args: Array[String]): Unit = {
    new Person() {
      override def sayHello(): Unit = println("Hello,Scala!")
    }.sayHello()

    // 通过匿名内部类的形式创建Person抽象类的子类对象
    val p: Person = new Person() { // 多态
      override def sayHello(): Unit = println("Hello,Scala!我是通过匿名内部类的方式实现的")
    }
    show(p)

  }
}
