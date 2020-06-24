package com.leetcode.challenge.june

import com.common.Utils

/**
 *
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * You may assume all the characters consist of printable ascii characters.
 *
 *
 *
 * Example 1:
 *
 * Input: ['h','e','l','l','o']
 * Output: ['o','l','l','e','h']
 * Input:
 * ['A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a']
 * Expected:
 * ['a','m','a','n','a','P',' ',':','l','a','n','a','c',' ','a',' ',',','n','a','l','p',' ','a',' ',',','n','a','m',' ','A']
 */
object Day4_ReverseString {

  def main(args: Array[String]): Unit = {
    val n: Array[Char] = Array('A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ', 'c',
      'a', 'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a')
    Utils.time(reverseString1(n))
    n.foreach(x => print(x + " "))
  }

  def reverseString(s: Array[Char]): Unit = {
    val len = s.size
    for (i <- 0 to len / 2 - 1) {
      val tmp = s(i)
      s(i) = s(len - 1 - i)
      s(len - 1 - i) = tmp
    }
  }

  //optimized
  def reverseString1(s: Array[Char]): Unit = {
    var i = 0
    var j = s.length - 1
    while (i < j) {
      val tmp = s(i)
      s(i) = s(j)
      s(j) = tmp
      i += 1
      j -= 1
    }
  }
}
