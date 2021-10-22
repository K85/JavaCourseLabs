package lab5;

// **************************************************************** 
//   Guess.java 
// 
//   Play a game where the user guesses a number from 1 to 10 
//           
// **************************************************************** 
import java.util.Scanner;
import java.util.Random;

public class Guess2 {
  public static void main(String[] args) {
    int numToGuess; // Number the user tries to guess
    int guess; // The user's guess

    Scanner scan = new Scanner(System.in);
    Random generator = new Random();

    // randomly generate the number to guess
    numToGuess = generator.nextInt(10) + 1;
    // print message asking user to enter a guess
    System.out.println("please guess a number: ");

    int times = 0;
    int bigTimes = 0;
    int smallTimes = 0;
    do {
      // get another guess from the user
      guess = scan.nextInt();
      times++;

      // guess right ?
      if (guess == numToGuess)
        break;
      else if (guess > numToGuess) {
        bigTimes++;
        System.out.println("too big, try again!");
      } else {
        smallTimes++;
        System.out.println("too small, try again!");
      }
    } while (true); // keep going as long as the guess is wrong

    // print message saying guess is right
    System.out.println(String.format(
        "your guess is right! you tried %d times, %d times too big, %d times too small, and the num is %d", times,
        bigTimes, smallTimes, numToGuess));
  }
}
