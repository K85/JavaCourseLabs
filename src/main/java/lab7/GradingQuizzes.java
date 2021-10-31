package lab7;


import java.util.Scanner;

public class GradingQuizzes {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Enter the amount of quiz: ");
        int quizAmount = scanner.nextInt();

        System.out.println("Enter the answer for each quiz: ");

        int[] quizAnswers = new int[quizAmount];
        for (int i = 0; i < quizAmount; i++) {
            quizAnswers[i] = scanner.nextInt();
        }

        int trueAnswers = 0;
        int wrongAnswers = 0;
        for (int k = 0; k < quizAmount; k++) {
            System.out.println("Now, enter your answer for each quiz: ");

            if (scanner.nextInt() == quizAnswers[k]) {
                System.out.printf("Your answer is true !");
                trueAnswers++;
            } else {
                System.out.printf("Your answer is false, true answer is %d!", quizAnswers[k]);
                wrongAnswers++;
            }

            System.out.println("Grade another quiz? (y/n)");
            if (scanner.next().toUpperCase().equals("N")) break;
        }

        System.out.printf("Quiz end: total quizs = %d, true answers = %d, your ac ratio = %.2f%n",
                quizAmount, trueAnswers, (double) trueAnswers / quizAmount);
    }
}
