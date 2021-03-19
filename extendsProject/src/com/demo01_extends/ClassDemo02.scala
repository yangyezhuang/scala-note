package com.demo01_extends

import com.demo01_extends.ClassDemo01.{Student, Teacher}


// 继承版
object ClassDemo02 {

  // 定义Person类，父类
  class Person {
    var name = ""
    var age = 0

    def eat() = println("人要吃饭...")
  }

  // 定义子类
  class Teacher extends Person()

  class Student extends Person()


  def main(args: Array[String]): Unit = {
    val t = new Teacher
    t.name = "王老师"
    t.age = 34
    t.eat()
    println(t.name, t.age)

    println()

    val s = new Student
    s.name = "小张"
    s.age = 15

    println(s.name, s.age)
    s.eat()
  }
}
