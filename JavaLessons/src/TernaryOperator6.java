/**
 * ternary opertor (?) return 1 of 2 values if a condition is true
 * Structure:
 * variable = (condition) ? if True : if False;
 *          "?" is like asking if the condition is true or not
 *          ":" is like else. If not true, then....
 *
 * This is a simpler version of if-else statements
 */




public class TernaryOperator6 {
    public static void main(String[] args){
        int score=70;

        // If-else statement version:
        if(score>60){
            System.out.println("Win");
        } else{
            System.out.println("Lose");
        }

        // Ternary Operator version:
        String passOrFail = (score>60)? "Win" : "Lose"; // If score>60 is true, then print Win, else Lose
        System.out.println(passOrFail);

        // Example:
        int num = 3;
        String evenOrOdd = (num %2 ==0)?"Even":"Odd";
        System.out.println("The number "+num+" is: "+evenOrOdd);

        // Practice:
        temperature();
    }
    public static void temperature(){

    }
}
