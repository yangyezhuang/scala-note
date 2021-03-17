package com.demo09_utils

import java.text.SimpleDateFormat
import java.util.Date

//案例：定义日期工具类
object ClassDemo01 {

  object DataUtils {
    //1. 定义DateUtils工具类. //也就是Scala中的单例对象.
    var sdf: SimpleDateFormat = null

    // 将日期转换成字符串
    def data2String(date: Date, template: String) = {
      sdf = new SimpleDateFormat(template)
      sdf.format(date)
    }

    //将字符串转换为日期
    def string2Date(dateString: String, template: String) = {
      sdf = new SimpleDateFormat(template)
      sdf.format(dateString)
    }
  }


  def main(args: Array[String]): Unit = {
    //调用方法
    println(DataUtils.data2String(new Date(), "HH:mm:ss"))
    println(DataUtils.string2Date("2021年3月17日", "yyyy年MM月dd日"))
  }
}
