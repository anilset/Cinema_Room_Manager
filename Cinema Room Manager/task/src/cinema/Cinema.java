package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Write your code here
        System.out.print("Cinema:");
       int seats[][] = new int[8][9];
        for (int i = 0; i < seats.length; i++) {
            if (i == 0) {
                System.out.print("\n" + "  ");
            } else {
                System.out.print("\n" + i + " ");
            }
            for (int j = 1; j < seats[i].length; j++) {
                if (i == 0) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("S ");
                }
            }
        }
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = scanner.nextInt();
        int discount = 20;
        if (rows * seatsPerRow <= 60) {
            int smallCount = rows * seatsPerRow * 10;
            System.out.println("Total income:");
            System.out.println("$" + smallCount);
        } else if (rows * seatsPerRow > 60) {
            if (rows % 2 == 0) {
                int bigEvenCount = rows/2 * seatsPerRow * 10 + (rows/2 * seatsPerRow * 8);
                System.out.println("Total income:");
                System.out.println("$" + bigEvenCount);
            } else {
                int bigOddCount = rows/2 * seatsPerRow * 10 + ((rows/2 + rows%2)* seatsPerRow * 8);
                System.out.println("Total income:");
                System.out.println("$" + bigOddCount);
            }
        }
    }
}
