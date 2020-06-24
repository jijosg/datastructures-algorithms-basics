package com.leetcode.challenge.june

/**
 * Count Complete Tree Nodes
 * Given a complete binary tree, count the number of nodes.
 *
 * Note:
 *
 * Definition of a complete binary tree from Wikipedia:
 * In a complete binary tree every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 *
 * Example:
 *
 * Input: 
 * 1
 * / \
 * 2   3
 * / \  /
 * 4  5 6
 *
 * Output: 6
 */
object Day23_CountCompleteTreeNodes {
  // TODO : O(n) solution improve accuracy by counting height of tree
  def main(args: Array[String]): Unit = {
    val h1right = new TreeNode(3, new TreeNode(6))
    val h1left = new TreeNode(2, new TreeNode(4), new TreeNode(5))
    val root = new TreeNode(1, h1left, h1right)

    println(countNodes(root))
  }

  def countNodes(root: TreeNode): Int = {
    if (root == null) 0
    else 1 + countNodes(root.left) + countNodes(root.right)
  }

}

/*
class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right
}*/
