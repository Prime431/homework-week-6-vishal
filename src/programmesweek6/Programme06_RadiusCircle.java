package programmesweek6;
/*
Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Programme06_RadiusCircle {

    // main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radios");
        double r = scanner.nextDouble();
        circle(r); // calling static method
        scanner.close(); //closing scanner
    }

    //static method
    public static void circle(double r) {
        double area = (22 * r * r) / 7; // applying Radios formula
        System.out.println("Area of circle = " + area);

    }

}






