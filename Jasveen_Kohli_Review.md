## Question1 
**Overview** 
- The given code implements a program in Scala that takes an array of doubles as input and groups them into buckets, where each bucket represents a range of values. The range of each bucket is 0.050 and the values are rounded off to three decimal places. The output is printed as a list of values with their respective bucket range.

**Functionality** <br /> 
The code performs the following tasks:

- Defines a function named round_off that takes a double value and returns a BigDecimal value, rounded off to three decimal places using the HALF_UP rounding mode.
- Defines the main function that:
- Defines an array of doubles arr with sample data.
- Creates an empty ArrayBuffer named bucketizeArray to store the results.
- Loops through the array arr and for each element:
- Rounds off the element to three decimal places using the round_off function and stores it in a variable named r.
- Calculates the index of the bucket to which the value belongs by dividing r by 0.050 and converting it to an integer.
- Calculates the range of the bucket to which the value belongs, stored as a tuple named bucketRange.
- Appends a string in the format "elem belongs to bucket bucketRange._1 - bucketRange._2" to the bucketizeArray.
- Prints the bucketizeArray.

## Question2
- The code defines a case class Player with attributes Year, PlayerName, Country, Matches, Runs and Wickets. It then defines several functions to analyze and rank the data of the players.

- The first function, player_with_highest_runs, takes an array of Player objects and returns the name of the player with the highest Runs attribute.

- The second function, top_5_run_scorer, takes an array of Player objects and prints the top 5 players based on their Runs attribute.

- The third function, top_5_wicket_taker, takes an array of Player objects and prints the top 5 players based on their Wickets attribute.

- The fourth function, player_ranking, takes an array of Player objects and ranks them based on their Runs and Wickets attributes using a formula of Runs * 5 + Wickets * 0.05. It then prints the ranking of all players.

- The code then creates an array of Player objects with sample data and prints the results of calling the functions defined earlier with this data.
