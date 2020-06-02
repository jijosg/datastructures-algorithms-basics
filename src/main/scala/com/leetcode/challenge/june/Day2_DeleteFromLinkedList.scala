package com.leetcode.challenge.june

import com.learn.arrays.Utils

import scala.util.control.Breaks._

/**
 * Write a function to delete a node (except the tail) in a singly linked list, 
 * given only access to that node.
 *
 * Given linked list -- head = [4,5,1,9]
 * Example 1:
 *
 * Input: head = [4,5,1,9], node = 5
 * Output: [4,1,9]
 * Explanation: You are given the second node with value 5, 
 * the linked list should become 4 -> 1 -> 9 after calling your function.
 *
 * Note:
 *
 * The linked list will have at least two elements.
 * All of the nodes' values will be unique.
 * The given node will not be the tail and it will always be a valid node of the linked list.
 * Do not return anything from your function.
 */
object Day2_DeleteFromLinkedList {
  var head = new ListNode(4)
  val node = new ListNode(5)
  head.next = node
  head.next.next = new ListNode(1)
  head.next.next.next = new ListNode(9)

  def main(args: Array[String]): Unit = {

    Utils.time(deleteNode1(node))
    displayNodes(head)
  }

  def deleteNode1(node: ListNode): Unit = {
    val top = node.next
    node.x = top.x
    node.next = top.next
  }

  def deleteNode2(node: ListNode): Unit = {
    node.x = node.next.x
    node.next = node.next.next
  }


  def displayNodes(node: ListNode): Unit = {
    if (node != null) {
      print(node.x)
      if (node.next != null) {
        print(" -> ")
        displayNodes(node.next)
      }
    }
  }

}

// Definition for singly-linked list.
class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}
