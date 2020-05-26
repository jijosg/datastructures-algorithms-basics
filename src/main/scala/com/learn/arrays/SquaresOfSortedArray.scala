package com.learn.arrays

import com.learn.arrays.Utils._

object SquaresOfSortedArray {
  /**
   * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.
   *
   *
   *
   * Example 1:
   *
   * Input: [-4,-1,0,3,10]
   * Output: [0,1,9,16,100]
   * Example 2:
   *
   * Input: [-7,-3,2,3,11]
   * Output: [4,9,9,49,121]
   *
   * @param args
   */
  def main(args: Array[String]): Unit = {
    val nums = Array(-4, -1, 0, 3, 10)
    time(sortedSquares(nums)).foreach(println _)
  }

  def sortedSquares1(A: Array[Int]): Array[Int] = {
    A.map(x => x * x).sorted
  }
  
  def sortedSquares(A:Array[Int]):Array[Int] = {
    var i = 0
    var j = A.length - 1


    val res = new Array[Int](A.length)
    var t = res.length - 1
    while(i <= j) {
      if(A(i) * A(i) >= A(j) * A(j)) {
        res(t) = A(i) * A(i)
        i += 1
      } else {
        res(t) = A(j) * A(j)
        j -= 1
      }
      t -= 1
    }
    res
  }
}
