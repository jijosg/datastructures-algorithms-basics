package com.learn.arrays

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 *
 * Example 1:
 * Input: [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 */
object FindMaxConsecutiveOnes {

  def main(args: Array[String]): Unit = {
    val nums = Array(1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1)
    val numOnes = time(findMaxConsecutiveOnes(nums))
    println("Number of consective ones : " + numOnes)

  }

  def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
    var sum, max = 0
    for (i <- nums.indices) {
      if (nums(i) == 1) {
        sum = sum + 1
        if (max < sum) max = sum
      } else sum = 0
    }
    max
  }

  def time[R](block: => R): R = {
    val t0 = System.currentTimeMillis()
    val result = block // call-by-name
    val t1 = System.currentTimeMillis()
    println("Elapsed time: " + (t1 - t0) / 1000.0 + "s")
    result
  }
}
