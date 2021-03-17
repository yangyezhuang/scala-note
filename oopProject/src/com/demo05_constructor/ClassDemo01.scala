package com.demo05_constructor

object ClassDemo01 {

  class Person(val name: String = "张三", val age: Int = 23) { //这里应该用var修饰.
    //2. 在主构造器中输出"调用主构造器"
    println("调用主构造器!...")
  }


  def main(args: Array[String]): Unit = {
    //3. 创建"空"对象, 什么都不传.
    val p1 = new Person()
    println(s"p1: ${p1.name}...${p1.age}")
    //4. 创建"李四"对象, 传入姓名和年龄
    val p2 = new Person("李四", 24)
    println(s"p2: ${p2.name}...${p2.age}")
    //5. 创建测试对象, 仅传入年龄.
    val p3 = new Person(age = 30)
    println(s"p3: ${p3.name}...${p3.age}")
  }


}
