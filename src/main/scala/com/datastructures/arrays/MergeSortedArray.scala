package com.datastructures.arrays

import java.util.Collections

import com.common.Utils
import dotty.runtime.Arrays

/**
 * Merge Sorted Array
 *
 * Solution
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 */
object MergeSortedArray {
  // TODO : optimize
  def main(args: Array[String]): Unit = {

    // test input 1
    /*val nums1: Array[Int] = Array(1, 2, 3, 0, 0, 0)
    val nums2: Array[Int] = Array(2, 5, 6)
    
    val m: Int = 3
    val n: Int = 3*/

    // test input 2
    /*val nums1: Array[Int] = Array(0)
    val nums2: Array[Int] = Array(1)

    val m: Int = 0
    val n: Int = 1*/

    // test input 3
    /*val nums1: Array[Int] = Array(1)
    val nums2: Array[Int] = Array(0)

    val m: Int = 1
    val n: Int = 0*/

    // test input 4
    val nums1: Array[Int] = Array(2,0)
    val nums2: Array[Int] = Array(1)

    val m: Int = 1
    val n: Int = 1

    Utils.time(merge(nums1, m, nums2, n))
    nums1.foreach(x => print(x + " "))
  }

  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    if (n > 0) {
      var p = if (m == 0) m else m - 1
      var q = n - 1
      var k = m + n - 1
      while (q >= 0) {
        if (nums1(p) > nums2(q)) {
          nums1(k) = nums1(p)
          p -= 1
        } else {
          nums1(k) = nums2(q)
          q -= 1
        }
        k -= 1
      }
    }
  }


}


