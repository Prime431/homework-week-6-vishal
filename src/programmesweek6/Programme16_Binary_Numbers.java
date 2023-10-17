package programmesweek6;

import java.util.Scanner;

/*Write a Java program to add two binary numbers.
input first binary number: 10
input second binary number :11
Expected output:
Sum of two binary number should be 101
 */
public class Programme16_Binary_Numbers {
    public static void main(String[] args) { // declaring main method

        Scanner scanner = new Scanner(System.in); // applying scanner method
        System.out.print("Input first binary number");
        String binary1 = scanner.next();
        System.out.print("Input second binary number");
        String binary2 = scanner.next();

        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int sum = num1 + num2;
        String binarySum = Integer.toBinaryString(sum); //integer to binary formula
        System.out.println("Sum of two binary numbers: " + binarySum);
        scanner.close(); // closing scanner

    }
}
