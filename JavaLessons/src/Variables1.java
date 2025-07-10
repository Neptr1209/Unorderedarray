/**
 * This is about the Variables and Variable scope
 *
 * There are two types of variables:
 *
 * 1. Primitive: simple value stores directly in the memory (stack), such as int, boolean, double, char
 * 2. Reference: memory address (stack) that points to the (heap), such as string, array, object
 *
 *
 * There are two types of Variable Scope:
 *      Local - declares in a method. Not global, cannot be called by other methods unless it becomes an argument
 *      Class - declares in the class, just below the class name. This is like the global variable in Python
 *              Best to use in OOP, but stick to Local is safer
 */


public class Variables1 {
    static String name = "Hello, this is the class variable";  // Class Variable
    public static void main(String[] args) {
        // General Variable Knowledge
        variable();

        // Variable scope
        variable();
    }

    static void variable() {
        int number = 12;

        double Decimal_number = 12.1;

        char One_character_only = 'A';
        char symbols = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean isNotStudent = false;

        String name = "Bro code";
        String email = "fake1234@gmail.com"; //String treats 1234 more of a character rather than numbers


        System.out.println("Hello world");
        System.out.println(number);
        System.out.println(Decimal_number);
        System.out.println(One_character_only);
        System.out.println(symbols);
        System.out.println(currency);
        System.out.println(isStudent);
        System.out.println(isNotStudent);
        System.out.println("His name is: " + name);
        System.out.println("His email is: " + email);
        System.out.println("This is a global variable!"+name);
        System.out.println("==============");

    }

    static void variableScope(){
        int x =1; // Local Variable
        System.out.println("This is a local variable!"+x);
        System.out.println("This is a global variable!"+name);

    }
}








