import java.util.Scanner;

public class StringsMethod5 {
    public static void main(String [] args){
        String name = "Bro code";
        String spaceName = "      Bro Code      ";
        String emptyName = "";
        String password = "Password";

        int len = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("o"); // Find the occurrence of in the string
        int lastIndex = name.lastIndexOf("o"); //Find the last location of the word

        String upperCaseName = name.toUpperCase();
        String lowerCaseName = name.toLowerCase();
        String deleteSpaceName = spaceName.trim(); // Remove space, white space
        String replacingName = name.replace("o", "A");




        System.out.println("The length of the name is: "+len);
        System.out.println("What is the character at an index zero?: "+letter);
        System.out.println("How many letter O is in the name: "+index);
        System.out.println("Where is the last location/index of letter O: "+lastIndex);

        System.out.println("Turn the name all into uppercase: "+upperCaseName);
        System.out.println("Turn the name all into lowercase: "+lowerCaseName);
        System.out.println("Remove the unnecessary spaces around the name: "+deleteSpaceName);

        System.out.println("Replacing the name from o to A: "+replacingName);

        System.out.println("-----------");
        System.out.println("If the string is empty then will display True: "+emptyName.isEmpty());
        System.out.println("But if the string is not empty, return False: "+name.isEmpty());

        if (name.isEmpty()){
            System.out.println("Your name is empty");
        } else {
            System.out.println("Your name is not empty");
        }


        // Check if our string contains any character or space
        if (name.contains(" ")){
            System.out.println("Your name is contains a space");
        } else {
            System.out.println("Your name is not a space");
        }


        // Comparing if two strings are the same. The .equals has no case sensitivity
        if(password.equals("password")){
            System.out.println("Your name cant be password");
        } else {
            System.out.println("Hello, "+name);
        }

        // To ignore case sensitivity
        if(password.equalsIgnoreCase("password")){
            System.out.println("Your name cant be password");
        } else {
            System.out.println("Hello, "+name);
        }

        System.out.println("------------Sub Strings Below--------------");

        // Learn Substrings
        Substrings();
    }
    public static void Substrings(){

        /*
    .substring(): a method used to extract a portion of a string
    .substring(start, end)
     */

        String email = "hello123@gmail.com";
        String email2 = "holymollybro@gmail.com";
        String email3 = "TheHolyemail@gmail.com";

        email = email.substring(0,14);
        int len = email.length();

        email2 = email2.substring(0, email2.indexOf("@")); // Use .indexOf() to filter using character, not number
        email3 = email3.substring(email3.indexOf("@")); // To cut getting fro, @ onwards. If you want to remove @, add +1 after ("@"). Example: (email3.indexOf("@")+1);

        System.out.println(len);
        System.out.println(email);
        System.out.println(email2);
        System.out.println(email3);
        System.out.println("------------Practice Sub Strings Below--------------");

        // Practice:
        practice();
    }
    public static void practice() {
        Scanner scanner = new Scanner(System.in);
        String emailInput;
        String username;
        String domain;

        System.out.print("Input your email: ");
        emailInput = scanner.nextLine();

        username = emailInput.substring(0,emailInput.indexOf("@"));
        domain = emailInput.substring(emailInput.indexOf("@"));

        System.out.println("The username is: "+username);
        System.out.println("The domain is: "+domain);


        scanner.close();
    }
}
