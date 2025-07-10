/**
 * printf() = is a method used to format output
 * It is an alternative to the println();
 *
 * %[flags][width][.precision][specifier-character]
 *
 */


public class Printf1 {
    public static void main(String[] args){
        String name = "SpongeBob";
        char firstLetter = 'S';
        int age = 30;
        double height = 50.3;
        boolean isEmployed = true;

        // For Strings - Read the document above. In this case, this is a specifier character String. So we use %s, where % is a place holder
        System.out.printf("Hello %s", name);

        // For Character - firstLetter datatype of Character, so we use lowercase c
        System.out.printf("Your name starts with a %c", firstLetter);

        // Add a new line by adding \n
        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c", firstLetter);

        // For integer, use %d
        System.out.printf("You are %d years old\n", age);

        // For Boolean, use %b
        System.out.printf("Employed: %b\n", isEmployed);

        // All in one example:
        System.out.printf("%s is %d years old\n", name,age);


        // Learn more about [flags]
        flags();

        // Learn more about [width]
        width();
    }

    public static void flags(){
        /*
        + = output a plus
        , = comma grouping separator
        ( = negative numbers are enclosed in ()
        space = display a minus if negative, space if positive
         */
        System.out.println("=====================================");
        double price1= 9.99;
        double price2=100.14;
        double price3 = -53.13;
        double price4=100000.234;

        // Adding a plus
        System.out.printf("%+.2f\n", price1);
        System.out.printf("%+.2f\n", price3); // Still negative

        // Adding a comma
        System.out.printf("%,.2f\n", price4); // Adds every thousand placeth

        // Adding parentheses ()
        System.out.printf("%(.2f\n", price1);
        System.out.printf("%(.2f\n", price3); // Only puts () around a negative number. Racist XD

        // Adding space
        System.out.printf("% .2f\n", price1); // Any Positive number will have a space in front of the number
        System.out.printf("% .2f\n", price3); // No space for negative number
    }
    public static void width(){
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 32;
        int id3 =234;
        int id4 = 4534;

        System.out.println("----------------------------------");
        System.out.printf("%d\n", id1);
        System.out.printf("%d\n", id3);
        System.out.printf("%04d\n", id1); // This is the padding. Creating a 4-digits number, making it a good way to create IDs
        System.out.printf("%04d\n", id2);

        System.out.printf("%4d\n", id1); // if no put zero, it will create a space
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);

        System.out.printf("%-4d\n", id1); // negative number
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);




    }
}
