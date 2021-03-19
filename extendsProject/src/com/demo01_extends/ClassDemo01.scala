package com.demo01_extends

// 非继承版
object ClassDemo01 {

  class Teacher {
    var name = ""
    var age = 0

    def eat() = println("老师喝牛肉汤...")
  }

  class Student {
    var name = ""
    var age = 0

    def eat() = println("学生喝牛肉汤...")
  }

  def main(args: Array[String]): Unit = {
    val t = new Teacher
    t.name = "王老师"
    t.age = 34
    t.eat()
    println(t.name, t.age)
    t.eat()

    println()

    val s = new Student
    s.name = "小张"
    s.age = 15

    s.eat()
    println(s.name, s.age)
    s.eat()
  }

}
