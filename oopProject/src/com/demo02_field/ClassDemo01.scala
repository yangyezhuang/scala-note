package com.demo02_field


// 案例：演示如何在类中定义成员变量
object ClassDemo01 {

  // 1.定义Person类
  class Person {
    // 2.定义姓名和年龄字段
    // 方式一：普通写法
    // val name:String = ""
    // 方式二：采用类型推断实现
    var name = ""
    var age = 0
  }

  // 3. 添加main方法，主程序入口
  def main(args: Array[String]): Unit = {
    // 4. 创建person类型的对象
    val p = new Person
    // 5. 给成员变量赋值
    p.name = "张三"
    p.age = 20
    // 6. 打印属性值
    println(s"我叫${p.name}，今年${p.age}岁。")
  }
}
