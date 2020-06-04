package com.leetcode.challenge.june

import java.util.Arrays

import com.learn.arrays.Utils._

/**
 * There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].
 *
 * Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.
 *
 *
 *
 * Example 1:
 *
 * Input: [[10,20],[30,200],[400,50],[30,20]]
 * Output: 110
 * Explanation: 
 * The first person goes to city A for a cost of 10.
 * The second person goes to city A for a cost of 30.
 * The third person goes to city B for a cost of 50.
 * The fourth person goes to city B for a cost of 20.
 *
 * The total minimum cost is 10 + 30 + 50 + 20 = 110 to have half the people interviewing in each city.
 *
 */
object Day3_TwoCityScheduling {
  def main(args: Array[String]): Unit = {
//    val costs = Array(Array(10, 20), Array(30, 200), Array(400, 50), Array(30, 20)) //110
        val costs = Array(Array(259, 770), Array(448, 54), Array(926, 667), Array(184, 139), Array(840, 118), Array(577, 469)) //1859
    println(time(twoCityScheduling1(costs)))
  }

  // this solution didnot workout for test case 2
  def twoCitySchedCost(costs: Array[Array[Int]]): Int = {
    var count = 0
    var countA = costs.size / 2
    var countB = costs.size / 2
    var c = costs
    c = c.sortBy(_ (0))

    for (i <- costs) {
      if ((i(0) < i(1) && countA != 0) || countB == 0) {
        count += i(0)
        countA -= 1
      } else if (i(1) < i(0) && countB != 0) {
        count += i(1)
        countB -= 1
      }
      println(s"$count \t ${i(0)} ${i(1)} $countA $countB")
    }
    count
  }

  // final solution
  def twoCityScheduling1(s: Array[Array[Int]]): Int = {
    val costs = s.sortWith((a, b) => ((a(0) - a(1)) - (b(0) - b(1))) > 0)
    costs.foreach(x => println(x(0)+" "+x(1)))
    var cost: Int = 0
    for (i <- 0 to (costs.size / 2) - 1) {
      cost += costs(i)(1)
    }
    for (i <- costs.size / 2  to costs.size - 1) {
      cost += costs(i)(0)
    }
    cost
  }

}

