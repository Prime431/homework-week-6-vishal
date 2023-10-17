package programmesweek6;
/*
Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
 */

import java.util.Scanner;

public class Programme05_Calculator {


    // Applying main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Applying Scanner
        System.out.println("Please enter first  ");
        int a = scanner.nextInt();
        System.out.println("Enter second");
        int b = scanner.nextInt();
        Programme05_Calculator obj = new Programme05_Calculator(); // declaring adjective

        Addition(a, b); // Calling addition method
        Subtraction(a, b); // Calling subtraction method
        obj.Division(a, b); // Calling Division method
        obj.Multiplication(a, b); // Calling Multiplication method
        scanner.close(); // Closing scanner
    }

    public static void Addition(int a, int b) {  // Static method

        System.out.println("Addition of a + b     " + (a + b));
    }

    public static void Subtraction(int a, int b) { // Static method
        System.out.println("Subtraction of a - b     " + (a - b));
    }

    public void Multiplication(int a, int b) {  // Instance method
        System.out.println("Multiplication of a * b    " + (a * b));
    }

    public void Division(int a, int b) { // Instance method
        System.out.println("Division of a / b      " + (a / b));
    }
}