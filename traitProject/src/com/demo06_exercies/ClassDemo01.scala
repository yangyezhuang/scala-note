package com.demo06_exercies

//案例: 程序员案例
object ClassDemo01 {

  //1. 定义程序员类Programmer.
  abstract class Programmer {
    //属性: 姓名和年龄
    var name = ""
    var age = 0

    //行为: 吃饭和技能
    def eat()

    def skill()
  }

  //2. 定义特质BigData.
  trait BigData {
    def learningBigdata(): Unit = {
      println("来到黑马程序员之后: ")
      println("我学会了: Hadoop, Zookeeper, HBase, Hive, Sqoop, Scala, Spark, Flink等技术")
      println("我学会了: 企业级360°全方位用户画像, 千亿级数据仓, 黑马推荐系统, 电信信号强度诊断等项目")
    }
  }

  //3. 定义Java程序员类JavaProgrammer.
  class JavaProgrammer extends Programmer {
    override def eat(): Unit = println("Java程序员吃大白菜, 喝大米粥.")

    override def skill(): Unit = println("我精通Java技术.")
  }

  //4. 定义Python程序员类PythonProgrammer.
  class PythonProgrammer extends Programmer {
    override def eat(): Unit = println("Python程序员吃小白菜, 喝小米粥.")

    override def skill(): Unit = println("我精通Python技术.")
  }

  //5. 定义PartJavaProgrammer类, 表示精通: Java和大数据的程序员.
  class PartJavaProgrammer extends JavaProgrammer with BigData {
    override def eat(): Unit = println("精通Java和大数据的程序员, 吃牛肉, 喝牛奶")

    override def skill(): Unit = {
      super.skill()
      learningBigdata()
    }
  }

  //6. 定义PartPythonProgrammer类, 表示精通: Python和大数据的程序员.
  class PartPythonProgrammer extends PythonProgrammer with BigData {
    override def eat(): Unit = println("精通Python和大数据的程序员, 吃羊肉, 喝羊奶")

    override def skill(): Unit = {
      super.skill()
      learningBigdata()
    }
  }

  def main(args: Array[String]): Unit = {
    //7.1 测试普通Java程序员.
    val jp = new JavaProgrammer
    jp.name = "tom"
    jp.age = 34
    println(jp.name, jp.age)
    jp.skill()
    jp.eat()
    println("-" * 30)

    //7.2 测试精通Java + 大数据的程序员
    val pjp = new PartJavaProgrammer
    pjp.name = "tom"
    pjp.age = 34
    println(pjp.name, pjp.age)
    pjp.skill()
    pjp.eat()

  }
}
