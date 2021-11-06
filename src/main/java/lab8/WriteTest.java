package lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class WriteTest {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // input
        int questionAmount = Integer.parseInt(scanner.nextLine());
        ArrayList<TestQuestion> testQuestions = new ArrayList<>();

        for (int i = 0; i < questionAmount; i++) {
            String questionType = scanner.nextLine();
            TestQuestion testQuestion = null;
            if (questionType.equals("e")) testQuestion = new Essay();
            if (questionType.equals("m")) testQuestion = new MultiChoice();

            testQuestion.readQuestion();
            testQuestions.add(testQuestion);
        }

        // output
        for (int i = 0; i < testQuestions.size(); i++) {
            System.out.println((i + 1) + ". " + testQuestions.get(i));
        }

    }
}
