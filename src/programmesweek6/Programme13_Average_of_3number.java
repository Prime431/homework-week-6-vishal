package programmesweek6;

import java.util.Scanner;

/*
Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */
public class Programme13_Average_of_3number {
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // using scanner
        System.out.println("Please enter the value of a ");
        int a = scanner.nextInt();
        System.out.println("Please enter the value of b ");
        int b = scanner.nextInt();
        System.out.println("Please enter the value of c ");
        int c = scanner.nextInt();

        //int a = 100;
        //int b = 200;
        //int c = 300;
        int plusaverage = (a + b + c) / 3; // Addition formula
        int multiaverage = (a * b * c) / 3; // Multiplication formula
        System.out.println("plus average is  " + plusaverage); // plsuaverage output
        System.out.println("Multiplication average is " + multiaverage); // multiplication output
        scanner.close(); // scamnner closing
    }
}
