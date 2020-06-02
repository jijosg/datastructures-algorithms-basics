package com.leetcode.challenge.june

import com.learn.arrays.Utils

/**
 * Invert a binary tree.
 *
 * Example:
 *
 * Input:
 *
 * 4
 * /   \
 * 2     7
 * / \   / \
 * 1   3 6   9
 * Output:
 *
 * 4
 * /   \
 * 7     2
 * / \   / \
 * 9   6 3   1
 */
object Day1_InvertBinaryTree {

  def main(args: Array[String]): Unit = {
    val sampleTree = new TreeNode(4
      , new TreeNode(2, new TreeNode(1), new TreeNode(3))
      , new TreeNode(7, new TreeNode(6), new TreeNode(9)))

    printTree(sampleTree)
    printTree(Utils.time(invertTree(sampleTree)))
  }

  def invertTree(root: TreeNode): TreeNode = {
    if (root == null) root
    else {
      val tmp = root.left
      root.left = root.right
      root.right = tmp
      invertTree(root.left)
      invertTree(root.right)
      root
    }
  }

  def printTree(root: TreeNode): Unit = {
    println(root.value)
    if (root.left != null) printTree(root.left)
    if (root.right != null) printTree(root.right)
  }
}


class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}
