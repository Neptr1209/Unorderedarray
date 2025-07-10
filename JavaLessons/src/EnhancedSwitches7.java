
/*
Enhance switches is better than regular switches
Enhance switches is a replacement to many if-else statements (Java14 feature)

 */

import java.util.Scanner;
public class EnhancedSwitches7 {
    public static void main(String[] args){
        String day = "Monday";

        // The code is shorter than if-else statement. Try to recreate this code using if statements
        switch (day){
            case "Monday" -> System.out.println("It is a weekday"); // The -> is telling the system to do this code. If case Monday then do this code, which is system.out...
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekend");
            case "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day+" is not a day"); // Behaves like an else statement
        }
        System.out.println("------------------------------------------");
        // Another example
        String month = "February";
        month = month.toLowerCase().trim();
        switch (month){
            case "January", "February","March","April","May","June" -> System.out.println("This is the first 6 months");
            case "July", "August","September","October","November","December" -> System.out.println("This is the last 6 months");
            default -> System.out.println(month+" is not a month");
        }
    }
}
