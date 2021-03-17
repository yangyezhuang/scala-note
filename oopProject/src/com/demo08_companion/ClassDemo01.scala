package com.demo08_companion

//案例: 演示Scala中的伴生对象
object ClassDemo01 {

  //1. 定义一个类Generals, 作为一个伴生类.
  class Generals { //这里写的都是非静态成员.
    //2. 定义一个toWar()方法, 输出一句话, 格式为"武将拿着**武器, 上阵杀敌!"
    def toWar() = println(s"武将拿着${Generals.armsName},上阵杀敌")
  }

  //3. 定义一个伴生对象, 用来保存"武将的武器"
  object Generals { //这里写的都是静态成员
    private var armsName = "青龙偃月刀"
  }


  def main(args: Array[String]): Unit = {
    //4. 创建Generals类的对象.
    val g = new Generals
    //5. 调用Generals类中的toWar方法
    g.toWar()
  }

}
