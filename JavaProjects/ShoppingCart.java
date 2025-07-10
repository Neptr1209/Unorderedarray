

                            // Shopping Cart Program

import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /** A cleaner and a good practice to declare variable first
        * String item;
        * double price;
        * int numberOfItem;
        * double totalPrice;

        * System.out.print("What do you want to buy?: ");
        * item = scanner.nextLine();

        * ...
        */

        // My work:
        System.out.print("What item would you like to buy?: ");
        String item=scanner.nextLine();

        System.out.print("What is the price for each?: ");
        double price= scanner.nextDouble();

        System.out.print("How many would you like?: ");
        int numberOfItem= scanner.nextInt();
        scanner.nextLine();

        double totalPrice = price * numberOfItem;

        System.out.println("\n"+numberOfItem +" " +item +" coming right up!");
        System.out.println("That will be "+ totalPrice+ "$");

        scanner.close();
    }
}
