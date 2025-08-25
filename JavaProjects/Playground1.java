
import java.util.Scanner;
public class Playground1 {

    public static void main(String[] args){
        // Menu
        Scanner scanner = new Scanner(System.in);

        System.out.println((int)(Math.random() * 10));

        char ch ='a';
        System.out.println(++ch);

        String name = "Kim Jones";

        int k = name.indexOf(' ');
        String newName = name.substring(0,k);
        String lastName = name.substring(k+1);


        System.out.println(k);
        System.out.println(newName );
        System.out.println(lastName);




        scanner.close();
    }
}
