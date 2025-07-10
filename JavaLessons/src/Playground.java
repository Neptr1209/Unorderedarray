
import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Playground {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = "Hello world";
        String vowels = "aeiouAEIOU";
        int count = 0;



       // System.out.println(word);
        for(int i =0;i<word.length();i++) {
            char c = word.charAt(i);

            for (int j = 0; j < vowels.length(); j++) {
                if (vowels.charAt(j) == c) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("number of vowels: " + count);

        double doubleString = Double.parseDouble(word);

        System.out.println(word.getClass().getName());

        scanner.close();
    }
}


