package com.demo08_companion

// 演示：apply()方法，创建对象的时候, 免new的动作
object ClassDemo03 {

  // 定义Person类
  class Person(var name: String = "", var age: Int = 0) {}

  // 定义Person类的伴生对象
  object Person {
    //3. 定义apply方法, 实现创建Person对象的时候免new.
    //apply()方法，scala SDK会自动调用
    def apply(name: String, age: Int): Person = new Person(name, age)
  }


  def main(args: Array[String]): Unit = {
    val p = Person("tom", 23)
    println(p.name, p.age)
  }
}
