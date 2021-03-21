package com.demo03_pattern

// 演示：演示职责链模式（也叫责任链模式，调用链模式）
/*
  1. 按照 从右往左 的顺序依次执行.
     即首先会先从最右边的trait方法开始执行，然后依次往左执行对应trait中的方法
  2. 当所有子特质的该方法执行完毕后, 最后会执行父特质中的此方法.
 */
object ClassDemo03 {

  //1. 定义一个父特质 Handler, 表示处理数据(具体的支付逻辑)
  trait Handler {
    def handler(data: String) = { // data：用户发起的具体支付数据
      println("具体的处理数据...")
      println(data)
    }
  }

  //2. 定义一个子特质 DataValidHandler, 表示 校验数据
  trait DataValidHandler extends Handler {
    override def handler(data: String): Unit = {
      println("验证数据")
      super.handler(data)
    }
  }

  //3. 定义一个子特质 SignatureValidHandler, 表示 校验签名
  trait SignatureValidHandler extends Handler {
    override def handler(data: String): Unit = {
      println("检查签名")
      super.handler(data)
    }
  }

  //4. 定义一个子特质 BankValidHandler, 表示 银行校验
  trait BankValidHandler extends Handler {
    override def handler(data: String): Unit = {
      println("银行校验")
      super.handler(data)
    }
  }

  //5. 定义一个类Payment, 表示: 用户发起的支付请求.
  class Payment extends BankValidHandler with DataValidHandler with SignatureValidHandler {
    def pay(data: String): Unit = {
      println("用户发起支付请求")
      super.handler(data)
    }
  }

  def main(args: Array[String]): Unit = {
    val p = new Payment
    p.pay("tom给bob转账1000元")
  }
}
