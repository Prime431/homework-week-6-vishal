package programmesweek6;
/*
Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C)
 */

import java.util.Scanner;

public class Programme07_Fahrenheit {

    public static void temperature(float fahrenheit) { //Static method
        float temperature = ((fahrenheit - 32) * 5 / 9); //Applying formula
        System.out.println("Celsius is =  " + temperature); // output
    }

    public static void main(String[] args) { //main method
        Scanner scanner = new Scanner(System.in); //Using Scanner
        System.out.println("Please enter Fahrenheit  = ");
        float fahrenheit = scanner.nextFloat();
        temperature(fahrenheit); // calling static method
        scanner.close(); // close scanner
    }
}

