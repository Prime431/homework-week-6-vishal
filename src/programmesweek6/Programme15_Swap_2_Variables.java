package programmesweek6;
//  Java program to swap two variables.

import java.util.Scanner;

public class Programme15_Swap_2_Variables {
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // using scanner
        System.out.println("Please enter the value of x ");
        int X = scanner.nextInt(); // declaring x value
        System.out.println("Please enter the value of Y ");
        int Y = scanner.nextInt(); //declaring y value
        System.out.println("Value of X is " + Y); //printing Y value
        System.out.println("Value of Y is " + X); // Printing X value
        scanner.close(); // closing scanner
    }
}
