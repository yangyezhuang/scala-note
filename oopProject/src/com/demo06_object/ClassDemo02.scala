package com.demo06_object

//案例: 演示Scala中的单例对象之定义和访问成员方法
object ClassDemo02 {

  //1. 定义单例对象PrintUtil
  object PrintUtil {
    //2. 定义一个方法, 用来打印分割线
    def printSpliter() = println("-" * 20)
  }


  def main(args: Array[String]): Unit = {
    //3. 调用单例对象中的成员方法
    PrintUtil.printSpliter()
  }
}
