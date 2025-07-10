/**
 * To create a user input, we need to use Scanner
 * First, we need to import the Scanner
 * .util is a package
 * .Scanner is the class that we want to use
 */

import java.util.Arrays;
import java.util.Scanner;
public class User_inputs2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Use this below if you want the input to be below the "Enter your name"
        System.out.print("Enter your Testing Name: ");
        String testingName = scanner.nextLine(); // If use scanner.next(), it doesn't read any spaces. Input: Bro Code, Output: Bro
        System.out.println("Hello, "+ testingName);
        // Use this if you want the input to be in the same line the "Enter your name"
        System.out.print("Enter your name2: ");
        String name = scanner.nextLine();
        System.out.println("Hello, "+ name);


        // To read an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); //Integer only
        System.out.println("You are " + age+" years old");

        // To read a double
        System.out.print("Enter your GPA: ");
        double gpa = scanner.nextDouble(); //Double + Integer
        System.out.println("You are have "+ gpa);

        // To read a boolean
        System.out.print("Are you a student? (true or false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("Student Status: "+ isStudent);

        // To read a boolean (If statement)
        if(isStudent){
            System.out.println("You are enrolled");
        } else {
            System.out.println("You are not a student here. Get lost");
        }

        System.out.println("---------");
        /* Possible Errors
        If you use .nextLine(); after .nextInt();, you need to write
        .nextLine(); right after the .nextInt(); code

         */
       System.out.print("Enter your age: ");
       int yourAge = scanner.nextInt();
       scanner.nextLine(); // Try to delete this and re-run the program

       System.out.print("Enter your name again: ");
       String nameAgain = scanner.nextLine();

       System.out.println("Your age is: " + yourAge);
       System.out.println("Your name is: "+ nameAgain);

        // Need to close your scanner class; otherwise error
        scanner.close();

        // Using another User Inputs:
         vanillaPumpShops();

        // Using Arrays:
        UsingArrays();
    }

    public static void vanillaPumpShops(){
        Scanner scanner = new Scanner(System.in);

        final boolean ISICED; // This is to name the CONSTANT value.
        // You can just write boolean isIced, but I thought it's a good practice here. In case I need to use more than this same variable name
        final boolean ISLATTE;
        final boolean WITHMATCHA;

        int itemsOrdered =0;
        int vanillaPumps=0;


        // These blocks belows are user inputs
        System.out.print("Do you want a regular Latte? (true/false): ");
        ISLATTE = scanner.nextBoolean();
        if (ISLATTE) {
            System.out.println("espresso, milk, ice, syrup");
            itemsOrdered++;  // This is to add to int itemsOrdered. It's like an array in Python where you store values of the user inputs
        }

        System.out.print("Do you want it to be with Matcha? (true/false): ");
        WITHMATCHA = scanner.nextBoolean();
        if(WITHMATCHA) {
            System.out.println("matcha, oat milk, ice, vanilla.");
            itemsOrdered++; // This is to add to int itemsOrdered. It's like an array in Python where you store values of the user inputs
        }

        System.out.print("Do you want just an iced latte: ");
        ISICED = scanner.nextBoolean();
        if(ISICED){
            System.out.println("espresso, steamed milk.");
            itemsOrdered++; // This is to add to int itemsOrdered. It's like an array in Python where you store values of the user inputs
        } else if (!ISLATTE && !ISICED && !WITHMATCHA){
            System.out.println("Pick a god damn drink bruh!");
        }

        System.out.print("How many vanilla pumps do you want?: ");
        vanillaPumps++; // This is to add to int itemsOrdered. It's like an array in Python where you store values of the user inputs. I have to declare this before scanner.nextInt();
        vanillaPumps = scanner.nextInt();

        System.out.println("--------------------");

        // For items ordering and vanilla pumps
        if (itemsOrdered > 1){
                System.out.println("You ordered "+ itemsOrdered+ " cups. We will provide a cup holder for you...");
        }

        // Extra charge for vanilla pumps
        if (vanillaPumps >= 2){
                System.out.println("You ordered "+ vanillaPumps +" vanilla pumps! We'll charge extra $1");
        }

            // Bye bye
        System.out.println("Here's your order. Come back next time");
        scanner.close();
    }
    public static void UsingArrays(){
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;


        System.out.print("Enter 3 integers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();


        int[] sortNum = {a,b,c};
        Arrays.sort(sortNum);
        System.out.println("Here are the sorted numbers: ");

        for (int i : sortNum){ // this is the same as for i in sortNum. ":" is the same as "in" in Python
            System.out.print(i+" ");
        }
        scanner.close();
    }
}

