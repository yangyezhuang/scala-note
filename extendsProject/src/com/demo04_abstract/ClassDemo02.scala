package com.demo04_abstract


// 演示抽象字段
object ClassDemo02 {

  abstract class Person {
    val occupation: String
  }

  class Student extends Person {
    override val occupation: String = "Student"
  }

  class Teacher extends Person {
    override val occupation: String = "Teacher"
  }

  def main(args: Array[String]): Unit = {
    val s = new Student
    println(s.occupation)

    val t = new Teacher
    println(t.occupation)

  }
}
