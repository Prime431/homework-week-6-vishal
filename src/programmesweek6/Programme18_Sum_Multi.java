package programmesweek6;
/*
Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */
public class Programme18_Sum_Multi {
    public static void main(String[] args) { //Main method
        int firstnumber = 125; // declaring first number
        int secondnumber = 24; // declaring second number
        System.out.println("Sum is: " + (firstnumber + secondnumber)); // Sum equation
        System.out.println("multiply is " + (firstnumber * secondnumber)); // Multiply equation
        System.out.println("substract is " + (firstnumber - secondnumber)); // Subtraction equation
        System.out.println("Devide is " + firstnumber / secondnumber); // Device equation
        System.out.println("Remainder is " + firstnumber % secondnumber); // Remainder equation

    }
}
