package programmesweek6;

/*
Java program to convert a decimal number to binary number.
Input Data:
 Input a Decimal Number : 5
Expected Output
Binary number is: 101
 */
public class Programme17_Decimal_to_Binary {
    public static void main(String[] args) { //main method
        int decimal = 5; // selecting decimal value
        String binaryNumber = Integer.toBinaryString(decimal); // decimal to binary code
        System.out.println("Decimal Number is: " + decimal);
        System.out.println("Binary Number is:  " + binaryNumber);
    }
}
