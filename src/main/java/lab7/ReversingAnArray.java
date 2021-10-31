package lab7;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingAnArray {

    public static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Enter the length of the array: ");
        int a = scanner.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
        }
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
        System.out.println();

        System.out.println("After Reverse the original array: ");
        for (int i = 0; i < a / 2; i++)  {
            array[i] ^= array[a - i - 1];
            array[a - i - 1] ^= array[i];
            array[i] ^= array[a - i - 1];
        }
        for(var e : array) System.out.print(e + " ");
    }

}
