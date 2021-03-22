package com.demo01_array


// 演示：演示定长数组
object ClassDemo01 {
  def main(args: Array[String]): Unit = {
    //1. 定义一个长度为10的整型数组, 设置第1个元素为11, 并打印第1个元素
    val arr1 = new Array[Int](10)
    arr1(0) = 11
    println(arr1(0))
    println()

    //2. 定义一个包含"java", "scala", "python"这三个元素的数组, 并打印数组长度
    val arr2 = Array("java", "scala", "python")
    println(arr2.length) // 求长度方法一
    println(arr2.size) //  求长度方法二
  }
}
