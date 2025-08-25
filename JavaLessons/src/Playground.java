import java.util.Scanner;

public class Playground{
    public static void main(String [] args){
        System.out.println("This is a review session");
        Scanner scanner = new Scanner(System.in);

//        for(int i=0;i<22;i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        }

        // finding positive numbers
       // positiveNum( scanner);

        // adding numbers
        addingUp(scanner);

    }
    static void positiveNum(Scanner scanner){
        System.out.print("enter your number: ");
        int reply = scanner.nextInt();

        if(reply>0){
            System.out.println("Positive");
        }
        else if (reply<0){
            System.out.println("Negative");
        }
        else if (reply==0){
            System.out.println("Neutral number");
        }
        else{
            System.out.println("Enter the right request or integer numbers only");
        }

        System.out.println(reply);
    }
    static void addingUp(Scanner scanner){

        int num = 0;
        System.out.print("Enter int: ");
        num = scanner.nextInt();

        int sum =0;
        for(int i=0;i<num;i++){
            sum +=i;
        }
        System.out.println(sum);

        /*
        the entered number supposed to be the number of times that the loop should add up its number

         */


    }

}