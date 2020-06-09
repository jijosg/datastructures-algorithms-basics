package com.leetcode.challenge.june

import com.learn.arrays.Utils

/**
 * Power of Two
 * Given an integer, write a function to determine if it is a power of two.
 *
 * Example 1:
 *
 * Input: 1
 * Output: true 
 * Explanation: 20 = 1
 * Example 2:
 *
 * Input: 16
 * Output: true
 * Explanation: 24 = 16
 */
object Day8_PowerOfTwo {

  def main(args: Array[String]): Unit = {
    println(Utils.time(isPowerOfTwo(0)))
    println(Utils.time(isPowerOfTwo(1)))
    println(Utils.time(isPowerOfTwo(2)))
    println(Utils.time(isPowerOfTwo(3)))
    println(Utils.time(isPowerOfTwo(4)))
    println(Utils.time(isPowerOfTwo(6)))
  }

  def isPowerOfTwo1(n: Int): Boolean = {
    if (n == 1) true
    else if (n != 0 && n % 2 == 0) {
      isPowerOfTwo(n / 2)
    } else false
  }

  // new trick comparing either n&(n-1) or n&-n both yield same results
  def isPowerOfTwo(n: Int): Boolean = {
    n>0 && (n & -n) == n
  }
}
