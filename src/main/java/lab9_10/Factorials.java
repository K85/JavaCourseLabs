package lab9_10;

import java.util.Scanner;

public class Factorials {

    public static final Scanner scanner = new Scanner(System.in);

    public static class MathUtils {

        public static int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    }


    public static int safeFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if (n > 16) {
            throw new IllegalArgumentException("n must be less than 16");
        }

        return MathUtils.factorial(n);
    }

    public static void main(String[] args) {

        int n = scanner.nextInt();
        try {
            System.out.println(safeFactorial(n));
        } catch (Exception e) {
            System.out.println("An error occurs!");
            e.printStackTrace();
        }
    }

}
