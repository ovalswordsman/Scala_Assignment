package com.disprz.scala

import scala.collection.mutable.ArrayBuffer


case class playerClass(Year: Int, PlayerName: String, Country: String, Matches: Int, Runs: Int, Wickets: Int)

object Question2 {


  def highestRuns(players: ArrayBuffer[playerClass]): String = {
    val res = players.sortBy(_.Runs).reverse //Sorted data in reverse order by runs
    res(0).PlayerName //return the first name
  }


  def top5ByRun(players: ArrayBuffer[playerClass]): Unit = {
    val res = players.sortBy(_.Runs).reverse //Sorted data in reverse order by runs
    for (player <- res.slice(0, 5)) {
      println(player.PlayerName)
    }
  }


  def top5Wicket(players: ArrayBuffer[playerClass]): Unit = {
    val res = players.sortBy(_.Wickets).reverse //Sorted data in reverse by Wickets
    for (player <- res.slice(0, 5)) {
      println(player.PlayerName)
    }
  }


  def rankPlayers(players: ArrayBuffer[playerClass]): Unit = {
    val sortedByRank = players.sortWith((player1, player2) => (player1.Runs * 5 + player1.Wickets * 0.05) > (player2.Runs * 5 + player2.Wickets * 0.05))
    for (player <- sortedByRank) {
      println(player.PlayerName)
    }
  }

  def main(args: Array[String]): Unit = {
    val players = ArrayBuffer[playerClass](
      playerClass(2021, "Sam", "India", 23, 2300, 3),
      playerClass(2021, "Ram", "India", 23, 300, 30),
      playerClass(2021, "Mano", "India", 23, 300, 13),
      playerClass(2022, "Kohli", "India", 70, 1000, 0),
      playerClass(2020, "Dhoni", "India", 80, 7000, 10),
      playerClass(2020, "Rohit", "India", 80, 9000, 0)
    )

    //Question1
    println(s"Player with the best highest run scored : ")
    println(s"${highestRuns(players)}")
    println()

    //Question2
    println(s"Top 5 players by run scored : ")
    top5ByRun(players)
    println()

    //Question3
    println(s"Top 5 wicket takers are : ")
    top5Wicket(players)
    println()

    //Question4
    println(s"Rank players with overall performance give weight 5x to wicket taken and (5/100)x to run scored : ")
    rankPlayers(players)
    println()
  }


}