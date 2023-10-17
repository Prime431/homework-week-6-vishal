package programmesweek6;

import java.util.Scanner;

public class Programme10_Mulitplication_Table {

    public static void main(String[] args) {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number = ");
        int number = scanner.nextInt();
        System.out.println("         MULTIPLICATION TABLE   ");

        System.out.println("Multiplication table of number " + number + " * 1 is  = " + number * 1);
        System.out.println("Multiplication table of number " + number + " * 2 is  = " + number * 2);
        System.out.println("Multiplication table of number " + number + " * 3 is  = " + number * 3);
        System.out.println("Multiplication table of number " + number + " * 4 is  = " + number * 4);
        System.out.println("Multiplication table of number " + number + " * 5 is  = " + number * 5);
        System.out.println("Multiplication table of number " + number + " * 6 is  = " + number * 6);
        System.out.println("Multiplication table of number " + number + " * 7 is  = " + number * 7);
        System.out.println("Multiplication table of number " + number + " * 8 is  = " + number * 8);
        System.out.println("Multiplication table of number " + number + " * 9 is  = " + number * 9);
        System.out.println("Multiplication table of number " + number + " * 10 is  = " + number * 10);

        scanner.close();
    }
}
