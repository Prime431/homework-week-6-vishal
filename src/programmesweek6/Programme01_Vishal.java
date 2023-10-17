package programmesweek6;

/*
 * Vishal patel
 * Programme 1
 * Declare 2 instance variable
 * declare one instance method
 * call both instance variables into the instance method inside the print statement
 */
public class Programme01_Vishal {

    int x = 10; // declare instance variables
    int y = 20; // declare instance variables

    public static void main(String[] args) {
        Programme01_Vishal t = new Programme01_Vishal();
        t.p1();
    }
    public void p1() {     // Instance method
        System.out.println(x);
        System.out.println(y);
    }
}
