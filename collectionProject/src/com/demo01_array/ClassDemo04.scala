package com.demo01_array

//案例: 遍历数组
object ClassDemo04 {
  def main(args: Array[String]): Unit = {
    val arr1 = Array(1, 2, 3, 4, 5)

    //2. 通过两种遍历方式遍历数组，并打印数组中的元素.
    //方式一: 遍历数组索引， to：包左也包右
    for (i <- 0 to arr1.length - 1) println(arr1(i))
    println("-" * 15)

    //方式二: 遍历数组索引， until：包左不包右
    for (i <- 0 until arr1.length) println(arr1(i))
    println("-" * 15)


    // 直接遍历数组元素
    for (i <- arr1) println(i)
    println("-" * 15)
  }
}
