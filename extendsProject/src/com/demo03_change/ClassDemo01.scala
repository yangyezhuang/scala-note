package com.demo03_change


// 演示isInstanceOf和asInstanceOf关键字
/*
  isInstanceOf: 判断对象是否为指定类的对象
  asInstanceOf: 将对象转换为指定类型
 */
object ClassDemo01 {

  // 定义Person类
  class Person {}

  // 定义Student类，继承自Person类，该类有一个自己的成员方法：sayHello
  class Student extends Person {
    def sayHello() = println("Hello,Student")
  }

  def main(args: Array[String]): Unit = {
    // 通过多态的形式，创建Student类型的对象
    /*
      多态：
        概述：同一个事物在不同时刻表现出来的不同形态
        弊端：父类引用不能直接使用子类的特有成员
    */
    val p: Person = new Student
    // p.sayHello()       // 这样写会报错，因为弗雷引用不能直接使用子类的特有成员


    // 解决办法
    // 1.判断对象p是否是Student类型的对象
    if (p.isInstanceOf[Student]) {
      // 2.如果是，就将其转化成Student类型的对象，然后调用sayHello()
      val s = p.asInstanceOf[Student]
      // 上边这行代码相当于：val s:Student = new Student
      s.sayHello()
    }
  }
}
