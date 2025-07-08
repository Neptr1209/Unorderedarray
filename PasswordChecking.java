
/*
This is a modification of the assignment. It still has the main funcitons such as displaying the password strength and exiting the program.
Furthermore, arrays for usernames and passwords are limited to 3 spaces ... for the project assignment purpose

There are 4 functions.
1. main(String[] arg) - the Main method or function
This acts as a menu and the main platform to call other methods.

2. userName() - This is to ask the user for the username before enter the password
Specifically designed for simplicity for asking for usernames. Easy to modify later on if needed.

3. passwordValidation() - For inputing password
This method is to check the input password according the the criteria below. If the password entered doesn't meet with the criteria, the program will re-prompt again
Password Criteria:
-At least 8 characters long
-Contains at least one uppercase letter
-Contains at least one digit
-Contains at least one special character (e.g., @, #, $, %, &)

4. details() - Method to display detail of the user
This method is to display the detail of the user (Username, Password, and Password Strength)

This code will be available on Github: https://github.com/MJeat/PasswordStrengthChecking.git

 */



import java.util.Scanner;
public class PasswordChecking {

    static String[] usrNameArr = new String[3];
    static String[] passwordArr = new String[3];
    static int countUsrNameArr = 0;
    static int countPasswordArr = 0;


    public static void main(String[] args) {
        // Here to display menu. Like a sign up page and you check the password strength
        Scanner scanner = new Scanner(System.in);


        boolean exit = false;
        while(!exit) {
            System.out.println("=====================================");
            System.out.println("=====Welcome to the log in page!=====");
            System.out.print(
                    "1 - Sign Up With Username & Password \n" +
                    "2 - Display Details (Username, Password, Password strength) \n" +
                    "3 - Exit the Program \n" +
                    ">>> "
            );
            String options = scanner.nextLine();

            switch(options){
                case "1" -> {
                    userName(scanner);
                    passwordValidation(scanner);
                }
                case "2" -> details();
                case "3" -> {
                    exit = true;
                    System.out.println("====================");
                    System.out.println("Exiting Program...");
                    System.out.println("====================");
                }
                default -> System.out.println("Invalid Input");
            }
        }
        scanner.close();
    }

    public static void userName(Scanner scanner){
        if (countUsrNameArr >= usrNameArr.length || countPasswordArr >= passwordArr.length) {
            System.out.println("Maximum signups reached.");
            return;
        }
        System.out.println("=====Please enter your Username=====");

        String usrName = "";
        while (usrName.isEmpty()) {
            System.out.print("Enter your username: ");
            usrName = scanner.nextLine();
        }
        usrNameArr[countUsrNameArr] = usrName;
        countUsrNameArr++;
    }

    // Here to check the password criteria
    public static void passwordValidation(Scanner scanner) {
        if (countUsrNameArr >= usrNameArr.length || countPasswordArr >= passwordArr.length) {
            System.out.println("Maximum signups reached.");
            return;
        }

        char[] specialChar = {'@', '%', '#', '$', '*', '&', ';', '/', '!', '!', '~'};

        // To prevent no input and don't allow user to proceed to the next block of code

        while(true) {
            System.out.println("=====================================");
            System.out.print("=====Please enter your Password===== \n" +
                    "Criteria: \n" +
                    "At least 8 characters long\n" +
                    "Contains at least one uppercase letter\n" +
                    "Contains at least one digit\n" +
                    "Contains at least one special character (e.g., @, #, $, %, &) \n" +
                    ">>>");
            String password = scanner.nextLine();

            boolean passwordLength = password.length() >= 8;
            boolean upperCaseLetter = false;
            boolean digitCharacter = false;
            boolean hasSpecialChar = false;


            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);

                if (Character.isUpperCase(c)) {
                    upperCaseLetter = true;
                }

                if (Character.isDigit(c)) {
                    digitCharacter = true;
                }

                for (char value : specialChar) {
                    if (value == c) {
                        hasSpecialChar = true;
                        break;
                    }
                }
            }

            if (passwordLength && upperCaseLetter && digitCharacter && hasSpecialChar) {
                System.out.println("The password is valid. Congrats!");
                passwordArr[countPasswordArr] = password;
                countPasswordArr++;
                break;
            }
            else {
                System.out.println("Invalid password. Try again");
            }
        }
    }


    public static void details(){
        // Here to check if it's strong based on the length
        if(countPasswordArr==0){
            System.out.println("No password or username input");
            return;
        }
        System.out.println("========Display Details Table========");

        for(int z =0;z<countPasswordArr;z++) {
            System.out.println("ID: "+z);
            System.out.println("Username: " + usrNameArr[z]);
            System.out.println("Password: " + passwordArr[z]);


            if (passwordArr[z].length() < 10) {
                System.out.println("Password Strength: Weak");
            } else if (passwordArr[z].length() >= 10 && passwordArr[z].length() < 12) {
                System.out.println("Password Strength: Medium");
            } else {
                System.out.println("Password Strength: Strong");
            }
            System.out.println("---------------------");
        }
    }
}
