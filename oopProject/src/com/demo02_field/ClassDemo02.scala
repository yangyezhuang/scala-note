package com.demo02_field

// 案例：演示通过下划线来初始化成员变量值
object ClassDemo02 {

  // 1.定义Person类
  class Person {
    // 2.定义姓名和年龄字段
    // 方式一：普通写法
    // val name:String = ""
    // 方式二：采用类型推断实现
    // var name = ""
    // 方式三：采用下划线来初始化成员变量值
    var name: String = _
    var age: Int = _
    //  val age:Int = _   // 这样写会报错，因为使用下划线出事故化成员变量值的方法只针对var
  }

  def main(args: Array[String]): Unit = {
    val p = new Person
    p.name = "tom"
    p.age = 18
    println(p.name, p.age)
  }
}
