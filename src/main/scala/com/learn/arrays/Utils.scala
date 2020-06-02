package com.learn.arrays


object Utils {
  /*
  
    def main(args: Array[String]): Unit = {
      println("Hello world!")
      println(msg)
    }
  */

  def msg = "I was compiled by dotty :)"

  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0) + "ns")
    result
  }
}
