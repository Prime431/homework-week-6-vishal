package programmesweek6;

/*
 * Declare 2 instant and 2 static variable
 * Declare 1 isntance method
 * Declare one static method
 * call all four instance and static variables into both instance and static methods inside the print statement
 * Declare the Main Method
 * call both instance and static methods into the Main method and run the programme
 */
public class Programme04_Various_Method {
    int a = 10; // instant variabl
    int b = 20; // instant variable
    static int c = 30; // static variable
    static int d = 40; // static variable

    public void instance() { // Instance method
        System.out.println("Instance Method value of a = " + a);
        System.out.println("Instance Method value of b = " + b);
        System.out.println("Instance Method value of c = " + c);
        System.out.println("Instance Method value of d = " + d);
    }

    public static void stati() { // Static Method
        Programme04_Various_Method obj = new Programme04_Various_Method();
        System.out.println("Static Method value of a = " + obj.a);
        System.out.println("Static Method value of b = " + obj.b);
        System.out.println("Static Method value of c = " + c);
        System.out.println("Static Method value of d = " + d);
    }

    public static void main(String[] args) { //Main method
        Programme04_Various_Method calling = new Programme04_Various_Method();
        calling.instance();
        stati();
    }
}
