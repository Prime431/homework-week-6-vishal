package programmesweek6;

/*
 * Vishal Patel Programme 2
 * declaring two static variables
 * declaring one static method
 * calling both static variables into the static method inside the print statement
 * Declaring the main method
 * calling the static method into the main and Run programme
 */
public class Programme02_Variable {
    static int a = 10; // static variable
    static String name = "vishal"; // static variable

    public static void t2() {  // static method
        System.out.println(a);
        System.out.println(name);
    }

    public static void main(String[] args) { // main method
        t2();
    }

}
