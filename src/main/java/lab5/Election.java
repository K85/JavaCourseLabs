package lab5;

// *************************************************************** 
//   Election.java 
// 
//   This file contains a program that tallies the results of 
//   an election.  It reads in the number of votes for each of 
//   two candidates in each of several precincts.  It determines 
//   the total number of votes received by each candidate, the 
//   percent of votes received by each candidate, the number of  
//   precincts each candidate carries, and the  
//   maximum winning margin in a precinct. 
// ************************************************************** 

import java.util.Scanner;

public class Election {
  public static void main(String[] args) {
    int votesForPolly; // number of votes for Polly in each precinct
    int votesForErnest; // number of votes for Ernest in each precinct
    int totalPolly = 0; // running total of votes for Polly
    int totalErnest = 0; // running total of votes for Ernest
    String response; // answer (y or n) to the "more precincts" question

    Scanner scan = new Scanner(System.in);

    System.out.println();
    System.out.println("Election Day Vote Counting Program");
    System.out.println();

    // Initializations
    int winsOfPolly = 0;
    int winsOfErnest = 0;
    int tieOfBoth = 0;

    // Loop to "process" the votes in each precinct
    do {
      System.out.println("votes for Polly: ");
      votesForPolly = scan.nextInt();
      totalPolly += votesForPolly;
      System.out.println("votes for Ernest: ");
      votesForErnest = scan.nextInt();
      totalErnest += votesForErnest;

      if (votesForPolly == votesForErnest)
        tieOfBoth++;
      else if (votesForPolly > votesForErnest)
        winsOfPolly++;
      else
        winsOfErnest++;

      System.out.println("has more areas? y/n");
      response = scan.next();
    } while (response.equalsIgnoreCase("Y"));

    // Print out the results
    System.out.println(String.format("totalPolly = %d, totalErnest = %d\n", totalPolly, totalErnest));
    System.out.println(String.format("rate of Polly = %.2f, rate of Ernest = %.2f",
        (double) totalPolly / (totalPolly + totalErnest), (double) totalErnest / (totalPolly + totalErnest)));
    System.out.println(
        String.format("winsOfPolly = %d, winsOfErnest = %d, tieOfBoth = %d", winsOfPolly, winsOfErnest, tieOfBoth));

  }
}
