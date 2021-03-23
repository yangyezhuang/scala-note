package com.demo02_tuple

// 演示：演示访问元组中的元素
object ClassDemo02 {
  def main(args: Array[String]): Unit = {
    // 通过 ._1访问元组元素，下标从1开始
    val tuple1 = "tom" -> "alice"

    println(s"name：${tuple1._1}")
    println("-" * 15)

    // 通过迭代器遍历元组元素
    val tuple2 = (1, 2, 3, 4, 5)
    val it = tuple2.productIterator
    for (i <- it) println(i)
  }
}
