package programmesweek6;

import java.util.Scanner;

/*Write a program to calculate the area of a triangle.
 */
public class Programme08_Triangle {
    public static void main(String[] args) { // main method
        Scanner scanner = new Scanner(System.in); // scanner
        System.out.println("Please enter Base  = ");
        int b = scanner.nextInt(); // declaring base
        System.out.println("Please enter height = ");
        int h = scanner.nextInt(); // declaring height
        triangle(b, h); // calling triangle method
        scanner.close();
    }

    public static void triangle(int b, int h) { //static method
        double triangle = (0.5 * b * h); // triangle formula
        System.out.println("Area of tirangle = " +triangle); // triangle output
    }

}

