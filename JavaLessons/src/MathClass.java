/**
 * You can access the Math class using Math.
 *
 *
 */


import java.util.Scanner;
public class MathClass {
    public static void main(String[] args){

        double absoluteNumber;
        double powerOf;
        double regularRoundNum;
        double roundNumUp;
        double roundNumDown;
        double squareRoot;
        double maxNum;
        double minNum;

        powerOf = Math.pow(2,3); // 2 to the power of 3
        absoluteNumber = Math.abs(-5);
        regularRoundNum = Math.round(3.14); //Regular rounding
        roundNumUp = Math.ceil(3.14); //Round up to the next integer
        roundNumDown = Math.floor(3.14); // Round down
        squareRoot = Math.sqrt(9); // Square root of a number
        maxNum = Math.max(20,30); // What's the biggest number between these two nums
        minNum = Math.min(20,30); // what's the smallest number between these two



        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println("Power of...: "+powerOf);
        System.out.println("Absolute number is: "+absoluteNumber);
        System.out.println("Regular/Standard Rounding number: "+regularRoundNum);
        System.out.println("Rounding number up: "+roundNumUp);
        System.out.println("Rounding number down: "+roundNumDown);
        System.out.println("Square root of 3 is: "+squareRoot);
        System.out.println("Biggest number between 20 and 30 is: "+maxNum);
        System.out.println("Smallest number between 20 and 30 is: "+minNum);
        System.out.println("=========================================");

        // Practice: Find the Hypotenuse C
        practice();


    }

    public static void practice(){
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        double c;

        System.out.print("Enter value of a: ");
        a = scanner.nextInt();

        System.out.print("Enter value of b: ");
        b = scanner.nextInt();

        c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.printf("%.5f cm",c);




        scanner.close();
    }
}
