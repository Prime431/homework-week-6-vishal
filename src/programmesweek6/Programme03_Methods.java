package programmesweek6;

/* Vishal Patel Programme 3
 * one intance and one static variable
 * one instance method
 * one static method
 * call both variables in noth method in print statement
 * declare the Main method
 * Call both instance and static methods into the main method run the programme
 */
public class Programme03_Methods {
    int a = 10; //instance variable
    static String name = "vishal"; // static variable

    public void d1() { // instance method
        System.out.println("Inastant Method output = " + a);
        System.out.println("Inastant Method output = " + name);
    }

    public static void e1() { //static method
        Programme03_Methods obj = new Programme03_Methods();
        System.out.println("Static Method output = " + obj.a);
        System.out.println("Static Method output = " + name);
    }

    public static void main(String[] args) {  // main method
        Programme03_Methods nonstatic = new Programme03_Methods(); //create nonstatic object
        nonstatic.d1(); // calling instance method
        e1(); // calling static method
    }
}
