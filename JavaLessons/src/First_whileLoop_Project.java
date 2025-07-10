import java.util.Scanner;
public class First_whileLoop_Project{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Welcome to the Pet Store, gentlemen. Allow me to ask you some questions.");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Are you the dog owner?(true or false): ");
            boolean dogOwner = scanner.nextBoolean();
            if (dogOwner){
                System.out.println("WOOF for 20%");
            } else{
                System.out.print("Are you the cat owner? (true or false): ");
                boolean catOwner = scanner.nextBoolean();
                if (catOwner){
                    System.out.println("MEOW for 20%");
                } else {
                    System.out.println("Bye");
                }
            }
            // To break the while loop
            System.out.print("Continue asking? (true or false): ");
            boolean continueProgram = scanner.nextBoolean();
            if (!continueProgram){
                System.out.println("Goodbye");
                break;
            }
        }
        // scanner.close();  // Uncomment this is optional. If the program is large or heavy, dont delete. However, if the program is small like this code here, delete it or not, it's fine.
    }
}