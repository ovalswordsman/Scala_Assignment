## Question 1
- The Question_1 class has one method getBucket that takes one argument (a floating-point number) and returns nothing (Unit). The method first calculates the last two digits after the decimal point of the input number and then determines the bucket range based on the value of these digits. If the last two digits are greater than or equal to 50, then the bucket range is calculated from n - (last two digits/1000) + 0.050 to n + (99 - last two digits)/1000. Otherwise, the bucket range is calculated from n - (last two digits/1000) to n + (49 - last two digits)/1000.
- The Question_1 object has a main method that creates an instance of the Question_1 class and uses it to categorize a list of floating-point numbers into buckets by calling the getBucket method. The input values are stored in a list and printed with their respective bucket ranges.
- Overall, this code provides a simple implementation of a bucketization algorithm based on digits after the decimal point of floating-point numbers.


## Question 2
**Overview**
The given Scala code performs various operations on a list of Player objects. It reads data from a file named "details.txt", creates a list of Player objects from the data, and performs various operations on the list, such as displaying the details of top scorers, top wicket-takers, and top performers.

**Classes and Methods**
The Scala code defines a class Player and a class Question_2, and the main method is defined in the Question_2 object. Here's a brief overview of these classes and methods:

**Class Player**
The Player class defines the structure of the player object with the following attributes:

- Year - The year in which the player played
- Name - The name of the player
- Country - The country to which the player belongs
- Matches - The number of matches played by the player
- Runs - The number of runs scored by the player
- Wickets - The number of wickets taken by the player

**Class Question_2**
The Question_2 class defines the following methods:

- readData(): List[Player]
The readData method reads data from the file "details.txt" and creates a list of Player objects from the data. It returns the created list of Player objects.

- displayPlayerDetails(playerobjects: List[Player]): Unit
The displayPlayerDetails method takes a list of Player objects as input and displays the details of each player, including their name, country, year, runs, matches, and wickets.

- diaplayPlayerWithRank(playerobjects: List[Player]): Unit
The diaplayPlayerWithRank method takes a list of Player objects as input and displays the details of each player, including their name, rank, country, year, runs, matches, wickets, and performance. The performance metric is calculated as 5 times the number of wickets plus 0.05 times the number of runs scored.

**Object Question_2**
The Question_2 object defines the main method, which calls the readData method to read data from the file and create a list of Player objects. It then performs various operations on the list of Player objects, as follows:


- Creates an object of the Question_2 class.
- Calls the readData method to read data from the file and create a list of Player objects.
- Displays the details of the top scorer using the displayPlayerDetails method, by sorting the players using the sortBy function by using runs as the metric in reverse order and picking the top element.
- Displays the details of the top 5 scorers using the displayPlayerDetails method, by sorting the players using the sortBy function by using runs as the metric in reverse order and picking the top 5 elements.
- Displays the details of the top 5 wicket-takers using the displayPlayerDetails method, by sorting the players using the sortBy function by using the number of wickets as the metric in reverse order and picking the top 5 elements.
- Displays the details of the top 5 performers using the diaplayPlayerWithRank method, by sorting the players using the sortBy function by using the performance metric (5 times the number of wickets plus 0.05 times the number of runs scored) as the metric in
