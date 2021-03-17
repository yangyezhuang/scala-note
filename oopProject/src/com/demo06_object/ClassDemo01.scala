package com.demo06_object

//案例: 演示Scala中的单例对象之定义和访问成员变量.
object ClassDemo01 {

  //1. 定义单例对象Dog
  object Dog {
    //2. 定义一个变量, 用来存储狗腿子的数量
    val leg_num = 4

  }


  def main(args: Array[String]): Unit = {
    //3. 打印狗腿子的数量
    println(Dog.leg_num)
  }
}
