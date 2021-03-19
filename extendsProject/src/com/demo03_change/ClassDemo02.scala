package com.demo03_change


// 演示getClass和ClassOf关键字
object ClassDemo02 {

  class Person

  class Student extends Person


  def main(args: Array[String]): Unit = {
    val p: Person = new Student //利用多态创建对象（父类引用指向子类对象）

    // 通过isInstanceOf关键字判断其是否是Person类型的对象.
    println(p.isInstanceOf[Person]) // 只要传入Peson类型或者其子类对象，返回值都是true

    // 通过isInstanceOf关键字判断其是否是Person类型的对象.
    println(p.isInstanceOf[Student]) // 只要传入Student类型或者其子类对象，返回值都是true

    // 通过getClass, ClassOf判断其是否是Person类型的对象.
    println(p.getClass == classOf[Person]) // 传入的必须是Person类型的对象，否则返回false

    // 通过getClass, ClassOf判断其是否是Student类型的对象.
    println(p.getClass == classOf[Student]) // 传入的必须是Student类型的对象，否则返回false
  }

}
