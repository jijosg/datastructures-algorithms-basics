package com.datastructures.arrays

import com.common.Utils._

object FindNumbersWithEvenDigits {

  /**
   * Given an array nums of integers, return how many of them contain an even number of digits.
   *
   *
   * Example 1:
   *
   * Input: nums = [12,345,2,6,7896]
   * Output: 2
   * Explanation: 
   * 12 contains 2 digits (even number of digits). 
   * 345 contains 3 digits (odd number of digits). 
   * 2 contains 1 digit (odd number of digits). 
   * 6 contains 1 digit (odd number of digits). 
   * 7896 contains 4 digits (even number of digits). 
   * Therefore only 12 and 7896 contain an even number of digits.
   *
   *
   *
   * Example 2:
   *
   * Input: nums = [555,901,482,1771]
   * Output: 1 
   * Explanation: 
   * Only 1771 contains an even number of digits.
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {

    val numArray1 = Array(12, 345, 2, 6, 7896)
    val numArray2 = Array(555, 901, 482, 1771)
    val numArray3 = Array(12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896,
      12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896,
      12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896,
      12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896
      , 12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896, 12, 345, 2, 6, 7896)
    //    println(time(findNumbers1(numArray1)))
    //    println(time(findNumbers1(numArray2)))
    println(time(findNumbers1(numArray3)))
    println(time(findNumbers(numArray3)))
  }

  def findNumbers1(nums: Array[Int]): Int = {
    var count = 0
    for (i <- nums.indices) {
      var len = 1
      var num = nums(i)
      while (num / 10 != 0) {
        num = num / 10
        len += 1
      }
      if (len % 2 == 0) count += 1
    }
    count
  }

  def findNumbers(nums: Array[Int]): Int = {
    nums.foldLeft(0)((a, b) =>
      if ((b >= 10 & b < 100) || (b >= 1000 & b < 10000) || (b >= 100000 & b < 1000000)) a + 1 else a)
  }
}
