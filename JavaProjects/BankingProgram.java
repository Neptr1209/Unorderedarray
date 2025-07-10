/*
 * This is a simple banking program with basic exception errors had been implemented.
 * 
 * Once you enter each option, press Q to return to the main menu
 */



import java.util.Scanner;
public class BankingProgram {
    static double balanceArr = 0;

    public static void main(String[] args) {
        // Menu
        Scanner scanner = new Scanner(System.in);

        // Looping until Exit
        boolean exit = false;
        while (!exit) {
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
    static void showBalance(Scanner scanner) {
        if (balanceArr == 0) {
            System.out.println("Your Balance: $" + balanceArr);
        } else {
            System.out.println("Your Balance: $" + balanceArr);
        }

        // Returning Back to the Menu
        System.out.println("[Enter to Return Back to The Menu]");
        scanner.nextLine();
    }

    // Deposit Method
    static void deposit(Scanner scanner) {

        // Note: If you type "2e3", it will deposit 2,000. "e3" here means a thousand, "e4" is 10,000, and so on. 
        // This is not a bug for me, but modify as you wish.
        // First make it string
        while (true) {
            System.out.print("[Press Q To Return to the Menu]\n" +
                    "Enter Your Deposit Amount ($): ");

            // Return back to the Menu
            String stringInputDeposit = scanner.nextLine();
            if (stringInputDeposit.equals("Q")) {
                return;
            }

            // Check if empty. If not, continue
            else if (stringInputDeposit.isEmpty()) {
                continue;
            }

            // Second convert back to double and input validation
            try {
                double depositAmount = Double.parseDouble(stringInputDeposit);
                if (depositAmount > 0) {
                    balanceArr += depositAmount;
                    System.out.println("Deposition Success!");

                    // Returning Back to the Menu
                    System.out.println("[Enter to Return Back to The Menu]");
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Invalid Input! Enter Numbers/Positive Numbers Only.");
                    scanner.next(); // This is used to clear the invalid input so that it can print Invalid Input...
                                   // If not, it will create infinite loop
                }
            }

            // Invalid numbers (non-numberic input)
            catch (NumberFormatException e) {
                System.out.println("Invalid input! Numbers only (e.g., 100 or 50.25).");
            }
        }
    }

    // Withdraw Method
    static void withDraw(Scanner scanner) {

        // Note: If you type "2e3", it will deposit 2,000. "e3" here means a thousand, "e4" is 10,000, and so on. 
        // This is not a bug for me, but modify as you wish.
        // First, make it string
        while (true) {
            System.out.print("[Press Q To Return to the Menu]\n" +
                    "Enter Your Withdraw Amount ($): ");
            String stringWithdrawAmount = scanner.nextLine();

            if (stringWithdrawAmount.equals("Q")) {
                return;
            } else if (stringWithdrawAmount.isEmpty()) {
                continue;
            }

            // Check if it has enough balance
            try {
                double withdrawAmount = Double.parseDouble(stringWithdrawAmount);
                if(withdrawAmount>0){
                    if (balanceArr == 0) {
                        System.out.println("Failed To Withdraw");
                        System.out.println("Your Balance: $" + balanceArr);
                    } else if (withdrawAmount > balanceArr) {
                        System.out.println("Failed To Withdraw");
                        System.out.println("Your Balance: $" + balanceArr);
                    } else {
                        balanceArr -= withdrawAmount;
                        System.out.println("Withdrawal Success!");
                        System.out.println();

                        // Returning Back to the Menu
                        System.out.println("[Enter to Return Back to The Menu]");
                        scanner.nextLine();
                        break;
                    }
                } else {
                    System.out.println("Invalid Input. Positive Number Only");
                }
            }

            // Invalid numbers (non-numberic input)
            catch (NumberFormatException e) {
                System.out.println("Invalid input! Numbers only (e.g., 100 or 50.25).");
            }
        }
    }
}