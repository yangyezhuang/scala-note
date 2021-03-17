package com.demo08_companion


//案例：演示private[this]访问权限修饰符
//解释：private[this]修饰的内容只能在本类中直接使用，就连伴生类（或者其他伴生对象）也无法直接访问
object ClassDemo02 {

  // 1.定义Person伴生类，并在其中定义name字段
  class Person(var name: String) {
  // class Person(private[this] var name: String)    // 这样写，第十六行代码会报错

  }

  // 2. 定义Person类的伴生对象
  object Person {
    // 3.定义一个printPerson方法，用来打印Person随想的属性值
    def printPerson(p: Person) = println(p.name)
  }

  def main(args: Array[String]): Unit = {
    val p = new Person("tom")
    Person.printPerson(p)
  }
}
