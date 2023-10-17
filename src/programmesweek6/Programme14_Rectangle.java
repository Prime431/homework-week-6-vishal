package programmesweek6;

/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Programme14_Rectangle {
    public static void main(String[] args) { // main method
        double width = 5.6; // declaring width
        double height = 8.5; // declaring height
        double area = width * height;
        double perimeter = 2 * (width + height); // perimeter formula
        System.out.println("area is = " + area); // ara output
        System.out.println("Perimeter is = " + perimeter); // perimeter output
    }
}
