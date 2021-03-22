package com.demo01_array

//案例: 数组的常用算法

object ClassDemo05 {
  def main(args: Array[String]): Unit = {
    //1. 定义一个数组, 包含4, 1, 6, 5, 2, 3这些元素.
    val arr1 = Array(4, 1, 6, 5, 2, 3)
    //测试sum
    println(s"sum：${arr1.sum}")
    //测试max
    println(s"max：${arr1.max}")
    //测试min
    println(s"min：${arr1.min}")
    //测试sorted
    val arr2 = arr1.sorted
    //测试reverse
    val arr3 = arr2.reverse

    for (i <- arr2) println(i)
    println("-" * 15)
    for (i <- arr3) println(i)

  }
}
