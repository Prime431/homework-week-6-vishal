package programmesweek6;

import java.util.Scanner;

/*
Write a program to convert the upper case to lower case.
 */
public class Programme09_Lowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Write the sentence in Capital ");
        String sentence = scanner.nextLine();
        System.out.println("Capital sentence is "  + sentence.toLowerCase());
        // Converter(sentence);
        scanner.close();
    }

}
