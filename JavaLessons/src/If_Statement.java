
import java.util.Scanner;
public class If_Statement{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int age;
        String name;

        System.out.print("name: ");
        name = scanner.nextLine();

        System.out.print("age: ");
        age = scanner.nextInt();

        if (name.isEmpty()){ // .isEmpty() is to check if the input is empt
            System.out.println("You didnt enter name");
        }
        if (age>=20) {
            System.out.println("You baby");
        }
        else if (age >=10){
            System.out.println("we");
        }
        else {
            System.out.println("You are under 10");
        }

        scanner.close();
    }
}

