package com.demo01_trait

// 演示类继承多个特质
object ClassDemo02 {

  // 定义一个特质MessageSender，表示发送消息
  trait MessageSender {
    def send(msg: String) // 抽象方法

  }

  // 定义一个特质MessageReceiver，表示接收消息
  trait MessageReceiver {
    def receive()
  }

  // 定义MessageWorker类，继承两个特质
  class MessageWorker extends MessageSender with MessageReceiver {
    override def send(msg: String): Unit = println("发送消息：" + msg)

    override def receive(): Unit = println("消息已收到，我很好！")
  }

  def main(args: Array[String]): Unit = {
    val m = new MessageWorker
    m.send("你好吗")
    m.receive()
  }

}
