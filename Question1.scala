package com.disprz.scala

import scala.collection.mutable.ListBuffer

object Question1 {

  def bucketize(item: Double): String = {
    val last_two_digits = (item * 1000) % 100 //For getting last two digits

    //If last two digits >= 50, then range is from `n-(last two digits/1000)+0.050 to n+(99 - last two digits)/1000`
    if (last_two_digits >= 50) {
      val left = item - (last_two_digits / 1000) + 0.050 //left limit
      val right = item + (99 - last_two_digits) / 1000 // right limit
      f"$left%,.3f" + " - " + f"$right%,.3f"
    }

    //Else, range is from `n - (last two digits/1000) to n + (49 - last two digits)/1000`.
    else {
      val left = item - (last_two_digits / 1000) //left limit
      val right = item + (49 - last_two_digits) / 1000 //right limit
      f"$left%,.3f" + " - " + f"$right%,.3f"
    }
  }

  def main(args: Array[String]): Unit = {
    //Storing the values in an List and printing the bucket related to the given values.
    val res = new ListBuffer[String]()
    val values = List(
      12.05,
      12.03,
      10.33,
      11.45,
      13.50)
    for (value <- values) {
      res += bucketize(value)
    }

    println(res)
  }
}