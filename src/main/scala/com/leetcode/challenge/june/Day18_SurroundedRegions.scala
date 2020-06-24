package com.leetcode.challenge.june

import com.common.Utils

/**
 * Given a 2D board containing 'X' and 'O' (the letter O), capture all regions 
 * surrounded by 'X'.
 *
 * A region is captured by flipping all 'O's into 'X's in that surrounded region.
 *
 * Example:
 *
 * X X X X
 * X O O X
 * X X O X
 * X O X X
 * After running your function, the board should be:
 *
 * X X X X
 * X X X X
 * X X X X
 * X O X X
 * Explanation:
 *
 * Surrounded regions shouldn’t be on the border, which means that any 'O' on the border 
 * of the board are not flipped to 'X'. Any 'O' that is not on the border and it is not 
 * connected to an 'O' on the border will be flipped to 'X'. Two cells are connected if 
 * they are adjacent cells connected horizontally or vertically.
 */
object Day18_SurroundedRegions {
  // TODO : optimize 
  def solve(board: Array[Array[Char]]): Unit = {
    if (!board.isEmpty) {
      val length = board.size
      val size = board(0).size
      if (length > 2 && size > 2) {
        for (i <- 1 until size-1) {
          if (board(i).contains('O')) {
            if (!(i == 0 || i == (size - 1))) {
              for (j <- 1 until board(i).size-1) {
                if (board(i)(j) == 'O') {
                  val count = countX(board, i - 1, j - 1)
                  if (count >= 5) board(i)(j) = 'X'
                }
              }
            }
          }
        }
      }
    }
  }

  def countX(subBoard: Array[Array[Char]], x: Int, y: Int): Int = {
    var count: Int = 0
    var size = 3
    for (i <- x until x + size) {
      for (j <- y until y + size) {
        if (subBoard(i)(j) == 'X') count += 1
      }

    }
    count
  }

  def main(args: Array[String]): Unit = {
    val input1 = Array(
      Array('X', 'X', 'X', 'X'),
      Array('X', 'O', 'O', 'X'),
      Array('X', 'X', 'O', 'X'),
      Array('X', 'O', 'X', 'X')
    )
    val input3 = Array(Array('O', 'O', 'O'), Array('O', 'O', 'O'), Array('O', 'O', 'O'))
    val input2: Array[Array[Char]] = Array[Array[Char]]()
    Utils.time(solve(input3))
    input3.foreach(x => {
      x.foreach(y => print(y + " "))
      println()
    })
  }


}
