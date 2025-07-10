
import java.util.Scanner;
import java.util.Random;

public class WhileLoop9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Enter your username: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello, " + name);
        System.out.println("--------------------");

        //scanner.close(); // When working with multiple methods with scanners, you need to remove the scanner.close();

        // Play game
        game();

        // PracticeWhileDoLoop
        PracticeWhileDoLoop();

        // Practice
        Practice();

        scanner.close();
    }


    public static void game() {
        Scanner scanner = new Scanner(System.in);
        String response = "";

        while (!response.equals("Q")) {
            System.out.println("You are playing a game");
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }
        System.out.println("You have quit the game");
        System.out.println("--------------------");

        //scanner.close();
    }

    public static void PracticeWhileDoLoop() {
        Scanner scanner = new Scanner(System.in);

        int age = 0;

        do { // We do these codes below first, then check if in the while loop if it's true. If not, it will loop around
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        } while (age < 0);

        System.out.println("Your age is: " + age);
        System.out.println("--------------------");
    }

    public static void Practice() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guessing;
        int attempts = 0;
        int RandomNum = random.nextInt(1, 6);
        System.out.println(RandomNum);

        do{
            System.out.print("Guess the number between 1-5: ");
            guessing = scanner.nextInt();
            attempts++;
            if(attempts==3){
                System.out.println("Better luck next time pal");
                break;
            }

            if(guessing==RandomNum){
                System.out.println("You got it right! It was "+RandomNum);
            }
        }while(guessing!=RandomNum);


        // scanner.close(); // Finally ends the scanner
    }
}

