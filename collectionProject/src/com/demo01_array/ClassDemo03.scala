package com.demo01_array

// 导包

import scala.collection.mutable.ArrayBuffer
//案例: 修改变长数组中的内容.

object ClassDemo03 {
  def main(args: Array[String]): Unit = {
    //1. 定义一个变长数组，包含以下元素: "java", "scala", "python"
    val arr1 = ArrayBuffer("java", "scala", "python")
    //2. 往该变长数组中添加一个"hadoop"元素
    arr1 += "hadoop"
    //3. 从该变长数组中删除"scala"元素
    arr1 -= "scala"
    //4. 将一个包含"hive", "flume"元素的数组, 追加到变长数组中.
    arr1 ++= Array("hive", "flume")
    //5. 从该变长数组中删除"java", "python"这两个元素.
    arr1 --= Array("java", "python")

    println(s"arr1:${arr1}")
  }
}
