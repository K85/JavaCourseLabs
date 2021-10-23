package lab6;

//******************************************************************** 
//  MiniQuiz.java       Author: Lewis/Loftus 
// 
//  Demonstrates the use of a class that implements an interface. 
//******************************************************************** 

import java.util.Scanner;

public class MiniQuiz {

  private static final Scanner scan = new Scanner(System.in);

  private static void askQuestion(Question q) {
    
    System.out.print(q.getQuestion());
    System.out.println(" (Level: " + q.getComplexity() + ")");

    String possible;
    possible = scan.nextLine();
    if (q.answerCorrect(possible))
      System.out.println("Correct");
    else
      System.out.println("No, the answer is " + q.getAnswer());
  }

  // -----------------------------------------------------------------
  // Presents a short quiz.
  // -----------------------------------------------------------------
  public static void main(String[] args) {
    Question q1, q2;

    q1 = new Question("What is the capital of Jamaica?", "Kingston");
    q1.setComplexity(4);
    MiniQuiz.askQuestion(q1);

    q2 = new Question("Which is worse, ignorance or apathy?", "I don't know and I don't care");
    q2.setComplexity(10);
    MiniQuiz.askQuestion(q2);

  }
}
