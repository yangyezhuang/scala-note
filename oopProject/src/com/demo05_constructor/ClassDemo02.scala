package com.demo05_constructor

object ClassDemo02 {

  //1. 创建Customer类, 主构造器参数列表为: 姓名和地址.
  class Customer(var name: String, var address: String) { //这里应该用var修饰.
    //2. 定义一个辅助构造器, 接收一个数组参数
    def this(arr: Array[String]) {
      this(arr(0), arr(1)) //将数组的前两个元素分别传给主构造器的两个参数.
    }
  }


  def main(args: Array[String]): Unit = {
    //3. 调用辅助构造器, 创建Customer对象.
    val c = new Customer(Array("张三", "北京"))
    //4. 打印结果.
    println(c.name, c.address)
  }

}
