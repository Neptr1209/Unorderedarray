import java.util.Scanner;
public class LatteCafeOrdering {
    public static void main(String[] args ){
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
        System.out.println("Here's your order. Come back next time!");
        scanner.close();
    }
}