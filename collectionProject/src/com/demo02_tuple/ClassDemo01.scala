package com.demo02_tuple

// 演示：演示元组（元组的长度和元素是不可变的）
object ClassDemo01 {
  def main(args: Array[String]): Unit = {

    // 通过小括号的形式实现
    val tuple1 = ("tom", 24, "boy")
    // 通过箭头的方式实现
    val tuple2 = "alice" -> 23

    println(tuple1)
    println(tuple2)

  }
}
