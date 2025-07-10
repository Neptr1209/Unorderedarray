
public class hello {
    public static void main(String[] args) {
        System.out.println("This is normal output.");
        System.err.println("This is an error message."); // This line is for error msg bcuz its outputed line is highlighted
        // in red
    }

    public static void next(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop index: " + i);
        }

        System.err.println("Oops, this is an error!");
        }
    }
