
import java.util.Scanner;
public class Playground1 {
    static double balanceArr = 0;

    public static void main(String[] args){
        // Menu
        Scanner scanner = new Scanner(System.in);

        // Looping until Exit
        boolean exit = false;
        while(!exit) {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.print(
                    "1 - Show Balance \n" +
                            "2 - Deposit \n" +
                            "3 - Withdraw \n" +
                            "4 - Exit \n" +
                            ">>> ");
            String options = scanner.nextLine();
            switch (options) {
                case "1" -> showBalance(scanner);
                case "2" -> deposit(scanner);
                case "3" -> withDraw(scanner);
                case "4" -> exit = true;
                default -> {
                    System.out.println("Invalid option");
                    scanner.nextLine(); // Extra Enter to continue. For Terminal Readability
                }
            }
        }
        scanner.close();
    }

    // Show Balance Method
    static void showBalance(Scanner scanner){
        if(balanceArr==0) {
            System.out.println("You have: $"+ balanceArr);
        }
        else {
            System.out.println("Your Current Balance is: $" + balanceArr);
        }

        // Returning Back to the Menu
        System.out.println("********************************");
        System.out.println("Enter to Return Back to The Menu");
        System.out.println("********************************");
        scanner.nextLine();
    }

    // Deposit Method
    static void deposit(Scanner scanner){
        // First make it string
        while(true){
            System.out.print("[Press Q To Return to the Menu]\n" +
                    "Enter Your Deposit Amount ($): ");

            // Return back to the Menu
            String stringInputDeposit = scanner.nextLine();
            if(stringInputDeposit.equals("Q")){
                return;
            }

            // Check if empty. If not, continue
            else if(stringInputDeposit.isEmpty()){
                continue;
            }

            // Second convert back to double and input validation
            try{
                double depositAmount = Double.parseDouble(stringInputDeposit);
                if(depositAmount>0){
                    balanceArr += depositAmount;
                    System.out.println("Deposition Success!");
                    break;
                } else {
                    System.out.println("Invalid Input! Enter Numbers/Positive Numbers Only.");
                    scanner.next(); // This is used to clear the invalid input so that it can print Invalid Input...
                    // If not, it will create infinite loop
                }
            }



            // Invalid numbers (non-numberic input)
            catch (NumberFormatException e){
                System.out.println("Invalid input! Numbers only (e.g., 100 or 50.25).");
            }
        }

        // Returning Back to the Menu
        System.out.println("********************************");
        System.out.println("Enter to Return Back to The Menu");
        System.out.println("********************************");
        scanner.nextLine();
    }

    // Withdraw Method
    static void withDraw(Scanner scanner) {



        if (balanceArr == 0) {
            System.out.println("Failed To Withdraw");
            System.out.println("You have $" + balanceArr);
        } else {
            System.out.print("Enter Your Withdraw Amount ($): ");
            double withdrawAmount = scanner.nextDouble();

            if(withdrawAmount>balanceArr){
                System.out.println("Failed To Withdraw");
                System.out.println("You have $" + balanceArr);
            }
            else {
                balanceArr -= withdrawAmount;
                System.out.println("Withdrawal Success!");
            }
            scanner.nextLine();

        }
        // Returning Back to the Menu
        System.out.println("********************************");
        System.out.println("Enter to Return Back to The Menu");
        System.out.println("********************************");
        scanner.nextLine();
    }
}
