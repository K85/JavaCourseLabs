package lab7;//********************************************************
//  Parameters.java
//
//  Illustrates the concept of a variable parameter list.
//********************************************************

import java.util.Arrays;
import java.util.Scanner;

public class Parameters {
    public static final Scanner scanner = new Scanner(System.in);

    //-----------------------------------------------
    //  Calls the average and minimum methods with
    //  different numbers of parameters.
    //-----------------------------------------------
    public static void main(String[] args) {
        double mean1, mean2;

        mean1 = average(42, 69, 37);
        mean2 = average(35, 43, 93, 23, 40, 21, 75);

        System.out.println("mean1 = " + mean1);
        System.out.println("mean2 = " + mean2);

        System.out.println(average(13));
        System.out.println(average());

        System.out.println("Please enter at most 20 not negative number: ");
        int[] array = new int[20];
        int size = 0;
        for (int i = 0; i < 20; i++) {
            int number = scanner.nextInt();
            if (number < 0) break;
            array[size++] = number;
        }
        array = Arrays.copyOf(array, size);
        System.out.println(average(array));

        System.out.println("Test for min(list ...)");
        System.out.println(min(100, 200, 300, 400, 500));
    }

    //----------------------------------------------
    //  Returns the average of its parameters.
    //----------------------------------------------
    public static double average(int... list) {
        double result = 0.0;

        if (list.length != 0) {
            int sum = 0;
            for (int num : list)
                sum += num;
            result = (double) sum / list.length;
        }
        return result;
    }

    public static double min(int... list) {
        double result = Integer.MAX_VALUE;
        if (list.length != 0) {
            for (int num : list)
                result = Math.min(result, num);
        }
        return result;
    }


}