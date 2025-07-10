
import java.util.Scanner;

public class NestedLoop11 {
    public static void main(String[] args){

        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = scanner.nextInt();

        System.out.print("Enter column: "); // input 4\n
        int col = scanner.nextInt(); // takes 4, leaves \n

        scanner.nextLine(); //  if there were to have many different kinds of data types like in this case int and string, i need to place scanner.nextLine(); in between the data types

        System.out.print("Enter symbol: "); // \n is from the previous input -> input 5\n => \n5\n
        String symbol = scanner.nextLine(); // 5\n


        for(int i=0; i<row;i++){   //row
            for(int j=0;j<col;j++){  //column
                System.out.print(symbol);
            }
            System.out.println();
        }

        // Another example of scanner.nextLine()
        example(scanner);

        scanner.close();
    }
    public static void example(Scanner scanner){
        System.out.println("========================================");

        // Integer
        System.out.print("Enter num: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        // String
        System.out.print("Enter word: ");
        String word = scanner.nextLine(); // No need to delete this because scanner.nextLine(); takes everything and remove for the next flow already

        // Double
        System.out.print("Enter decimal: ");
        double decimal = scanner.nextDouble();
        scanner.nextLine(); // Try deleting this

        // Character
        System.out.print("Enter a Character: ");
        char character = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.println(num);
        System.out.println(word);
        System.out.println(decimal);
        System.out.println(character);


        /*
        When Do You Need nextLine()?
            Only after these methods (they leave \n behind):
                nextInt()
                nextDouble()
                next()
                Any nextX() that doesn’t consume \n.
         */

    }
}
