package com.demo01_array

// 导包
import scala.collection.mutable.ArrayBuffer

// 案例：创建变长数组
object ClassDemo02 {
  def main(args: Array[String]): Unit = {
    //2. 定义一个长度为0的整型变长数组.
    val arr1 = ArrayBuffer[Int]()
    //3. 定义一个包含"java", "scala", "python"这三个元素的变长数组
    val arr2 = ArrayBuffer("java", "scala", "python")

    println(s"arr1:${arr1}")
    println(s"arr2:${arr2}")
  }
}
