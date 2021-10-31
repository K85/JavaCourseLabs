package lab7;// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople.  Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************

import java.util.Scanner;

public class Sales {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int salesPerson;
        System.out.println("Enter the amount of salesperson");
        salesPerson = scan.nextInt();

        int[] sales = new int[salesPerson];
        int sum;
        int maxIndex = 0;
        int maxSale = Integer.MIN_VALUE;
        int minIndex = 0;
        int minSale = Integer.MAX_VALUE;


        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxIndex = i;
            }
            if (sales[i] < maxSale) {
                minSale = sales[i];
                minIndex = i;
            }
        }

        System.out.println("\nSalesperson   Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i = 0; i < sales.length; i++) {
            System.out.println("     " + (i + 1) + "         " + sales[i]);
            sum += sales[i];
        }

        double average = (double) sum / salesPerson;
        System.out.println("\nTotal sales: " + sum);
        System.out.printf("Average sales: %.2f%n", average);
        System.out.printf("Salesperson %d had the highest sale with $%d%n", maxIndex + 1, sales[maxIndex]);
        System.out.printf("Salesperson %d had the lowest sale with $%d%n", minIndex + 1, sales[minIndex]);

        System.out.println("Enter sales to find all salesperson whose sales is higher than it.");
        int boundSales = scan.nextInt();
        int boundPersons = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= boundSales) continue;
            System.out.println("     " + (i + 1) + "         " + sales[i]);
            sum += sales[i];
            boundPersons++;
        }
        System.out.printf("There are %d persons match.%n", boundPersons);

    }
}